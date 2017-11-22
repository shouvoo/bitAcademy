/*
 *   insert 
 *   delete
 *   detail
 *   modify
 * 	 list
 */
package kr.co.mlec.search;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.MyAppSqlConfig;

public class SearchMapper 
{
	
	private final static String NS = "search.SearchMapper.";
	
	private static SqlSession session;
	
	public SearchMapper () 
	{
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public void insertBoard(SearchDomain board)throws Exception 
	{
		session.insert(NS + "insertBoard", board);
	}
	
	public List<ReligionDomain> religionRead()
	{
		return session.selectList(NS + "religionRead");
	}
	
	public List<SchoolDomain> schoolRead()
	{
		return session.selectList(NS + "schoolRead");
	}
	
	public List<SkillDomain> skillRead()
	{
		return session.selectList(NS + "skillRead");
	}
	
	
}













