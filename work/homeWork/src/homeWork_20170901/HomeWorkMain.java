package homeWork_20170901;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.List;
import java.util.Scanner;

class Line1
{
	private static String [][] stationArr = {{"인천2", "동인천3", "제물포3", "도화2", "주안4", "간석4", "간석3", 
												"동암3", "백운3", "부평3", "부개2", "송내2", "중동4", "부천5", 
												"소사3", "역곡4", "온수3", "오류동2", "개봉2",  "구일2", "구로3", 
												"신도림4", "영등포4", "신길4", "대방5", "노량진3", "용산4", "남영3", 
												"서울4", "시청5", "종각3", "종로3가2", "종로5가2", "동대문2", "동묘앞3", 
												"신설동3", "제기동3", "청량리4", "회기3", "외대앞4", "신이문4", "석계4", 
												"광운대2", "월계2", "녹천3", "창동2", "방학3", "도봉3", "도봉산3", "망월사4", 
												"회룡5", "의정부2", "가능2", "늑암3", "양주5", "덕정4", "지행4", "동두천중앙3", 
												"보산2", "동두천2", "소요산2"},
							
												{"구로2", "가산디지털단지3", "독산3", "금천구청3", "석수3", "관악4", "안양4", 
												"명학2", "금정2", "군포2", "당정5", "의왕5", "성균관대5", "화서3", "수원3", 
												"세류2", "병정4", "세마4", "오산대3", "오산2", "진위2", "송탄5", "서정리3", 
												"지제3", "평택4", "성환4", "직산3", "두정5", "천안3", "봉명3", "쌍용(나사렉대)4", 
												"아산2", "탕정3", "배방3", "온양온천5", "신창(순천향대)5"},
												
												{"금천구청3", "광명5"},
												
												{"병점4", "서동탄4" }};

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
		String str = "출발역 : " + is.startStation + " ----> " + "도착역 : " + is.endStation +  "\n" + 
						"이동 역 갯수 : " + moveStation + "정거장" +  "\n" + 
						"소요시간 : " + moveTime + "분";
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
	String resultCommnet = "출발", startStation,  endStation;
	
	
	public InputScanner(List list) 
	{
		argList = list;
		resultList = new ArrayList();
		loop(resultCommnet + "하실 역을 입력해 주세요!");
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
			System.out.println("다시 입력해 주세요!");
			loop("");
			return;
		}
		else 
		{
			String str = "";
			String tossStr = "";
			
			if(findList.size() > 1)
			{
				System.out.println(resultCommnet + "하실 역을 선택해 주세요!");
				for (int i = 0; i < findList.size(); i++) 
				{
					tossStr = findList.get(i) + "";
					str = tossStr.substring(0, tossStr.length() - 1) + "역";
					System.out.print((i + 1) + "." + str + "\t");
					
				}
				scanner();
				
				tossStr = findList.get(Integer.parseInt(input) - 1) + "";
				str = tossStr.substring(0, tossStr.length() - 1) + "역";
			} else 
			{
				tossStr = findList.get(0) + "";
				str = tossStr.substring(0, tossStr.length() - 1) + "역";
				
			}
			
			
			System.out.println(resultCommnet + "역  :  " + str);
			resultList.add(tossStr);
			if(resultCommnet == "도착") 
			{
				endStation = str;
				return;
			}else 
			{
				startStation = str;
			}
			
			resultCommnet = "도착";
			loop(resultCommnet + "하실 역을 입력해 주세요!");
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
		/*지하철 노선도를 구현하세요 
		지하철 역
		역번호, 역이름, 각소요시간
		검색 : 시작역, 도착역 -> 이중으로 검색시 선탱 가능토록 할 것
		결과 : 어디역부터 어디역 까지, 역 갯수, 소요시간
		평일 / 주말 나누어 연산토록 할 것*/
		//Line1 l1 = new Line1();
		MakeLine line1 = new MakeLine(1, Line1.getStationArr());
		
		
	}
}
