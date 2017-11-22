package homeWork_20170908;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class InputScanner 
{
	String firstGuidance = "1.회원가입  2.회원탈퇴";
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
				print("보기를 선택해 주세요");
				input = sc.nextLine();
				if(Integer.parseInt(input) != 1 && Integer.parseInt(input) != 2)
				{
					throw new Exception("보기의 번호중에 다시 입력해 주세요!");
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
		print(title + "(를)을 입력해 주세요!");
		name:while(true)
		{
			input = sc.nextLine();
			if(input.length() <= limit)
			{
				print(title + "(는)은 " + limit + "자 이상이어야 합니다");
			}
			
			inpuTm.put(title, input);
			break name;
		}
	}
	
	void signUp()
	{
		
		inpuTm = new TreeMap<>();
		db = new DataBank();
		print("회원가입을 선택해 주셨습니다!");
		
		setData("이름", 2);
		setData("아이디", 2);
		setData("비밀번호", 2);
		setData("전화번호", 9);

		DataBank db = new DataBank(inpuTm.get("이름"), inpuTm.get("아이디"), 
				inpuTm.get("비밀번호"), inpuTm.get("전화번호"));
		
		insertDbList.add(db);
		continueAdd();		
		
		/*new ConnectionMain().insertMultiData(insertDbList);
		resultPrint();*/
	}
	
	public void withdrawal()
	{
		
		inpuTm = new TreeMap<>();
		print("회원탈퇴를 선택해 주셨습니다!");
		setData("이름", 2);		
		deleteList.add(inpuTm.get("이름"));
		continueDelete();
		/*new ConnectionMain().deleteMultiData(deleteList);
		resultPrint();*/
	}
	
	public void continueAdd()
	{
		switchNum = 4;
		print("다른 회원의 가입을 원하시면 1번 종료를 원하시면 2번");
		initInput();
	}
	
	public void continueDelete()
	{
		switchNum = 2;
		print("다른 회원의 탈퇴를 원하시면 1번 종료를 원하시면 2번");
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

























