package fixBoard;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oreilly.servlet.MultipartRequest;

import common.HanbitFileRenamePolicy;
import member.MemberDomain;

@WebServlet("/fix/writeinsert")
public class WriteController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDomain md = (MemberDomain)session.getAttribute("user");
		
		try {
			String uploadPath = "c:/lee/jsp/miniProject/WebContent/img/fix/image";
			File f = new File(uploadPath);
			
			if(!f.exists()) f.mkdirs();
			
			MultipartRequest mRequest = new MultipartRequest(
					request,
					uploadPath,
					1024*1024*10,
					"utf-8",
					new HanbitFileRenamePolicy()
			);

			//String youtube = mRequest.getParameter("youtube");
			String title = mRequest.getParameter("title");
			String writer = mRequest.getParameter("writer");
			String cate = mRequest.getParameter("cate");
			String brand = mRequest.getParameter("brand");
			String content = "";
			String thumb = new ThumbMake().Thumb(mRequest.getFile("file1"));
			
			/*for (int i = 1; i <= 5; i++) {
				String str = "";
				
				if(i != 1)
					str = "☎AIE☎";
				
				content += str+mRequest.getParameter("content"+i);
			}*/
			
			int i = 0;
			for (String s : mRequest.getParameterValues("content")) {
				String str = "";
				
				if(i != 0)
					str = "☎AIE☎";
				/*else if(i == 0 && youtube != null) {
					str = 
					"<iframe width=500 height=350 src=https://www.youtube.com/embed/"+
							youtube.substring(youtube.indexOf("v=")+2)+"frameborder=0 gesture=media allowfullscreen></iframe>";
				}*/
					
				
				content += str+s;
				
				i++;
			}
			
			Enumeration<String> fNames = mRequest.getFileNames();
			
			FixDAO dao = new FixDAO();
			int no = 0;
			
			try {
				no = dao.number();
			} catch (Exception e1) {}
			
			FixVO fix = new FixVO();
			
			fix.setBrand(brand);
			fix.setCate(cate);
			fix.setContent(content);
			fix.setWriter(writer);
			fix.setTitle(title);
			fix.setNo(no);
			fix.setThumb(thumb);
			fix.setIp(request.getLocalAddr());
			fix.setId((((MemberDomain)session.getAttribute("user")).getId()));
			
			try {
				dao.insertFix(fix);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			while (fNames.hasMoreElements()) {
				FixVO ff = new FixVO();
				String fName = fNames.nextElement();
		
				File file = mRequest.getFile(fName);
		
			if(file != null) {
				String oriName = mRequest.getOriginalFileName(fName);
				String systemName  = mRequest.getFilesystemName(fName);

				ff.setNo(no);
				ff.setSysName(systemName);
				ff.setOriName(oriName);
				
				BufferedImage img = ImageIO.read(file);
				
				ff.setWidth(img.getWidth());			
				
				try {
					dao.insertFile(ff);
				} catch (Exception e) {}
				
				}
			}

			response.sendRedirect(request.getContextPath()+"/fix/list");
		} catch (Exception e) {
			response.sendRedirect(request.getContextPath()+"/fix/list?chk=f");
		}
		
	}
}
