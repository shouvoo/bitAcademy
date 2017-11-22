package kr.co.mlec.login;

import org.apache.ibatis.session.SqlSession;

import kr.co.mlec.common.MyAppSqlConfig;

public interface LoginMapper {
	public Login detailMember(Login login) throws Exception;
	
}
