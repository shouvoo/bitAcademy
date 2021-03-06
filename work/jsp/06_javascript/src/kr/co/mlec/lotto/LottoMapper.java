/*
 *   insert 
 *   delete
 *   detail
 *   modify
 * 	 list
 */
package kr.co.mlec.lotto;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import common.MyAppSqlConfig;

public class LottoMapper 
{
	
	private final static String NS = "lotto.LottoMapper.";
	
	private static SqlSession session;

	public LottoMapper() 
	{
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public void insert(LottoDomain ld)
	{
		session.insert(NS + "insert", ld);
	}
	
	public List<LottoDomain> read()
	{
		return session.selectList(NS + "read");
	}
}













