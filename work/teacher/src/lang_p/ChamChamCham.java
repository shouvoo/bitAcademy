package lang_p;

import java.io.IOException;

public class ChamChamCham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] index = {"����","������","����"};
		
		System.out.println("�߾��� ���� ������");
		while(true) {
			try {
				for (int i = 0; i < index.length; i++) {
					System.out.print(i+"."+index[i]);
				}
				System.out.print("\n�Է�:");
			
			
				int user = System.in.read()-'0';
				System.in.read();
				System.in.read();
				if(user==index.length-1)
					break;
				
				int com = (int)(Math.random()*(index.length-1));
				
				String res = "��";
				
				if (user==com)
					res ="��";
				
				System.out.println("���̸�:"+index[user]);
				System.out.println("��ǻ��:"+index[com]);
				System.out.println("���:"+res);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("���� ����");
	}

}