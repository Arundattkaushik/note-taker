<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quick Notes: Add Note</title>
<link rel="stylesheet" href="css/style.css">
<%@include file="bootstrap.jsp" %>
<%@include file="navbar.jsp" %>
</head>
<body>

<!-- Form to take input from user  -->
<div class="container">

<form action="CreateController" method="post">
  <div class="mb-3">
  
    <label class="form-label pt-4">Title</label>
    <input type="text" class="form-control" name="noteTitle" required="required">
    
  <div class="mb-3">
    <label class="form-label pt-4">Note</label>
    <textarea rows="15" cols="" class="form-control" name="noteContent"></textarea>
  </div>
  <div class="row justify-content-end pr-3">
  <button type="submit" class="btn btn-primary">Add Note</button>
  </div>
  </div>
</form>

</div>

</body>
</html>