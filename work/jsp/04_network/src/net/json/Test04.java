package net.json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/naverapi/search")
public class Test04 extends HttpServlet
{
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		request.setCharacterEncoding("utf-8");
		String word = request.getParameter("word");
		if(word != null && word.length() != 0) 
		{
			List<NaverItem> list = search(word);
			request.setAttribute("list", list);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/naver/naversearch.jsp");
		rd.forward(request, response);
	}
	
	public List<NaverItem> search(String word) {
        String clientId = "zm6e3Nxz2cWUAOMqtJ9J";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "kGYFQt7bpc";//애플리케이션 클라이언트 시크릿값";
        NaverSearch result = null;
        try {
            String text = URLEncoder.encode(word, "UTF-8");
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
            
            result = new Gson().fromJson(response.toString(), NaverSearch.class);
           
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return result.getItems();
	}
}










