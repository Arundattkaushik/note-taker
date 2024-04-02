package com.notes.services;

import java.util.ArrayList;
import java.util.List;

import com.notes.dao.Dao;
import com.notes.dao.NotesDao;
import com.notes.entities.Note;

public class NotesService {
	static Dao dao = new NotesDao();
	static int id;
	static Boolean isDeleted = false;
	static Boolean isUpdate = false;

	public static int saveNote(Note note) {
		try {
			id = dao.create(note);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	public static List<Note> getAllNotes(){
		List<Note> list = new ArrayList<Note>();
		list = dao.getNotesList();
		return list;
	}
	
	public static Boolean deleteNote(Note note) {
		isDeleted = false;
		dao.deleteANote(note);
		return isDeleted;
	}
	
	public static Note getNote(int id) {
		Note note = dao.getNote(id);
		return note;
	}
	
	public static Boolean updateNote(Note note) {
		isUpdate = false;
		dao.update(note);
		isUpdate = true;
		return isUpdate;
	}
}
