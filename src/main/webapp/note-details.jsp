<%@page import="com.notes.services.NotesService"%>
<%@page import="com.notes.entities.Note"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quick Notes: View Note</title>
<link rel="stylesheet" href="css/style.css">
<%@include file="bootstrap.jsp"%>
<%@include file="navbar.jsp"%>
<% int noteId = Integer.parseInt(request.getParameter("note_id"));
       Note note = NotesService.getNote(noteId);
%>
</head>
<body>

	<div class="container">

		<form action="UpdateController?noteId=<%=noteId %>" method="post">
			<div class="mb-3">

				<label class="form-label pt-4">Title</label> 
				<input type="text" class="form-control" name="noteTitle" required="required" value="<%=note.getTitle() %>" disabled="disabled"> 

				<div class="mb-3">
					<label class="form-label pt-4">Note</label>
					<textarea rows="15" cols="" class="form-control" name="noteContent" disabled="disabled"><%=note.getContent() %></textarea>
				</div>
			</div>
		</form>

	</div>

</body>
</html>