package jdbc;

import java.util.ArrayList;

public class JDBCLogicMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*ExamVO one = new ExamDAO().detail(10);
		if(one != null)
		{
			one.print();
		} else 
		{
			System.out.println("데이터 없음");
		}*/ //20170907 수정
		
		ArrayList<Test3VO> list3 = new ExamDAO().testList();
		
		for (Test3VO vo : list3) 
		{
			System.out.println(vo);
		}
		/*System.out.println("---------------------------------------------------------");
		new ExamDAO().test3Insert(new Test3VO(31, 87, 54, 1));
		
		ArrayList<Test3VO> list4 = new ArrayList<>();
		list4.add(new Test3VO(52, 87, 54, 1));
		list4.add(new Test3VO(53, 87, 54, 1));
		list4.add(new Test3VO(54, 87, 54, 1));
		list4.add(new Test3VO(55, 87, 54, 1));
		
		new ExamDAO().test3InsertList(list4);*/
		
	}
}
