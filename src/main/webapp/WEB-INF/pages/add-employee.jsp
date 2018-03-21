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
		<form:form action="${pageContext.request.contextPath}/employee/add"
			method="post" commandName="employee">
			<table width="35%">
				<tr>
					<td width="48%">Employee ID:</td>
					<td width="52%"><form:input type="text" path="employeeId" /></td>
				</tr>
				<tr>
					<td width="48%">Basic Pay:</td>
					<td width="52%"><form:input type="text" path="salary" /></td>
				</tr>
				<tr>
					<td width="48%">HRA :</td>
					<td width="52%"><form:input type="text" path="hra" /></td>
				</tr>
				<tr>
					<td width="48%">Transport Allowance :</td>
					<td width="52%"><form:input type="text"
							path="transportAllowance" /></td>
				</tr>
				<tr>
					<td width="48%">Special Allowance :</td>
					<td width="52%"><form:input type="text"
							path="specialAllowance" /></td>
				</tr>
				<tr>
					<td width="48%">LTA :</td>
					<td width="52%"><form:input type="text" path="lta" /></td>
				</tr>
				<tr>
					<td width="48%">Medical Bills :</td>
					<td width="52%"><form:input type="text" path="medicalBills" /></td>
				</tr>
				<tr>
					<td width="48%">Other Allowance :</td>
					<td width="52%"><form:input type="text" path="otherAllowance" /></td>
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