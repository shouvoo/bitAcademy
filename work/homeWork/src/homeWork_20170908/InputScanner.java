package homeWork_20170908;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class InputScanner 
{
	String firstGuidance = "1.ȸ������  2.ȸ��Ż��";
	Scanner sc;
	String input;
	TreeMap<String, String> inpuTm;
	DataBank db;
	int selectId;
	int switchNum = 0;
	ArrayList<DataBank> insertDbList;
	ArrayList<String> deleteList;
	
	public InputScanner() 
	{
		// TODO Auto-generated constructor stub
		print(firstGuidance);
		insertDbList = new ArrayList<>();
		deleteList = new ArrayList<>();
		sc = new Scanner(System.in);
	}
	
	public void print(String str)
	{
		System.out.println(str);
	}
	
	public void initInput()
	{
		while(true)
		{
			try 
			{
				print("���⸦ ������ �ּ���");
				input = sc.nextLine();
				if(Integer.parseInt(input) != 1 && Integer.parseInt(input) != 2)
				{
					throw new Exception("������ ��ȣ�߿� �ٽ� �Է��� �ּ���!");
				}
				selectId = Integer.parseInt(input);
				System.out.println(selectId + switchNum);
				if(selectId + switchNum  == 1) signUp();
				else if(selectId + switchNum   == 2) withdrawal();
				else if(selectId + switchNum   == 3) withdrawal();
				else if(selectId + switchNum   == 4) 
				{
					System.out.println(deleteList);
					new ConnectionMain().deleteMultiData(deleteList);
					resultPrint();
					break;
				}
				else if(selectId + switchNum   == 5)	signUp();
				else if(selectId + switchNum   == 6) 
				{
					new ConnectionMain().insertMultiData(insertDbList);
					resultPrint();	
					break;
				};
				
				System.out.println(selectId + switchNum);
				break;
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		}
	}
	
	void setData(String title, int limit)
	{
		print(title + "(��)�� �Է��� �ּ���!");
		name:while(true)
		{
			input = sc.nextLine();
			if(input.length() <= limit)
			{
				print(title + "(��)�� " + limit + "�� �̻��̾�� �մϴ�");
			}
			
			inpuTm.put(title, input);
			break name;
		}
	}
	
	void signUp()
	{
		
		inpuTm = new TreeMap<>();
		db = new DataBank();
		print("ȸ�������� ������ �ּ̽��ϴ�!");
		
		setData("�̸�", 2);
		setData("���̵�", 2);
		setData("��й�ȣ", 2);
		setData("��ȭ��ȣ", 9);

		DataBank db = new DataBank(inpuTm.get("�̸�"), inpuTm.get("���̵�"), 
				inpuTm.get("��й�ȣ"), inpuTm.get("��ȭ��ȣ"));
		
		insertDbList.add(db);
		continueAdd();		
		
		/*new ConnectionMain().insertMultiData(insertDbList);
		resultPrint();*/
	}
	
	public void withdrawal()
	{
		
		inpuTm = new TreeMap<>();
		print("ȸ��Ż�� ������ �ּ̽��ϴ�!");
		setData("�̸�", 2);		
		deleteList.add(inpuTm.get("�̸�"));
		continueDelete();
		/*new ConnectionMain().deleteMultiData(deleteList);
		resultPrint();*/
	}
	
	public void continueAdd()
	{
		switchNum = 4;
		print("�ٸ� ȸ���� ������ ���Ͻø� 1�� ���Ḧ ���Ͻø� 2��");
		initInput();
	}
	
	public void continueDelete()
	{
		switchNum = 2;
		print("�ٸ� ȸ���� Ż�� ���Ͻø� 1�� ���Ḧ ���Ͻø� 2��");
		initInput();
	}
	
	public void resultPrint()
	{
		ArrayList<DataBank> showDBList = new ConnectionMain().getData();
		for (DataBank showDB : showDBList) 
		{
			showDB.print();
		}
	}
}

























