package oops;

class HomeWork_20170803
{
	int studentId = 17;
	int studentClass = 1;
	int [][] scoreArr = {{98, 49, 87}, 
						  {88, 59, 77},
						  {78, 69, 67},
						  {68, 79, 57},
						  {58, 89, 97},
						 };

	int totalScore = 0;
	int average = 0;
	
	String [] studentName = {"�Ѻ�", "�̺�" ,"���", "���", "����"};
	String [] phoneNumber = {"010-1234-5678", "010-1234-5678", "010-1234-5678",
								"010-1234-5678", "010-1234-5678"};
	
	void getTotalScore(int [] arg)
	{
		for (int i = 0; i < arg.length; i++) 
		{
			this.totalScore += arg[i];
		}
		this.average = this.totalScore / arg.length;
	}
	
}

public class HomeWorkMain_20170803 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [] index = {"�й�", "�̸�", "��", "��ȭ��ȣ", "����", "����", "����", "����", "���", "���"};
		int studentTotal = 5;
		int [] totalAverage = new int [studentTotal];
		int [] resultArr = new int [studentTotal];
		int rank;
		HomeWork_20170803 [] classArr = new HomeWork_20170803[studentTotal];
		
		//Ŭ��������

		for (int i = 0; i < index.length; i++) 
		{
			if(i == 4) System.out.print("" + "\t");
			System.out.print(index[i] + "\t");
		}
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
				
		for (int i = 0; i < studentTotal; i++) 
		{
			classArr[i] = new HomeWork_20170803();
			System.out.print("" + classArr[i].studentId + "\t" + classArr[i].studentName[i]
			+ "\t" + classArr[i].studentClass + " ��\t" + classArr[i].phoneNumber[i] + "\t");
			
			for (int j = 0; j < classArr[i].scoreArr[i].length; j++) 
			{
				System.out.print(classArr[i].scoreArr[i][j] + "\t");
			}
			
			classArr[i].getTotalScore(classArr[i].scoreArr[i]);
			System.out.print("" + classArr[i].totalScore + "\t" + classArr[i].average);
			System.out.println();
			
			totalAverage[i] = classArr[i].average;
		}
		
		for (int i = 0; i < studentTotal; i++) 
		{
			rank = 1;
			for (int j = 0; j < studentTotal; j++) 
			{
				if(totalAverage[i] <= totalAverage[j])
				{
					resultArr[i] = rank++;
				}
			}
			
			System.out.println(resultArr[i]);
		}

	}

}
