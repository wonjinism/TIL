package com.fileboard.fileboard.vo;

import java.util.Arrays;

public class Board {

	private String boardSeq;
	private String title;
	private String content;
	private String id;
	private String indate;
	private BoardFile[] fileList;

	public Board(String boardSeq, String title, String content, String id, String indate, BoardFile[] fileList) {
		super();
		this.boardSeq = boardSeq;
		this.title = title;
		this.content = content;
		this.id = id;
		this.indate = indate;
		this.fileList = fileList;
	}

	public Board() {
		super();
	}

	public String getBoardSeq() {
		return boardSeq;
	}

	public void setBoardSeq(String boardSeq) {
		this.boardSeq = boardSeq;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	public BoardFile[] getFileList() {
		return fileList;
	}

	public void setFileList(BoardFile[] fileList) {
		this.fileList = fileList;
	}

	@Override
	public String toString() {
		return "Board [boardSeq=" + boardSeq + ", title=" + title + ", content=" + content + ", id=" + id + ", indate="
				+ indate + ", fileList=" + Arrays.toString(fileList) + "]";
	}

}
