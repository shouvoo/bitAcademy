package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Station{
	
	
	int id;
	String name;
	ArrayList lines=new ArrayList();
	
	public Station(String name) {
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


class ControlTow{
	List subs;
	Scanner sc = new Scanner(System.in);
	
	public ControlTow(String [] name, String[][] staion) {
		// TODO Auto-generated constructor stub
		
		subs = new ArrayList();
		
		
		for (int s =0; s<staion.length;s++) {
			ArrayList ar = new ArrayList<>();
			ar.add(name[s]);
			
			for (String str : staion[s]) {
				Station st=new Station(str);
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
	
	void changeStst(Station st, String [] lines)
	{
		for (String str : lines) {
			
			String [] buf = str.split("_");
			int line = Integer.parseInt(buf[0]);
			((ArrayList)subs.get(line)).add(Integer.parseInt(buf[1])+1, st);
			
			st.lines.add(line);
		}
	}
	
	void findTrack() {
		System.out.print("출발:");
		String first = sc.nextLine();
		
		System.out.print("도착:");
		String end = sc.nextLine();
		
		System.out.println(first);
		System.out.println(end);
		Station ff = findSt(first);
		Station ee = findSt(end);
		Station bufee = ee;
		int total = 0;
		
		if((lineChk(ff, bufee))<0)
		{
			bufee = eeLineChk(ff, ee);
			if(bufee==null)
			{
				ArrayList another = eeTrans(ee);
				System.out.println(((Station)another.get(0)).name);
				System.out.println(another.get(0));
				for (Object object : another) {
					
					Station sss = eeLineChk(ff,(Station)object);
					if(sss!=null)
					{
						bufee = sss;
						total += stationGap(ff, bufee);
						
						ff = bufee;
						bufee = (Station)object;
						
					}
				}
			}
		}
		
		total += stationGap(ff, bufee);
		
		ff = bufee;
		bufee = ee;
		int line=lineChk(ff, bufee);
		
		if(line>=0)
		{
			total += stationGap(ff, bufee);
		}

		System.out.println("소요역구간:"+total);
	}
	
	int stationGap(Station ff, Station bufee)
	{
		int total =0;
		int ffNum=0;
		int eeNum=0;
		int line;
		
		line=lineChk(ff, bufee);
		ffNum = numberofLine(line, ff);
		eeNum = numberofLine(line, bufee);
		int cum= Math.abs(ffNum-eeNum);
		
		System.out.println(cum);
		total+=cum;
		
		return cum;
	}
	
	
	//////환승역을 찾아라 
	ArrayList eeTrans(Station end)
	{
		ArrayList res = new ArrayList();
		
		for (Object obj : (ArrayList)end.lines) {
		
			//System.out.println(obj);
			ArrayList ar = (ArrayList)subs.get((int)obj);
			for(Object arr : ar.subList(1, ar.size()))
			{
				Station st = (Station)arr;
				for (Object object : st.lines) {
					
					if(obj!=object)
					{
						//res.add(new Object [] {object,st});
						res.add(st);
					}
				}
			}
		}
		
		
		
		return res;
	}
	
	
	
	
	int numberofLine(Object line, Station st)
	{
		return ((ArrayList)subs.get((int)line)).indexOf(st);
	}
	
	int lineChk(Station ff,	Station ee )
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
	
	
	Station eeLineChk(Station ff, Station ee)
	{
		
		Station res = null;
		for (Object eeLine : ee.lines) {
			for (Object ffLine : ff.lines) {
				//System.out.println(ffLine);
				
				ArrayList ffLines = (ArrayList)subs.get((int)ffLine);
				
				for(Object lineSt: ffLines.subList(1,ffLines.size()))
				{
					Station ffLinesSt = (Station)lineSt;
					for (Object ffLinesStLines : ffLinesSt.lines) {
						if(eeLine == ffLinesStLines)
							res =ffLinesSt;
					}					
				}
			}
		}
		
		return res;
	}
	
	
	
	
	Station findSt(String stat)
	{
		Station res =null;
		
		for (Object arr : subs) {
			

			for (Object ss : ((ArrayList)arr).subList(1,((ArrayList)arr).size())) {
				
				
				
				Station st =(Station)ss;
				if(stat.equals(st.name))
				{
					res = st;
				}
			}
			
		}
		
		return res;
		
	}
	
	
	
	
}

public class SubWayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] name = {"신분당","분당","8호","1호"};
		 String[][] staion = {
				 {"0_광교","1_광교중앙","2_상현","3_성복","4_수지구청","5_동천","7_판교","8_청계산입구","9_양재시민의숲","10_양재","11_강남"},
					 {"100_수원","101_매교","102_수원시청","103_매탄권선","104_망포","105_영통","106_청명","107_상갈","108_기흥","109_신갈","110_구성","111_보정","112_죽전","113_오리","114_미금","116_수내","117_서현","118_이매","119_야탑","120_모란","121_태평","122_가천대","124_수서","125_대모산입구","126_개포동","127_구룡","128_도곡","129_한티","130_선릉","131_선정릉","132_강남구청","133_압구정로데오","134_서울숲","135_왕십리"},
					 {"200_모란","201_수진","202_신흥","203_단대오거리","204_남한산성입구","207_장지","208_문정","209_가락시장","210_송파","211_석촌","212_잠실","213_몽촌토성","214_강동구청","215_천호","216_암사"},
					 {"300_인천2", "301_동인천3", "302_제물포3", "303_도화2", "305_주안4", "306_간석4", "307_간석3"},
		 		};
		 ControlTow ct = new ControlTow(name,staion);
		 ct.changeStst(new Station("6_정자"), new String[] {"0_6","1_15"});
		 ct.changeStst(new Station("123_복정"), new String[] {"1_23","2_6"});
		 ct.changeStst(new Station("205_산성"), new String[] {"2_5","3_5"});
		 
		 ct.print();
		 ct.findTrack();
		
		
		
	}

}
