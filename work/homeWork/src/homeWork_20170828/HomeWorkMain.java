package homeWork_20170828;

public class HomeWorkMain 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*�ֹι�ȣ�� �̿��Ͽ�
		����, ����, ��������� ����ϼ���*/
		String [][] dataArr = 	{{"�Ѻ���", "800505-1234567"},
								{"�Ѻ���", "950725-2234567"},
								{"�κ���", "020123-3234567"},
								{"�κ���", "050421-4234567"},
								{"�귡��", "880623-5234567"},
								{"��������", "990811-6234567"},
								{"��Ʈ", "011223-7234567"},
								{"����", "071010-8234567"},
								{"�����", "960222-9234567"},
								{"�����", "540319-0234567"}};
		
		String [] gender = {"��", "��"};
		String [] country = {"������", "�ܱ���"};
		
		String printStr = "";
		String persnolId = "";
		String birth = "";
		String name = "";
		String year = "";
		int countryId = 0;
		for (int i = 0; i < dataArr.length; i++) 
		{
			persnolId = dataArr[i][1].substring(dataArr[i][1].indexOf("-") + 1, 
					                            dataArr[i][1].indexOf("-") + 2);
			if(i <= 7) year = ((i % 4) / 2) + 19 + "";
			else year = "18";
			
			birth = year + dataArr[i][1].substring(0, 2) + "�� " + 
			        dataArr[i][1].substring(2, 4) + "�� " + 
			        dataArr[i][1].substring(4, 6) + "�� ";
			

			name = dataArr[i][0];
				
			countryId = ((i / 4) > 1) ? (i / 4) - 2 : (i / 4);
				
				
			printStr = country[countryId] + "\t" + gender[i  % 2] + "\t" + name + "\t" + birth;
			System.out.println(printStr);
		}
		
	}

}
