package com.spring.po;

import java.sql.Timestamp;

/**
 * Tbooks entity. @author MyEclipse Persistence Tools
 */

public class Tbooks implements java.io.Serializable {

	// Fields

	private Long bookId;
	private Tauthors tauthors;
	private Tbooktypes tbooktypes;
	private Tbookcategorys tbookcategorys;
	private String bookName;
	private String bookBrief;
	private String bookFilePath;
	private String bookLogoPath;
	private Timestamp bookPublishDate;

	// Constructors

	/** default constructor */
	public Tbooks() {
	}

	/** minimal constructor */
	public Tbooks(Tauthors tauthors, Tbooktypes tbooktypes,
			Tbookcategorys tbookcategorys) {
		this.tauthors = tauthors;
		this.tbooktypes = tbooktypes;
		this.tbookcategorys = tbookcategorys;
	}

	/** full constructor */
	public Tbooks(Tauthors tauthors, Tbooktypes tbooktypes,
			Tbookcategorys tbookcategorys, String bookName, String bookBrief,
			String bookFilePath, String bookLogoPath, Timestamp bookPublishDate) {
		this.tauthors = tauthors;
		this.tbooktypes = tbooktypes;
		this.tbookcategorys = tbookcategorys;
		this.bookName = bookName;
		this.bookBrief = bookBrief;
		this.bookFilePath = bookFilePath;
		this.bookLogoPath = bookLogoPath;
		this.bookPublishDate = bookPublishDate;
	}

	// Property accessors

	public Long getBookId() {
		return this.bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Tauthors getTauthors() {
		return this.tauthors;
	}

	public void setTauthors(Tauthors tauthors) {
		this.tauthors = tauthors;
	}

	public Tbooktypes getTbooktypes() {
		return this.tbooktypes;
	}

	public void setTbooktypes(Tbooktypes tbooktypes) {
		this.tbooktypes = tbooktypes;
	}

	public Tbookcategorys getTbookcategorys() {
		return this.tbookcategorys;
	}

	public void setTbookcategorys(Tbookcategorys tbookcategorys) {
		this.tbookcategorys = tbookcategorys;
	}

	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookBrief() {
		return this.bookBrief;
	}

	public void setBookBrief(String bookBrief) {
		this.bookBrief = bookBrief;
	}

	public String getBookFilePath() {
		return this.bookFilePath;
	}

	public void setBookFilePath(String bookFilePath) {
		this.bookFilePath = bookFilePath;
	}

	public String getBookLogoPath() {
		return this.bookLogoPath;
	}

	public void setBookLogoPath(String bookLogoPath) {
		this.bookLogoPath = bookLogoPath;
	}

	public Timestamp getBookPublishDate() {
		return this.bookPublishDate;
	}

	public void setBookPublishDate(Timestamp bookPublishDate) {
		this.bookPublishDate = bookPublishDate;
	}

}