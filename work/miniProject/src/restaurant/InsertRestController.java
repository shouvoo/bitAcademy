package restaurant;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;

import common.HanbitFileRenamePolicy;

@WebServlet("/restaurant/insert")
public class InsertRestController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String street = request.getParameter("street");
		String flavor = request.getParameter("flavor");
		String price = request.getParameter("price");
		String etc = request.getParameter("etc");
		String addr = request.getParameter("addr");
		int fla = 0;
		
		for (int i = 0; i < flavor.length(); i++) {
			if(flavor.equals("★"))
				fla += 20;
			if(flavor.equals("☆"))
				fla += 10;
		}
		
		RestVO vo = new RestVO();
		vo.setEtc(etc);
		vo.setFlavor(flavor);
		vo.setName(name);
		vo.setPrice(price);
		vo.setStreet(street);
		vo.setAddr(addr);
		vo.setFla(fla);
		
		RestDAO dao = new RestDAO();
		try {
			dao.insertRest(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//throw new ServletException(e);
		}
		
		response.sendRedirect(request.getContextPath()+"/restaurant/main");
	}
}
