package lang_p;

import java.io.IOException;

public class ChamChamCham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] index = {"왼쪽","오른쪽","종료"};
		
		System.out.println("추억의 게임 참참참");
		while(true) {
			try {
				for (int i = 0; i < index.length; i++) {
					System.out.print(i+"."+index[i]);
				}
				System.out.print("\n입력:");
			
			
				int user = System.in.read()-'0';
				System.in.read();
				System.in.read();
				if(user==index.length-1)
					break;
				
				int com = (int)(Math.random()*(index.length-1));
				
				String res = "패";
				
				if (user==com)
					res ="승";
				
				System.out.println("게이머:"+index[user]);
				System.out.println("컴퓨터:"+index[com]);
				System.out.println("결과:"+res);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("게임 종료");
	}

}
