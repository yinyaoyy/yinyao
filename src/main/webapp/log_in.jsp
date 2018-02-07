<%@ page language="java" contentType="text/html;utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="/yinyao/hello/fileSave.do" method="post" enctype="multipart/form-data">
	<!--  账号：<input type="text" name="username"> <br>
             密码：<input type="password" name="password">
     id:<input type="text" name="id">
             住址：<input type="text" name="address"> -->
             文件：<input type="file" name="fileSave"/>         
        <input type="submit" value="提交"/>
	</form>
</body>
</html>