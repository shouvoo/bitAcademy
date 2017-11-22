package dynamic;

class DyCar{
	int [] jum;
	String kind, name;
	double res;
	int rank;
	
	

	public DyCar(String kind, String name, int[] jum) {
		super();
		this.kind = kind;
		this.name = name;
		this.jum = jum;
	}

	void print()
	{
		cal();
		String str = kind+"\t"+name+"\t"+res+"\t"+rank;
		
		System.out.println(str);
	}
	
	void cal() {}
	
	void calRank(DyCar [] arr)
	{
		rank=1;
		
		for (DyCar dyCar : arr) {
			if(res<dyCar.res)
				rank++;
		}
	}
	
}

class DySport extends DyCar{
	double [] rate = {0.5,0.2,0.3};

	public DySport(String name, int speed, int eff, int design) {
		super("������ī", name, new int[] {speed, eff, design});
	}
	
	@Override
	void cal() {
		// TODO Auto-generated method stub
		res =0;
		for (int i = 0; i < jum.length; i++) {
			res+= rate[i]*jum[i];
		}
	}
	
}

class DyVan extends DyCar{
	double [] rate = {0.15,0.35,0.5};

	public DyVan(String name, int speed, int eff, int design) {
		super("������", name, new int[] {speed, eff, design});
	}
	
	@Override
	void cal() {
		// TODO Auto-generated method stub
		res =0;
		for (int i = 0; i < jum.length; i++) {
			res+= rate[i]*jum[i];
		}
	}
	
}



class DyTruck extends DyCar{
	double [] rate = {0.6,0.4};

	public DyTruck(String name, int eff, int cnt) {
		super("Ʈ��", name, new int[] {eff, cnt});
		
		res =0;
		for (int i = 0; i < jum.length; i++) {
			res+= rate[i]*jum[i];
		}
	}
}



public class DyCarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DyCar [] arr = {
			
			new DyTruck("Ÿ��ź", 78,89),
			new DyVan("�̽�Ÿ��", 54,65,76),
			new DySport("���������", 77,88,99)
		};
		
		for (DyCar dyCar : arr) {
			dyCar.cal();
		}
		
		for (DyCar dyCar : arr) {
			
			dyCar.calRank(arr);
			dyCar.print();
		}
	}

}
