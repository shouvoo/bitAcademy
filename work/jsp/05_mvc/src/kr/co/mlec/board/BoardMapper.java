/*
 *   insert 
 *   delete
 *   detail
 *   modify
 * 	 list
 */
package kr.co.mlec.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import kr.co.mlec.common.MyAppSqlConfig;

public interface BoardMapper
{	
	public void insertBoard(BoardDomain board) throws Exception;
	public void modifyBoard(BoardDomain board) throws Exception;
	public void deleteBoard(int no) throws Exception;
	public BoardDomain detailBoard(int no) throws Exception;
	public List<BoardDomain> listBoard() throws Exception;
}













