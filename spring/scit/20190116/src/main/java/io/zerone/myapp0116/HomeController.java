package io.zerone.myapp0116;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private static final String UPLOADPATH="D:/upload/";
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "home";
	}
	
	/*
	 * MultipartFile 객체를 사용
	 * form의 file type input 태그의 name과 일치 시켜야 함.
	 */
	@RequestMapping(value = "/fileUpload", method = RequestMethod.POST)
	public String fileUpload(MultipartFile uploadFile, Model model) { 
		String fileName = uploadFile.getOriginalFilename();
		System.out.println(fileName);

		File file = new File(UPLOADPATH + fileName);

		try {
			uploadFile.transferTo(file);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		model.addAttribute("fileName", fileName);
		return "home";
	}
	
	/*
	 * html을 리턴하는 것이 아니라 파일을 리턴한다.
	 */
	@RequestMapping(value = "/fileDownload", method = RequestMethod.GET)
	public void downloadFile(HttpServletResponse response, String downloadFile) {
		
		// attachment;filename 사용자가 다운받게 되는 파일 이름을 결정
		response.setHeader("Content-Disposition", "attachment;filename="+downloadFile);
		
		FileInputStream fis; // 서버에서 가져오는 객체
		ServletOutputStream sos; // 서버에서 클라이언트로 보내는 객체
		
		try {
			fis = new FileInputStream(UPLOADPATH + downloadFile); // 경로 + jsp에서 가져온 파일 이름
			sos = response.getOutputStream();
			FileCopyUtils.copy(fis, sos); // Spring 객체로 fis로 서버에서 가져와서 sos로 클라이언트로 보냄
			sos.close();
			fis.close();
		} catch (FileNotFoundException e) { // FileInputStream
			e.printStackTrace();
		} catch (IOException e) { // ServeletOutputStream
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/editor", method = RequestMethod.GET)
	public void editor() {
	}
}
	
