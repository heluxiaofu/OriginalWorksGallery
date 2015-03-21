package com.spring.po;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Tauthors entity. @author MyEclipse Persistence Tools
 */

public class Tauthors implements java.io.Serializable {

	// Fields

	private Long authorId;
	private String authorName;
	private String authorPwd;
	private String authorLogoPath;
	private Integer authorLevel;
	private Timestamp authorRegisterTime;
	private Set tbookses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tauthors() {
	}

	/** minimal constructor */
	public Tauthors(Integer authorLevel) {
		this.authorLevel = authorLevel;
	}

	/** full constructor */
	public Tauthors(String authorName, String authorPwd, String authorLogoPath,
			Integer authorLevel, Timestamp authorRegisterTime, Set tbookses) {
		this.authorName = authorName;
		this.authorPwd = authorPwd;
		this.authorLogoPath = authorLogoPath;
		this.authorLevel = authorLevel;
		this.authorRegisterTime = authorRegisterTime;
		this.tbookses = tbookses;
	}

	// Property accessors

	public Long getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorPwd() {
		return this.authorPwd;
	}

	public void setAuthorPwd(String authorPwd) {
		this.authorPwd = authorPwd;
	}

	public String getAuthorLogoPath() {
		return this.authorLogoPath;
	}

	public void setAuthorLogoPath(String authorLogoPath) {
		this.authorLogoPath = authorLogoPath;
	}

	public Integer getAuthorLevel() {
		return this.authorLevel;
	}

	public void setAuthorLevel(Integer authorLevel) {
		this.authorLevel = authorLevel;
	}

	public Timestamp getAuthorRegisterTime() {
		return this.authorRegisterTime;
	}

	public void setAuthorRegisterTime(Timestamp authorRegisterTime) {
		this.authorRegisterTime = authorRegisterTime;
	}

	public Set getTbookses() {
		return this.tbookses;
	}

	public void setTbookses(Set tbookses) {
		this.tbookses = tbookses;
	}

}