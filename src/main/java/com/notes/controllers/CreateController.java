package com.notes.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import com.notes.entities.Note;
import com.notes.services.NotesService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "CreateController", value = "/CreateController")
public class CreateController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Note note = new Note();
		
		note.setTitle(req.getParameter("noteTitle"));
		note.setContent(req.getParameter("noteContent"));
		
		NotesService.saveNote(note);
		PrintWriter writer = resp.getWriter();
		writer.print("Saved successfully..........");
		resp.sendRedirect("index.jsp");
	}

}
