package oops;

class SmartPhone{
	String camera="일반카메라", ear="일반이어폰";
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
		arr[0].camera="광학카메라";
		arr[1].ear="블루투스이어폰";
		System.out.println(arr);
		
		arr[0]=new SmartPhone();
		
		for (SmartPhone sp: arr) {
			System.out.println(sp+":"+sp.camera+","+sp.ear);
		}
		
		MP3 twice = new MP3();
		twice.title="트와이스1집";
		twice.song= new String[]{
				"OOH-AHH하게",
				"다시 해줘",
				"미쳤나봐",
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
