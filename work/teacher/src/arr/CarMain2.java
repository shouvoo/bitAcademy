package arr;
//�ڵ����� ������ ������ �迭�� ���ϼ���
//�� 100�� ������ 
//�ӵ�->
/*
 * ������ : 50%,   30%   ,20%
Ʈ  �� : 20,    80
��  �� : 30,    40,    30
*/
//������ ����� ����ϼ���

//------------------------------------��¹��
//���̸�, �ӵ�, ����, ������, ����, ���
//--------------------------------------
//������ 
//sm5
//k9
//bmw
public class CarMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] name = {
				{"������","������"},
				{"Ʈ��","sm5"},
				{"����","k9"},
				{"������","bmw"}
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
				case "Ʈ��":
					kind = 1;
					break;
				case "����":
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
					
					if(name[i][0]=="Ʈ��")
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
