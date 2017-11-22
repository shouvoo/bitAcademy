package kr.co.mlec.search;

import java.util.List;

import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.ModelAndView;
import org.springframework.web.mvc.RequestMapping;


@Controller
public class SearchController 
{
	@RequestMapping("/search/searchform.do")
	public ModelAndView searchform() throws Exception 
	{
		SearchMapper sm = new SearchMapper();
		List<ReligionDomain> religionList = sm.religionRead();
		List<SchoolDomain> schoolList = sm.schoolRead();
		List<SkillDomain> skillList = sm.skillRead();
		System.out.println(schoolList);
		ModelAndView mav = new ModelAndView("/search/searchform.jsp");
		mav.addAttribute("religion", religionList);
		mav.addAttribute("school", schoolList);
		mav.addAttribute("skill", skillList);
		return mav;
	}
}
