package arr;

import java.io.IOException;

public class HomeWork_20170731 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub		
		String typeStr = "";
		int caseNum;
		String [] nameArr = {"�л�1", "�л�2", "�л�3", "�л�4", "�л�5"};
		String [] genderArr = {"��", "��", "��", "��", "��"};
		int [][] resArr = new int [nameArr.length][3]; //0. ����, 1. ���, 2. ���
		int [][] scoreArr = new int[][]{{88, 66, 78},
										{95, 96, 99},
										{64, 84, 54},
										{87, 78, 60},
										{85, 82, 61}};
										
		String [] indexArr = {"�̸�", "����", "����", "����", 
              				  	 "����", "����", "���", "���"};
		
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		
		//�����
		String [][] editArr = new String[nameArr.length][indexArr.length];
		
		for (int i = 0; i < scoreArr.length; i++) 
		{	
			
			for (int j = 0; j < scoreArr[i].length; j++) 
			{
				resArr[i][0] += scoreArr[i][j];
			}
			resArr[i][1] = resArr[i][0] / scoreArr[i].length;
		}
		
		for (int i = 0; i < resArr.length; i++) 
		{
			resArr[i][2] = 1;			
			
			for (int j = 0; j < resArr.length; j++) 
			{
				if(resArr[i][1] < resArr[j][1])
				{
					resArr[i][2]++;	
				}
			}
		}
		
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		homeWork:while(true) // ����� ���� while
		{
			
			System.out.println("1. ������ ���, 2.�ݺ� ���, 3.�ݺ� ���� ���, 4.�ѹ��� ���");
			caseNum = 0;			
			
			inputClass:while(true)
			{
				int input = System.in.read();
				
				if(input == 13) 
				{
					System.in.read();
					break inputClass;
				}
				caseNum *= 10;
				caseNum += input - '0';				
			}

			
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
			gradeClass:while(true)
			{
				switch(caseNum)
				{
					case 1 :
						int woGrade = 0;
						for(int c = 0; c < 5; c++)
						{
							for (int i = 0; i < 5; i++) 
							{
								if(genderArr[i] == "��")
								{
									if(resArr[i][2] == c + 1)
									{
										System.out.print(nameArr[i] + "\t");
										System.out.print(genderArr[i] + "\t");
										
										for (int j = 0; j < scoreArr[i].length; j++) 
										{
											System.out.print(scoreArr[i][j] + "\t");
										}
										
										for (int j = 0; j < resArr[i].length - 1; j++) 
										{
											System.out.print(resArr[i][j] + "\t");
										}
										
										System.out.print(++woGrade + "\t");
										System.out.println();
						
									}
								} 
							}
						}	
						
						int manGrade = 0;
						for(int c = 0; c < 5; c++)
						{
							for (int i = 0; i < 5; i++) 
							{
								if(genderArr[i] == "��")
								{
									if(resArr[i][2] == c + 1)
									{
										System.out.print(nameArr[i] + "\t");
										System.out.print(genderArr[i] + "\t");
										
										for (int j = 0; j < scoreArr[i].length; j++) 
										{
											System.out.print(scoreArr[i][j] + "\t");
										}
										
										for (int j = 0; j < resArr[i].length - 1; j++) 
										{
											System.out.print(resArr[i][j] + "\t");
										}
										
										System.out.print(++manGrade + "\t");
										System.out.println();
						
									}
								} 
							}
						}		
						break gradeClass;
					case 2 :
						typeStr = "���� �߰��ؼ� ���";
						//System.out.println(typeStr);
						break gradeClass;
					case 3 :
						typeStr = "�� -> ���� ���";
						//System.out.println(typeStr);
						break gradeClass;
					case 4 :
						typeStr = "��� ������� ���";
						//System.out.println(typeStr);
						break gradeClass;
					default : 
						break;
				}
				
			}	
			
			
			
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++		
			System.out.println("r. �ٽ��ϱ�, c.����");
			
			
			endClass:while(true)
			{
				int input = System.in.read();				
				switch(input)
				{
					case 10 :
						continue homeWork;
					case 99 :
						break homeWork;
					default : 
						break;
				}
			}
			
		}
		
		System.out.println("�����ϱ�");

	}

}
