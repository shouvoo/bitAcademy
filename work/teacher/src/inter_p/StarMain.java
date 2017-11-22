package inter_p;

interface Resource{
	
	void getting(String name);
}

interface Build{
	void building(String name);
	void repair(String name);
}

interface Unit{
	void riding(String name);
	void repair(String name);
}
interface Enemy{
	void attack(String name);
}

class SCV implements Build, Unit, Enemy, Resource{
	int [] getResource = {8,8};
	
	SCVData totData,myData;
	String pre;
	
	
	public SCV(SCVData totData, String name) {
		super();
		this.totData = totData;
		myData = new SCVData(name);
		pre = totData.name+"_"+myData.name+":";
	}
	
	@Override
	public void getting(String name) {
		// TODO Auto-generated method stub
		int reNum=myData.resourceNum(name);
		
		
		myData.resource[reNum]+=getResource[reNum];
		totData.resource[reNum]+=getResource[reNum];
		
		
		System.out.println(pre+ name+"-"+
		myData.resource[reNum]+"("+
		totData.resource[reNum]+")");
	}

	@Override
	public void building(String name) {
		
		for(int k = 0 ; k <myData.up.length;k++) {
		
			UnitPrice buf = myData.up[k];
			if(name==buf.name)
			{
				boolean chk = true;
				for (int i = 0; i < buf.resource.length; i++) {
					if (totData.resource[i]<buf.resource[i])
						chk = false;
				}
				
				if(chk)
				{
					for (int i = 0; i < buf.resource.length; i++) {
						totData.resource[i]-=buf.resource[i];
							
					}
					System.out.println(pre+name+"���� ����");
					
					myData.res[0][k]++;
					totData.res[0][k]++;
					
				}else {
					System.out.println(pre+name+" �ڿ��� ���ڸ��ϴ�.");
				}
			}
		}
		
		
	}
	
	@Override
	public void repair(String name) {
		// TODO Auto-generated method stub
		
		for(int k = 0 ; k <myData.up.length;k++) {
			
			UnitPrice buf = myData.up[k];
			if(name==buf.name)
			{
				
				System.out.println(pre+name+" �����ؿ�");
				
				myData.res[3][k]++;
				totData.res[3][k]++;
					
				
			}
		}
		

		for (int i = 0; i < myData.resStr[0].length; i++) {
			
			if(myData.resStr[0][i]==name)
			{
				System.out.println(pre+name+" �����ؿ�");
				myData.res[3][myData.up.length+i]++;
				totData.res[3][myData.up.length+i]++;
			}
		}
	}
	
	@Override
	public void riding(String name) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < myData.resStr[0].length; i++) {
			
			if(myData.resStr[0][i]==name)
			{
				System.out.println(pre+name+" Ÿ��");
				myData.res[1][i]++;
				totData.res[1][i]++;
			}
		}
		
	}
	
	@Override
	public void attack(String name) {
		// TODO Auto-generated method stub
		for (int i = 0; i < myData.resStr[1].length; i++) {
			
			if(myData.resStr[1][i]==name)
			{
				System.out.println(pre+name+" �ο���");
				myData.res[2][i]++;
				totData.res[2][i]++;
			}
		}
	}
	
	void print()
	{
		System.out.println(myData.print());
	}
}

class UnitPrice{
	String name;
	int [] resource= new int[2];
	public UnitPrice(String name, int mineral, int gas) {
		super();
		this.name = name;
		this.resource[0] = mineral;
		this.resource[1] = gas;
	}
	
	
}

class SCVData{
	String name;
	
	int [] resource=new int[2];
	
	
	
	UnitPrice [] up = {
		new UnitPrice("Ŀ�ǵ弾��", 400,0),
		new UnitPrice("���丮", 200,100),
		new UnitPrice("��Ÿ��Ʈ", 150,100)
	};
	
	String [][] resStr = {{"��ũ","�����"},
			{"����","�����"}};
									
	int [][] res = {
			new int[up.length],//�Ǽ�, Ÿ��
			new int[resStr[0].length],//Ÿ��
			new int[resStr[1].length],//, �����ϱ�
			new int[up.length+resStr[0].length]//��ġ��
	};
	
	
	int resourceNum(String name)
	{
		int reNum=-1;
		switch(name)
		{
			case "�̳׶�":
				reNum=0;
				break;
			case "����":
				reNum=1;
				break;
		}
		return reNum;
	}
	

	public SCVData(String name) {
		super();
		this.name = name;
	}
	
	
	String print()
	{
		String res = name+" �ڿ�:";
		for (int i: resource) {
			res+= i+",";
		}
		res+="\n";
		
		for (int i = 0; i < this.res[0].length; i++) {
			res+=up[i].name+":"+this.res[0][i]+",";
		}
		res+="\n";
		
		for (int k = 1; k < this.res.length-1; k++) {
			for (int i = 0; i < this.res[k].length; i++) {
				res+=resStr[k-1][i]+":"+this.res[k][i]+",";
			}
			res+="\n";
		}
		
		
		for (int i = 0; i < up.length; i++) {
			res+=up[i].name+":"+this.res[3][i]+",";
		}
		
		for (int k = 0; k < resStr[0].length; k++) {
			
			res+=resStr[0][k]+":"+this.res[3][up.length+k]+",";
			
		}

		return res;
		
	}
	
}


public class StarMain {

	static void gets(SCV [] scvs,String name, int limit)
	{
		while(true)
		{
			for (SCV scv : scvs) {
				Resource rr = scv;
				
				rr.getting(name);
				
				if(scv.totData.resource[scv.myData.resourceNum(name)]>=limit) {
					return;
				}
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SCVData t12 = new SCVData("12��");
		SCV [] scv = {
				new SCV(t12, "1ȣ��"),
				new SCV(t12, "2ȣ��"),
				new SCV(t12, "3ȣ��"),
				new SCV(t12, "4ȣ��")
		};
		
		Resource rr;
		Build bb;
		Unit uu;
		Enemy ee;
		
		
		gets(new SCV[] {scv[0], scv[1], scv[3]},"�̳׶�", 1000);
		
		gets(new SCV[] {scv[2], scv[1], scv[0]},"����", 1000);
		
		bb = scv[1];
		bb.building("Ŀ�ǵ弾��");
		bb = scv[2];
		bb.building("���丮");
		uu = scv[3];
		uu.riding("��ũ");
		ee = scv[1];
		ee.attack("����");
		bb.repair("��Ÿ��Ʈ");
		uu.repair("�����");
		for (SCV ss : scv) {
			System.out.println("-----------------------");
			ss.print();
		}
		
		System.out.println("-----------------------");
		System.out.println(t12.print());
		
	}

}
