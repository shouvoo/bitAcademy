package collection;

import java.util.ArrayList;
import java.util.List;

public class RetailMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*List topList = new ArrayList();
		
		topList.add("�����");
		topList.add("������");
		topList.add("����");
		topList.add("�豤��");
		topList.add("������");
		topList.add("�����");
		topList.add("��ȣ��");
		
		List secondList = new ArrayList();
		
		secondList.add("��ȣ��");
		secondList.add("������");
		secondList.add("����ȫ");
		secondList.add("�̽���");
		secondList.add("�嵿��");
		
		List thirdList = new ArrayList();
		
		thirdList.add("�̺���");
		thirdList.add("�̽¿�");
		thirdList.add("������");
		thirdList.add("�嵿��");
		thirdList.add("�ڿ���");
		thirdList.add("ȫ����");
		
		List rs = new ArrayList(topList);
		rs.addAll(secondList);
		
		System.out.println(topList);
		System.out.println("-----------------------------------------------------");
		System.out.println(secondList);
		System.out.println("-----------------------------------------------------");
		System.out.println(thirdList);
		System.out.println("-----------------------------------------------------");
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("1��-----------------------------------------------------");
		topList.removeAll(secondList);
		topList.remove("������");
		System.out.println(topList);
		
		
		System.out.println("2��-----------------------------------------------------");
		secondList.removeAll(thirdList);
		System.out.println(secondList);
		
		
		System.out.println(rs);
		System.out.println("-----------------------------------------------------");
		
		System.out.println("FA ����-----------------------------------------------------");
		thirdList.removeAll(rs);
		System.out.println(thirdList);*/
		
		String [][] arr = {{"�����", "������","����","�豤��","������","�����","��ȣ��"}, 
							{"��ȣ��","������","����ȫ","�̽���","�嵿��"}, 
							{"�̺���","�̽¿�","������","�嵿��","�ڿ���","ȫ����"}};
		
		List total = new ArrayList();
		
		for (String[] strs : arr) 
		{
			List bb = new ArrayList();
			for (Object str : strs) 
			{
				bb.add(str);
			}
			total.add(bb);
		}
		
		/*for (Object obj : total) 
		{
			System.out.println(obj);
		}*/
		
		List t1 = (List)total.get(0);
		List t2 = (List)total.get(1);
		List fa = (List)total.get(2);
		List subfa = new ArrayList(fa);
		
		
		System.out.println("������ : ");
		System.out.println("team1 : " + t1);
		System.out.println("team2 : " + t2);
		System.out.println("FA : " + fa);
		
		subfa.removeAll(t1);
		subfa.removeAll(t2);
		t1.removeAll(t2);
		t1.removeAll(fa);
		t2.removeAll(fa);
		
		System.out.println("������ : ");
		System.out.println("team1 : " + t1);
		System.out.println("team2 : " + t2);
		System.out.println("FA : " + subfa);
		
	}

}















