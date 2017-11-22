package jdbc;

import java.util.ArrayList;
import java.util.HashMap;

interface ExamExec{
	Object execute(Object obj);
}

public class LamdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//;
		HashMap<String, ExamExec> map = new HashMap<>();
		
		map.put("list", (obj)->new ExamDAO().reportList((String)obj));
		map.put("detail", (obj)->new ExamDAO().detail((int)obj));
		map.put("insert",(obj)->{new ExamDAO().test3Insert((Test3VO)obj); return 1;} );
		
		
		
		
		for (ReportVO oo : (ArrayList<ReportVO>)map.get("list").execute("semi")) {
			System.out.println(oo);
		}
		
		System.out.println(map.get("detail").execute(1));
		
		
	}

}
