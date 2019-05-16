package kr.kfc.kiosk.util;

public class PageNavigator {
	/* 조건 */
	private int postPerPage; // 페이지당 글목록수
	private int pagePerGroup; // 그룹당 페이지수
	private int currentPage; // 현재 페이지
	private int totalPage; // 전체 글목록수
	private int currentPageInGroup; // 현재 그룹
	/* 구하려는 것 */
	private int startPageInGroup; // 현재 그룹 첫 페이지
	private int endPageInGroup; // 현재 그룹 끝 페이지
	private int startPostInCurrentPage; // 현재 페이지의 첫 글 위치

	public PageNavigator(int postPerPage, int pagePerGroup, int currentPage, int totalPage) {
		this.postPerPage = postPerPage;
		this.pagePerGroup = pagePerGroup;
		
		// 전체 페이지수 = (총 글목록수 + 페이지당 글목록수-1) / 페이지당 글목록수
		totalPage = (totalPage + postPerPage-1) / postPerPage;
		
		/*
		 * 현재 페이지 < 1 = 1
		 * 현재 페이지 > 전체 페이지수 = 전체 페이지수
		 */
		if(currentPage < 1) {
			this.currentPage = 1;
		}else if(currentPage > totalPage) {
			this.currentPage = totalPage;
		}else {
			this.currentPage = currentPage;
		}
		
		// 현재 그룹 = (현재페이지-1) / 그룹당 페이지수
		currentPageInGroup = (this.currentPage-1)/pagePerGroup;
		
		// 현재 그룹 첫 페이지 = 현재 그룹 * (그룹당 페이지수+1)
		startPageInGroup = currentPageInGroup * (pagePerGroup + 1);
		// 현재 그룹 첫 페이지 < 1 = 1
		if(startPageInGroup < 1) {
			startPageInGroup = 1;
		}
		
		// 현재 그룹 끝 페이지 = 첫 페이지 + (그룹당 페이지수-1)	
		endPageInGroup = startPageInGroup + (pagePerGroup - 1);
		// 현재 그룹 끝 페이지 > 전체 페이지 = 전체 페이지
		if(endPageInGroup > totalPage) {
			endPageInGroup = totalPage;
		}
		
		// 현재 페이지의 첫 글 위치 = (현재 페이지-1) * 페이지당 글목록수
		startPostInCurrentPage = (this.currentPage-1) * postPerPage;
	}

	public PageNavigator() {
	}

	public int getPostPerPage() {
		return postPerPage;
	}

	public void setPostPerPage(int postPerPage) {
		this.postPerPage = postPerPage;
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

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getCurrentPageInGroup() {
		return currentPageInGroup;
	}

	public void setCurrentPageInGroup(int currentPageInGroup) {
		this.currentPageInGroup = currentPageInGroup;
	}

	public int getStartPageInGroup() {
		return startPageInGroup;
	}

	public void setStartPageInGroup(int startPageInGroup) {
		this.startPageInGroup = startPageInGroup;
	}

	public int getEndPageInGroup() {
		return endPageInGroup;
	}

	public void setEndPageInGroup(int endPageInGroup) {
		this.endPageInGroup = endPageInGroup;
	}

	public int getStartPostInCurrentPage() {
		return startPostInCurrentPage;
	}

	public void setStartPostInCurrentPage(int startPostInCurrentPage) {
		this.startPostInCurrentPage = startPostInCurrentPage;
	}

	@Override
	public String toString() {
		return "PageNavigator [postPerPage=" + postPerPage + ", pagePerGroup=" + pagePerGroup + ", currentPage="
				+ currentPage + ", totalPage=" + totalPage + ", currentPageInGroup=" + currentPageInGroup
				+ ", startPageInGroup=" + startPageInGroup + ", endPageInGroup=" + endPageInGroup
				+ ", startPostInCurrentPage=" + startPostInCurrentPage + "]";
	}
	
}
