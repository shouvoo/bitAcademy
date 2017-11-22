package arr;

public class MulExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///1. 입력부
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
				{"이름","성별","반","국어","수학","국사","lol",
				"총점","평균","전체등수","성별등수","반별","반성별"},
				{"여","남"}
		};
		
		String [] name = {
				"한가인",
				"한나인",
				"한다인",
				"한라인",
				"한마인",
				"두가인",
				"두나인",
				"두다인",
				"두라인",
				"두마인"
		};
		
		int [][] res = new int [name.length][7];
		   ///0:성별,  1 : 총점,   2: 평균, 3:등수, 4: 성별등수
		
		/////연산부
		int maxSub=0;
		
		for (int i = 0; i < jum.length; i++) {
			if(maxSub<jum[i].length)
				maxSub=jum[i].length;
			
			for (int j = 1; j < jum[i].length; j++) {
				res[i][1]+=jum[i][j];	//총점
			}
			res[i][2]=res[i][1]/(jum[i].length-1);//평균
		}
		
		
		//// 성별
		for (int me = 0; me < res.length; me++) {
			res[me][0]=jum[me].length/maxSub;	///성별확인
		}
		
		
		//// 등수
		for (int me = 0; me < res.length; me++) {
	
			
			for (int i = 3; i < res[me].length; i++) {
				res[me][i]=1;	//등수초기화
			}
			
			for (int you = 0; you < res.length; you++) {
				if(res[me][2]<res[you][2])//평균비교
				{
					res[me][3]++;	//전체
					
					if(res[me][0]==res[you][0]) //성별이 같은지
					{
						res[me][4]++;
						if(jum[me][0]==jum[you][0]) //반이 같은지
							res[me][6]++;
					}
					if(jum[me][0]==jum[you][0]) //반이 같은지
						res[me][5]++;
					
					
				}
			}
		}
		
		
		
		/////출력부
		
		int kind = 3;
		
		int [][] limit = {{1,1},{1,2},{1,4},{4,2}};
		
		
		for (int kk = 0; kk <=  kind; kk++) {
			
		
			String line="";
			for (int i = 0; i < index[0].length; i++) {
				System.out.print(index[0][i]+"\t");///제목
				line+="========";
			}
			
			System.out.println("\n"+line);
			
			
			
			for (int s = 0; s < limit[kk][0]; s++) {
				for (int k = 0; k < limit[kk][1]; k++) {
					
				
					for (int r = 1; r <= name.length; r++) {
			
						for (int i = 0; i < name.length; i++) {///사람돌리기
							boolean [] chk = {
									r==res[i][3],
									r==res[i][3] && k == res[i][0],
									r==res[i][3] && k == jum[i][0],
									r==res[i][3] && s == jum[i][0] && k== res[i][0],
									};
							
							//if(r==res[i][3]) {   //전체
							//if(r==res[i][3] && k == res[i][0]) {//성별
							//if(r==res[i][3] && k == jum[i][0]) { //반
							//if(r==res[i][3] && s == jum[i][0] && k== res[i][0]) { //반
							if(chk[kk]) {
								System.out.print(name[i]+"\t");//이름
								System.out.print(index[1][res[i][0]] +"\t");//성별
								for (int j = 0; j < jum[i].length; j++) {
									System.out.print(jum[i][j]+"\t");//과목들
								}
								
								if(res[i][0]==0)//여자일때 빈칸 추가(lol)
									System.out.print("\t");
								
								
								for (int j = 1; j < res[i].length; j++) {
									System.out.print(res[i][j]+"\t");///결과
								}
								System.out.println();
							}
						}
					}
				}
			}
			System.out.println("----------------------------------------------------------------------------------------");
		}
		
		////1. 성별별 등수
		////2. 반별 등수
		/// 3. 반-> 성별 등수
		/// 4. 등수 순서대로 출력
		/// 5. 출력방식을 외부에서 지정하여 선택적으로 출력
		
		
	}

}
