package oops;
/*�л�Ŭ������ ����, ����, ����, ȣ�� �Ͽ� �л������� ����ϼ���
--- �й�, �̸�, ��, ��ȭ��ȣ, ����[����, ����, ����], ����, ���*/

class SingleStudent
{
	int studentId = 17;
	int studentClass = 1;
	int [] scoreArr = {98, 89, 87};
	int totalScore = 0;
	int average = 0;
	
	String studentName = "�Ѻ�";
	String phoneNumber = "010-1234-5678";
}

public class HomeWork_20170802 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String [] index = {"�й�", "�̸�", "��", "��ȭ��ȣ", "����", "����", "����", "����", "���"};
		SingleStudent ss = new SingleStudent();
		
		//�����
		for (int i = 0; i < ss.scoreArr.length; i++) 
		{
			ss.totalScore += ss.scoreArr[i];
		};
		
		ss.average = ss.totalScore / ss.scoreArr.length;
		
		
		
		
		//��º�
		
		for (int i = 0; i < index.length; i++) 
		{
			if(i == 4) System.out.print("" + "\t");
			System.out.print(index[i] + "\t");
		}
		
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.print(ss.studentId + "\t");
		System.out.print(ss.studentName + "\t");
		System.out.print((ss.studentClass + "��") + "\t");
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
