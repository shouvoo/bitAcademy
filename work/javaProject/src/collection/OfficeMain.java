package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/////���޺��� �������� ����Ͻÿ�
/// �� ����, ����, �븮, ��� ������ ����� ��
//���� Ŭ���� - �����ڵ�, ������, ����

class Employee{
	String code, name, grade;

	@Override
	public String toString() {
		return code + ", " + name + ", " + grade;
	}

	public Employee(String code, String name, String grade) {
		super();
		this.code = code;
		this.name = name;
		this.grade = grade;
	}
	
	
}

class OfficeCom implements Comparator<String>{
	
	Map<String, Integer> om;
	
	public OfficeCom() {
		// TODO Auto-generated constructor stub
		om = new HashMap();
		om.put("����", 1);
		om.put("���", 4);
		om.put("�븮", 3);
		om.put("����", 2);
	}
	
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
		
		
		return om.get(o1)-(int)om.get(o2);
	}
}
public class OfficeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee [] arr = {
				new Employee("a1231", "�����", "����"),
				new Employee("a1232", "������", "�븮"),
				new Employee("a1233", "�̿���", "����"),
				new Employee("a1234", "��ȣ��", "���"),
				new Employee("a1235", "����", "���"),
				new Employee("a1236", "����", "����"),
				new Employee("a1237", "�����", "����"),
				new Employee("a1238", "�۽���", "�븮"),
				new Employee("a1239", "����", "���"),
				new Employee("a12310", "����", "����"),
		};
		TreeMap<String, Integer> map = new TreeMap(new OfficeCom());
		
		for (Employee em : arr) {
			int cnt =1;
			
			if(map.containsKey(em.grade))
				cnt = map.get(em.grade)+1;
			
			map.put(em.grade, cnt);
		}
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			
			System.out.println(key+":"+map.get(key));
			
		}
		
		
	}

}
