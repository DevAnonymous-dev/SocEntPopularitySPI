package com.popularity.media.metadata;

import java.util.Date;
import java.util.List;

import com.popularity.media.provider.Attribute;


public class MediaMetadataMetrics {
	
	private String id;
	private String url;
	private Date createdAt;
	private List<Attribute> newAttributes;
	

	
	public MediaMetadataMetrics(String id, String url, Date createdAt) {
		super();
		this.id = id;
		this.url = url;
		this.createdAt = createdAt;
	}

	public MediaMetadataMetrics(String url, Date createdAt) {
		super();
	
		this.url = url;
		this.createdAt = createdAt;
	}



	public MediaMetadataMetrics(List<Attribute> newAttributes) {
		super();
		this.newAttributes = newAttributes;
	}

	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getUrl() {
		return url;
	}




	public void setUrl(String url) {
		this.url = url;
	}

	
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public List<Attribute> getNewAttributes() {
		return newAttributes;
	}

	public void setNewAttributes(List<Attribute> newAttributes) {
		this.newAttributes = newAttributes;
	}

	public String toString() {
		return "MediaMetadataMetrics [id=" + id + ", url=" + url
				+ ", createdAt=" + createdAt + "]";
	}





}
