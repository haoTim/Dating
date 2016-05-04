package com.dating.Appaction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.dating.Utils.ResponseUtil;
import com.dating.base.BaseAction;
import com.dating.domain.User;
import com.google.gson.Gson;


public class UserAction extends BaseAction<User>{
	
	private static final long serialVersionUID = 1L;
	
	private User user;
	private String account;//账号
	private String telephone;//电话号码
	private String password;//密码
	private String user_id;//id
	private String userName;//用户名
	private String sex;
	
	
	
	HttpServletResponse resp=ServletActionContext.getResponse();
	HttpServletRequest req=ServletActionContext.getRequest();
	
	//登陆方法
	public void login(){
		
		
		User user=userService.findByAccount(account,password);;
		
		if(user==null){
			System.out.println("出错");
			
			ResponseUtil.writeToResp(resp, "0");//登陆失败，返回0
			
		}else{
			this.user=user;
		//	System.out.println(this.user);
			System.out.println("登录成功");
			System.out.println("成功");
			//ResponseUtil.writeToResp(resp,new Gson().toJson(this.user));
			
		
			ResponseUtil.writeToResp(resp, this.user.getUser_id()+"");//登陆成功，返回1
		}
		
		
	}
	//注册
	public void register(){
		
		System.out.println("#####"+account);
		System.out.println("#####"+password);
			User user=userService.checkTEL(telephone);
			System.out.println("注册信息");
			if(user==null){
				System.out.println("还未注册");
				Date date=new Date(); 
				user=new User();
				user.setAccount(account);
				user.setPassword(password);
				user.setUserName(userName);
		
				userService.save(user);
				resp.setStatus(200);
				
				ResponseUtil.writeToResp(resp, "1");
			}else{		
				System.out.println("已注册的");		
				resp.setStatus(200);
				ResponseUtil.writeToResp(resp, "0");
			}
	}
	
	/**
	 * 获取个人
	 * @param user_id
	 */
	public void getMemInfo(){
		
		
		
		
		user=userService.getById(new Long(Long.parseLong(user_id)));
		
		//System.out.println(telephone);
			
		ResponseUtil.writeToResp(resp,new Gson().toJson(this.user));
		
	}
	
	
	
	
	
	//get set 方法
	//---------------------------------------------------------------------
	public User getUser() {
		return user;
	}
	public String getAccount() {
		return account;
	}
	public String getTelephone() {
		return telephone;
	}
	public String getPassword() {
		return password;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
			
			
			
			
			
		
}
	
	
	
	


