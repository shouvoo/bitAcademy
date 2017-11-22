package homeWork_20170811;
import homeWork_20170811.BasicStudent;
import homeWork_20170811.BasicUniversity;
import homeWork_20170811.ArtUniversity;

public class HomeWorkMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		BasicStudent [] bsArr = {new BasicStudent("브레드", "남", "일반", new int [] {78, 87, 61, 53, 57, 73}),
									new BasicStudent("레즈너", "남", "일반", new int [] {98, 87, 91, 98, 78, 38}),
									new BasicStudent("졸리", "여", "특별전형", new int [] {38, 67, 51, 38, 78, 88}),
									new BasicStudent("에드거", "남", "수시", new int [] {54, 76, 52, 53, 73, 93}),
									new BasicStudent("엠마", "여", "산업체", new int [] {99, 85, 95, 93, 53, 73}),
									new BasicStudent("코넬리", "여", "수시", new int [] {95, 63, 74, 93, 43, 53}),
									new BasicStudent("키아누", "남", "외국인", new int [] {25, 64, 95, 55, 75, 8}),
									new BasicStudent("와이즈", "여", "산업체", new int [] {89, 98, 99, 35, 83, 73}),
									new BasicStudent("조니뎁", "남", "특별전형", new int [] {63, 85, 77, 73, 83, 43}),
									new BasicStudent("노튼", "여", "외국인", new int [] {96, 74, 85, 83, 93, 73})};
		
		
		
		BasicUniversity [] bu = {new BasicUniversity(), 
				                  new ArtUniversity(),
				                  new ArmyUniversity(),
				                  new HanbitUniversity()};
		PassResult pr = new PassResult();
		
		for (int i = 0; i < bu.length; i++) 
		{	
			System.out.println();
			
			for (int j = 0; j < bsArr.length; j++) 
			{
				bu[i].init(bsArr[j]);
				pr.init(bu[i], j);
			}
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------------------------------------");
		}
		
	}

}
