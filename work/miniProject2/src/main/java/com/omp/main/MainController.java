package com.omp.main;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;

import com.omp.repository.domain.Board;
import com.omp.repository.service.MainService;

@Controller
@RequestMapping("/main")
public class MainController {

	@Autowired
	private MainService mainService; // 자동으로 주입

	@RequestMapping("/main.do")
	public String main(Model model, HttpSession session) throws Exception {
		
		System.out.println(session.getAttribute("user"));
		model.addAttribute("newlyBoard", mainService.selectNewlyBoard());
		model.addAttribute("notice", mainService.selectNotice(6));
		model.addAttribute("todayDeal", mainService.selectNotice(7));
		return "/main/main";
	}

	@ResponseBody
	@RequestMapping("/notice.json")
	public void notice(Board board) throws Exception {
		mainService.insertNotice(board);
	}

	@ResponseBody
	@RequestMapping("/todayDeal.json")
	public void todayDeal(Board board) throws Exception {
		mainService.updateTodayDeal(board);
	}

}
