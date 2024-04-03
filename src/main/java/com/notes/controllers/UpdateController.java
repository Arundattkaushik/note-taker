
package com.notes.controllers;

import java.io.IOException;

import com.notes.entities.Note;
import com.notes.services.NotesService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateController", value = "/UpdateController")
public class UpdateController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Note note = new Note();
		int id =  Integer.parseInt(req.getParameter("noteId"));
		note.setId(id);
		note.setTitle(req.getParameter("noteTitle"));
		note.setContent(req.getParameter("noteContent"));
		NotesService.updateNote(note);
		resp.sendRedirect("notes-list.jsp");
	}


}
