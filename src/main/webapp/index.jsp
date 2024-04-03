<%@page import="com.notes.entities.Note"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="bootstrap.jsp"%>
<title>Home</title>

<link rel="stylesheet" href="css/style.css">
</head>
<body>
<%@include file="navbar.jsp"%>

<!-- Adding card -->
<div class="card container mt-4" style="width: 38rem;">

	<div class="container text-center pr-5">
  <img src="img/sticky-notes.png" class="card-img-top " style="max-width: 300px;">	
	</div>
  <div class="card-body">
    <h5 class="card-title text-uppercase text-center">Take A Note</h5>
    <div class="container text-center">
    <a href="add-notes.jsp" class="btn btn-primary">Add</a>    
    </div>
  </div>
</div>

	
</body>
</html>