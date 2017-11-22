package kr.co.mlec.list;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.ModelAndView;
import org.springframework.web.mvc.RequestMapping;

import kr.co.mlec.search.ReligionDomain;
import kr.co.mlec.search.SearchMapper;

@Controller
public class ListController 
{
	@RequestMapping("/list/list.do")
	public ModelAndView list(HttpServletRequest request) throws Exception 
	{
		
		
		/*String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String religion = request.getParameter("religion");
		String [] sYear = request.getParameterValues("sYear");
		String [] eYear = request.getParameterValues("eYear");
		String [] gender = request.getParameterValues("gender");
		String [] religion = request.getParameterValues("religion");
		String [] school = request.getParameterValues("school");
		String [] skill = request.getParameterValues("skill");
		String [] sYear = request.getParameterValues("sYear");
		String [] eYear = request.getParameterValues("eYear");
		
		
		
		
		
		for (String g : gender) System.out.println("gender : " + g);
		for (String g : religion) System.out.println("religion : " + g);
		for (String g : school) System.out.println("school : " + g);
		for (String g : skill) System.out.println("skill : " + g);
		
		String sDate = "";
		String eDate = "";
		String dash = "";
		for (String g : sYear) 
		{
			sDate += dash + (g = (10 > Integer.parseInt(g)) ? "0" + g : g);
			dash = "-";
		}
		
		dash = "";
		for (String g : eYear) 
		{
			eDate += dash + (g = (10 > Integer.parseInt(g)) ? "0" + g : g);
			dash = "-";
		}
		
		ListDomain ld = new ListDomain();
		ld.setStaffName(name);
		ld.setGender(gender);
		ld.setReligion(religion);
		ld.setsGraduationDate(sDate);
		ld.seteGraduationDate(eDate);*/
		
		ListMapper sm = new ListMapper();
		//List<ListDomain> templesList = sm.getTemplesList(ld);
		List<ListDomain> templesList = sm.getTemplesList();
		ModelAndView mav = new ModelAndView("/list/list.jsp");
		mav.addAttribute("templesList", templesList);
		return mav;
	}
}




















