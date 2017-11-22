package homeWork_20170906;
import java.util.*;

class Person implements Comparable<Person> 
{

	 public String name;

	 public int age;

	 

	 public Person(String name, int age) {

	  this.name = name;

	  this.age = age;

	 }

	 

	 @Override

	 public int compareTo(Person o) {

	  if(age<o.age) return -1;

	  else if(age == o.age) return 0;

	  else  return 1;

	 }

	 

	}


	


	public class Test {

	 public static void main(String[] args) {

	/*  TreeSet<Person> treeSet = new TreeSet<Person>();

	  

	  treeSet.add(new Person("���̹�", 45));

	  treeSet.add(new Person("��α�", 25));

	  treeSet.add(new Person("�θ���", 31));

	  

	  Iterator<Person> iterator = treeSet.iterator();

	  while(iterator.hasNext()) {

	   Person person = iterator.next();

	   System.out.println(person.name + ":" + person.age);

	  }
*/
		 
		 Unit [] unitArr = {	new Unit("���", 60, 70, 90),
					new Unit("����", 55, 45, 95),
					new Unit("���۸�", 30, 30, 80),
					new Unit("�޵�", 1, 60, 70),
					new Unit("���÷�", 100, 90, 40),
					new Unit("��Ŀ", 100, 70, 45)};



				TreeMap<String, Unit>unitMap = new TreeMap<String, Unit>();
				
				for (Unit unit : unitArr) 
				{
					unitMap.put(unit.character, unit);
				}
				
				Iterator<String> unitIt = unitMap.keySet().iterator();
				
				while(unitIt.hasNext())
				{
					String key = unitIt.next();
					System.out.println(unitMap.get(key));
				}		
		 
	 }

	 

	}

