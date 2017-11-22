package day05;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test01Sub
{
	public static void main(String[] args) 
	{
		//%EC%9E%90%EB%B0%94 -> 자바123java
		String msg = "자바123java";
		try {
			String eMsg = URLEncoder.encode(msg, "utf-8");
			System.out.println(eMsg);
			eMsg = URLDecoder.decode(eMsg, "utf-8");
			System.out.println(eMsg);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
