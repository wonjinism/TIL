package com.fileboard.fileboard.vo;

import org.springframework.web.multipart.MultipartFile;

public class BoardFile {

	private String fileSeq;
	private String boardSeq;
	private String orgname;
	private String name;
	private String indate;
	private MultipartFile files;

	public BoardFile(String fileSeq, String boardSeq, String orgname, String name, String indate, MultipartFile files) {
		super();
		this.fileSeq = fileSeq;
		this.boardSeq = boardSeq;
		this.orgname = orgname;
		this.name = name;
		this.indate = indate;
		this.files = files;
	}

	public BoardFile() {
		super();
	}

	public String getFileSeq() {
		return fileSeq;
	}

	public void setFileSeq(String fileSeq) {
		this.fileSeq = fileSeq;
	}

	public String getBoardSeq() {
		return boardSeq;
	}

	public void setBoardSeq(String boardSeq) {
		this.boardSeq = boardSeq;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	public MultipartFile getFiles() {
		return files;
	}

	public void setFiles(MultipartFile files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "BoardFile [fileSeq=" + fileSeq + ", boardSeq=" + boardSeq + ", orgname=" + orgname + ", name=" + name
				+ ", indate=" + indate + ", files=" + files + "]";
	}

}
