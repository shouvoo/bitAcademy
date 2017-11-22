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
		MoviePlayer mp = new MoviePlayer( "�δ��ϴ�.;������ ����� ���ƿ� ��"
                + "����.;������ �������� ����.;"
                + "���� ������ �����ϱ�.;�Ʊ����� �ؿ��� �� ��.;�����㵵 �ؿ��� �� ��.;�� �� ��.;�Ʊ� ���� �ٽ� �ؿ��� �� ��;"
                + "���� �����㿡��.;������ �� ��;���� �׸�! ���廩���?; ����?; �� ���ϰ� ������ �и� �ؿ��� ����?; "
                + "���� ���ٸ� �ֹ����� ���̳� �� ������?;"
                + "���� �־�?;����? ���� ����. �ʴ� ������ ������ ���� ���̿�.;�׸��� ���������� �ַ��� �� �̰� �̰�, "
                + "�̰� �̰� ��¥�� �ƴϿ�?; �� ��ε� ����.; ���������� �嶯�� �༭ �� ���� �����ڴ�,; �̰� �ƴϿ�?;"
                + "�ó����� �����ֳ� ��ģ ������!;��������������!;������, �� �� ����, Ȥ�� ���̾�?;�� �ǵ��� ��! "
                + "�ո��� ���ư��ذ�.; �ظ� ���� ��;"
                + "���� �̷��Ա��� �ؾ� ��?;���. �׷��� �Ǹ� ���߰ھ�?;����ġ�� �ɸ��� �� ���� �� �� �����?;"
                + "����. �� �а� ��ǳ�� �ƴ϶�� �ſ� �� �� ����ϰ� �� �ո����� �Ǵ�. �̸��� �����õ���.;"
                + "���� õ���� �ƱͰ� ���ٴ��� �� �̷��� ���? �Ĵ޸���?"
                + "�Ĵ޷�? ����������������. ����, �� �� ����ϰ� �� �ո��� �Ǵ�. �� �� ����!;"
                + "�غ�ƾ�? �� ����? �� ���ݺ��� Ȯ�� ���ڽ��ϴ���. �� ��~����~ �����~ �����~ ��~ ��¦¦~ ��¦¦~ ���󸮶��.;"
                + "������?;������?;���� �þ�. �� ���߳� ���� ���� �� �ȶ��� �ôٴϲ�!;"
                + "Ȯ������ ������ �ºθ� ���� ����' �̷� �� �� �����? ����, �ϳ� ���� �� �� ���?;"
                + "��! �� ���߳� �ո��� ���!");
		
		
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
