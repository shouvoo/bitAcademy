package oops;

import java.util.Iterator;

class Home_20170805
{
	int classId;
	String studentName;
	String gender;
	int [] scoreArr = new int [4];
	int totalScore;
	int average;
	int rank;
	int genderRank;
	int totalFemale;

	
	void init(int classId, String studentName, int [] scoreArr)
	{
		this.classId = classId;
		this.studentName = studentName;
		this.gender = (scoreArr.length == 4) ? "남" : "여";
		this.scoreArr = scoreArr;
		this.totalScore = totalScore;
		this.average = average;
		
		
		totalCal();
		//print();
	}
	
	void totalCal()
	{
		this.totalScore = 0;
		for (int i = 0; i < this.scoreArr.length; i++) 
		{
			this.totalScore += this.scoreArr[i];
		}
		average = this.totalScore / this.scoreArr.length;
	}
	
	void rankCal(Home_20170805 [] arr)
	{
		this.rank = 1;

		for (Home_20170805 you : arr) 
		{
			if(this.average < you.average)
			{
				this.rank++;
			}
		}
		
		print(); //0. 입력순서
	}
	
	void maleSort(Home_20170805 [] arr)
	{
		this.totalFemale = 0;
		for (Home_20170805 me : arr) 
		{
			if(me.gender == "여") this.totalFemale++;
		}
	}
	
	void print()
	{
		String space = (this.gender == "여") ? "\t" : "";
		String printResult = (this.classId + "반") + "\t"; 
		printResult += this.studentName + "\t";
		printResult += this.gender + "\t";
		for (int i : this.scoreArr) 
		{
			printResult += i + "\t";
		}
		
		printResult += space + this.totalScore + "\t" + this.average + "\t" + this.rank
				 + "\t" + this.genderRank;
		
		System.out.println(printResult);
	}
}

class ReturnClass_20170805
{		
	int totalClassScore = 0;
	int maxScore;
	int minScore;
	
	Home_20170805 returnRank(Home_20170805 [] arr, int count)
	{
		Home_20170805 inArr = arr[count];
		for (Home_20170805 you : arr) 
		{
			if(count + 1 == you.rank)
			{
				inArr = you;
			}
		}
		return inArr;
	}
	
	Home_20170805 returnGenderRank(Home_20170805 [] arr, int count)
	{
		
		Home_20170805 inArr = arr[count];
		inArr.genderRank = 1;
		for (Home_20170805 you : arr) 
		{
			if(inArr.average < you.average && you.gender == inArr.gender)
			{
				inArr.genderRank++;
			} 

		}
		
		return inArr;
	}
	
	Home_20170805 returnGenderSort(Home_20170805 [] arr, int count)
	{
		
		Home_20170805 inArr = arr[count];
		for (Home_20170805 you : arr) 
		{
			int rank = (you.gender == "남") ? you.genderRank + inArr.totalFemale : you.genderRank;
			if(count + 1 == rank)
			{
				inArr = you;
			}
		}
		
		return inArr;
	}
	
	void returnTotalAverage(Home_20170805 [] arr, int count)
	{
		
		Home_20170805 inArr = arr[count];
		this.totalClassScore += inArr.totalScore;
		for (Home_20170805 you : arr) 
		{
			if(inArr.totalScore < you.totalScore) this.maxScore = you.totalScore;
			if(inArr.totalScore > you.totalScore)  this.minScore = you.totalScore;
		}
	}
}

public class HomeWork_20170805 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*학생클래스를 정의 , 선언, 생성, 호출 하여 학생정보를 출력하세요
		=== 반, 이름, 성별, 점수[국어, 영어, 수학, 교련], 총점, 평균, 등수

		출력방식

		0. 입력순서 1.전체등수 2.반별등수 3.성별등수 4.반, 성별, 등수

		클래스배열을 받아 처리하는 로직클래스에 메소드로 처리할것

		각 카테고리별로 누적집계 출력하세요
		누적집계 종류 : 합계, 평균, 최대, 최소
		누적집계 대상 : 국어, 영어, 수학, 교련, 총점, 평균
*/
		String [] index = {"반", "이름", "성별", "국어", "영어", 
	              "수학", "교련", "총점", "평균", "등수", "성별등수"};
		String line = "";
		
		int [][][] scoreArr = {	{{98, 49, 87, 87}, 
								 {88, 59, 77},
								 {78, 69, 67, 87},
								 {68, 79, 57},
								 {58, 89, 97}},
				
								{{98, 49, 87, 87}, 
								 {88, 59, 77, 64},
								 {78, 69, 67, 87},
								 {68, 79, 57},
								 {58, 89, 97}},
								
								{{98, 49, 87}, 
								 {88, 59, 77},
								 {78, 69, 67, 87},
								 {68, 79, 57},
								 {58, 89, 97}}
								};
		
		for (int i = 0; i < scoreArr.length; i++) 
		{
			Home_20170805 [][] classArr = new Home_20170805 [scoreArr.length][scoreArr[i].length];
			
			if(i > 0)
			{
				System.out.println();
				System.out.println();
			}
			System.out.println("(((((((((((((((((((((((((((((" + (i + 1)  + "반" + "))))))))))))))))))))))))))))");
			
			for (int j = 0; j < classArr[i].length; j++) 
			{
				classArr[i][j] = new Home_20170805();
				classArr[i][j].init(i + 1, (j + 1) + "한빛", scoreArr[i][j]);
			}
			
			for (int j = 0; j < index.length; j++) 
			{
				System.out.print(index[j] + "\t");
				line += "========";
			}
			System.out.println();
			
			System.out.println("0. 입력순서-----------------------------------------------------------");
			for (Home_20170805 me : classArr[i]) 
			{
				me.rankCal(classArr[i]);
			}
			
			for (Home_20170805 me : classArr[i]) 
			{
				me.maleSort(classArr[i]);
			}
			
			System.out.println("1.전체등수 -----------------------------------------------------------");
			
			//1.전체등수
			for (int j = 0; j < classArr[i].length; j++) 
			{
				ReturnClass_20170805 rc = new ReturnClass_20170805();
				rc.returnRank(classArr[i], j).print();
			}
			
			System.out.println("3.성별등수-------------------------------------------------------------");
			//3.성별등수
			for (int j = 0; j < classArr[i].length; j++) 
			{
				ReturnClass_20170805 rc2 = new ReturnClass_20170805();
				rc2.returnGenderRank(classArr[i], j).print();
			}
			
			System.out.println("4.성별등수 소팅-------------------------------------------------------------");
			
			for (int j = 0; j < classArr[i].length; j++) 
			{
				ReturnClass_20170805 rc2 = new ReturnClass_20170805();
				rc2.returnGenderSort(classArr[i], j).print();
			}
			
			System.out.println("5.누적집계-------------------------------------------------------------");
			System.out.println("합계" + "\t" + "평균" + "\t" + "최대" + "\t" + "최소");
			ReturnClass_20170805 rta = new ReturnClass_20170805();
			for (int j = 0; j < classArr[i].length; j++) 
			{
				rta.returnTotalAverage(classArr[i], j);				
			}
			
			
			System.out.println(rta.totalClassScore + "\t" + rta.totalClassScore / classArr[i].length+ "\t" + 
								rta.maxScore + "\t" + rta.minScore);
			
			
		}
				
	}

}
