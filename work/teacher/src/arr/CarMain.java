package arr;
//�ڵ����� ������ ������ �迭�� ���ϼ���
//�� 100�� ������ 
//�ӵ�->50%, ����->30%, ������->20% �� ���
//������ ����� ����ϼ���
//------------------------------------��¹��
//���̸�, �ӵ�, ����, ������, ����, ���
//--------------------------------------
//������ 
//sm5
//k9
//bmw
public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name = {"������","sm5","k9","bmw"};
		
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
