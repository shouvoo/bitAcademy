package dynamic;

import java.util.ArrayList;

///// 중국집을 구현하세요
///포장용- 군만두, 탕수육, 삭스핀, 라조기(주문을 받아 미리 만든 제품을 준다)
///홀용 : 제품 - 짜장면, 짬뽕, 울면, 단무지 (주문을 받아 홀에 준다)

///포장용 만들기, 포장용 팔기, 홀 주문
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
			System.out.println(new HallFood(str)+" 나왔습니다.");
		}
		
		
	}
	
	
}
public class InnerChinaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		China ch = new China();
		
		/*China.TakeOut ct=ch.makeTakeOut("군만두");
		
		System.out.println(ct);*/
		
		ArrayList<China.TakeOut> lunch = ch.torder("군만두,탕수육,삭스핀");
		
		System.out.println(lunch);
		ch.hall("짜장면,짬뽕,울면");
	}

}
