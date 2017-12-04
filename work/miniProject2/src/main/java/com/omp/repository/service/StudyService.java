package com.omp.repository.service;

import java.util.List;

import com.omp.repository.domain.ClassBoard;
import com.omp.repository.domain.CommentBoard;
import com.omp.repository.domain.FileBoard;
import com.omp.repository.domain.LikeHate;
import com.omp.repository.domain.Study;

public interface StudyService {
	public List<Study> monthTitleList(String month) throws Exception;
	public void titleInsert(Study study) throws Exception;
	public void titleUpdate(Study study) throws Exception;
	public List<Study> dayTitleList(String day) throws Exception; 
	public List<ClassBoard> classBoardList(Integer no) throws Exception; 
	public int classNo() throws Exception;
	public int classBoardNo() throws Exception;
	public void classBoardInsert(ClassBoard board) throws Exception;
	public ClassBoard classBoardDetail(int no) throws Exception;
	public void up(int no) throws Exception;
	public void file(FileBoard file) throws Exception;
	public List<FileBoard> fileList(int no) throws Exception;
	public List<CommentBoard> comment(int no) throws Exception;
	public void commentInsert(CommentBoard board) throws Exception;
	public int like(int no) throws Exception;
	public int hate(int no) throws Exception;	
	public String likeJung(LikeHate like) throws Exception;	
	public void likeHate(LikeHate like) throws Exception;	
	public void likeup(LikeHate like) throws Exception;	
}
 