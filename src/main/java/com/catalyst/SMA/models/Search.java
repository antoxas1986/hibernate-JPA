package com.catalyst.SMA.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "search")
public class Search {

	@Id
	@GeneratedValue
	@Column(name = "search_id")
	private Integer searchId;

	@Column(name = "keyterm")
	private String keyterm;

	@Column(name = "autostart")
	private String autostart;

	@Column(name = "period")
	private String period;

	@Column(name = "user_id")
	private Integer userId;

	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="search_id")
	private SocialMedia socialMedia;

	/**
	 * @return the socialMedia
	 */
	public SocialMedia getSocialMedia() {
		return socialMedia;
	}

	/**
	 * @param socialMedia
	 *            the socialMedia to set
	 */
	public void setSocialMedia(SocialMedia socialMedia) {
		this.socialMedia = socialMedia;
	}

	public Integer getSearchId() {
		return searchId;
	}

	public void setSearchId(Integer searchId) {
		this.searchId = searchId;
	}

	public String getKeyterm() {
		return keyterm;
	}

	public void setKeyterm(String keyterm) {
		this.keyterm = keyterm;
	}

	public String getAutostart() {
		return autostart;
	}

	public void setAutostart(String autostart) {
		this.autostart = autostart;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
