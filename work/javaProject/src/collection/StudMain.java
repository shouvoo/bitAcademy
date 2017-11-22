package collection;

import java.util.Arrays;
import java.util.TreeSet;

class CStud implements Comparable{
   int ban;
   String name;
   String gender;
   int []jum;
   int sum, avg, rank;
   
   
   public CStud(int ban, String name, String gender, int kor, int eng, int mat) {
      super();
      this.ban = ban;
      this.name = name;
      this.gender = gender;
      this.jum = new int[]{kor, eng, mat};
      
      cal();
   }
   
   void cal()
   {
    for (int i = 0; i < jum.length; i++) {
      sum += jum[i];
   }  
    avg = sum/jum.length;
   }
   
   
   @Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
	   
	   CStud you = (CStud)o;
	   
	   int res = you.avg-avg;
	   
	   if(res==0)
		   res = name.compareTo(you.name);
	   
	   return res;
	}
   
   void rank(TreeSet cs)
   {
	   rank++;
	   for (Object obj : cs) {
		   CStud you = (CStud)obj;
		   
		   if(this.avg <you.avg)
				this.rank++;
	   }
   }
  

	@Override
	public String toString() {
	   return ban + "," + name + "\t" + gender + "," + Arrays.toString(jum) + ", "
	         + sum + "," + avg + "," +rank;
	}
   
  
}

class CateList implements Comparable
{
	Object cate;
	TreeSet data;
	public CateList(Object cate) {
		super();
		this.cate = cate;
		data = new TreeSet();
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Comparable c1 = (Comparable)cate;  
		Comparable c2 = (Comparable)((CateList)o).cate;
		
		return c1.compareTo(c2);
	}
}

class CStudControl{
	
	
	TreeSet total;
	public CStudControl(CStud []csArr) {
		// TODO Auto-generated constructor stub
		total = new TreeSet();
	     
	    for (CStud cs: csArr) {
			
	    	//반
	    	CateList banCate =getCate(total,cs.ban);
	    	
	    	//성별
	    	CateList genCate =getCate(banCate.data,cs.gender);
	    	
	    	genCate.data.add(cs);  
	     }
	    
	    rank();
	}
	
	
	CateList getCate(TreeSet set,Object cate)
	{
		CateList res = null;
		for (Object obj : set) {
			CateList ca = (CateList)obj;
			
			if(ca.cate.equals(cate))
				res = ca;
			
		}
		if(res==null)
    	{
			res = new CateList((Comparable)cate);
    		set.add(res);
    	}

		return res;
	}
	
	void rank()
	{
		for (Object banList : total) {
			CateList ban = (CateList)banList;

			for (Object genList : ban.data) {

				CateList gen = (CateList)genList;
				
				for (Object obj : gen.data) {
					CStud me = (CStud)obj;
					me.rank(gen.data);
				}
			}
		}
	}
	
	
	void print()
	{
		for (Object banList : total) {
			CateList ban = (CateList)banList;
			System.out.println(ban.cate);
			
			for (Object genList : ban.data) {
				
				
				CateList gen = (CateList)genList;
				System.out.println(">>>>"+gen.cate);
				
				for (Object obj : gen.data) {
					System.out.println(obj);
				}
			}
		}
	}
	
}

public class StudMain {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
    
      CStud []csArr ={
            new CStud(3, "엘리자베", "여자", 60, 96, 90),
            new CStud(2, "멕베스", "남자", 50, 86, 90),
            new CStud(3, "신사인당", "여자", 90, 93, 94),
            new CStud(3, "아이슈타", "남자", 90, 95, 90),
            new CStud(2, "헬렌켈러", "여자", 90, 87, 94),
            new CStud(1, "나이팅게", "여자", 80, 60, 30),
            new CStud(2, "슈바이처", "남자", 50, 56, 90),
            new CStud(1, "메르켈", "여자", 40, 30, 90),
            new CStud(1, "니체", "남자", 90, 65, 80),
            new CStud(4, "테레사", "여자", 90, 45, 89),
           
            
      };
      
      CStudControl cc = new CStudControl(csArr);
      cc.print();
      
       
     
   }

}
