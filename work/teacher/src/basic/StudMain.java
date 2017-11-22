package basic;

public class StudMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//국어, 영어, 수학 점수를 이용하여 총점, 평균을 계산하세요
		int kor = 99,eng=77,math = 68;
		int sum = kor+eng+math;
		double avg=(double)sum/3;
		
		
		
		avg = (double)(int)(avg*100+0.5)/100;
		
		
		
		
		int univStudNum = 111;  //stud + num
		
		String res = avg>=90 ? "수":
					 avg>=80 ? "우":
					 avg>=70 ? "미":
					 avg>=60 ? "양":"가"	;
					 
					 
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
			res3="수";
			if(kor>=90 && eng >=90 && math>=90)
				res3+="(우등생)";
		}else if(avg>=80){
			res3="우";
		}else if(avg>=70){
			res3="미";
		}else if(avg>=60){
			res3="양";
		}else{
			res3="가";
		}
		
		System.out.println(res3);
		
		
		String univA = "불합격";
		String univB = "불합격";
		String univC = "불합격";
		if((0.5*kor+0.3*eng+0.2*math)>=80)
			univA="합격";
		if((0.4*kor+0.3*eng+0.3*math)>=80)
			univB="합격";
		if((0.2*kor+0.3*eng+0.5*math)>=80)
			univC="합격";
		
		System.out.println("A대학:"+univA);
		System.out.println("B대학:"+univB);
		System.out.println("C대학:"+univC);
	}

}
