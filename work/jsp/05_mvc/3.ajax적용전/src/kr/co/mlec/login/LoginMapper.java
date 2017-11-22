package kr.co.mlec.login;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.common.MyAppSqlConfig;

public class LoginMapper {
	
	private final static String NS = "kr.co.mlec.login.LoginMapper.";
	private static SqlSession session;
	
	public LoginMapper () {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public Login detailMember(Login login) throws Exception {
		return session.selectOne(NS + "detailMember", login);		
	}
	
}
