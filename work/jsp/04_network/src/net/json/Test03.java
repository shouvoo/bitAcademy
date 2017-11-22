package net.json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.Gson;

public class Test03 {
	public static void main(String[] args) {
        String clientId = "zm6e3Nxz2cWUAOMqtJ9J";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "kGYFQt7bpc";//애플리케이션 클라이언트 시크릿값";
        try {
            String text = URLEncoder.encode("강남역맛집", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/blog?query="+ text; // json 결과
            //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 결과
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            
            NaverSearch result = new Gson().fromJson(
            		response.toString(), NaverSearch.class
            );
            for (NaverItem item : result.getItems()) {
            	System.out.println("-------------------");
            	System.out.println("제목 : " + item.getTitle());
            	System.out.println("블로거이름 : " + item.getBloggername());
            	System.out.println("블로거주소 : " + item.getBloggerlink());
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
	}
}










