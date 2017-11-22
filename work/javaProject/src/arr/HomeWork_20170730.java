package arr;

public class HomeWork_20170730 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int total = 5;

		int [] kor = {90, 87, 84, 87, 99};
		int [] eng = {60, 95, 65, 96, 85};
		int [] math = {77, 80, 75, 83, 86};
		String [] name = {"학생1", "학생2", "학생3", "학생4", "학생5"};


		int [] totalScore = new int[5];
		int [] avg = new int[5];
		String [] rating = {"1등급", "2등급", "3등급", "4등급", "5등급"};
		String ratingOut = "";
		
		System.out.println("번호  이름      국어   영어   수학    총점    평균    등급");
		
		for(int i = 0; i < total; i++)
		{
			totalScore[i] = kor[i] + eng[i] + math[i];
			avg[i] = totalScore[i] / 3;
			
			switch(avg[i] / 10)
			{
				case 10: 
				case 9: 
					rating[i] = "1등급";
					break;
				case 8: 
					rating[i] = "2등급";
					break;
				case 7: 
					rating[i] = "3등급";
					break;
				case 6: 
					rating[i] = "4등급";
					break;
				case 5: 
					rating[i] = "5등급";
					break;
				default : 
					break;
			}
			
			System.out.print("" + i + ".  " + name[i]  + "  " + kor[i] + "점  " + eng[i] + "점  " + math[i]
					 + "점  " + totalScore[i] + "점  " + avg[i] + "점  " + rating[i]);
			
			System.out.println();
		}

	}

}
