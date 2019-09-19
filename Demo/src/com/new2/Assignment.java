package com.new2;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")

public class Assignment {
	
	@Id
	@Column(name="book_id")
	private int book_id;
	@Column(name="book_name")
	private String book_name;
	@Column(name="published_date")
	private Date published_date;
	@Column(name="author_name")
	private String author_name;
	@Column(name="edition")
	private int edition;
	
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public Date getPublished_date() {
		return published_date;
	}
	public void setPublished_date(String published_date) {
		this.published_date = Date.valueOf(published_date);
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public int getEdition() {
		return edition;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public Assignment(int book_id, String book_name, String published_date, String author_name, int edition) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.published_date = Date.valueOf(published_date);
		this.author_name = author_name;
		this.edition = edition;
	}
	public Assignment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
