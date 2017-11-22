package kr.co.mlec.lotto;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.mvc.Controller;
import org.springframework.web.mvc.ModelAndView;
import org.springframework.web.mvc.RequestMapping;



@Controller
public class LottoController 
{
	@RequestMapping("/lotto/write.do")
	public void write() {}
	
	@RequestMapping("/lotto/saveData.do")
	public String saveData(HttpServletRequest request) 
	{
		LottoMapper lm = new LottoMapper();
		LottoDomain ld = new LottoDomain();

		String [] lottoNumberArr = request.getParameterValues("lottoNumber");
		String lottoNumbers = "";
		String comma = "";
		String name = request.getParameter("writer");
		for (int i = 0; i < lottoNumberArr.length; i++) 
		{
			lottoNumbers += comma + lottoNumberArr[i];
			comma = ",";
		}

		System.out.println(name);
		System.out.println(lottoNumbers);
		ld.setName(name);
		ld.setLottoNumbers(lottoNumbers);
		
		lm.insert(ld);
		return "redirect:/lotto/play.do";
	}
	
	@RequestMapping("/lotto/play.do")
	public ModelAndView play() 
	{
		LottoMapper lm = new LottoMapper();
		List<LottoDomain> ld = lm.read();	

		for (LottoDomain lottoDomain : ld) 
		{
			List<String> lottoList = new ArrayList<>();
			String [] lottoArr = lottoDomain.getLottoNumbers().split(",");
			
			for (String l : lottoArr) 
			{
				lottoList.add(l);
			}
		
			lottoDomain.setLottoList(lottoList);
		}
		
		
		ModelAndView mav = new ModelAndView("/lotto/play.jsp");
		mav.addAttribute("lottoList", ld);
		return mav;
	}
	
}




















