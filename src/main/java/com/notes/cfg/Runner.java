package com.notes.cfg;

import java.util.List;

import com.notes.entities.Note;
import com.notes.services.NotesService;

public class Runner {

	public static void main(String[] args) {
		List<Note> noteList = NotesService.getAllNotes();
		for (Note note : noteList) {
			System.out.println(note.getTitle());
		}

	}

}
