package util_p;

import java.util.regex.Pattern;

public class RegexFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] mmArr = {"�嵿��","�弭��","����","�峲��","��","�屺","���屺","���屺","�屺��","������",
                "����","����","ī�ĺ�","Ŀ�Ǻ�","Ŀ�ǹ�","����Ŀ��","�����","������","������",
                "��","����ȣ","�����","�����","�ʺ�ƴ�","������","ī����","������"};
		
		String index="��������������������������������������";
		String ff="�����ٶ󸶹ٻ������īŸ���ϱ��¥����";
		String ee="�����L���J����磠���i�M���R����������";
		
		String sch = "������";
		
		String pp ="";
		
		for (int i = 0; i < sch.length(); i++) {
			int pos = index.indexOf(""+sch.charAt(i));
			
			if(pos<0)
				pp+=sch.charAt(i);
			else
				pp+="["+sch.charAt(i)+"|"+ff.charAt(pos)+"-"+ee.charAt(pos)+"]";
		}
		
		System.out.println(pp);
		
		for (String str : mmArr) {
			if(Pattern.matches(pp, str))
				System.out.print(str+",");
		}
	}

}
