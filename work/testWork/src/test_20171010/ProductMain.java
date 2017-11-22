package test_20171010;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductMain 
{
	
	public static void main(String args[]) throws Exception
	{
		ArrayList<Product> productList = new ArrayList<>();
		FileReader fr = new FileReader("data/product.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		int num = 0;
		for (int i = 0; (line = br.readLine()) != null; i++) 
		{
			
			if(!line.substring(0,  1).equals("#"))
			{
				Product pd = new Product();
				String [] str = line.split(":");
				
				pd.setCompany(str[0]);
				pd.setProductName(str[1]);
				pd.setProductId(str[2]);
				pd.setPrice(str[3]);
				productList.add(pd);
			};

		}
		
		new ProductService(productList);

	}
	
}




