package oops;
/*학생클래스를 정의, 선언, 생성, 호출 하여 학생정보를 출력하세요
--- 학번, 이름, 반, 전화번호, 점수[국어, 영어, 수학], 총점, 평균*/

class SingleStudent
{
	int studentId = 17;
	int studentClass = 1;
	int [] scoreArr = {98, 89, 87};
	int totalScore = 0;
	int average = 0;
	
	String studentName = "한빛";
	String phoneNumber = "010-1234-5678";
}

public class HomeWork_20170802 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [] index = {"학번", "이름", "반", "전화번호", "국어", "영어", "수학", "총점", "평균"};
		SingleStudent ss = new SingleStudent();
		
		//연산부
		for (int i = 0; i < ss.scoreArr.length; i++) 
		{
			ss.totalScore += ss.scoreArr[i];
		};
		
		ss.average = ss.totalScore / ss.scoreArr.length;
		
		
		
		
		//출력부
		
		for (int i = 0; i < index.length; i++) 
		{
			if(i == 4) System.out.print("" + "\t");
			System.out.print(index[i] + "\t");
		}
		
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print(ss.studentId + "\t");
		System.out.print(ss.studentName + "\t");
		System.out.print((ss.studentClass + "반") + "\t");
		System.out.print(ss.phoneNumber + "\t");
		
		for (int i = 0; i < ss.scoreArr.length; i++) 
		{
			System.out.print(ss.scoreArr[i] + "\t");
		};
		
		System.out.print(ss.totalScore + "\t");
		System.out.print(ss.average + "\n");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}

}
