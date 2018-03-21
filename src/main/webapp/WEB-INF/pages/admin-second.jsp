<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<jsp:include page="header.jsp" />

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Add Employee Details</h1>
	<p>
		<a href="${pageContext.request.contextPath}/index.html">Home page</a><br />
	</p>
	<div align="center">
		<form:form action="${pageContext.request.contextPath}/user/add"
			method="post" commandName="newUser">
			<table width="35%">
				<tr>
					<td width="48%">User ID:</td>
					<td width="52%"><form:input type="text" path="login" /></td>
				</tr>
				<tr>
					<td width="48%">Role :</td>
					<td width="52%"><form:radiobutton path="role" value="1" />ADMIN
						<form:radiobutton path="role" value="2" />USER							
					</td>
				</tr>
			</table>
			<tr>
				<td><button>Reset</button></td>
				<td><input type="submit" value="Add" /></td>
			</tr>
		</form:form>
	</div>
</body>
</html>