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
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>First Admin page</title>
<style>
table#taxDetails, th#taxDetails, td#taxDetails {
    border: 1px solid black;
    table-layout: auto;
}
</style>
</head>
<body>
	<h1 align="center">Calculate Tax</h1>
	<p>
		<a href="${pageContext.request.contextPath}/index.html">Home page</a><br />
	</p>
	<div align="center">
		<form:form action="${pageContext.request.contextPath}/calculate"
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
					<td width="52%"><form:input type="text"
							path="otherAllowance" /></td>
				</tr>
			</table>
			<tr>
				<td><button>Reset</button></td>
				<td><input type="submit" value="Calculate" /></td>
			</tr>
		</form:form>
		<p>
			<c:if test="${tax != null }">
				<h2>Total Tax:</h2>
				<form:form commandName="employee" method="get">
					<table id="taxDetails">
						<tr>
							<th>Nature</th>
							<th>Amount</th>
							<th>Exemption</th>
							<th>Taxable</th>
						</tr>
						<tr>
							<td>Basic Pay</td>
							<td>${employee.salary}</td>
							<td>-</td>
							<td>${employee.taxable.salary}</td>
						</tr>
						<tr>
							<td>HRA</td>
							<td>${employee.hra}</td>
							<td>-</td>
							<td>${employee.taxable.hra}</td>
						</tr>
						<tr>
							<td>LTA</td>
							<td>${employee.lta}</td>
							<td>-</td>
							<td>${employee.taxable.lta}</td>
						</tr>
						<tr>
							<td>Transport Allowance</td>
							<td>${employee.transportAllowance}</td>
							<td>-</td>
							<td>${employee.taxable.transportAllowance}</td>
						</tr>
						<tr>
							<td>Special Allowance</td>
							<td>${employee.specialAllowance}</td>
							<td>-</td>
							<td>${employee.taxable.specialAllowance}</td>
						</tr>
						<tr>
							<td>Other Allowance</td>
							<td>${employee.otherAllowance}</td>
							<td>-</td>
							<td>${employee.taxable.otherAllowance}</td>
						</tr>
						<tr>
							<td>Total</td>
							<td></td>
							<td></td>
							<td>${taxableSalary}</td>
						</tr>
					</table>
				</form:form>
				<h2>"${tax}"</h2>
			</c:if>
		</p>
	</div>
</body>
</html>