package util_p;

import java.util.Calendar;

public class DiaryMain 
{
	/*����
	 * 1�� 2�� 3��
	 * 4�� 5�� 6��
	 * 7�� 8�� 9��
	 * 
	 * �Ϸ���
	 * 
	 * ���� �Ͽ�  [] ���ֱ�
	 * 
	 * �Ϸ��� 
	 * 
	 * �޷� ��¥ �ؿ� ������ ǥ��
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		now.set(Calendar.DATE, 1);
		
		for (int j = 1; j < now.get(Calendar.DAY_OF_WEEK); j++) 
		{
			System.out.print("   ");
		}
		
		for (int i = 1; i <= now.getActualMaximum(Calendar.DATE); i++) 
		{
			String pre = "";
			if(i < 10) pre = " ";
			System.out.print(pre + i + " ");
			now.set(Calendar.DATE, i);
			if(now.get(Calendar.DAY_OF_WEEK) == 7)
			{
				System.out.println();
			}
		}

	}

}
