package fixBoard;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Craw {
	public static List<CrawVO> ebay(String str) throws IOException {
		if(str.contains(" ")) {
			String a = "";
			int i = 1;
			for (String s : str.split(" ")) {
				if(str.split(" ").length != i)
					a += s+"%20";
				else
					a += s;
				i++;
			}
			str = a;
		}
			
		Document doc = Jsoup.connect("https://www.ebay.com/sch/i.html?_nkw="+str+"&_ipg=25").get();

		//Elements ele = doc.select(".lvtitle a");
		Elements ele = doc.select("#ListViewInner > li");
		
		List<CrawVO> list = new ArrayList<>(); 
		
		int i = 1;
		for (Element e : ele) {
			CrawVO vo  = new CrawVO();
			vo.setHref(e.select(".lvtitle a").attr("href"));
			vo.setSrc(e.select("img").attr("src"));
			vo.setName(e.select("img").attr("alt"));
			
			list.add(vo);
			
			i++;
			
			if(i == 6) break;
		}
		
		return list;
	}
}
