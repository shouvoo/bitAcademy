package basic;

public class StudMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//����, ����, ���� ������ �̿��Ͽ� ����, ����� ����Ͻÿ�
		
		int k; // ��������
		int e; // ��������
		int c; // ��������
		
		/*k = 88;
		e = 87;
		c = 87;
		
		int result = k + e + c;
		double average = (int)(((double)result / 3) * 100);
		average = average / 100;
		������ �ڵ� : avg = (double)(int)(result * 100 + 0.5) / 100;
		*/
		
		k = 91;
		e = 95;
		c = 98;
		
		int result = k + e + c;
		double average = (int)(((double)result / 3) * 100) + 1;
		average = average / 100;		
		
		System.out.println("����  :  " + result + "��");
		System.out.println("���  :  " + average + "��");
		System.out.println(average > 90 ? "��" : average > 80 ? "��" : 
			               average > 70 ? "��" : average > 60 ? "��" : "��");
		
		int editAverage = ((int)average / 10) * 10;
		char changeChar = (char)('A' + 10 - (int)average / 10);
		System.out.println("editAverage  :  " + editAverage);
		System.out.println(changeChar);
		
		String charValue = "";
		if(average > 90)
		{
			charValue = "��";
			if(k > 90 && e > 90 && c > 90)
			{
				System.out.println("����");
			}
		} else if(average > 80) 
		{
			charValue = "��";
		} else if(average > 70)
		{
			charValue = "��";
		} else if(average > 60)
		{
			charValue = "��";
		} else
		{
			charValue = "��";
		}
		
		System.out.println(charValue);
		
		
		
		k = 100;
		e = 50;
		c = 49;
		
		double col1Kor = 50, col1Eng = 30, col1Math = 20;
		double col2Kor = 40, col2Eng = 30, col2Math = 30;
		double col3Kor = 30, col3Eng = 20, col3Math = 50;
		
		int colKor = (int)(k * (col2Kor / 100));
		int colEng = (int)(e * (col2Eng / 70));
		int colMath = (int)(c * (col2Math / 70));
		int colResult = colKor + colEng + colMath;
		

		colKor = (int)(k * (col1Kor / 100));
		colEng = (int)(e * (col1Eng / 70));
		colMath = (int)(c * (col1Math / 70));
		colResult = colKor + colEng + colMath;
		
		System.out.println(colKor + " + " + colEng + " + " + colMath + " = "
		                   + (colKor + colEng + colMath));
		
		if(colKor > col1Kor && colEng > col1Kor && colMath > col1Kor && colResult > 80)
		{
			System.out.println("A���� - �հ�");
		} else 
		{
			System.out.println("A���� - ���հ�");
		}
		
		
		System.out.println(colKor + " + " + colEng + " + " + colMath + " = "
		                   + (colKor + colEng + colMath));
		
		if(colKor > col2Kor && colEng > col2Kor && colMath > col3Kor && colResult > 80)
		{
			System.out.println("B���� - �հ�");
		} else 
		{
			System.out.println("B���� - ���հ�");
		}
		
		
		colKor = (int)(k * (col3Kor / 100));
		colEng = (int)(e * (col3Eng / 70));
		colMath = (int)(c * (col3Math / 70));
		colResult = colKor + colEng + colMath;
		
		System.out.println(colKor + " + " + colEng + " + " + colMath + " = "
		                   + (colKor + colEng + colMath));
		
		if(colKor > col3Kor && colEng > col3Kor && colMath > col3Kor && colResult > 80)
		{
			System.out.println("C���� - �հ�");
		} else 
		{
			System.out.println("C���� - ���հ�");
		}
		
	}

}




































































