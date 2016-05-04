<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  	<form action="${pagecontext.request.contextpath}/Dating/app/user_register.action" method="post">
  		<input type="text" value="你好" id="telephone"  name="telephone">
  		<input type="submit" value="提交">
  	</form>
  
  <body>
    This is my JSP page. <br>
  </body>
</html>
