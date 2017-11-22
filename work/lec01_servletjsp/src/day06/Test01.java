package day06;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import common.HanbitFileRenamcePloicy;

@WebServlet("/day06/test01")
public class Test01 extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//파일이 저장되는 폴더 관리
		//기본 업로드 root 폴더 + 현재 년도 / 월 / 일 / 시간
		String uploadPath = "C:/!SHOU/upload";
		
		SimpleDateFormat sdf = new SimpleDateFormat("/yy/MM/dd/HH");
		String subPath = sdf.format(new Date());

		File f = new File(uploadPath + subPath);
		
		if(!f.exists())
		{
			f.mkdirs();
		}
		
		//파일 업로드 라이브러리
		//- cos.jar, apache commons
		// 소스코드 다운 경로 : mvnrepository.com
		MultipartRequest mRequest = new MultipartRequest(request, 
														f.getPath(), 
														1024 * 1024 * 100, 
														"utf-8", 
														new HanbitFileRenamcePloicy());
		
		/*
		 * request, 
		saveDirecotry : 저장위치 
		maxPostSize : post 방식으로 넘어오는 사이즈크기 설정
		encoding : 파라미터 인코딩을 무엇으로 할거냐
		policy : 보안정책 동일 이름이 업로드 될때 어떤방식으로 파일이름을 변경해서 저정할건지 지정
		*/
		
		String msg = mRequest.getParameter("msg");
		System.out.println("msg : " + msg);
		System.out.println("파일 업로드 성공");
		
		//테이블에 파일 정보를 저장하기 위한 정보 추출
		//사용자가 파일을 선택새서 올린 경우에만 실행한다
		//file 이 null 일 경우는 사용자가 파일을 선택하지 않은 경우
		
		Enumeration<String> fNames = mRequest.getFileNames();
		
		while(fNames.hasMoreElements())
		{
			String fName = fNames.nextElement();
			
			File file = mRequest.getFile(fName);
			
			if(file != null)
			{
				long fileSize = file.length(); // 파일 크기
				String oriName = mRequest.getOriginalFileName(fName); //업로드시 원본 이름
				String systemName = mRequest.getFilesystemName(fName); //서버에 저장되는 이름
				System.out.println("파일 사이즈 : " + fileSize);
				System.out.println("원본 파일명 : " + oriName);
				System.out.println("서버 파일명 : " + systemName);
			}
		}
		
		/*String fName = "attachFile1";
		File file = mRequest.getFile(fName);
		
		if(file != null)
		{
			long fileSize = file.length(); // 파일 크기
			String oriName = mRequest.getOriginalFileName(fName); //업로드시 원본 이름
			String systemName = mRequest.getFilesystemName(fName); //서버에 저장되는 이름
			System.out.println("파일 사이즈 : " + fileSize);
			System.out.println("원본 파일명 : " + oriName);
			System.out.println("서버 파일명 : " + systemName);
		}*/
		
		
		
	}
	
	
	
	
	//화면에서 전송되는 데이터 확인 코드
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//화면에서 전송되는 데이터를 확인
		PrintWriter out = response.getWriter();
		
		//요청 body 에 들어온 내용을 확인
		InputStream in = request.getInputStream();
		Scanner sc = new Scanner(in);
		
		while(sc.hasNext())
		{
			out.println(sc.nextLine());
		}
		
		out.close();
	}*/
}
