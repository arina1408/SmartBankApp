<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Add Account</title>
<style>
body {
	background-image: url("SmartBank1.jpg");
}
</style>
</head>
<body>
	<h3 class="text-light bg-dark">Welcome</h3>
	<div class="col-md-6">
		<form action="/add">
			<p>
				Account Number <input type="text" , name="accountnumber"
					required="required"><br>
			</p>
			<p>
				Account Name <input type="text" , name="accountname"
					required="required"><br>
			</p>
			<div class="col-md-3">
				<label for="validationCustom04" class="form-label">Branch</label> <select
					name="branch" class="form-select" id="validationCustom04" required>
					<option selected disabled value="">Select</option>
					<option value="SmartBank Chennai">SmartBank Chennai</option>
				</select>
			</div>
			<div class="col-md-3">
				<label for="validationCustom04" class="form-label">Currency</label>
				<select name="currency" class="form-select" id="validationCustom04"
					required>
					<option selected disabled value="">Select</option>
					<option value="INR">INR</option>
					<option value="USD">USD</option>
				</select>
			</div>
			<br> Available Balance <input type="text" , name="availablebalance" 
			         required="required"><br>

			<button type="submit" class="btn btn-primary">Submit</button>
			<br> <a href="/" class="list-group-item list-group-item-action">Back</a>
		</form>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
</body>
</html>