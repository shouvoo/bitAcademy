package dynamic;

import java.util.ArrayList;

///// �߱����� �����ϼ���
///�����- ������, ������, �轺��, ������(�ֹ��� �޾� �̸� ���� ��ǰ�� �ش�)
///Ȧ�� : ��ǰ - ¥���, «��, ���, �ܹ��� (�ֹ��� �޾� Ȧ�� �ش�)

///����� �����, ����� �ȱ�, Ȧ �ֹ�
///

class China{
	
	
	
	ArrayList<TakeOut> torder(String arr)
	{
		ArrayList<TakeOut> tlist = new ArrayList<>();
		
		for (String str : arr.split(",")) {
			tlist.add(makeTakeOut(str));
		}
		
		return tlist;
	}
	
	class TakeOut{
		String name;
		int price;
		public TakeOut(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}
		@Override
		public String toString() {
			return  name + ":" + price;
		}
		
	}
	
	TakeOut makeTakeOut(String name) {
		TakeOut res = null;
		
		res = new TakeOut(name, 5000);
		return res;
	}
	
	void hall(String arr)
	{
		class HallFood{
			String name;
			int price;
			public HallFood(String name) {
				super();
				this.name = name;
				this.price = 7000;
			}
			@Override
			public String toString() {
				return  name + ":" + price;
			}
			
			
		}
		
		
		for (String str : arr.split(",")) {
			System.out.println(new HallFood(str)+" ���Խ��ϴ�.");
		}
		
		
	}
	
	
}
public class InnerChinaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		China ch = new China();
		
		/*China.TakeOut ct=ch.makeTakeOut("������");
		
		System.out.println(ct);*/
		
		ArrayList<China.TakeOut> lunch = ch.torder("������,������,�轺��");
		
		System.out.println(lunch);
		ch.hall("¥���,«��,���");
	}

}
