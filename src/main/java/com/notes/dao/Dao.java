package com.notes.dao;

import java.util.List;

import com.notes.entities.Note;

public interface Dao {
	public int create(Note note);
	public Boolean update(Note note);
	public Note getNote(int id);
	public List<Note> getNotesList();
	public Boolean deleteANote(Note note);
}
