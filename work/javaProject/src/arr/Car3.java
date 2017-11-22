package arr;

public class Car3 
{
	public static void main(String[] args) 
	{
		String [][] name = {{"스포츠", "렉스턴"}, 
							{"트럭", "sm5"}, 
							{"버스", "k9"}, 
							{"스포츠", "bmw"}};
		
		int [][] jum = {{90, 60, 60}, 
				  		{60, 75}, 
				  		{90, 64, 90},
				  		{80, 88, 85}};
		double [][] rate = {{0.5, 0.3, 0.2}, 
						  {0.2, 0.8}, 
						  {0.3, 0.4, 0.3}};
		double [][] res = new double[name.length][2];
		
		for (int i = 0; i < jum.length; i++) 
		{
			int kind = 0;
			switch(name[i][0])
			{
				case "트럭" :
					kind = 1;
					break;
				case "버스" :
					kind = 2;
					break;
			}
			
			for (int j = 0; j < jum[i].length; j++) 
			{
				res[i][0] += rate[kind][j] * jum[i][j];
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
		
		for (int r = 1; r <= res.length; r++)
		{
			for (int i = 0; i < res.length; i++) 
			{
				if(res[i][1] == r)
				{
					for (String nn : name[i]) 
					{
						System.out.print(nn + "\t");
					}
					
					
					for (int j = 0; j < jum[i].length; j++) 
					{
						System.out.print(jum[i][j] + "\t");
					}
					
					if(name[i][0] == "트럭") System.out.print("\t");
					
					for (int j = 0; j < res[i].length; j++) 
					{
						System.out.print((int)res[i][j] + "\t");
					}
					
					System.out.println();
				}
			}
		}
	}
}
