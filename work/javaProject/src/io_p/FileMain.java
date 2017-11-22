package io_p;

import java.io.File;
import java.util.Date;

public class FileMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//File ff = new File("fff"); // ���� ���� ���� Ȯ��
		File ff = new File("fff/aaa.txt");
		
		/*String [] aa = ff.getName().split(".");
		System.out.println(aa.toString());*/
		
		System.out.println(ff.exists()); // ���� ���� ����Ȯ��
		System.out.println(ff.getName()); // ���� �̸� Ȯ��
		System.out.println(ff.getPath()); // ���� �̸� Ȯ��
		System.out.println(ff.getParent()); // ���� ���� �̸� Ȯ��
		System.out.println(ff.canRead()); // �б� ��������
		System.out.println(ff.canWrite()); // ���� ��������
		System.out.println(ff.isHidden()); // ���� ��������
		System.out.println(ff.isFile()); // ��������
		System.out.println(ff.isDirectory()); // ��������
		System.out.println(ff.length()); // ���� ������ ���ڼ�
		System.out.println(new Date(ff.lastModified())); // ���� ������ �����Ǿ�����
		System.out.println(ff.getAbsolutePath()); // ���� ��ǥ
		
		File [] list = new File("fff").listFiles();
		
		for (File file : list) 
		{
			System.out.println(file.getName());
		}
		
		File newFF = new File("fff/xxx/bbb");
		//newFF.mkdir(); // ���� ������ ���������
		newFF.mkdirs(); //������ ����(���� �������� ���̸�����ش�
		//newFF.delete(); //������ ������ ����
		
		File delFF = new File("fff/bbb.txt");
		delFF.delete();
		
		/*//������ ������ ������ ���� �������� ���� ������ �����Ͻÿ�

		/// ���� �������� �˻��ϼ���

		/// ���� ���ϸ��� ��� �ߺ� ó�� �ϼ���

		//�̹��� : bmp, jpg, gif, png 

		//���� : mp3, wma, wav

		//���� :doc, hwp, ppt, xls, pptx, xlsx. docx

		//���� :txt

		//��Ÿ : ���� �з� �̿�

		//Ȯ������ ��ҹ��� �������� ����

		 -------------------------------------------------------------------------------------------------------------

		 

		///���������� �帣���� ������ �����ϼ���

		/// ���� ���ϸ��� ��� �ߺ� ó�� �ϼ���

		/// ���� �������� �˻��ϼ���

		/// ����� - �帣 ���� - ����, ����  ���� �����Ͽ� �����ϼ���

		///  ���� ���� 


		    1- �뷡����

		    2- �帣

		    3- ����

		    4- ����

		    5- ����*/

		 



	}

}
