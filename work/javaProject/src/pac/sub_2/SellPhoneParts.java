package pac.sub_2;

public class SellPhoneParts 
{
	public String country = "�븸";
	
	public SellPhoneParts() 
	{
		// TODO Auto-generated constructor stub
		//print();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*�ܱ�(�븸��) �ڵ��� ��ǰ
		-ī�޶�, ����ũ, ���͸�
		����(�Ｚ)�ڵ��� ����
			����� ȸ�� - �Ｚ
			�ڵ��� - ������
		�������, ��ȭ�ϱ�, ������*/

	}
	
	public String  cameraParts()
	{
		return "ī�޶�";
	}
	
	public String  micParts()
	{
		return "����ũ";
	}
	
	public String  betteryParts()
	{
		return "���͸�";
	}
	
	public String print()
	{
		String res = "��ǰ������ : " + country + "\t";
		res += cameraParts() + "\t" + micParts() + "\t" + betteryParts();
		res += "��ǰ���޿Ϸ�!!";
		return res;
	}

}
