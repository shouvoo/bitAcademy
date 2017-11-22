package thread_p;

import java.util.ArrayList;

class MP3 extends Thread{
	ArrayList<Music> list;
	int curr = 0, currMM=-1,dir =1;
	Music now;
	
	boolean pau = false, finish;
	
	void pause() {
		
		pau = !pau;
	}
	
	void next()
	{
			
		finish=true;
		
	}
	void back()
	{
			
		finish=true;
		curr-=2;
	}
	void goTrack(int tr)
	{
			
		finish=true;
		curr=tr-1;
	}
	
	public MP3(Music [] mm) {
		// TODO Auto-generated constructor stub
		list = new ArrayList<>();
		for (Music music : mm) {
			list.add(music);
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			finish=false;
			curr++;
			
			if(curr>=list.size()-1)
			{
				curr=list.size()-1;
				
				continue;

			}
			if(curr<0)
			{
				curr=0;

				continue;

			}
			
			now = list.get(curr);
			currMM=-1;
			play();
			System.out.println();
		}
	}
	
	
	
	void play()
	{
		System.out.println("\n>>>>>>"+now.name+" : 시작");
		while(true)
		{
			try {
				Thread.sleep(50);
				
				if(pau)
					continue;
				
				currMM+= dir;
				if(finish)
					break;
				
				if(currMM>=now.str.length()-1)
				{
					curr++;
					break;
				}
				if(currMM<0)
				{
					curr--;
					break;
	
				}
				
				
				System.out.print(now.str.charAt(currMM));
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("\n>>>>>>"+now.name+" : 종료");
	}
	
	
}

class Music //extends Thread
{
    String singer;
    String name;
    String str;
	public Music(String singer, String name, String str) {
		super();
		this.singer = singer;
		this.name = name;
		this.str = str;
	}
    
    
}
public class MP3PlayerMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 MP3 mm = new MP3(new Music[] {
				 new Music("임참정","날 닮은 너","날 닮은 너를 부족한 너를 그저 바라보기엔 \n"+
		                    "후회로 물든 내 지난날이 너무 많이 다쳤어 \n"+
		                    "나의 과거와 너의 지금과 너무도 같기에 \n"+
		                    "두려워 겁이나 \n"+
		                    "내게 마지막이어야 할 사람\n"+
		                    "너의 방황을 돌릴 수 있게 \n"+
		                    "날 이렇게 뿌리친대도 너의 손을 놓친 않을 거야\n"+
		                    "잠시도 너는 불안한 모습 감출 수가 없었니 음~~\n"+
		                    "내가 아녀도 지친 니 맘을 위로 받을 수 있니 \n"+
		                    "나의 과거와 너의 지금과 너무도 같기에\n"+
		                    "두려워 겁이나 \n"+
		                    "내게 마지막이어야 할 사람\n"+
		                    "너의 방황을 돌릴 수 있게 \n"+
		                    "날 이렇게 뿌리친대도 너의 손을 놓친 않을거야\n"),
		            new Music("정재욱","잘가요","미안해마요 이제야 난 깨달아요\n"+
		                    "내 절대 그대 짝이 아님을\n"+
		                    "괜찮을게요 영혼 밖엔 팔 것 없는\n"+
		                    "못난 날 잘 비켜갔어요\n"+
		                    "그대 행복 내가 꼭 아니라도\n"+
		                    "지킬테면 그게 사랑일테죠 그게 나의 몫이죠\n"+
		                    "잘가요 내 소중한 사랑 행복했어요\n"+
		                    "그래도 이것만 알아줘요\n"+
		                    "지금 그 사랑보다 결코\n"+
		                    "내 사랑이 부족하다거나 얕지 않음을"),
		            new Music("G드래곤","무제","나에게 돌아오기가\n"+
		                    "어렵고 힘든 걸 알아\n"+
		                    "이제 더는 상처받기가\n"+
		                    "두렵고 싫은 걸 알아\n"+
		                    "네가 떠나 버린 그날에도\n"+
		                    "모진 말로 널 울리고\n"+
		                    "뒤돌아 서서 후회해 미안해\n"+
		                    "제발 단 한 번이라도\n"+
		                    "너를 볼 수 있다면\n"+
		                    "내 모든 걸 다 잃어도 괜찮아\n"+
		                    "꿈에서라도 너를 만나\n"+
		                    "다시 사랑하기를\n"+
		                    "우리 이대로"),
		            new Music("윤종신","좋니","이제 괜찮니 너무 힘들었잖아\n"+
		                    "우리 그 마무리가 고작 이별뿐인 건데 \n"+
		                    "우린 참 어려웠어\n"+
		                    "잘 지낸다고 전해 들었어 가끔\n"+
		                    "벌써 참 좋은 사람\n"+
		                    "만나 잘 지내고 있어\n"+
		                    "굳이 내게 전하더라\n"+
		                    
		                    "잘했어 넌 못 참았을 거야\n"+
		                    "그 허전함을 견뎌 내기엔\n"+
		                    "좋으니 사랑해서 사랑을 시작할 때\n"+
		                    "니가 얼마나 예쁜지 모르지\n"+
		                    "그 모습을 아직도 못 잊어\n"+
		                    "헤어 나오지 못해\n"+
		                    "니 소식 들린 날은 더\n"+
		                    
		                    "좋으니 그 사람 솔직히 견디기 버거워\n"+
		                    "니가 조금 더 힘들면 좋겠어\n"+
		                    "진짜 조금 내 십 분의 일 만이라도\n"+
		                    "아프다 행복해줘"),
		            new Music("김현성","Heaven","왜 이제 왔나요 더 야윈 그대 \n"+
		                    "나만큼 힘들었나요 \n"+
		                    "두 번 살게 하네요 그댄 내 삶을\n"+ 
		                    "난 모든 걸 버리려 했죠 \n"+
		                    "왜 나를 떠나요 아플거면서 \n"+
		                    "사랑이 여기에 있는데 \n"+
		                    "다신 그러지마요 내가 죽어요\n"+ 
		                    "그댄 나의 숨이니까요 \n"+
		                    "나 그댈 잃는다는 건 \n"+
		                    "내 삶이 다한 건 \n"+
		                    "살아도 지옥인거죠 \n"+
		                    "그댄 나의 전부 그댄 나의 운명\n"+ 
		                    "헤어질 수 없어요 \n"+
		                    "영원보다 먼 곳에 우리 사랑 가져가요\n"+ 
		                    "눈물없는 세상 나의 사랑 하나로만 그댈 살게 할께요 \n"+
		                    "그대와 나 영원히 행복할 그 곳 Heaven ")
		 });
		 
		 
		 mm.start();
		 Thread.sleep(2000);
		 mm.pause();
		 Thread.sleep(2000);
		 mm.pause();
		 Thread.sleep(2000);
		 mm.next();
		 Thread.sleep(2000);
		 mm.goTrack(3);
		 Thread.sleep(2000);
		 mm.back();
		 Thread.sleep(2000);
		 mm.stop();
	}

}
