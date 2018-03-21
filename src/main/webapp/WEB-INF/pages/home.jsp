<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:include page="header.jsp" />
<%@taglib prefix="sec" uri="/WEB-INF/security.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Home page</title>
<style>
#container {
	width: 1000px;
	background-color: #ffcc33;
	margin: auto;
	margin-top: 3cm;
}

#first {
	width: 300px;
	float: left;
	height: 200px;
	background-color: navy;
}

#second {
	width: 300px;
	float: left;
	height: 200px;
	background-color: #FF6600;
}

#third {
	width: 300px;
	float: left;
	height: 200px;
	background-color: #8B008B;
}
</style>
</head>
<body>

	<div id="container">
			<div id="first" style="margin-right: 0.75cm;">
				<a href="${pageContext.request.contextPath}/admin/first.html">
					<h2 style="color: white; margin-top: 2cm;" align="center">Check
						Tax</h2>
				</a>
			</div>
		<sec:authorize access="hasRole('ROLE_ADMIN')">
			<div id="second" style="margin-right: 0.75cm;">
				<a href="${pageContext.request.contextPath}/admin/addEmployee.html">
					<h2 style="color: white; margin-top: 2cm;" align="center">Add
						Employee</h2>
				</a>
			</div>
			<div id="third">
				<a href="${pageContext.request.contextPath}/admin/second.html">
					<h2 style="color: white; margin-top: 2cm;" align="center">Add
						Users</h2>
				</a>
			</div>
		</sec:authorize>
	</div>
</body>
</html>