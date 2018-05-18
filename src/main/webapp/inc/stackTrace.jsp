<%@ page contentType="text/html;charset=gb2312" %>
<%@ page isErrorPage="true" %> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
	<title>出错啦</title>
</head>
<%
	Exception ex = (Exception)session.getAttribute("Exception"); 
%>
<body>
	<font face="Helvetica">
		<h2><strong><font color=#DB1260 size="4">错误详细信息如下——</font></strong></h2>
		<p>
			An exception was thrown: <b> 
			<%if(exception.getMessage()!=null){%>
				<%=exception.getMessage() %> 
			<%}else{%>
				<%=exception%> 
			<%}%>
			<p>
			With the following stack trace: 
			<pre> 
				<% java.io.ByteArrayOutputStream ostr = new java.io.ByteArrayOutputStream();
				if(exception!=null){
				exception.printStackTrace(new java.io.PrintStream(ostr)); out.print(ostr);}
				%>
			</pre>
		<p> 
		<hr width=95%>
	</font> 
	<div align="center">
		<input name="close" type="button" onClick="javascript:history.go(-1)" value="返回">
	</div>
</body>
</html>
