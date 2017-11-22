package thread_p;

import java.util.ArrayList;

class MoviePlayer extends Thread{

	ArrayList<String> movie;
	
	int curr=-1;
	
	int dir =1;
	

	
	public MoviePlayer(String movie) {
		super();
		this.movie = new ArrayList<>();
		
		for (String string : movie.split(";")) {
			this.movie.add(string);
		}
	}

	void reverse()
	{
		dir *= -1;
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				sleep(300);
				
				curr+=dir;
				if(curr>=movie.size()-1)
				{
					curr=movie.size()-1;
					
					continue;
	
				}
				if(curr<0)
				{
					curr=0;
	
					continue;
	
				}
				System.out.println(movie.get(curr));
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class MoviePlayerMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MoviePlayer mp = new MoviePlayer( "싸늘하다.;가슴에 비수가 날아와 꽂"
                + "힌다.;하지만 걱정하지 마라.;"
                + "손은 눈보다 빠르니까.;아귀한텐 밑에서 한 장.;정마담도 밑에서 한 장.;나 한 장.;아귀 한텐 다시 밑에서 한 장;"
                + "이제 정마담에게.;마지막 한 장;동작 그만! 밑장빼기냐?; 뭐야?; 내 패하고 정마담 패를 밑에서 뺐지?; "
                + "내가 빙다리 핫바지로 보이냐 이 새끼야?;"
                + "증거 있어?;증거? 증거 있지. 너는 나한테 구땡을 줘을 것이여.;그리고 정마담한테 주려는 거 이거 이거, "
                + "이거 이거 장짜리 아니여?; 자 모두들 보쇼.; 정마담한테 장땡을 줘서 이 판을 끝내겠다,; 이거 아니여?;"
                + "시나리오 쓰고있네 미친 새끼가!;으허허허허허허!;예림이, 그 패 봐봐, 혹시 장이야?;패 건들지 마! "
                + "손모가지 날아가붕게.; 해머 갖고 와;"
                + "정말 이렇게까지 해야 돼?;잠깐. 그렇게 피를 봐야겠어?;구라치다 걸리면 피 보는 거 안 배웠냐?;"
                + "좋아. 이 패가 단풍이 아니라는 거에 내 돈 모두하고 내 손모가지를 건다. 쫄리면 뒈지시든지.;"
                + "씨발 천하의 아귀가 혓바닥이 왜 이렇게 길어? 후달리냐?"
                + "후달려? 허허허허허허허허. 오냐, 내 돈 모두하고 내 손모가질 건다. 둘 다 묶어!;"
                + "준비됐어? 까 보까? 자 지금부터 확인 들어가겠습니다잉. 따 따~라라란~ 따라란~ 따라란~ 따~ 쿵짝짝~ 쿵짝짝~ 따라리라라리.;"
                + "사쿠라네?;사쿠라야?;내가 봤어. 이 씨발놈 밑장 빼는 걸 똑똑히 봤다니께!;"
                + "확실하지 않으면 승부를 걸지 마라' 이런 거 안 배웠어? 뭐해, 니네 형님 손 안 찍고?;"
                + "야! 이 씨발놈 손모가지 찍어!");
		
		
		mp.start();
		Thread.sleep(1000);
		mp.reverse();
		Thread.sleep(2000);
		mp.reverse();
		Thread.sleep(2000);
		mp.suspend();
		Thread.sleep(2000);
		mp.resume();
		Thread.sleep(2000);
		mp.stop();
	}

}
