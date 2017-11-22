package io_p;

import java.io.File;
import java.util.Date;

public class FileMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//File ff = new File("fff"); // 폴더 존재 유무 확인
		File ff = new File("fff/aaa.txt");
		
		/*String [] aa = ff.getName().split(".");
		System.out.println(aa.toString());*/
		
		System.out.println(ff.exists()); // 파일 존재 유뮤확인
		System.out.println(ff.getName()); // 파일 이름 확인
		System.out.println(ff.getPath()); // 파일 이름 확인
		System.out.println(ff.getParent()); // 상위 폴더 이름 확인
		System.out.println(ff.canRead()); // 읽기 가증한지
		System.out.println(ff.canWrite()); // 쓰기 가증한지
		System.out.println(ff.isHidden()); // 숨김 파일인지
		System.out.println(ff.isFile()); // 파일인지
		System.out.println(ff.isDirectory()); // 폴더인지
		System.out.println(ff.length()); // 파일 내부의 글자수
		System.out.println(new Date(ff.lastModified())); // 언제 마지막 수정되었는지
		System.out.println(ff.getAbsolutePath()); // 절대 좌표
		
		File [] list = new File("fff").listFiles();
		
		for (File file : list) 
		{
			System.out.println(file.getName());
		}
		
		File newFF = new File("fff/xxx/bbb");
		//newFF.mkdir(); // 단일 폴더만 만들수있음
		newFF.mkdirs(); //폴더를 생성(하위 폴더까지 같이만들어준다
		//newFF.delete(); //마지막 폴더만 삭제
		
		File delFF = new File("fff/bbb.txt");
		delFF.delete();
		
		/*//지정한 폴더의 파일을 각각 종류별로 지정 폴더에 저장하시오

		/// 하위 폴더까지 검색하세요

		/// 같은 파일명인 경우 중복 처리 하세요

		//이미지 : bmp, jpg, gif, png 

		//음악 : mp3, wma, wav

		//문서 :doc, hwp, ppt, xls, pptx, xlsx. docx

		//가사 :txt

		//기타 : 위의 분류 이외

		//확장자의 대소문자 구분하지 않음

		 -------------------------------------------------------------------------------------------------------------

		 

		///음악파일을 장르별로 폴더에 저장하세요

		/// 같은 파일명인 경우 중복 처리 하세요

		/// 하위 폴더까지 검색하세요

		/// 저장시 - 장르 폴더 - 국내, 국외  별로 구분하여 저장하세요

		///  파일 정보 


		    1- 노래제목

		    2- 장르

		    3- 가수

		    4- 국적

		    5- 가사*/

		 



	}

}
