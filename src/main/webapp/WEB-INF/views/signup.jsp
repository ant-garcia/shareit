<%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign up</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/form.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="partials/error.jsp" />

	<div id="outer">
		<div id="container">
			<form:form action="signup" method="post" modelAttribute="signupDto" class="form-horizontal">
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="email">Email:</label>
			    <div class="col-sm-8">
			      <form:input path="email" type="email" class="form-control" id="email" placeholder="Enter email"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="pwd">Password:</label>
			    <div class="col-sm-8"> 
			      <form:input path="password" type="password" class="form-control" id="pwd" placeholder="Enter password"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="cpwd">Confirm:</label>
			    <div class="col-sm-8"> 
			      <form:input path="confirmPassword" type="password" class="form-control" id="cpwd" placeholder="Confirm password"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="username">Username:</label>
			    <div class="col-sm-8">
			      <form:input path="username" type="text" class="form-control" id="username" placeholder="Enter username"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="email">First Name:</label>
			    <div class="col-sm-8">
			      <form:input path="firstName" type="text" class="form-control" id="firstName" placeholder="First name"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="email">Last Name:</label>
			    <div class="col-sm-8">
			      <form:input path="lastName" type="text" class="form-control" id="lastName" placeholder="Last name"/>
			    </div>
			  </div>
			  <div class="form-group"> 
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-default">Submit</button>
			    </div>
			  </div>
			  <footer class="form-group"> 
			    <div class="col-sm-offset-2 col-sm-10">
			      <p>Already a User? <a href="login">Log in now!</a></p>
			    </div>
			  </footer>
			</form:form>
		</div>
	</div>
</body>
</html>