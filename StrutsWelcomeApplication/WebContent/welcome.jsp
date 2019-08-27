<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Struts Application</title>
</head>
 
<body>
<h1>
<s:property value="userName" />
</h1>
<ol>
<h1>
<s:bean name="com.uks.varad.struts.day1.assignment1.bean.Welcome" var="welcomeBean" />
<s:property value="#welcomeBean.name" />
</h1>
</ol>

</body>
</html>