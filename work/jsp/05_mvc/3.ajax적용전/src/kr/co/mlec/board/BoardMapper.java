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

public class BoardMapper {
	
	private final static String NS = "board.BoardMapper.";
	
	private static SqlSession session;
	
	public BoardMapper () {
		session = MyAppSqlConfig.getSqlSessionInstance();
	}
	
	public void insertBoard(BoardDomain board)
			throws Exception {
		session.insert(NS + "insertBoard", board);
	}
	public void modifyBoard(BoardDomain board) 
			throws Exception {
		session.update(NS + "modifyBoard", board);
	}
	public void deleteBoard(int no) throws Exception {
		session.delete(NS + "deleteBoard", no);
	}
	
	public BoardDomain detailBoard(int no) throws Exception {
		return session.selectOne(NS + "detailBoard", no);
	}
	
	public List<BoardDomain> listBoard() throws Exception {
		return session.selectList(NS + "listBoard");
	}
}













