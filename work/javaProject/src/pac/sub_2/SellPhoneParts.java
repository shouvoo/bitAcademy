package pac.sub_2;

public class SellPhoneParts 
{
	public String country = "대만";
	
	public SellPhoneParts() 
	{
		// TODO Auto-generated constructor stub
		//print();
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*외국(대만제) 핸드폰 부품
		-카메라, 마이크, 베터리
		국내(삼성)핸드폰 생성
			만드는 회사 - 삼성
			핸드폰 - 갤럭시
		사진찍기, 전화하기, 터지기*/

	}
	
	public String  cameraParts()
	{
		return "카메라";
	}
	
	public String  micParts()
	{
		return "마이크";
	}
	
	public String  betteryParts()
	{
		return "베터리";
	}
	
	public String print()
	{
		String res = "부품제조국 : " + country + "\t";
		res += cameraParts() + "\t" + micParts() + "\t" + betteryParts();
		res += "부품전달완료!!";
		return res;
	}

}
