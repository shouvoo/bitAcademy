package com.omp.repository.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omp.repository.domain.ClassBoard;
import com.omp.repository.domain.CommentBoard;
import com.omp.repository.domain.FileBoard;
import com.omp.repository.domain.LikeHate;
import com.omp.repository.domain.Study;
import com.omp.repository.mapper.StudyMapper;

@Service("studyService")
public class StudyServiceImpl implements StudyService {

	@Autowired
	private StudyMapper mapper;
	
	@Override
	public List<Study> monthTitleList(String month) throws Exception {
		return mapper.monthTitleList(month);
	}
	
	@Override
	public void titleInsert(Study study) throws Exception {
		mapper.titleInsert(study);
	}
	
	@Override
	public void titleUpdate(Study study) throws Exception {
		mapper.titleUpdate(study);
	}
	
	@Override
	public List<Study> dayTitleList(String day) throws Exception {
		return mapper.dayTitleList(day);
	}
	
	@Override
	public List<ClassBoard> classBoardList(Integer no) throws Exception {
		return mapper.classBoardList(no);
	}
	
	@Override
	public int classNo() throws Exception {
		return mapper.classNo();
	}
	
	@Override
	public int classBoardNo() throws Exception {
		return mapper.classBoardNo();
	}
	
	@Override
	public void classBoardInsert(ClassBoard board) throws Exception {
		mapper.classBoardInsert(board);
	}
	
	@Override
	public ClassBoard classBoardDetail(int no) throws Exception {
		return mapper.classBoardDetail(no);
	}
	
	@Override
	public void up(int no) throws Exception {
		mapper.up(no);
	}
	
	@Override
	public void file(FileBoard file) throws Exception {
		mapper.file(file);
	}
	
	@Override
	public List<FileBoard> fileList(int no) throws Exception {
		return mapper.fileList(no);
	}
	
	@Override
	public List<CommentBoard> comment(int no) throws Exception {
		return mapper.comment(no);
	}
	
	@Override
	public void commentInsert(CommentBoard board) throws Exception {
		mapper.commentInsert(board);
	}
	
	@Override
	public int like(int no) throws Exception {
		return mapper.like(no);
	}
	
	@Override
	public int hate(int no) throws Exception {
		return mapper.hate(no);
	}
	
	@Override
	public String likeJung(LikeHate like) throws Exception {
		return mapper.likeJung(like);
	}
	
	@Override
	public void likeHate(LikeHate like) throws Exception {
		mapper.likeHate(like);
	}
	
	@Override
	public void likeup(LikeHate like) throws Exception {
		mapper.likeup(like);
	}
}
