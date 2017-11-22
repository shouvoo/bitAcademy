package restaurant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import common.ConnectionPool;

public class RestDAO {
	PreparedStatement ptmt;
	Connection con = null;
	ResultSet rs;
	StringBuffer sb;
	
	public void insertRest(RestVO rest) throws Exception {
		//t17_board 테이블에 데이터를 입력
		try {			
			con = ConnectionPool.getConnection();
			sb = new StringBuffer();
			sb.append("insert into RESTAURANT (");
			sb.append("name, street, flavor, price, etc, addr, fla)");
			sb.append("values (");
			sb.append("?,?,?,?,?,?,?) ");
			
			ptmt = con.prepareStatement(sb.toString());
			
			int index = 1;
			ptmt.setString(index++, rest.getName());
			ptmt.setString(index++, rest.getStreet());
			ptmt.setString(index++, rest.getFlavor());
			ptmt.setString(index++, rest.getPrice());
			ptmt.setString(index++, rest.getAddr());
			if(rest.getEtc().equals(""))
				rest.setEtc("``");
			ptmt.setString(index++, rest.getEtc());
			ptmt.setInt(index++, rest.getFla());
			ptmt.executeUpdate();
			
		} catch (SQLException e) {
			throw e;
		} finally {
			ConnectionPool.releaseConnection(con);
			//close();
		}
	}
	
	public RestVO JungBok(RestVO rest) throws Exception {
		try {
			con = ConnectionPool.getConnection();
			sb = new StringBuffer();
			sb.append("select * from todayrest ")
			  .append("where to_char(reg_date, 'yyyy-mm-dd') = ")
			  .append("? and ip = ?");
			
			ptmt = con.prepareStatement(sb.toString());
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			ptmt.setString(1, sdf.format(new Date()));
			ptmt.setString(2, rest.getIp());
			
			rs = ptmt.executeQuery();
			
			if(rs.next()) {
				rest.setChk(true);
				rest.setRegDate(rs.getString("reg_date"));
				rest.setName(rs.getString("name"));
				
				return rest;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally {
			try {
				//close();
				ptmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			ConnectionPool.releaseConnection(con);
		}
		return rest;
	}
	
	public void TodayinsertRest(RestVO rest) throws Exception {
		//t17_board 테이블에 데이터를 입력
		try {
			con = ConnectionPool.getConnection();
			sb = new StringBuffer();
			sb.append("insert into todayrest (");
			sb.append("name, ip)");
			sb.append("values (");
			sb.append("?,?) ");
			
			ptmt = con.prepareStatement(sb.toString());
			
			ptmt.setString(1, rest.getName());
			ptmt.setString(2, rest.getIp());

			ptmt.executeUpdate();
			
		} catch (SQLException e) {
			throw e;
		} finally {
			ConnectionPool.releaseConnection(con);
			//close();
		}
	}
	
	public RestVO randomRest(int no, String flavor) throws Exception {
		RestVO rest = new RestVO();
		try {
			con = ConnectionPool.getConnection();
			sb = new StringBuffer();
			sb.append("select * from (select rownum as no, restaurant.* from restaurant where flavor = ?) where no = ?");
			
			ptmt = con.prepareStatement(sb.toString());
			
			ptmt.setString(1, flavor);
			ptmt.setInt(2, no);

			rs = ptmt.executeQuery();

			if(rs.next()) {
				rest.setName(rs.getString("Name"));
			}
			
			return rest;
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally {
			try {
				//close();
				ptmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			ConnectionPool.releaseConnection(con);
		}
	}
	
	public List<RestVO> listRest(String order, int page) throws Exception {
		List<RestVO> list = new ArrayList<RestVO>();
		try {
			con = ConnectionPool.getConnection();
			sb = new StringBuffer();
			//sb.append("select * from RESTAURANT order by "+order);
			sb.append("select * from (select rownum as no, ")
			  .append("rest.* from (select * from restaurant ")
			  .append("order by ")
			  .append(order)
			  .append(") rest) ");
			if(page != 0) {
				sb.append("where no between ")
				  .append(page*5-4)
				  .append("and ")
				  .append(page*5);
				
			//5 = 한 페이지에 출력할 게시물
			}
			
			ptmt = con.prepareStatement(sb.toString());

			rs = ptmt.executeQuery();

			while(rs.next()) {
				RestVO rest = new RestVO();
				rest.setEtc(rs.getString("etc"));
				rest.setFlavor(rs.getString("flavor"));
				rest.setName(rs.getString("Name"));
				rest.setPrice(rs.getString("Price"));
				rest.setStreet(rs.getString("Street"));
				rest.setAddr(rs.getString("addr"));

				list.add(rest);
			}
			
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally {
			try {
				//close();
				ptmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			ConnectionPool.releaseConnection(con);
		}
	}
	
	public int Page() throws Exception {
		try {
			con = ConnectionPool.getConnection();
			sb = new StringBuffer();
			sb.append("select count(*) ")
			  .append("from restaurant");
			
			ptmt = con.prepareStatement(sb.toString());

			rs = ptmt.executeQuery();

			if(rs.next()) {
				return rs.getInt(1);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally {
			try {
				//close();
				ptmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			ConnectionPool.releaseConnection(con);
		}
		return 0;
	}
	
	public int Page(String flavor) throws Exception {
		try {
			con = ConnectionPool.getConnection();
			sb = new StringBuffer();
			sb.append("select count(*) ")
			  .append("from restaurant where flavor = ?");
			
			ptmt = con.prepareStatement(sb.toString());
			
			ptmt.setString(1, flavor);

			rs = ptmt.executeQuery();

			if(rs.next()) {
				return rs.getInt(1);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally {
			try {
				//close();
				ptmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			ConnectionPool.releaseConnection(con);
		}
		return 0;
	}
	
	public List<RestVO> TodaylistRest() throws Exception {
		List<RestVO> list = new ArrayList<RestVO>();
		try {
			con = ConnectionPool.getConnection();
			sb = new StringBuffer();
			sb.append("select * from todayrest ")
			  .append("where to_char(reg_date, 'yyyy-mm-dd') = ")
			  .append("?"); 
			
			ptmt = con.prepareStatement(sb.toString());
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			ptmt.setString(1, sdf.format(new Date()));
			
			rs = ptmt.executeQuery();

			while(rs.next()) {
				RestVO rest = new RestVO();
				rest.setName(rs.getString("Name"));
				rest.setIp(rs.getString("ip"));

				list.add(rest);
			}
			
			return list;
			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		} finally {
			try {
				//close();
				ptmt.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			ConnectionPool.releaseConnection(con);
		}
	}
}
