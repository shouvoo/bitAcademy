package oops;

class SmartPhone{
	String camera="�Ϲ�ī�޶�", ear="�Ϲ��̾���";
}

class MP3{
	
	String title;
	
	String [] song;
}

public class SmartPhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone [] arr= {
				new SmartPhone(),
				new SmartPhone()
		};
		arr[0].camera="����ī�޶�";
		arr[1].ear="��������̾���";
		System.out.println(arr);
		
		arr[0]=new SmartPhone();
		
		for (SmartPhone sp: arr) {
			System.out.println(sp+":"+sp.camera+","+sp.ear);
		}
		
		MP3 twice = new MP3();
		twice.title="Ʈ���̽�1��";
		twice.song= new String[]{
				"OOH-AHH�ϰ�",
				"�ٽ� ����",
				"���Ƴ���",
				"Truth",
				"Candy Boy",
				"Like a Fool"
		};
		//String [] ss= {};
		//twice.song = ss;
		System.out.println(twice.title);
		
		for (String ss : twice.song) {
			System.out.println(ss);
		}
	}

}
