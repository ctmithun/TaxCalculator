<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<body>

	<div>
		<div align="right" ><p>Hello, ${username} &nbsp &nbsp &nbsp <c:url value="/logout" var="logoutUrl" /><a href="${logoutUrl}" >Logout</a></p>
		</div>
    	<div align="right"><c:url value="/changePassword" var="changePasswordUrl" />	
    	<a href="${changePasswordUrl}">ChangePassword</a></div> 
	</div>
    <div>
		<h1
			style="color: navy; font-weight: bold; font-style: inherit; left: auto;"
			align="center">Employee Tax Calculation Portal</h1>
	</div>
  </body>
</body>
</html>