package arr;

public class ReHomeWork_20170703
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int total = 5;

		int [] kor = {90, 87, 84, 87, 99};
		int [] eng = {60, 95, 65, 96, 85};
		int [] math = {77, 80, 75, 83, 86};
		String [] name = {"�л�1", "�л�2", "�л�3", "�л�4", "�л�5"};


		int [] totalScore = new int[5];
		int [] avg = new int[5];
		String [] rating = {"1���", "2���", "3���", "4���", "5���"};
		String ratingOut = "";	
		
		int [] rank = new int[5];
		
		for(int i = 0; i < total; i++)
		{
			totalScore[i] = kor[i] + eng[i] + math[i];
			avg[i] = totalScore[i] / 3;
			
		}
		
		for(int me = 0; me < avg.length; me++)
		{
			rank[me]++;
			for(int you = 0; you < avg.length; you++)
			{
				if(avg[me] < avg[you])
				{
					rank[me]++;
				}
			}
		}
		
		
		for(int i = 0; i < total; i++)
		{
			totalScore[i] = kor[i] + eng[i] + math[i];
			avg[i] = totalScore[i] / 3;
			
			switch(avg[i] / 10)
			{
				case 10: 
				case 9: 
					rating[i] = "1���";
					break;
				case 8: 
					rating[i] = "2���";
					break;
				case 7: 
					rating[i] = "3���";
					break;
				case 6: 
					rating[i] = "4���";
					break;
				case 5: 
					rating[i] = "5���";
					break;
				default : 
					break;
			}
			
			System.out.println("��ȣ  �̸�      ����   ����   ����    ����    ���    ���");
			System.out.print("" + i + ".  " + name[i]  + "  " + kor[i] + "��  " + eng[i] + "��  " + math[i]
					 + "��  " + totalScore[i] + "��  " + avg[i] + "��  " + rating[i] + "" + rank[i]);
			System.out.println();
		}
			
			
			
			
			
			

	}

}