package homeWork_20170901;

import java.util.ArrayList;
import java.util.List;

public class Test 
{

	public static void main(String[] args) 
	{
		List l = new ArrayList();
		String [][] stationArr = {{"인천2", "동인천3", "제물포3", "도화2", "주안4", "간석4", "간석3", 
			"동암3", "백운3", "부평3", "부개2", "송내2", "중동4", "부천5", 
			"소사3", "역곡4", "온수3", "오류동2", "개봉2",  "구일2", "구로3", 
			"신도림4", "영등포4", "신길4", "대방5", "노량진3", "용산4", "남영3", 
			"서울역4", "시청5", "종각3", "종로3가2", "종로5가2", "동대문2", "동묘앞3", 
			"신설동3", "제기동3", "청량리4", "회기3", "외대앞4", "신이문4", "석계4", 
			"광운대2", "월계2", "녹천3", "창동2", "방학3", "도봉3", "도봉산3", "망월사4", 
			"회룡5", "의정부2", "가능2", "늑암3", "양주5", "덕정4", "지행4", "동두천중앙3", 
			"보산2", "동두천2", "소요산2"},

			{"구로2", "가산디지털단지3", "독산3", "금천구청3", "석수3", "관악4", "안양4", 
			"명학2", "금정2", "군포2", "당정5", "의왕5", "성균관대5", "화서3", "수원3", 
			"세류2", "병정4", "세마4", "오산대3", "오산2", "진위2", "송탄5", "서정리3", 
			"지제3", "평택4", "성환4", "직산3", "두정5", "천안3", "봉명3", "쌍용(나사렉대)4", 
			"아산2", "탕정3", "배방3", "온양온천5", "신창(순천향대)5"},
			
			{"금천구청3", "광명5"},
			
			{"병점4", "서동탄4" }};
		
		for (String[] arr1 : stationArr) 
		{
			List l2 = new ArrayList();
			for (String arr2 : arr1) 
			{
				l2.add(arr2);
			}
			l.add(l2);
		}
		List sub = (List)l.get(0);
		System.out.println(sub.indexOf("구로3"));
	}
	

}
