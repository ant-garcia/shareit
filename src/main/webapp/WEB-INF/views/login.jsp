<%@ taglib prefix="form"
	uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/form.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<jsp:include page="partials/error.jsp" />

	<div id="outer">
		<div id="container">
			<form:form action="login" method="post" modelAttribute="loginDto" class="form-horizontal">
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="username">Username:</label>
			    <div class="col-sm-10">
			      <form:input path="username" type="username" class="form-control" id="username" placeholder="Enter username"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="pwd">Password:</label>
			    <div class="col-sm-10"> 
			      <form:input path="password" type="password" class="form-control" id="pwd" placeholder="Enter password"/>
			    </div>
			  </div>
			  <div class="form-group"> 
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-default">Submit</button>
			    </div>
			  </div>
			  <footer class="form-group"> 
			    <div class="col-sm-offset-2 col-sm-10">
			      <p>New User? <a href="signup">Sign up now!</a></p>
			    </div>
			  </footer>
			</form:form>
		</div>
	</div>
</body>
</html>