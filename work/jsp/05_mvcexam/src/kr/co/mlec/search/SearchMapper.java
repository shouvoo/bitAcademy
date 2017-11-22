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
import kr.co.mlec.list.ListDomain;

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
	
	public List<ListDomain> getTemplesList()
	{
		return session.selectList(NS + "getTemplesList");
	}
	
	public List<ListDomain> getResultList(ListDomain ld)
	{
		return session.selectList(NS + "getResultList", ld);
	}

}













