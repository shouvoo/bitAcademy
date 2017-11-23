package db.repository.mapper;

import java.util.List;

import db.repository.vo.Member;

public interface MemberMapper {

	public List<Member> selectMember() throws Exception;
	
	public Member selectMemberById(String id) throws Exception;
	
	public void insertMember(Member member) throws Exception;
	
	public void updateMember(Member member) throws Exception;
	
	public void deleteMember(String id) throws Exception;
}
