package basic;

public class SwitchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		switch(15)
		{
			case 10:
				System.out.println("�� 10�̿�");
				break;
			case 7:
				System.out.println("�� 7�̿�");
				break;
			default:
				System.out.println("�� �⺻�̿�");
				break;
			case 15:
				System.out.println("�� 15�̿�");
				break;
			
		}
		
		
		//�μ��� mt ��Ҹ� �����ϼ���
		  // �λ�� - �ٴ�, ������ - ��, �κ� - �ȹ�, �κ� - ���
		
		String team = "������";
		
		String mt = "�ܾ�";
		
		switch(team) {
			case "�λ��":
				mt="�ٴ�";
				break;
			case "������":
				mt="��";
				break;
			case "�κ�":
				mt="�ȹ�";
				break;
			case "�κ�":
				mt="���";
				break;
		}
		
		System.out.println(team+":"+mt);
		
		int basic = 300;
		String pos = "����";
		
		double rate=0;
		
		switch(pos)
		{
			case "����":
				rate=0.5;
				break;
			case "����":
				rate=0.3;
				break;
			case "�븮":
				rate=0.2;
				break;
			case "���":
				rate=0.1;
				break;
		}
		
		System.out.println(basic*(rate+1));
		
	}

}

