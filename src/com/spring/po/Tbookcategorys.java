package com.spring.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Tbookcategorys entity. @author MyEclipse Persistence Tools
 */

public class Tbookcategorys implements java.io.Serializable {

	// Fields

	private Long bookcategoryId;
	private String bookcategoryName;
	private Set tbookses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tbookcategorys() {
	}

	/** full constructor */
	public Tbookcategorys(String bookcategoryName, Set tbookses) {
		this.bookcategoryName = bookcategoryName;
		this.tbookses = tbookses;
	}

	// Property accessors

	public Long getBookcategoryId() {
		return this.bookcategoryId;
	}

	public void setBookcategoryId(Long bookcategoryId) {
		this.bookcategoryId = bookcategoryId;
	}

	public String getBookcategoryName() {
		return this.bookcategoryName;
	}

	public void setBookcategoryName(String bookcategoryName) {
		this.bookcategoryName = bookcategoryName;
	}

	public Set getTbookses() {
		return this.tbookses;
	}

	public void setTbookses(Set tbookses) {
		this.tbookses = tbookses;
	}

}