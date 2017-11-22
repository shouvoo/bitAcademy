package jdbc;

import java.util.ArrayList;

public class JDBCLogicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExamVO one = new ExamDAO().detail(8);
		if(one !=null)
			one.print();
		else
			System.out.println("데이터 없음");
		
		
		ArrayList<ReportVO> list = new ExamDAO().reportList("final");
		
		for (ReportVO reportVO : list) {
			System.out.println(reportVO);
		}
		
	}

}
