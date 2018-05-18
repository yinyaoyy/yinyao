<%@ page language="java"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@ taglib uri="/WEB-INF/xmlnsLocation/fn.tld" prefix="fn" %>
<%
	String WEBROOT=request.getContextPath();
%>
<%!
public String htmlspecialchars(String str) {
	str = str.replaceAll("&", "&amp;");
	str = str.replaceAll("<", "&lt;");
	str = str.replaceAll(">", "&gt;");
	str = str.replaceAll("\"", "&quot;");
	return str;
}
%>