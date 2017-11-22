package lang_p;

import java.io.IOException;

public class GBBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] res = {
				{"비김","패","승"},	//가위
				{"승", "비김","패"},	//바위
				{"패","승","비김"}	//보
				
			//가위, 바위 ,보
		}; 
		
		
		
		String [] index = {"가위","바위","보","종료"};
		
		System.out.println("가위바위보");
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
				
				
				System.out.println("게이머:"+index[user]);
				System.out.println("컴퓨터:"+index[com]);
				System.out.println("결과:"+res[user][com]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("게임 종료");

	}

}
