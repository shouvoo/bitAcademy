package basic;

public class StudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����, ����, ���� ������ �̿��Ͽ� ����, ����� ����ϼ���
		int kor = 99,eng=77,math = 68;
		int sum = kor+eng+math;
		double avg=(double)sum/3;
		
		
		
		avg = (double)(int)(avg*100+0.5)/100;
		
		
		
		
		int univStudNum = 111;  //stud + num
		
		String res = avg>=90 ? "��":
					 avg>=80 ? "��":
					 avg>=70 ? "��":
					 avg>=60 ? "��":"��"	;
					 
					 
        //ABCDEFGHIJK					 
		char res2 = (char)('A'+10-(int)avg/10);
		
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(res2);
		
		String res3;
		
		if(avg>=90){
			res3="��";
			if(kor>=90 && eng >=90 && math>=90)
				res3+="(����)";
		}else if(avg>=80){
			res3="��";
		}else if(avg>=70){
			res3="��";
		}else if(avg>=60){
			res3="��";
		}else{
			res3="��";
		}
		
		System.out.println(res3);
		
		
		String univA = "���հ�";
		String univB = "���հ�";
		String univC = "���հ�";
		if((0.5*kor+0.3*eng+0.2*math)>=80)
			univA="�հ�";
		if((0.4*kor+0.3*eng+0.3*math)>=80)
			univB="�հ�";
		if((0.2*kor+0.3*eng+0.5*math)>=80)
			univC="�հ�";
		
		System.out.println("A����:"+univA);
		System.out.println("B����:"+univB);
		System.out.println("C����:"+univC);
	}

}
