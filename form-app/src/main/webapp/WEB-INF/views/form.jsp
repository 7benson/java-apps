<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="<c:url  value="/resources/css/style.css"/>" />
<%-- <script href="<c:url  value="/resources/js/script.js" /> "/>
 --%>
<title>Form</title>
</head>
<body>
	<div class="new container m-auto text-center"
		style="width: 50%; height: 100vh">
		<div class="card d-flex align-content-center flex-wrap mt-5 mb-5">
			<div class="alert alert-danger" role="alert">
				<form:errors form="formEntity.*" />
			</div>
			<h3 class="mt-5">Search App redirect</h3>
			<div class="card-body">

				<form action="success" method="post">
					<div class="form-group">
						<label for="exampleFormControlInput1">Name</label> <input
							type="text" class="form-control" id="exampleFormControlInput1"
							placeholder="name" name="name">
					</div>
			
					<div class="form-group">
						<label for="exampleFormControlInput5">Number</label> <input
							type="text" class="form-control" id="exampleFormControlInput5"
							placeholder="name" name="number">
					</div>
			
					<div class="form-group">
						<label for="exampleFormControlInput2">DOB</label> <input
							name="date" type="text" class="form-control"
							id="exampleFormControlInput2" placeholder="dd/mm/yyyy">
					</div>

					<div class="form-group">
						<p>Courses</p>
						<select name="courses" class="select" multiple
							data-mdb-clear-button="true">
							<option value="1">CSE</option>
							<option value="2">ME</option>
							<option value="3">CE</option>
							<option value="4">Four</option>
							<option value="5">Five</option>
						</select>
					</div>

					<div class="form-group">
						<p>Select Smthg</p>
						<select name="fruit" class="form-select"
							aria-label="Default select example">
							<option value="1">Apple</option>
							<option value="2">Mango</option>
							<option value="3">Both</option>
						</select>
					</div>

					<div class="form-group">
						<label for="exampleFormControlInput3">Street</label> <input
							name="address.street" type="text" class="form-control"
							id="exampleFormControlInput3" placeholder="address.street">
					</div>

					<div class="form-group">
						<label for="exampleFormControlInput4">City</label> <input
							name="address.city" type="text" class="form-control"
							id="exampleFormControlInput4" placeholder="address.city">
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>