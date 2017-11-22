package homeWork_20170901;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.List;
import java.util.Scanner;

class Line1
{
	private static String [][] stationArr = {{"��õ2", "����õ3", "������3", "��ȭ2", "�־�4", "����4", "����3", 
												"����3", "���3", "����3", "�ΰ�2", "�۳�2", "�ߵ�4", "��õ5", 
												"�һ�3", "����4", "�¼�3", "������2", "����2",  "����2", "����3", 
												"�ŵ���4", "������4", "�ű�4", "���5", "�뷮��3", "���4", "����3", 
												"����4", "��û5", "����3", "����3��2", "����5��2", "���빮2", "������3", 
												"�ż���3", "���⵿3", "û����4", "ȸ��3", "�ܴ��4", "���̹�4", "����4", 
												"�����2", "����2", "��õ3", "â��2", "����3", "����3", "������3", "������4", 
												"ȸ��5", "������2", "����2", "����3", "����5", "����4", "����4", "����õ�߾�3", 
												"����2", "����õ2", "�ҿ��2"},
							
												{"����2", "��������д���3", "����3", "��õ��û3", "����3", "����4", "�Ⱦ�4", 
												"����2", "����2", "����2", "����5", "�ǿ�5", "���հ���5", "ȭ��3", "����3", 
												"����2", "����4", "����4", "�����3", "����2", "����2", "��ź5", "������3", 
												"����3", "����4", "��ȯ4", "����3", "����5", "õ��3", "����3", "�ֿ�(���緺��)4", 
												"�ƻ�2", "����3", "���3", "�¾��õ5", "��â(��õ���)5"},
												
												{"��õ��û3", "����5"},
												
												{"����4", "����ź4" }};

	public static String[][] getStationArr() 
	{
		return stationArr;
	}
	
	

}

class MakeLine
{
	private int lineNumber;
	private List lineList = new ArrayList(); 
	private String [][] stationArr;
	
	public MakeLine(int lineNumber, String [][] stationArr) 
	{
		// TODO Auto-generated constructor stub.
		this.lineNumber = lineNumber;
		this.lineList = lineList;
		this.stationArr = stationArr;
		addList(lineList, stationArr);
	}
	
	public int getLineNumber() 
	{
		return lineNumber;
	}
	public List getLineList() 
	{
		return lineList;
	}
	
	private void addList(List l, String [][] a)
	{
		for (String[] arr1 : a) 
		{
			List l2 = new ArrayList();
			for (String arr2 : arr1) 
			{
				l2.add(arr2);
			}
			l.add(l2);
		}
		
		new InputScanner(this.lineList);
	}
	
}

class FindStation
{
	List list;
	String findStation = "";
	List returnList;
	
	public FindStation() 
	{
		// TODO Auto-generated constructor stub
		
	}
	
	public List find(List list, String findStation)
	{
		this.findStation = findStation;
		this.list = list;
		returnList = new ArrayList();
		
		
		for (int i = 0; i < this.list.size(); i++) 
		{
			List subList = (List)this.list.get(i);
			for (int j = (i > 0) ? 1 : 0; j < subList.size(); j++) 
			{
				if(Pattern.matches(this.findStation + ".*", subList.get(j).toString()))
				{
					String str = subList.get(j).toString();
					returnList.add(str.substring(0, str.length()));
				}
			}
		}
		
		return returnList;
	}
}

class Calculation
{
	List resultList;
	List lineList;
	int moveStation;
	int moveTime = 0;
	List calList;
	List sInfo;
	List eInfo;
	
	InputScanner is;
	
	public Calculation(InputScanner is) 
	{
		this.is = is;
		this.resultList = is.resultList;
		this.lineList = is.argList;
		getStation();
		checkStation();
		checkTime();
		print();
	}
	
	private void getStation()
	{
		calList = new ArrayList();
		int s = 0;
		for (int i = 0; i < resultList.size(); i++) 
		{
			List childList = new ArrayList();
			for (int j = 0; j < lineList.size(); j++) 
			{
				List checkList = (List)lineList.get(j);
				s = checkList.indexOf(resultList.get(i));
				if(s != -1) 
				{
					childList.add(j);
					childList.add(s);
				}
			}
			calList.add(childList);
		}
		
		sInfo = (List)calList.get(0);
		eInfo = (List)calList.get(1);
	}
	
	private void checkStation()
	{
		if((int)sInfo.get(0) == (int)eInfo.get(0))
		{
			moveStation = Math.abs((int)sInfo.get(1) - (int)eInfo.get(1));
		} else 
		{
			System.out.println(eInfo.get(0));
			//List sList = (List)this.lineList.get((int)eInfo.get(0));
			//System.out.println(sList.get(0));
		}
	}
	
	private void checkTime()
	{
		for (int i = (int)sInfo.get(1); i <= (int)eInfo.get(1); i++) 
		{
			List sub = (List)this.lineList.get(0);
			String timeStr = sub.get(i).toString();
			int stationTime = Integer.valueOf(timeStr.substring(timeStr.length() - 1, timeStr.length()));
			if(i > (int)sInfo.get(1)) moveTime += stationTime;
		}
	}
	
	private void print()
	{		
		String str = "��߿� : " + is.startStation + " ----> " + "������ : " + is.endStation +  "\n" + 
						"�̵� �� ���� : " + moveStation + "������" +  "\n" + 
						"�ҿ�ð� : " + moveTime + "��";
		System.out.print(str);
	}
}

class InputScanner
{
	List argList;
	Scanner sc;
	String input;
	FindStation fs;
	List findList;
	List resultList;
	String resultCommnet = "���", startStation,  endStation;
	
	
	public InputScanner(List list) 
	{
		argList = list;
		resultList = new ArrayList();
		loop(resultCommnet + "�Ͻ� ���� �Է��� �ּ���!");
	}
	
	private void scanner()
	{
		sc = new Scanner(System.in);
		input = sc.nextLine();
	}
	
	private void loop(String str)
	{
		System.out.println(str);
		scanner();
		fs = new FindStation();
		findList = fs.find(argList, input);
		choiceStation();
	}
	
	private void choiceStation()
	{
		
		if(findList.size() == 0) 
		{
			System.out.println("�ٽ� �Է��� �ּ���!");
			loop("");
			return;
		}
		else 
		{
			String str = "";
			String tossStr = "";
			
			if(findList.size() > 1)
			{
				System.out.println(resultCommnet + "�Ͻ� ���� ������ �ּ���!");
				for (int i = 0; i < findList.size(); i++) 
				{
					tossStr = findList.get(i) + "";
					str = tossStr.substring(0, tossStr.length() - 1) + "��";
					System.out.print((i + 1) + "." + str + "\t");
					
				}
				scanner();
				
				tossStr = findList.get(Integer.parseInt(input) - 1) + "";
				str = tossStr.substring(0, tossStr.length() - 1) + "��";
			} else 
			{
				tossStr = findList.get(0) + "";
				str = tossStr.substring(0, tossStr.length() - 1) + "��";
				
			}
			
			
			System.out.println(resultCommnet + "��  :  " + str);
			resultList.add(tossStr);
			if(resultCommnet == "����") 
			{
				endStation = str;
				return;
			}else 
			{
				startStation = str;
			}
			
			resultCommnet = "����";
			loop(resultCommnet + "�Ͻ� ���� �Է��� �ּ���!");
		}
		
		System.out.println("----------------------------------------------------------");
		System.out.println();
		System.out.println();
		new Calculation(this);		
	}
}

public class HomeWorkMain 
{
	public static void main(String[] args) 
	{
		/*����ö �뼱���� �����ϼ��� 
		����ö ��
		����ȣ, ���̸�, ���ҿ�ð�
		�˻� : ���ۿ�, ������ -> �������� �˻��� ���� ������� �� ��
		��� : ��𿪺��� ��� ����, �� ����, �ҿ�ð�
		���� / �ָ� ������ ������� �� ��*/
		//Line1 l1 = new Line1();
		MakeLine line1 = new MakeLine(1, Line1.getStationArr());
		
		
	}
}
