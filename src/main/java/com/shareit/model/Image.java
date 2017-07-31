package com.shareit.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Image implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "image_id")
	private String imageId;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String descrition;
	
	@Column(name = "views")
	private Long views;
	
	@Column(name = "likes")
	private Long likes;
	
	@Column(name = "tag")
	private String tag;
	
	@Column(name = "file_path")
	private String path;
	
	@Column(name = "created_on")
	private Date createdOn;
	
	@ElementCollection(fetch = FetchType.EAGER)
  	@CollectionTable(name="image_comments",joinColumns=@JoinColumn(name="image_id"))
	@Column(name="image_comment")
	private List<String> comments;

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescrition() {
		return descrition;
	}

	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}

	public Long getViews() {
		return views;
	}

	public void setViews(Long views) {
		this.views = views;
	}

	public Long getLikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}
}