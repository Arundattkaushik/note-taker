package com.notes.entities;

import java.util.Date;
import java.util.Random;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Note {
	@Id
	@Column(name = "note_id")
	private int id;
	
	@Column(name = "note_title")
	private String title;
	
	@Column(name = "note_content", length = 1500)
	private String content;
	
	@Column(name = "create_date")
	@Temporal(TemporalType.DATE)
	private Date createDate;

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public Note() {
		this.createDate = new Date();
		this.id = new Random().nextInt(10000);
	}

	
}
