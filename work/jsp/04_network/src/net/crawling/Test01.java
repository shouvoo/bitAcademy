package net.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test01
{
	public static void main(String[] args) 
	{
		String html = "";
		html += "<html>";
		html += "<head><title>JSOUP 연습</title></head>";
		html += "<body>";
		html += "	<p>Parse HTML</p>";
		html += "	<p id='a'>id로 접근</p>";
		html += "	<p class='b'>class로 접근</p>";
		html += "</body>";
		html += "<html>";
		

		Document doc = Jsoup.parse(html);
		Elements ele = doc.select("p");
		System.out.println(ele.size());
		
		for (Element e : ele) 
		{
			System.out.println(e.html());
		}
	}
	
}
