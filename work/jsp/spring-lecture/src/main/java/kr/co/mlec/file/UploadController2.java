package kr.co.mlec.file;

import java.io.File;
import java.util.Iterator;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/file")
public class UploadController2 {

	@Autowired
	ServletContext servletContext;
	  
	@RequestMapping(value="/upload2.do", method=RequestMethod.POST)
	public ModelAndView fileUpload2(FileVO fileVO) throws Exception 
	{

		ModelAndView mav = new ModelAndView("file/uploadResult");
		System.out.println("id : " + fileVO.getId());

		
		for(MultipartFile file : fileVO.getAttach())
		{
			if(file.isEmpty()) continue;
			System.out.println(file.getOriginalFilename());
		}
		return mav;
	}
}
