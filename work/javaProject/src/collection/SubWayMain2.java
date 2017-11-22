package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Station2{
	
	
	int id;
	String name;
	ArrayList lines=new ArrayList();
	
	public Station2(String name) {
		super();
		
		String [] buf = name.split("_");
		this.id = Integer.parseInt(buf[0]);
		this.name = buf[1];
	}
	@Override
	public String toString() {
		return id + "_" + name +lines;
	}

}


class ControlTow2{
	List subs;
	Scanner sc = new Scanner(System.in);
	
	public ControlTow2(String [] name, String[][] staion) {
		// TODO Auto-generated constructor stub
		
		subs = new ArrayList();
		
		
		for (int s =0; s<staion.length;s++) {
			ArrayList ar = new ArrayList<>();
			ar.add(name[s]); //��ȣ������ ��´�
			
			for (String str : staion[s]) {
				Station2 st=new Station2(str);
				
				st.lines.add(s);
				ar.add(st);
			}
			subs.add(ar);
		}
		
		
		
	}
	
	void print()
	{
		for (Object arr : subs) {
			
			for (Object ss : (ArrayList)arr) {
				System.out.print(ss+",");
			}
			System.out.println();
		}
	}
	
	void changeStst(Station2 st, String [] lines)
	{
		for (String str : lines) {
			
			String [] buf = str.split("_");
			int line = Integer.parseInt(buf[0]);
			((ArrayList)subs.get(line)).add(Integer.parseInt(buf[1])+1, st);
			
			st.lines.add(line);
		}
	}
	
	String first = "", end = "";
	void findTrack() {
		System.out.print("���:");
		first = sc.nextLine();
		
		System.out.print("����:");
		end = sc.nextLine();
		
		System.out.println(first);
		System.out.println(end);
		Station2 ff = findSt(first);
		Station2 ee = findSt(end);
		Station2 bufee = ee;
		int total = 0;
		
		
		
		
		if((lineChk(ff, bufee))<0)
		{
			bufee = eeLineChk(ff, ee);
			
			if(bufee==null)
			{
				ArrayList another = eeTrans(ee);
				for (Object object : another) {
					
					Station2 sss = eeLineChk(ff,(Station2)object);
					//if(sss != null) System.out.println("!!!" + sss.name);

					if(sss!=null)
					{
						bufee = sss;
						total += stationGap(ff, bufee);
						
						ff = bufee;
						bufee = (Station2)object;
						
					}
				}

			}
		}
		
		total += stationGap(ff, bufee);
		
		ff = bufee;
		bufee = ee;
		int line=lineChk(ff, bufee);
		
		if(line>=0) total += stationGap(ff, bufee);

		System.out.println("�ҿ俪����:"+total);
	}
	
	int stationGap(Station2 ff, Station2 bufee)
	{
		int total =0;
		int ffNum=0;
		int eeNum=0;
		int line;
		
		line=lineChk(ff, bufee);
		ffNum = numberofLine(line, ff);
		eeNum = numberofLine(line, bufee);
		int cum= Math.abs(ffNum-eeNum);
		System.out.println(ffNum + "  :  " + eeNum);
		System.out.println(((ArrayList)subs.get(line)).get(0) + "��");
		System.out.println(ff.name + "��  ���");
		if(!bufee.name.equals(end)) System.out.println(bufee.name + "��  ȯ��");
		else System.out.println(bufee.name + "��  ����");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//System.out.println(cum);
		total+=cum;
		
		return cum;
	}
	
	
	//////ȯ�¿��� ã�ƶ� 
	ArrayList eeTrans(Station2 end)
	{
		ArrayList res = new ArrayList();
		
		for (Object obj : (ArrayList)end.lines) 
		{
			ArrayList ar = (ArrayList)subs.get((int)obj);
			for(Object arr : ar.subList(1, ar.size()))
			{
				Station2 st = (Station2)arr;
				for (Object object : st.lines) {
					
					if(obj!=object)
					{
						res.add(st);
					}
				}
			}
		}
		return res;
	}
	
	
	
	
	int numberofLine(Object line, Station2 st)
	{
		return ((ArrayList)subs.get((int)line)).indexOf(st);
	}
	
	int lineChk(Station2 ff,	Station2 ee )
	{
		int res = -1;
		
		for (Object fl : ff.lines) {
		
			for (Object el : ee.lines) {
				
				if(fl==el)
					res=(int)fl;
			}
		}
		return res;
	}
	
	
	Station2 eeLineChk(Station2 ff, Station2 ee)
	{
		
		Station2 res = null;
		for (Object eeLine : ee.lines) {
			for (Object ffLine : ff.lines) {
				//System.out.println(ffLine);
				
				ArrayList ffLines = (ArrayList)subs.get((int)ffLine);
				
				for(Object lineSt: ffLines.subList(1,ffLines.size()))
				{
					Station2 ffLinesSt = (Station2)lineSt;
					for (Object ffLinesStLines : ffLinesSt.lines) {
						if(eeLine == ffLinesStLines)
							res =ffLinesSt;
					}					
				}
			}
		}
		
		return res;
	}
	
	
	
	
	Station2 findSt(String stat)
	{
		Station2 res =null;
		
		for (Object arr : subs) {
			

			for (Object ss : ((ArrayList)arr).subList(1,((ArrayList)arr).size())) {
				
				
				
				Station2 st =(Station2)ss;
				if(stat.equals(st.name))
				{
					res = st;
				}
			}
			
		}
		
		return res;
		
	}

}

public class SubWayMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String [] name = {"�źд�","�д�","8ȣ","1ȣ"};
		 String[][] staion = {
				 {"0_����","1_�����߾�","2_����","3_����","4_������û","5_��õ","7_�Ǳ�","8_û����Ա�","9_����ù��ǽ�","10_����","11_����"},
					 {"100_����","101_�ű�","102_������û","103_��ź�Ǽ�","104_����","105_����","106_û��","107_��","108_����","109_�Ű�","110_����","111_����","112_����","113_����","114_�̱�","116_����","117_����","118_�̸�","119_��ž","120_���","121_����","122_��õ��","124_����","125_�����Ա�","126_������","127_����","128_����","129_��Ƽ","130_����","131_������","132_������û","133_�б����ε���","134_���｣","135_�սʸ�"},
					 {"200_���","201_����","202_����","203_�ܴ���Ÿ�","204_���ѻ꼺�Ա�","207_����","208_����","209_��������","210_����","211_����","212_���","213_�����伺","214_������û","215_õȣ","216_�ϻ�"},
					 {"300_��õ2", "301_����õ3", "302_������3", "303_��ȭ2", "305_�־�4", "306_����4", "307_����3"},
		 		};
		 ControlTow2 ct = new ControlTow2(name,staion);
		 ct.changeStst(new Station2("6_����"), new String[] {"0_6","1_15"});
		 ct.changeStst(new Station2("123_����"), new String[] {"1_23","2_6"});
		 ct.changeStst(new Station2("205_�꼺"), new String[] {"2_5","3_5"});
		 
		 ct.print();
		 ct.findTrack();
		
		
		
	}

}
