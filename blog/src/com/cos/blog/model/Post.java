package com.cos.blog.model;

import java.sql.Timestamp;

public class Post {
	private int id;
	private String title;
	private String content;
	private int readCount;//조회수
	private Timestamp createData;//인서트 된 시간
	
	private int userId;

	


	public Post(int id, String title, String content, int readCount, Timestamp createData, int userId) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.readCount = readCount;
		this.createData = createData;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	public Timestamp getCreateData() {
		return createData;
	}

	public void setCreateData(Timestamp createData) {
		this.createData = createData;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
