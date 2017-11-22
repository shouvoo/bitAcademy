package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/////직급별로 직원수를 출력하시오
/// 단 부장, 과장, 대리, 사원 순으로 출력할 것
//직원 클래스 - 직원코드, 직원명, 직급

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
		om.put("부장", 1);
		om.put("사원", 4);
		om.put("대리", 3);
		om.put("과장", 2);
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
				new Employee("a1231", "배용준", "과장"),
				new Employee("a1232", "문희준", "대리"),
				new Employee("a1233", "이원준", "부장"),
				new Employee("a1234", "이호준", "사원"),
				new Employee("a1235", "허준", "사원"),
				new Employee("a1236", "이준", "과장"),
				new Employee("a1237", "김원준", "과장"),
				new Employee("a1238", "송승준", "대리"),
				new Employee("a1239", "박준", "사원"),
				new Employee("a12310", "봐준", "부장"),
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
