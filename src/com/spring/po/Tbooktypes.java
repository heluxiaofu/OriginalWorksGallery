package com.spring.po;

import java.util.HashSet;
import java.util.Set;

/**
 * Tbooktypes entity. @author MyEclipse Persistence Tools
 */

public class Tbooktypes implements java.io.Serializable {

	// Fields

	private Long booktypeId;
	private String booktypeName;
	private Set tbookses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tbooktypes() {
	}

	/** full constructor */
	public Tbooktypes(String booktypeName, Set tbookses) {
		this.booktypeName = booktypeName;
		this.tbookses = tbookses;
	}

	// Property accessors

	public Long getBooktypeId() {
		return this.booktypeId;
	}

	public void setBooktypeId(Long booktypeId) {
		this.booktypeId = booktypeId;
	}

	public String getBooktypeName() {
		return this.booktypeName;
	}

	public void setBooktypeName(String booktypeName) {
		this.booktypeName = booktypeName;
	}

	public Set getTbookses() {
		return this.tbookses;
	}

	public void setTbookses(Set tbookses) {
		this.tbookses = tbookses;
	}

}