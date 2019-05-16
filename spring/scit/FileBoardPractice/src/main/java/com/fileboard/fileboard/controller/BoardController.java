package com.fileboard.fileboard.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.fileboard.fileboard.dao.BoardDAO;
import com.fileboard.fileboard.dao.MemberDAO;
import com.fileboard.fileboard.util.PageNavigator;
import com.fileboard.fileboard.vo.Board;
import com.fileboard.fileboard.vo.BoardFile;

@Controller
public class BoardController {

	@Autowired
	BoardDAO dao;
	private static final String UPLOADPATH="D:/upload/";
	private static final int boardPerPage=5;
	private static final int pagePerGroup=3;
	
	@RequestMapping(value = "/board", method = { RequestMethod.POST, RequestMethod.GET })
	public String board(Model model,int page) {
		
		int totalRecord=dao.countRecord();

		PageNavigator pn= 
				new PageNavigator(boardPerPage,pagePerGroup,page,totalRecord);
	
		ArrayList<Board> board=dao.selectAllBoard(pn);	

		model.addAttribute("board",board);
		model.addAttribute("navi",pn);
		
		return "board";
	}

	@RequestMapping(value = "/boardWrite", method = { RequestMethod.POST, RequestMethod.GET })
	public String boardWrite() {
		return "boardWrite";
	}

	@RequestMapping(value = "/boardDetail", method = { RequestMethod.POST, RequestMethod.GET })
	public String boardDetail(String boardSeq,Model model) {
		
		Board board=dao.selectBoard(boardSeq);
		ArrayList<BoardFile> bf=dao.selectFile(boardSeq);

		model.addAttribute("board",board);
		model.addAttribute("file",bf);
		
		return "boardDetail";
	}
	@RequestMapping(value = "/contentWrite", method =RequestMethod.POST)
	public String contentWrite(HttpSession session,Board board,MultipartFile file) {
		
		String orgname=file.getOriginalFilename();//A.txt
		String name;
		
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("YYYYMMddmmss");
		String secondNow=sdf.format(date);//20190118094234
		String ext=orgname.split("\\.")[orgname.split("\\.").length-1];
		//txt
		
		name=secondNow+"."+ext;//20190118094234+"."+txt
		
		try {
			file.transferTo(new File(UPLOADPATH+name));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String id=(String) session.getAttribute("loginId");
		
		board.setId(id);
		dao.insertBoard(board);
		
		BoardFile bf=new BoardFile();
		bf.setName(name);
		bf.setOrgname(orgname);
		dao.insertFile(bf);	
				
		return "redirect:/board?page=1";
	}
	@RequestMapping(value = "/download", method =RequestMethod.GET)
	public void download(String boardSeq, HttpServletResponse response) {
		
		ArrayList<BoardFile> fList=dao.selectFile(boardSeq);
	
		try {
			response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode(fList.get(0).getOrgname(), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream fis;
		ServletOutputStream sos;
		
		try {
			fis=new FileInputStream(UPLOADPATH+fList.get(0).getName());
			sos = response.getOutputStream();
			FileCopyUtils.copy(fis, sos);
			
			fis.close();
			sos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	
	
	
	
	
	

}
