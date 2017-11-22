package test_20171010;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService 
{
	
	String basicStr = "---------------------------------\r\n" + 
			"��ǰ���� �ý���\r\n" + 
			"---------------------------------\r\n" + 
			"1. ��ü �˻�\r\n" + 
			"2. �ݾ� �˻�\r\n" + 
			"3. ��ǰ�� �˻�\r\n" + 
			"4. ����\r\n" + 
			"---------------------------------\r\n" + 
			"�޴� ���� : ";
	
	String endStr = "- ���ȭ��(���� ���� ��)\r\n" + 
			"---------------------------------\r\n" + 
			"�����Ͻðڽ��ϱ�? (��� : N, ���� : ����) : _\r\n";
	
	String endStr2 = "����Ǿ����ϴ�.\r\n" + 
			"---------------------------------";
	
	String serchStr = "----------------------------------------\r\n" + 
			"��ǰ�� �˻�\r\n" + 
			"----------------------------------------\r\n" + 
			"�˻��� �Է� :";
	
	String priceStr = "----------------------------------------\r\n" + 
			"�ݾ����� �˻�\r\n" + 
			"----------------------------------------\r\n" + 
			"�����ݾ� :";
	
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
			input("�����ݾ� : ");
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
		System.out.println("�ݾװ˻�" + lowPrice + " : " + highPrice);
	}
	
	private void name(String serchStr)
	{
		int cnt = 0;
		String str = "------------------------------------------------\r\n" + 
				"["+serchStr+"]�ڸ� �����ϴ� ��ǰ\r\n" + 
				"------------------------------------------------";
		
		topStr();
		for (Product pd : productList) 
		{
			//System.out.println("!!!!" + pd.productName.contains(serchStr));
			if(pd.productName.contains(serchStr)) pd.print();
			else cnt++;
		}
		
		if(cnt == productList.size()) System.out.println("�����!!");
		
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
