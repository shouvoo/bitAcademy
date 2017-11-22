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
		System.out.println("---------------------------------");
		ArrayList<Test3VO> list3 = new ExamDAO().testList();
		
		for (Test3VO vo: list3) {
			System.out.println(vo);
		}
		System.out.println("---------------------------------");
		//new ExamDAO().test3Insert(new Test3VO(31, 4,5,1));
		
		
		
		/*ArrayList<Test3VO> list4 = new ArrayList<>();
		
		list4.add(new Test3VO(62, 4,5,1));
		list4.add(new Test3VO(63, 4,5,1));
		list4.add(new Test3VO(64, 4,5,1));
		list4.add(new Test3VO(65, 4,5,1));
		
		new ExamDAO().test3InsertList(list4);*/
		
		new ExamDAO().test3Update(new Test3VO(31, 84,85,2));
		new ExamDAO().test3Delete(new Test3VO(31, 0,85,0));
		
	}

}
