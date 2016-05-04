开发用途：myEclipse
使用技术：mySQL+S2SH


1.导包： 

2.设计数据库：
	 user （user_id，登录账号，密码，昵称，性别，身份证号，姓名，出生年月，手机，邮箱，个人签名，大学，入学时间，专业，头像）；
	 postInfo表（post_id，求偶人的照片，求偶人的年级，求偶人的学校，求偶人的性格，求偶人的标准，发布者的愿望，发布者id，发布时间）
	 comment表（comment_id，post_id, 用户id，评论类容，评论时间）
	 likeRecord（post_id，user_id,  是否点赞）
	 
	 user(user_id, account,password,userName,sex,identificationID,trueName,birthday,telephone,email,description,college,intendedTime,userPhotoPath)
	 postInfo(post_id,fordollPhotoPath,intendedTime,college,characters,standard,desert,user_id,postTime)
	 comment(comment_id,post_id,user_id,content,commentTime)
	 likeRecord(post_id,user_id,isliked)
	 
	 
3.创建package 
	com。dating。domain//存放数据库bean
	com.dating.service.impl//用于处理各模块的实践
	com.dating.service//service。impl的接口包
	com.dating.Utils//工具包
	com.dating.base//存放通用的baseaction，baseService
	com.dating.action//用于实现action
	com。dating。test//用于测试

4.配置文件
   	hibernate。cfg。xml //配置hibernate  
   	jdbc。properties//配置数据库连接信息
   	applicationContext。xml//配置spring
   	struts。xml//配置action
   	log4j。properties//日志输出
 
 
 5。
   	
	
	
	
	 