package util_p;

import java.util.StringTokenizer;

public class StringtokenizerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "�Ʊ���,�������,,�ƺ����.�ҸӴϻ��,�Ҿƹ��� ���";
		
		StringTokenizer tok = new StringTokenizer(str, ",.");
		
		while(tok.hasMoreElements())
		{
			System.out.println(tok.nextToken());
		}
	}

}
