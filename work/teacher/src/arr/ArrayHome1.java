package arr;

public class ArrayHome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/////1. 입력부
		int[] kor = { 89, 97, 97, 77, 40 }; 						// 국어점수 입력
		int[] eng = { 87, 57, 99, 87, 57 }; 						// 영어점수 입력
		int[] mat = { 86, 66, 97, 77, 57 }; 						// 수학점수 입력
		String[] name = { "장동건", "장남건", "장서건", "장중건", "북두신건" }; // 학생이름

		int[] sum = new int[name.length]; 									// sum배열 크기 할당
		double[] avg = new double[name.length];	// avg배열 크기 할당
		int [] rank = new int[name.length];
		
		String[] grade = { "가", "가", "가", "가", "가", 				// 등급입력
							"가", "양", "미", "우", "수" }; 
		String[] total = new String[name.length]; 							// total배열 크기 할당

		
		/////2. 연산부
		///2.1 점수개산
		for (int i = 0; i < name.length; i++) { 					// 학생 수 만큼 내용 불러오기

			sum[i] += kor[i] + eng[i] + mat[i]; 					// sum배열에 각 학생의 국어, 영어, 수학의 합 넣기
			avg[i] = (double) sum[i] / 3; 							// avg배열에 각 학생의 평균 넣기
			avg[i] = (double) (int) (avg[i] * 100 + 0.5) / 100; 	// 평균을 소수 두자리수까지 반올림 표현						// total출력
		}
		///2.2 등수개산
		for(int me =0; me<avg.length;me++)
		{
			rank[me]++;
			for(int you =0; you<avg.length;you++)
			{
				if (avg[me]<avg[you])
					rank[me]++;
			}
		}
		
		
		///3. 출력부
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급\t등수");
		System.out.println("-----------------------------------------------------------");

		for (int i = 0; i < name.length; i++) { 					// 학생 수 만큼 내용 불러오기

			total[i] = name[i] + "\t" + 
						kor[i] + "\t" + 
						eng[i] + "\t" + 
						mat[i] + "\t" + 
						sum[i] + "\t" + 
						avg[i] + "\t" + 
						grade[(int) (avg[i] / 10)] + "\t" + 
						rank[i];	// total에 모든내용 넣기
			
			System.out.println(total[i]); 								// total출력
		}

	}

}
