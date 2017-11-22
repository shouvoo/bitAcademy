package net_p;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		URL url = new URL("http://comic.naver.com/webtoon/list.nhn?titleId=662774&weekday=wed");
		System.out.println(url.getAuthority());
		System.out.println(url.getContent());
		System.out.println(url.getDefaultPort());
		System.out.println(url.getPort());
		System.out.println(url.getFile());
		System.out.println(url.getHost());
		System.out.println(url.getPath());
		System.out.println(url.getQuery());
		System.out.println(url.getProtocol());
		System.out.println(url.toURI());
		
		InputStreamReader isr = new InputStreamReader(url.openStream());
		BufferedReader br = new BufferedReader(isr);
		String line;
		
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
		br.close();
		isr.close();
	}

}
