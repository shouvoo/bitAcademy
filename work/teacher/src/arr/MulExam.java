package arr;

public class MulExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///1. �Էº�
		int [][] jum = {
				{1,78,76,78},
				{3,58,56,57,58},
				{3,68,66,69},
				{1,98,96,90},
				{2,88,86,84,86},
				{2,78,76,70},
				{1,58,56,51,58},
				{1,68,66,66},
				{2,98,96,93},
				{1,88,86,80,86}
		};
		
		String [][] index = {
				{"�̸�","����","��","����","����","����","lol",
				"����","���","��ü���","�������","�ݺ�","�ݼ���"},
				{"��","��"}
		};
		
		String [] name = {
				"�Ѱ���",
				"�ѳ���",
				"�Ѵ���",
				"�Ѷ���",
				"�Ѹ���",
				"�ΰ���",
				"�γ���",
				"�δ���",
				"�ζ���",
				"�θ���"
		};
		
		int [][] res = new int [name.length][7];
		   ///0:����,  1 : ����,   2: ���, 3:���, 4: �������
		
		/////�����
		int maxSub=0;
		
		for (int i = 0; i < jum.length; i++) {
			if(maxSub<jum[i].length)
				maxSub=jum[i].length;
			
			for (int j = 1; j < jum[i].length; j++) {
				res[i][1]+=jum[i][j];	//����
			}
			res[i][2]=res[i][1]/(jum[i].length-1);//���
		}
		
		
		//// ����
		for (int me = 0; me < res.length; me++) {
			res[me][0]=jum[me].length/maxSub;	///����Ȯ��
		}
		
		
		//// ���
		for (int me = 0; me < res.length; me++) {
	
			
			for (int i = 3; i < res[me].length; i++) {
				res[me][i]=1;	//����ʱ�ȭ
			}
			
			for (int you = 0; you < res.length; you++) {
				if(res[me][2]<res[you][2])//��պ�
				{
					res[me][3]++;	//��ü
					
					if(res[me][0]==res[you][0]) //������ ������
					{
						res[me][4]++;
						if(jum[me][0]==jum[you][0]) //���� ������
							res[me][6]++;
					}
					if(jum[me][0]==jum[you][0]) //���� ������
						res[me][5]++;
					
					
				}
			}
		}
		
		
		
		/////��º�
		
		int kind = 3;
		
		int [][] limit = {{1,1},{1,2},{1,4},{4,2}};
		
		
		for (int kk = 0; kk <=  kind; kk++) {
			
		
			String line="";
			for (int i = 0; i < index[0].length; i++) {
				System.out.print(index[0][i]+"\t");///����
				line+="========";
			}
			
			System.out.println("\n"+line);
			
			
			
			for (int s = 0; s < limit[kk][0]; s++) {
				for (int k = 0; k < limit[kk][1]; k++) {
					
				
					for (int r = 1; r <= name.length; r++) {
			
						for (int i = 0; i < name.length; i++) {///���������
							boolean [] chk = {
									r==res[i][3],
									r==res[i][3] && k == res[i][0],
									r==res[i][3] && k == jum[i][0],
									r==res[i][3] && s == jum[i][0] && k== res[i][0],
									};
							
							//if(r==res[i][3]) {   //��ü
							//if(r==res[i][3] && k == res[i][0]) {//����
							//if(r==res[i][3] && k == jum[i][0]) { //��
							//if(r==res[i][3] && s == jum[i][0] && k== res[i][0]) { //��
							if(chk[kk]) {
								System.out.print(name[i]+"\t");//�̸�
								System.out.print(index[1][res[i][0]] +"\t");//����
								for (int j = 0; j < jum[i].length; j++) {
									System.out.print(jum[i][j]+"\t");//�����
								}
								
								if(res[i][0]==0)//�����϶� ��ĭ �߰�(lol)
									System.out.print("\t");
								
								
								for (int j = 1; j < res[i].length; j++) {
									System.out.print(res[i][j]+"\t");///���
								}
								System.out.println();
							}
						}
					}
				}
			}
			System.out.println("----------------------------------------------------------------------------------------");
		}
		
		////1. ������ ���
		////2. �ݺ� ���
		/// 3. ��-> ���� ���
		/// 4. ��� ������� ���
		/// 5. ��¹���� �ܺο��� �����Ͽ� ���������� ���
		
		
	}

}
