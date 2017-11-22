package arr;

public class Car 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*자동차의 성능을 다차원 배열로 비교하세요
		 * 각 100점 만점에 
		 * 속도 -50%, 연비->30%, 안정성->20% 로 계산
		 * 성능의 등수를 출력하세요
		 * -------------------출력방식
		 * 차종, 속도, 연비, 안정성, 점수, 등수
		 * ---------------------------
		 * 렉스턴
		 * sm5
		 * k9
		 * bmw 
		 * */
		
		/*String [] carArr = {"렉스턴", "sm5", "k9", "bmw"};
		
		int [][] scoreArr = {{90, 60, 60}, 
						  		{60, 75, 80}, 
						  		{90, 64, 90},
						  		{80, 88, 85}};
		double [] average = {50, 30, 20};
		
		double [][] result = new double[carArr.length][2];
		//1. 점수, 2. 등수
		
		String [] index = {"차종", "속도", "연비", "안정성", "점수", "등수"};
		
		
		System.out.println();
		
		for (int i = 0; i < scoreArr.length; i++) 
		{
			for (int j = 0; j < scoreArr[i].length; j++) 
			{
				result[i][0] += scoreArr[i][j] * (average[j] / 100);
			}
			
		}
		
		for (int i = 0; i < result.length; i++) 
		{
			result[i][1] += 1;
			for (int j = 0; j < result.length; j++) 
			{
				if(result[i][0] < result[j][0])
				{
					result[i][1]++;
				}
			}
			
		}

		
		for (int i = 0; i < index.length; i++) 
		{
			System.out.print(index[i] + "\t");
		}
		
		System.out.println();
		
		for (int i = 0; i < scoreArr.length; i++) 
		{
			System.out.print(carArr[i] + "\t");
			for (int j = 0; j < scoreArr[i].length; j++) 
			{
				System.out.print(scoreArr[i][j] + "\t");				
			}
			
			System.out.print(result[i][0] + "\t");
			System.out.print((int)result[i][1] + "\t");
			
			System.out.println();
		}*/
		
		/*선생님방식*/
		/*String [] name = {"렉스턴", "sm5", "k9", "bmw"};
		int [][] jum = {{90, 60, 60}, 
					  		{60, 75, 80}, 
					  		{90, 64, 90},
					  		{80, 88, 85}};
		double [] rate = {0.5, 0.3, 0.2};
		double [][] res = new double[name.length][2];
		
		for (int i = 0; i < jum.length; i++) 
		{
			for (int j = 0; j < jum[i].length; j++) 
			{
				res[i][0] += rate[j] * jum[i][j];
			}
		}
		
		for (int i = 0; i < res.length; i++) 
		{
			res[i][1] = 1;
			for (int j = 0; j < res.length; j++) 
			{
				if(res[i][0] < res[j][0]) res[i][1]++;
			}
		}
		
		for (int i = 0; i < res.length; i++) 
		{
			System.out.print(name[i] + "\t");
			for (int j = 0; j < jum[i].length; j++) 
			{
				System.out.print(jum[i][j] + "\t");
			}
			
			System.out.println();
		}*/
		
		
		
		/*자동차의 성능을 다차원 배열로 비교하세요
		 * 속도 연비 안정성
		 스포츠 :50 30 20 
		 트럭   : 30 80
		 버스     :30 40 30 
		 * */
		
		String [] carArr = {"스포츠", "트럭", "버스"};
		
		int [][] scoreArr = {{90, 60, 60}, 
					  		{60, 75, 80}, 
					  		{90, 64, 90}};
		
		double [][] average = {{50, 30, 20}, 
								{20, 80, 20}, 
								{30, 40, 30}};
		
		double [][] result = new double[carArr.length][2];
		//1. 점수, 2. 등수
		
		String [] index = {"차종", "속도", "연비", "안정성", "점수", "등수"};
		
		
		System.out.println();
		
		for (int i = 0; i < scoreArr.length; i++) 
		{
			for (int j = 0; j < scoreArr[i].length; j++) 
			{
				result[i][0] += scoreArr[i][j] * (average[i][j] / 100);
			}
			
		}
		
		for (int i = 0; i < result.length; i++) 
		{
			result[i][1] += 1;
			for (int j = 0; j < result.length; j++) 
			{
				if(result[i][0] < result[j][0])
				{
					result[i][1]++;
				}
			}
			
		}

		
		for (int i = 0; i < index.length; i++) 
		{
			System.out.print(index[i] + "\t");
		}
		
		System.out.println();
		
		for (int i = 0; i < scoreArr.length; i++) 
		{
			System.out.print(carArr[i] + "\t");
			for (int j = 0; j < scoreArr[i].length; j++) 
			{
				System.out.print(scoreArr[i][j] + "\t");				
			}
			
			System.out.print(result[i][0] + "\t");
			System.out.print((int)result[i][1] + "\t");
			
			System.out.println();
		}

	}

}





