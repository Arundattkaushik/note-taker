package com.notes.controllers;

import java.io.IOException;

import com.notes.entities.Note;
import com.notes.services.NotesService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "DeleteController", value = "/DeleteController")
public class DeleteController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int noteId = Integer.parseInt(req.getParameter("note_id"));
		System.out.println(noteId);
		Note note = NotesService.getNote(noteId);
		NotesService.deleteNote(note);
		resp.sendRedirect("notes-list.jsp");
	}

}
