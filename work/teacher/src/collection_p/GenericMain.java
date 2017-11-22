package collection_p;

import java.util.ArrayList;
import java.util.Iterator;

class Appliances{
	void meth() {
		System.out.println("가전 제품 meth()");
	}
	
}

class TV extends Appliances{
	void meth() {
		System.out.println("TV meth()");
	}
	
}

class Bed{
	void meth() {
		System.out.println("침대 meth()");
	}
	
}

public class GenericMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ar1 = new ArrayList();
		ArrayList<Appliances> ar2 = new ArrayList();
		ArrayList<TV> ar3 = new ArrayList();
		ArrayList<Bed> ar4 = new ArrayList();
		
		ar1.add(1234);
		ar1.add(new Appliances());
		ar1.add(new TV());
		ar1.add(new Bed());
		
		//ar2.add(1234);
		ar2.add(new Appliances());
		ar2.add(new TV());
		//ar2.add(new Bed());
		
		//ar3.add(1234);
		//ar3.add(new Appliances());
		ar3.add(new TV());
		//ar3.add(new Bed());
		
		//ar4.add(1234);
		//ar4.add(new Appliances());
		//ar4.add(new TV());
		ar4.add(new Bed());
		
		for (Object oo : ar1) {
		
			//oo.meth();
		}
		System.out.println("---------------");
		for (Appliances oo : ar2) {
			oo.meth();
		}
		System.out.println("---------------");
		for (TV oo : ar3) {
			oo.meth();
		}
		System.out.println("---------------");
		for (Bed oo : ar4) {
			oo.meth();
		}
		System.out.println("-----------------------");
		methObject(ar1);
		methObject(ar2);
		methObject(ar3);
		methObject(ar4);
		System.out.println("-----------------------");
		//methAppiances(ar1);
		methAppiances(ar2);
		//methAppiances(ar3);
		//methAppiances(ar4);
		System.out.println("-----------------------");
		//methTV(ar1);
		//methTV(ar2);
		methTV(ar3);
		//methTV(ar4);
		System.out.println("-----------------------");
		//methAppEx(ar1);
		methAppEx(ar2);
		methAppEx(ar3);
		//methAppEx(ar4);
		
		System.out.println("-----------------------");
		
		Iterator<TV>it = ar3.iterator();
		
		while(it.hasNext())
		{
			TV tt = it.next();
			tt.meth();
		}
		
	}
	
	static void methObject(ArrayList ar)
	{
		System.out.println(ar);
	}
	
	static void methAppiances(ArrayList<Appliances> ar)
	{
		for (Appliances oo : ar) {
			oo.meth();
		}
	}
	static void methTV(ArrayList<TV> ar)
	{
		for (TV oo : ar) {
			oo.meth();
		}
	}
	
	static void methAppEx(ArrayList<? extends Appliances> ar)
	{
		for (Appliances oo : ar) {
			oo.meth();
		}
	}
	

}

