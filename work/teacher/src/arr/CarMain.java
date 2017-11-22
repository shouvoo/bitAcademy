package arr;
//자동차의 성능을 다차원 배열로 비교하세요
//각 100점 만점에 
//속도->50%, 연비->30%, 안정성->20% 로 계산
//성능의 등수를 출력하세요
//------------------------------------출력방식
//차이름, 속도, 연비, 안정성, 점수, 등수
//--------------------------------------
//렉스턴 
//sm5
//k9
//bmw
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name = {"렉스턴","sm5","k9","bmw"};
		
		int [][] jum = {
				{56,67,78},
				{89,90,12},
				{13,35,57},
				{79,90,98}};
		double [] rate = {0.5,0.3,0.2};
		double [][] res = new double[name.length][2];
		
		for (int i = 0; i < jum.length; i++) {
			for (int j = 0; j < jum[i].length; j++) {
				res[i][0]+= rate[j]*jum[i][j];
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			res[i][1]=1;
			for (int j = 0; j < res.length; j++) {
				if(res[i][0]<res[j][0])
					res[i][1]++;
			}
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(name[i]+'\t');
			
			for (int j = 0; j < jum[i].length; j++) {
				System.out.print(jum[i][j]+"\t");
			}
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j]+"\t");
			}
			
			System.out.println();
		}
		
	}

}
