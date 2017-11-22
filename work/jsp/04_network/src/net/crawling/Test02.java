package net.crawling;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test02 
{
	public static void main(String[] args) throws IOException 
	{
		/*Document doc = Jsoup.connect("http://www.naver.com").get();
		Elements ele = doc.select("ul.ah_l > li.ah_item > a[href='#']");

		for (Element e : ele) 
		{
			//System.out.println(e.html());
			String rank = e.select("span.ah_r").html();
			String keyword = e.select("span.ah_k").html();
			
			System.out.println(rank + " : " + keyword);
		}*/
		
		Document doc = Jsoup.connect("http://www.daum.net").get();
		Elements ele = doc.select("ul.list_weather > li");
		
		System.out.println(ele.size());
		
		for (Element e : ele) 
		{
			System.out.println(e.html());
			String location = e.select("span.txt_part").html();
			String weather = e.select("strong.img_weather").html();
			
			System.out.println(location);
			
		}
	}
}




















