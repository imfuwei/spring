<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
  </head>
  
  <body>
	<form action="RegisterServlet" method="post">
		用户名：<input type="text" name="username"/><br>
		密码：<input type="password" name="password"><br>
		<input type="submit" value="注册">
	</form>
  </body>
</html>
