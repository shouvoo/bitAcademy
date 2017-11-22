package kr.co.mlec.ajax;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.MyAppSqlConfig;

public class QuizMapper 
{
	
	private final static String NS = "ajax.QuizMapper.";
	
	private static SqlSession session;

	public QuizMapper() 
	{
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public String read(String id)
	{
		return session.selectOne(NS + "read", id);
	}
	
	public Test12_quiz_VO codeRead(String id)
	{
		return session.selectOne(NS + "codeRead", id);
	}
}










