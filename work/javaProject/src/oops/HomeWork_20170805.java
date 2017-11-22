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
		this.gender = (scoreArr.length == 4) ? "��" : "��";
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
		
		print(); //0. �Է¼���
	}
	
	void maleSort(Home_20170805 [] arr)
	{
		this.totalFemale = 0;
		for (Home_20170805 me : arr) 
		{
			if(me.gender == "��") this.totalFemale++;
		}
	}
	
	void print()
	{
		String space = (this.gender == "��") ? "\t" : "";
		String printResult = (this.classId + "��") + "\t"; 
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
			int rank = (you.gender == "��") ? you.genderRank + inArr.totalFemale : you.genderRank;
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
		/*�л�Ŭ������ ���� , ����, ����, ȣ�� �Ͽ� �л������� ����ϼ���
		=== ��, �̸�, ����, ����[����, ����, ����, ����], ����, ���, ���

		��¹��

		0. �Է¼��� 1.��ü��� 2.�ݺ���� 3.������� 4.��, ����, ���

		Ŭ�����迭�� �޾� ó���ϴ� ����Ŭ������ �޼ҵ�� ó���Ұ�

		�� ī�װ����� �������� ����ϼ���
		�������� ���� : �հ�, ���, �ִ�, �ּ�
		�������� ��� : ����, ����, ����, ����, ����, ���
*/
		String [] index = {"��", "�̸�", "����", "����", "����", 
	              "����", "����", "����", "���", "���", "�������"};
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
			System.out.println("(((((((((((((((((((((((((((((" + (i + 1)  + "��" + "))))))))))))))))))))))))))))");
			
			for (int j = 0; j < classArr[i].length; j++) 
			{
				classArr[i][j] = new Home_20170805();
				classArr[i][j].init(i + 1, (j + 1) + "�Ѻ�", scoreArr[i][j]);
			}
			
			for (int j = 0; j < index.length; j++) 
			{
				System.out.print(index[j] + "\t");
				line += "========";
			}
			System.out.println();
			
			System.out.println("0. �Է¼���-----------------------------------------------------------");
			for (Home_20170805 me : classArr[i]) 
			{
				me.rankCal(classArr[i]);
			}
			
			for (Home_20170805 me : classArr[i]) 
			{
				me.maleSort(classArr[i]);
			}
			
			System.out.println("1.��ü��� -----------------------------------------------------------");
			
			//1.��ü���
			for (int j = 0; j < classArr[i].length; j++) 
			{
				ReturnClass_20170805 rc = new ReturnClass_20170805();
				rc.returnRank(classArr[i], j).print();
			}
			
			System.out.println("3.�������-------------------------------------------------------------");
			//3.�������
			for (int j = 0; j < classArr[i].length; j++) 
			{
				ReturnClass_20170805 rc2 = new ReturnClass_20170805();
				rc2.returnGenderRank(classArr[i], j).print();
			}
			
			System.out.println("4.������� ����-------------------------------------------------------------");
			
			for (int j = 0; j < classArr[i].length; j++) 
			{
				ReturnClass_20170805 rc2 = new ReturnClass_20170805();
				rc2.returnGenderSort(classArr[i], j).print();
			}
			
			System.out.println("5.��������-------------------------------------------------------------");
			System.out.println("�հ�" + "\t" + "���" + "\t" + "�ִ�" + "\t" + "�ּ�");
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
