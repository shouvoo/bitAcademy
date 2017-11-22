package test_20171010;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService 
{
	
	String basicStr = "---------------------------------\r\n" + 
			"상품관리 시스템\r\n" + 
			"---------------------------------\r\n" + 
			"1. 전체 검색\r\n" + 
			"2. 금액 검색\r\n" + 
			"3. 상품명 검색\r\n" + 
			"4. 종료\r\n" + 
			"---------------------------------\r\n" + 
			"메뉴 선택 : ";
	
	String endStr = "- 출력화면(종료 선택 시)\r\n" + 
			"---------------------------------\r\n" + 
			"종료하시겠습니까? (취소 : N, 종료 : 엔터) : _\r\n";
	
	String endStr2 = "종료되었습니다.\r\n" + 
			"---------------------------------";
	
	String serchStr = "----------------------------------------\r\n" + 
			"상품명 검색\r\n" + 
			"----------------------------------------\r\n" + 
			"검색어 입력 :";
	
	String priceStr = "----------------------------------------\r\n" + 
			"금액으로 검색\r\n" + 
			"----------------------------------------\r\n" + 
			"낮은금액 :";
	
	private ArrayList<Product> productList;
	private String inputStr = "";
	private boolean endBln = false;
	private boolean serchBln = false;
	private boolean priceBln = false;
	private int lowPrice = 0;
	private int highPrice = 0;
	
	public ProductService(ArrayList<Product> product) 
	{
		// TODO Auto-generated constructor stub
		this.productList = product;
		
		while(true)
		{
			if(endBln) break;
			input(basicStr);
		}
	}
	
	private void input(String str)
	{
		
		basicPrint(str);
		Scanner sc = new Scanner(System.in);
		inputStr = sc.nextLine();
		serch(inputStr);
		
	}
	
	private void basicPrint(String str)
	{
		System.out.println(str);
	}
	
	private void serch(String type)
	{
		if(serchBln)
		{
			name(type);
			
		} else if(priceBln) 
		{
			input("높은금액 : ");
			highPrice = Integer.parseInt(inputStr);
			price();
			priceBln = false;
		} else {
			switch(type)
			{
				case "" : 
					endBln = true;
					System.out.println(endStr2);
					break;	
				case "1" : 
					all();
					break;
					
				case "2" : 
					input(priceStr);
					lowPrice = Integer.parseInt(inputStr);
					priceBln = true;
					break;
					
				case "3" : 
					serchBln = true;
					input(serchStr);
					
					break;
					
				case "4" : 
					input(endStr);
					break;
					
				case "n" : 
					input(basicStr);
					break;

			}
		}
		
		serchBln = false;
	}
	
	private void all()
	{
		topStr();
		for (Product pd : productList) 
		{
			pd.print();
		}
		bottomStr();
	}
	
	private void price()
	{
		System.out.println("금액검색" + lowPrice + " : " + highPrice);
	}
	
	private void name(String serchStr)
	{
		int cnt = 0;
		String str = "------------------------------------------------\r\n" + 
				"["+serchStr+"]자를 포함하는 상품\r\n" + 
				"------------------------------------------------";
		
		topStr();
		for (Product pd : productList) 
		{
			//System.out.println("!!!!" + pd.productName.contains(serchStr));
			if(pd.productName.contains(serchStr)) pd.print();
			else cnt++;
		}
		
		if(cnt == productList.size()) System.out.println("없어요!!");
		
		bottomStr();
	}
	
	private void close()
	{
		
	}
	
	private void topStr()
	{
		System.out.println();
		System.out.println();
		System.out.println("==========================================");
	}
	
	private void bottomStr()
	{
		System.out.println("==========================================");
		System.out.println();
		System.out.println();
	}
	
	
}
