package arr;
//자동차의 성능을 다차원 배열로 비교하세요
//각 100점 만점에 
//속도->
/*
 * 스포츠 : 50%,   30%   ,20%
트  럭 : 20,    80
버  스 : 30,    40,    30
*/
//성능의 등수를 출력하세요

//------------------------------------출력방식
//차이름, 속도, 연비, 안정성, 점수, 등수
//--------------------------------------
//렉스턴 
//sm5
//k9
//bmw
public class CarMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] name = {
				{"스포츠","렉스턴"},
				{"트럭","sm5"},
				{"버스","k9"},
				{"스포츠","bmw"}
		};
		
		int [][] jum = {
				{56,67,78},
				{89,90},
				{13,35,57},
				{79,90,98}};
		double [][] rate = {
				{0.5,0.3,0.2},
				{0.2,0.8},
				{0.3,0.4,0.3}
				};
		double [][] res = new double[name.length][2];
		
		for (int i = 0; i < jum.length; i++) {
			int kind=0;
			switch(name[i][0]) {
				case "트럭":
					kind = 1;
					break;
				case "버스":
					kind = 2;
					break;
			}
			
			for (int j = 0; j < jum[i].length; j++) {
				res[i][0]+= rate[kind][j]*jum[i][j];
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			res[i][1]=1;
			for (int j = 0; j < res.length; j++) {
				if(res[i][0]<res[j][0])
					res[i][1]++;
			}
		}
		
		for (int r = 1; r <=name.length; r++) {
			
			for (int i = 0; i < res.length; i++) {
				if(r==res[i][1])
				{
					for (String nn : name[i]) {
						System.out.print(nn+'\t');
					}
					
					
					for (int j = 0; j < jum[i].length; j++) {
						System.out.print(jum[i][j]+"\t");
					}
					
					if(name[i][0]=="트럭")
						System.out.print("\t");
					
					for (int j = 0; j < res[i].length; j++) {
						System.out.print(res[i][j]+"\t");
					}
					
					System.out.println();
				}
			}
		}
	}

}
