package util_p;

import java.util.StringTokenizer;

public class StringtokenizerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "아기상어,엄마상어,,아빠상어.할머니상어,할아버지 상어";
		
		StringTokenizer tok = new StringTokenizer(str, ",.");
		
		while(tok.hasMoreElements())
		{
			System.out.println(tok.nextToken());
		}
	}

}
