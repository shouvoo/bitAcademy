package io_p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

class Stud implements Serializable, Comparable<Stud>{
	String name;
	int [] jum;
	int sum, avg, rank,gen, ban;
	
	void init(int ban,String name,int gen, int kor, int eng, int mat) {
		
		this.name = name;
		this.ban = ban;
		this.gen = gen;
		this.jum = new int[] {kor, eng,  mat};
	}
	
	public Stud(String line)
	{
		String [] arr = line.split(",");
		
		init(Integer.parseInt(arr[0]),
				arr[1],
				Integer.parseInt(arr[2]),
				Integer.parseInt(arr[3]),
				Integer.parseInt(arr[4]),
				Integer.parseInt(arr[5])
				
				);
		cal();
	}
	
	void cal()
	{
		sum =0;
		
		for (int i : jum) {
			sum+=i;
		}
		avg = sum/jum.length;
	}
	
	@Override
	public int compareTo(Stud o) {
		// TODO Auto-generated method stub
		int res = o.avg - avg;
		
		if (res ==0)
			name.compareTo(o.name);
		
		return res;
	}

	@Override
	public String toString() {
		return ban + "," + name + "," + new String [] {"남자","여자"}[gen] + "," + Arrays.toString(jum) + "," + sum
				
				+ "," + avg + "," + rank;
	}
	
	void rankCal(TreeSet<Stud>map)
	{
		rank =1;
		for (Stud stud : map) {
			if(avg <stud.avg)
				rank++;
		}
	}
	
	
	
}

public class StudFileMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileReader fis = new FileReader("fff/stud.txt");
		BufferedReader bis = new BufferedReader(fis); 
		
		String line;
		
		TreeMap<Integer, TreeMap<Integer,TreeSet<Stud>>>map = new TreeMap<>();
		
		while((line=bis.readLine())!=null)
		{
			Stud st = new Stud(line);
			TreeMap<Integer,TreeSet<Stud>> banMap = new TreeMap<>();
			if(map.containsKey(st.ban))
				banMap = map.get(st.ban);
			
			
			
			TreeSet<Stud> genSet = new TreeSet<>();
			if(banMap.containsKey(st.gen))
				genSet = banMap.get(st.gen);
			
			genSet.add(st);
			banMap.put(st.gen, genSet);
			map.put(st.ban, banMap);
		}
		
		bis.close();
		fis.close();
		
		
		Iterator<Integer>it = map.keySet().iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			
			System.out.println(key+"반>>>>");
			
			Iterator<Integer> git = map.get(key).keySet().iterator();
			while(git.hasNext())
			{
				Integer gkey = git.next();
				String getStr = new String [] {"남자","여자"}[gkey];
				System.out.println(">> "+getStr+" >>>>");
				
				String dirName = "bangen/"+key+"/";
				File ff = new File(dirName);
				ff.mkdirs();
				
				FileWriter fw = new FileWriter(dirName+getStr+".txt");
				BufferedWriter bw = new BufferedWriter(fw);
				for (Stud st : map.get(key).get(gkey)) {
					st.rankCal(map.get(key).get(gkey));
					System.out.println(st);
					bw.write(st+"\n");
				}
				
				bw.close();
				fw.close();
			}
			
		}
		
		
		
	}

}
