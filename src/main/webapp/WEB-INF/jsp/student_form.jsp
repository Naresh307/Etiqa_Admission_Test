<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Form</title>
<link href="../../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../../webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
 <script src="../../webjars/jquery/3.0.0/js/jquery.min.js"></script>

</head>
<body>
	<div class="container">
		<spring:url value="/student/saveStudent" var="saveURL" />
		<h2>Add Student</h2>
		<form:form modelAttribute="studentForm" method="post"
			action="${saveURL }" cssClass="form">
			<form:hidden path="id" />
			<div class="col-md-6 col-md-offset-6">
				<label>First Name</label>
				<form:input path="firstname" cssClass="form-control" id="firstname"/>
			</div>
			<div class="col-md-6 col-md-offset-6">
				<label>Last Name</label>
				<form:input path="lastname" cssClass="form-control" id="lastname" />
			</div>
			<div class="col-md-6 col-md-offset-6">
				<label>Age</label>
				<form:input path="age" cssClass="form-control" id="age" />
			</div>           
			<div class="col-md-6 col-md-offset-6">
				<label>Email ID</label>
				<form:input path="email" cssClass="form-control" id="email" />
			</div>
			<div>
			<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form:form>

	</div>
</body>
</html>