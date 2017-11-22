package net_p;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLMain 
{

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		
		URL url = new URL("http://comic.naver.com/webtoon/detail.nhn?titleId=662774&no=91&weekday=wed");
		System.out.println(url.getAuthority()); // comic.naver.com
		System.out.println(url.getContent()); // sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@53d8d10a
		System.out.println(url.getDefaultPort()); // 80
		System.out.println(url.getPort()); // -1
		System.out.println(url.getFile()); // .com 이후 주소 // /webtoon/detail.nhn?titleId=662774&no=91&weekday=wed
		System.out.println(url.getHost()); // comic.naver.com
		System.out.println(url.getPath()); // /webtoon/detail.nhn // titleId=662774&no=91&weekday=wed
		System.out.println(url.getQuery()); // ? 표 이후 주소
		System.out.println(url.getProtocol()); // http
		System.out.println(url.toURI()); // http://comic.naver.com/webtoon/detail.nhn?titleId=662774&no=91&weekday=wed
		System.out.println(url.openStream()); // sun.net.www.protocol.http.HttpURLConnection$HttpInputStream@e9e54c2
		
		InputStreamReader isr = new InputStreamReader(url.openStream());
		BufferedReader br = new BufferedReader(isr);
		String line;
		
		while((line = br.readLine()) != null)
		{
			System.out.println(line);
		}
		
		br.close();
		isr.close();

	}

}
