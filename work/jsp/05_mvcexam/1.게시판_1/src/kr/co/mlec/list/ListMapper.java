/*
 *   insert 
 *   delete
 *   detail
 *   modify
 * 	 list
 */
package kr.co.mlec.list;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.MyAppSqlConfig;

public class ListMapper 
{
	
	private final static String NS = "list.ListMapper.";
	
	private static SqlSession session;

	public ListMapper() 
	{
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public List<ListDomain> getTemplesList()
	{
		return session.selectList(NS + "getTemplesList");
	}
}













