<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script type="text/javascript">
	function validation() {
		//alert("Enter into validations");
		var user = document.getElementById("user").value;
		if (user == "") {
			alert("Please Enter valid User!!");
			return false;
		}

		var p = document.getElementById("pass").value;

		if (p == "") {
			alert("Please Enter valid Password!!");
			return false;
		}

		return true;
	}
	 
</script>
<style type="text/css">
 .erros{
   color:red
 }
</style>
</head>
<body>

	<div align="center">

		Login Application
		<hr>
		<form:form name="form" action="loginApp" method="post" onsubmit="return validation();"
			modelAttribute="loginForm">
			User Name <form:input path="user" id="user" autocomplete="off"/>
			<form:errors path="user" cssClass="erros"/>
			<br>
					
			Password <form:input path="pass" id="pass" autocomplete="off"/>
			<form:errors path="pass" cssClass="erros" />
			<br>
			<input type="submit" value="Login">
		</form:form>
	</div>
</body>
</html>