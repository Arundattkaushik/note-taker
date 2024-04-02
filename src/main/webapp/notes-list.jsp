<%@page import="java.util.ArrayList"%>
<%@page import="com.notes.entities.Note"%>
<%@page import="java.util.List"%>
<%@page import="com.notes.services.NotesService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css">
<%@include file="bootstrap.jsp"%>
<%@include file="navbar.jsp"%>


<title>Quick Notes: All Notes</title>
</head>
<body>
	<div class="container text-center">
		<h2>All Notes</h2>
		<p>
			<%
			for (Note note : NotesService.getAllNotes()) {
			%>
		
			<div class="pl-5 text-left">
				<div class="card mb-3" style="max-width: 540px;">
			<div class="row g-0">
				<div class="col-md-4">
					<img src="img/notepad.png" class="img-fluid rounded-start pl-4 pt-4" alt="this image is copyrighted and all image credit goes to flaticon.com">
				</div>
				<div class="col-md-8">
					<div class="card-body">
						<h5 class="card-title"><a href="note-details.jsp?note_id=<%=note.getId() %>"><%=note.getTitle() %></a> </h5>
						
						<!-- Applied ellipse -->
						<span class="d-inline-block text-truncate" style="max-width: 280px;">
						  <%=note.getContent() %>
						</span>
						
						<p class="card-text">
						<small class="text-body-secondary">Created on <%=note.getCreateDate() %></small>
						</p>
						<a class="btn btn-danger" href="DeleteController?note_id=<%=note.getId() %>" >Delete</a>
						<a class="btn btn-primary ml-1" href="edit-note.jsp?note_id=<%=note.getId()%>">Edit</a>
					</div>
				</div>
			</div>
		</div>
			
			</div>

		<%
		}
		%>
		</p>

	</div>
</body>
</html>