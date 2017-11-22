package kr.co.mlec.member.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.db.MyAppSqlConfig;
import kr.co.mlec.member.domain.Member;
import kr.co.mlec.member.domain.Search;


public class MemberMapper {

	private static SqlSession session;
	private final static String NS = "kr.co.mlec.member.mapper.MemberMapper.";
	
	public MemberMapper() throws Exception {
		session = MyAppSqlConfig.getSqlSessionInstance();
		System.out.println(session);
//		test01(); //결과가 하나일 경우
//		test02(); // 리스트 형태
//		insertMember();
//		updateMember();
//		deleteMember();
//		selectForeach();
		dynamicSelect();
	}
	
	public void test01() throws Exception 
	{
		//member.xml 에 있는 id 가 getMemberInfo1 인 태그를 호출하고 결과 받기
		//xml 에 있는 sql 을 호출하기 위해서 sqlSession 객체가 필요하다
		
		/*Member member = session.selectOne(NS + "getMemberInfo1", "member-1");
		
		System.out.println(member.getId());
		System.out.println(member.getName());
		System.out.println(member.getEmail());
		System.out.println(member.getAddr());*/
		
		/*Member param = new Member();
		param.setId("member-1");
		param.setName("sbc");
		Member member = session.selectOne(NS + "getMemberInfo2", param);
		
		System.out.println(member.getId());
		System.out.println(member.getName());
		System.out.println(member.getEmail());
		System.out.println(member.getAddr());*/
		
		/*String name = session.selectOne(NS + "getMemberInfo3", "member-2");
		System.out.println(name);*/
		
		/*int count = session.selectOne(NS + "getMemberInfo4");
		System.out.println(count);*/
	}

	private void test02() throws Exception 
	{
		/*List<Member> lsit = session.selectList(NS + "getMemberList1");
		for (Member member : lsit) 
		{
			System.out.println(member.getId() + "  : "  + member.getName());
		}*/
		
		/*List<String> list = session.selectList(NS + "getMemberList2");
		System.out.println(list);*/
		
		List<Member> lsit = session.selectList(NS + "getMemberList3");
		for (Member member : lsit) 
		{
			System.out.println(member.getId() + "  : "  + member.getName() + "  : " + member.getJoinDate());
		}
		
	}

	private void insertMember() throws Exception 
	{
		Member param = new Member();
		param.setId("member-5");
		param.setName("홍길동");
		param.setEmail("hong@a.com");
		param.setAddr("제주도");
		session.insert(NS + "insertMember", param);
		session.commit();
		System.out.println("등록성공!!!!");
	}
	
	private void updateMember() throws Exception 
	{
		//아이디가 member-5인 사용자의 주소를 경기도, 이메일을 b@b.com 으로 변경
		Member param = new Member();
		param.setAddr("경기도");
		param.setEmail("b@b.com");
		param.setId("member-5");
		session.update(NS + "updateMember", param);
		session.commit();
		System.out.println("수정성공!!!!");
	}
	
	private void deleteMember() throws Exception
	{
		//member-5 아이디 가진 회원 삭제
		session.delete(NS + "deleteMember", "member-5");
		session.commit();
		System.out.println("삭제성공!!!!");
	}
	
	private void selectForeach() throws Exception 
	{
		Member param = new Member();
		param.setAddrs(new String[] {"busan", "seoul"});
		List<Member> list = session.selectList(NS + "getMemberIteratorList", param);
		for (Member member : list) 
		{
			System.out.println(member.getId());
			System.out.println(member.getName());
			System.out.println(member.getAddr());
			
			System.out.println();
			System.out.println();
			System.out.println();
		}
	}
	
	private void dynamicSelect( ) throws Exception 
	{
		Member param = new Member();
		param.setId("ber-1");
		param.setName("s");
		List<Member> list = session.selectList(NS + "getMemberSearchList2", param);
		
		for (Member m : list) 
		{
			System.out.println(m.getId() + " : " + m.getName());
		}
		
		
		/*Search param = new Search();
		param.setSearchType("id");
		param.setSearchWord("b");
		
		List<Member> list = session.selectList(NS + "getMemberSearchList", param);
		
		for (Member m : list) 
		{
			System.out.println(m.getId() + " : " + m.getName());
		}*/

		
		/*List<Member> list = session.selectList(NS + "getMemberIncludeList");
		int count = session.selectOne(NS + "getMemberIncludeListCount");
		
		for (Member member : list) 
		{
			System.out.println(member.getId());
		}
		
		System.out.println("회원수 : " + count);*/
		
		
	}

	public static void main(String[] args) {
		try {
			new MemberMapper();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
