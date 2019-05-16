package com.fileboard.fileboard.util;

public class PageNavigator {
	/* 조건 */
	private int boardPerPage;// 페이지당 글 목록수
	private int pagePerGroup;// 그룹당페이지수
	private int currentPage;// 현재페이지
	private int totalBoard;// 전체 레코드수
	private int totalPage;// 전체 페이지수
	private int currentPageGroup;// 현재페이지 그룹
	/* 구하려하는 것 */
	private int startPageGroup;// 현재그룹첫페이지
	private int endPageGroup;// 현재그룹마지막페이지
	private int startBoardCurrentPage;// 현재페이지의 첫글 위치

	public PageNavigator(int boardPerPage,int pagePerGroup,int currentPage,int totalBoard) {
	this.boardPerPage=boardPerPage;
	this.pagePerGroup=pagePerGroup;
	
	//전체페이지=(총글 레코드수+페이지당 글목록수-1)/페이지당 글목록수;
	totalPage=(totalBoard+boardPerPage-1)/boardPerPage;
	
	if(currentPage<1) {
		this.currentPage=1;
	}else if(currentPage>totalPage) {
		this.currentPage=totalPage;
	}else {
		this.currentPage=currentPage;
	}
	//현재그룹=(현재페이지-1)/그룹당페이지수
	currentPageGroup=(this.currentPage-1)/pagePerGroup;
	
	startPageGroup=currentPageGroup*pagePerGroup+1;
	if(startPageGroup<1) {
		startPageGroup=1;
	}
	
	endPageGroup=startPageGroup+pagePerGroup-1;
	if(endPageGroup>totalPage) {
		endPageGroup=totalPage;
	}

	//현재페이지의 첫 글 위치= (현재페이지-1)*페이지당 글목록수
	startBoardCurrentPage= (this.currentPage-1)*boardPerPage;
	
	}

	public int getBoardPerPage() {
		return boardPerPage;
	}

	public void setBoardPerPage(int boardPerPage) {
		this.boardPerPage = boardPerPage;
	}

	public int getPagePerGroup() {
		return pagePerGroup;
	}

	public void setPagePerGroup(int pagePerGroup) {
		this.pagePerGroup = pagePerGroup;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalBoard() {
		return totalBoard;
	}

	public void setTotalBoard(int totalBoard) {
		this.totalBoard = totalBoard;
	}

	public int getCurrentPageGroup() {
		return currentPageGroup;
	}

	public void setCurrentPageGroup(int currentPageGroup) {
		this.currentPageGroup = currentPageGroup;
	}

	public int getStartPageGroup() {
		return startPageGroup;
	}

	public void setStartPageGroup(int startPageGroup) {
		this.startPageGroup = startPageGroup;
	}

	public int getEndPageGroup() {
		return endPageGroup;
	}

	public void setEndPageGroup(int endPageGroup) {
		this.endPageGroup = endPageGroup;
	}

	public int getStartBoardCurrentPage() {
		return startBoardCurrentPage;
	}

	public void setStartBoardCurrentPage(int startBoardCurrentPage) {
		this.startBoardCurrentPage = startBoardCurrentPage;
	}

	@Override
	public String toString() {
		return "PageNavigator [boardPerPage=" + boardPerPage + ", pagePerGroup=" + pagePerGroup + ", currentPage="
				+ currentPage + ", totalBoard=" + totalBoard + ", currentPageGroup=" + currentPageGroup
				+ ", startPageGroup=" + startPageGroup + ", endPageGroup=" + endPageGroup + ", startBoardCurrentPage="
				+ startBoardCurrentPage + "]";
	}

}
