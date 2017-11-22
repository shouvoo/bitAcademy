package collection_p;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List l1 = new ArrayList();
		
		l1.add(2);
		l1.add(123);
		l1.add(100);
		l1.add(200);
		l1.add(300);
		l1.add("efojewf");
		l1.add(new int[] {111,222,333});
		l1.add(new ArrayList<>());
		l1.add(1,456);
		l1.add(678);
		l1.add(789);
		l1.add(1456);
		l1.add(55);
		l1.add(678);
		l1.add(456);
		l1.add(789);
		
		
		
		
		
		System.out.println(l1);
		
		
		
		l1.remove("efojewf");	//값이 같은 객체 삭제
		System.out.println(l1);
		
		l1.remove(2);	//숫자인 경우 인덱스번호 인식
		System.out.println(l1);
		
		l1.remove((Object)456);
			//같은 객체는 맨 처음 객체 삭제
			//객체가 숫자인 경우 object로 형변환하여 인덱스 번호가 아님을 인식
		
		System.out.println("l1:"+l1);
		
		List l2 = l1;
		List l3 = new ArrayList(l1);
		List l4 = new ArrayList();
		l4.add(999);
		l4.add(888);
		l4.add(777);
		l4.addAll(l1);
		
		List l5 = l1.subList(4,8);
		List l6 = new ArrayList();
		l6.addAll(l1.subList(4,9));
		
		
		System.out.println("l2:"+l2);
		System.out.println("l3:"+l3);
		System.out.println("l4:"+l4);
		System.out.println("l5:"+l5);
		System.out.println("l6:"+l6);
		
		l5.add(11223344);
		l6.add(1357);
		l6.add(100);
		
		l1.set(4, 400);
		l5.set(1, 500);
		
		System.out.println("l1:"+l1);		
		System.out.println("l2:"+l2);
		System.out.println("l3:"+l3);
		System.out.println("l4:"+l4);
		System.out.println("l5:"+l5);
		System.out.println("l6:"+l6);
		
		System.out.println(l1.size());
		
		System.out.println(l1.contains(400));
		System.out.println(l1.indexOf(678));
		System.out.println(l1.lastIndexOf(678));
		
		//l1.retainAll(l5);
		l1.removeAll(l5);
		System.out.println("l1:"+l1);
		System.out.println("l6:"+l6);
		
		System.out.println("l1.get(2):"+l1.get(2));
		
		
	}

}

