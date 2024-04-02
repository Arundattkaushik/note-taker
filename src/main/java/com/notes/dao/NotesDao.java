package com.notes.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;

import com.note.utility.Utils;
import com.notes.entities.Note;

public class NotesDao implements Dao {
	int id;
	Boolean isUpdated = false;

	@Override
	public int create(Note note) {
		Utils.getSession().getTransaction();
		id = (int) Utils.getSession().save(note);
		Utils.getSession().getTransaction().begin();
		Utils.getSession().getTransaction().commit();
		return id;
	}

	@Override
	public Boolean update(Note note) {
		isUpdated = false;
		Utils.getSession().update(note);
		Utils.getSession().getTransaction().begin();
		Utils.getSession().getTransaction().commit();
		isUpdated = true;
		return isUpdated;
	}

	@Override
	public Note getNote(int id) {
		Note note = Utils.getSession().get(Note.class, id);
		return note;
	}

	@Override
	public List<Note> getNotesList() {
		List<Note> notesList = new ArrayList<Note>();
		String q = "from Note";
		Query<Note> query = Utils.getSession().createQuery(q);
		notesList = query.list();
		return notesList;
	}

	@Override
	public Boolean deleteANote(Note note) {
		isUpdated = false;
		Utils.getSession().delete(note);
		Utils.getSession().getTransaction().begin();
		Utils.getSession().getTransaction().commit();
		isUpdated = true;
		return isUpdated;
	}

}
