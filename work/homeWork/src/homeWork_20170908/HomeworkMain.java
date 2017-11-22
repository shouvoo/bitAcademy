package homeWork_20170908;

import java.util.ArrayList;
import java.util.TreeMap;

public class HomeworkMain
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		/*ArrayList<DataBank> dbList = new ConnectionMain().getData();
		ArrayList<String> deleteList = new ArrayList<>();
		deleteList.add("레퀴엠");
		deleteList.add("키아누");
		deleteList.add("byby");
		new ConnectionMain().deleteMultiData(deleteList);
		
		for (DataBank db : dbList) 
		{
			db.print();
		}
		
		ArrayList<DataBank> insertList = new ArrayList<>();
		insertList.add(new DataBank("브래드", "brad", "1234", "010-123-4567"));
		insertList.add(new DataBank("자레드", "reto", "1234", "010-4567-9558"));
		insertList.add(new DataBank("레퀴엠", "rqq", "1234", "010-9874-8794"));
		insertList.add(new DataBank("키아누", "good", "1234", "010-357-1354"));
		insertList.add(new DataBank("byby", "boy", "1234", "010-468-5468"));
		
		new ConnectionMain().insertMultiData(insertList);*/ //테스트
		
		/*ArrayList<DataBank> dbList = new ConnectionMain().getData();
		for (DataBank db : dbList) 
		{
			db.print();
		}*/ //테스트
		
		InputScanner ip = new InputScanner();
		ip.initInput();
	}

}
