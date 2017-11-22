package test_20170915;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class Dummy implements Comparable<Dummy> 
{
	 private String name;
	 Dummy(String n){
	  this.name = n;
	 }
	 public int compareTo(Dummy o) {
		 System.out.println("aaa");
	  return this.name.compareTo(o.name);
	 }
	 public String getName(){
	  return this.name;
	 }
}



	

	public class LinkedHashSetTest {

	 public static void main(String[] args) {
	  Set<Dummy> linkedHashSet = null;
	  Set<Dummy> hashSet = new HashSet<Dummy>();
	  hashSet.add(new Dummy("1"));
	  hashSet.add(new Dummy("2"));
	  hashSet.add(new Dummy("3"));
	  hashSet.add(new Dummy("5"));
	  hashSet.add(new Dummy("4"));
	  
	  Iterator<Dummy> it = hashSet.iterator();
	  System.out.println("HashSet iteratortion");
	  printIterator(it);
	 
	  linkedHashSet = new LinkedHashSet<Dummy>(hashSet);
	  it = linkedHashSet.iterator();
	  System.out.println("LinkedHashSet iteratortion");
	  printIterator(it);
	  
	  linkedHashSet.clear();
	  linkedHashSet.add(new Dummy("1"));
	  linkedHashSet.add(new Dummy("2"));
	  linkedHashSet.add(new Dummy("3"));
	  linkedHashSet.add(new Dummy("5"));
	  linkedHashSet.add(new Dummy("4"));
	  it = linkedHashSet.iterator();
	  System.out.println("LinkedHashSet iteratortion in insertion order");
	  printIterator(it);
	  
	  
	  
	  TreeSet<Dummy> treeSet = new TreeSet<Dummy>(hashSet);
	  it = treeSet.iterator();
	  System.out.println("TreeSet iteratortion");
	  printIterator(it);
	  
	  treeSet.clear();
	  treeSet.add(new Dummy("1"));
	  treeSet.add(new Dummy("2"));
	  treeSet.add(new Dummy("3"));
	  treeSet.add(new Dummy("5"));
	  treeSet.add(new Dummy("4"));
	  
	  it = treeSet.iterator();
	  System.out.println("TreeSet iteratortion regardless of insertion order");
	  printIterator(it);
	  
	  
	  TreeSet<Integer> primitiveTreeSet = new TreeSet<Integer>();
	  primitiveTreeSet.add(1);
	  primitiveTreeSet.add(2);
	  primitiveTreeSet.add(3);
	  primitiveTreeSet.add(4);
	  primitiveTreeSet.add(5);
	  Iterator<Integer> it2 = primitiveTreeSet.iterator();
	  System.out.println("TreeSet iteratortion primitive type");
	  printIterator2(it2);
	 }
	 
	 public static void printIterator(Iterator<Dummy> it){
	  while(it.hasNext()){
	   Dummy s = it.next();
	   System.out.println("hashCode: "+s.getName());
	  }
	 }
	 public static void printIterator2(Iterator<Integer> it){
	  while(it.hasNext()){
	   System.out.println("hashCode: "+it.next());
	  }
	 }

	}
