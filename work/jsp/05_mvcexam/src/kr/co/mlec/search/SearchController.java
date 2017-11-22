package kr.co.mlec.search;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.ModelAndView;
import org.springframework.web.mvc.RequestMapping;

import kr.co.mlec.list.ListDomain;
import kr.co.mlec.list.ListMapper;


@Controller
public class SearchController 
{
	@RequestMapping("/search/searchform.json")
	public Map searchform() throws Exception 
	{
		SearchMapper sm = new SearchMapper();
		List<ReligionDomain> religionList = sm.religionRead();
		List<SchoolDomain> schoolList = sm.schoolRead();
		List<SkillDomain> skillList = sm.skillRead();
		
		Map<String, List> viewMap = new HashMap<>();
		viewMap.put("religion", religionList);
		viewMap.put("school", schoolList);
		viewMap.put("skill", skillList);
		
		return viewMap;
	}
	
	@RequestMapping("/search/total.json")
	public List<ListDomain> total() throws Exception 
	{
		SearchMapper sm = new SearchMapper();
		List<ListDomain> templesList = sm.getTemplesList();
		return templesList;
	}
	
	@RequestMapping("/search/result.json")
	public List<ListDomain> result(HttpServletRequest request) throws Exception 
	{
		SearchMapper sm = new SearchMapper();
		ListDomain ld = new ListDomain();
		
		if(request.getParameter("name") != null) ld.setStaffName(request.getParameter("name"));
		
		if(request.getParameterValues("gender") != null)
		{
			List<String> genders = new ArrayList<>();
			for (String gender : request.getParameterValues("gender"))
			{
				genders.add(gender);
			}
			ld.setGenders(genders);
		}
		
		if(request.getParameter("religion") != null) ld.setReligionCode(Integer.parseInt(request.getParameter("religion")));
		
		if(request.getParameterValues("school") != null)
		{
			List<String> schools = new ArrayList<>();
			for (String school : request.getParameterValues("school"))
			{
				schools.add(school);
			}
			ld.setSchoolCodes(schools);
		}
		
		if(request.getParameterValues("skill") != null)
		{
			List<String> skills = new ArrayList<>();
			for (String skill : request.getParameterValues("skill"))
			{
				skills.add(skill);
				System.out.println(skill);
			}
			ld.setSkillCodes(skills);
		}
		
		String [] sYear = request.getParameterValues("sYear");
		String [] eYear = request.getParameterValues("eYear");
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

		ld.setsGraduationDate(sDate);
		ld.seteGraduationDate(eDate);

		List<ListDomain> templesList = sm.getResultList(ld);
		return templesList;
	}
	
	
	@RequestMapping("/search/modifyanddelete.do")
	public ModelAndView modifyanddelete() throws Exception 
	{
		SearchMapper sm = new SearchMapper();
		List<ReligionDomain> religionList = sm.religionRead();
		List<SchoolDomain> schoolList = sm.schoolRead();
		List<SkillDomain> skillList = sm.skillRead();

		ModelAndView mav = new ModelAndView("/search/modifyanddelete.jsp");
		mav.addAttribute("religion", religionList);
		mav.addAttribute("school", schoolList);
		mav.addAttribute("skill", skillList);
		return mav;
	}
	
	
}






















