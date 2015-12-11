package com.catalyst.SMA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "socialmedia")
public class SocialMedia {
	@Id
	@GeneratedValue
	@Column(name = "socialmedia_id")
	private Integer socialmediaId;
	
	@Column(name = "search_id")
	private Integer searchId;

	@Column(name = "name")
	private String name;

	@Column(name = "bookmarklist_id")
	private Integer bookmarkList;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the bookmarkList
	 */
	public Integer getBookmarkList() {
		return bookmarkList;
	}

	/**
	 * @param bookmarkList
	 *            the bookmarkList to set
	 */
	public void setBookmarkList(Integer bookmarkList) {
		this.bookmarkList = bookmarkList;
	}

	/**
	 * @return the searchId
	 */
	public Integer getSearchId() {
		return searchId;
	}

	/**
	 * @param searchId
	 *            the searchId to set
	 */
	public void setSearchId(Integer searchId) {
		this.searchId = searchId;
	}

	/**
	 * @return the socialmediaId
	 */
	public Integer getSocialmediaId() {
		return socialmediaId;
	}

	/**
	 * @param socialmediaId
	 *            the socialmediaId to set
	 */
	public void setSocialmediaId(Integer socialmediaId) {
		this.socialmediaId = socialmediaId;
	}

}
