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
					System.out.println(pre+name+"짓기 성공");
					
					myData.res[0][k]++;
					totData.res[0][k]++;
					
				}else {
					System.out.println(pre+name+" 자원이 모자릅니다.");
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
				
				System.out.println(pre+name+" 수리해요");
				
				myData.res[3][k]++;
				totData.res[3][k]++;
					
				
			}
		}
		

		for (int i = 0; i < myData.resStr[0].length; i++) {
			
			if(myData.resStr[0][i]==name)
			{
				System.out.println(pre+name+" 수리해요");
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
				System.out.println(pre+name+" 타요");
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
				System.out.println(pre+name+" 싸워요");
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
		new UnitPrice("커맨드센터", 400,0),
		new UnitPrice("팩토리", 200,100),
		new UnitPrice("스타포트", 150,100)
	};
	
	String [][] resStr = {{"탱크","드랍쉽"},
			{"저그","히드라"}};
									
	int [][] res = {
			new int[up.length],//건설, 타기
			new int[resStr[0].length],//타기
			new int[resStr[1].length],//, 공격하기
			new int[up.length+resStr[0].length]//고치기
	};
	
	
	int resourceNum(String name)
	{
		int reNum=-1;
		switch(name)
		{
			case "미네랄":
				reNum=0;
				break;
			case "가스":
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
		String res = name+" 자원:";
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
		SCVData t12 = new SCVData("12시");
		SCV [] scv = {
				new SCV(t12, "1호기"),
				new SCV(t12, "2호기"),
				new SCV(t12, "3호기"),
				new SCV(t12, "4호기")
		};
		
		Resource rr;
		Build bb;
		Unit uu;
		Enemy ee;
		
		
		gets(new SCV[] {scv[0], scv[1], scv[3]},"미네랄", 1000);
		
		gets(new SCV[] {scv[2], scv[1], scv[0]},"가스", 1000);
		
		bb = scv[1];
		bb.building("커맨드센터");
		bb = scv[2];
		bb.building("팩토리");
		uu = scv[3];
		uu.riding("탱크");
		ee = scv[1];
		ee.attack("저그");
		bb.repair("스타포트");
		uu.repair("드랍쉽");
		for (SCV ss : scv) {
			System.out.println("-----------------------");
			ss.print();
		}
		
		System.out.println("-----------------------");
		System.out.println(t12.print());
		
	}

}
