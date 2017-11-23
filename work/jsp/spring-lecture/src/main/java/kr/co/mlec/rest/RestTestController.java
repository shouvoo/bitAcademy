package kr.co.mlec.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.mlec.form.MemberVO;

@RestController
@RequestMapping("/rest")
public class RestTestController 
{
	@RequestMapping("/resBody.do")
	public String resStringBody() 
	{
		return "OK, 성공";
	}
	
	@RequestMapping("/resBody.json")
	public Map<String, String> resJsonBody() {
		Map<String, String> result = new HashMap<>();
		result.put("id", "sbc");
		result.put("name", "hong");
		result.put("addr", "서울");
		return result;
	}
	
	@RequestMapping("/resVOBody.json")
	public MemberVO resJsonVOBody() {
		MemberVO vo = new MemberVO();
		vo.setId("sbc");
		vo.setName("sbc");
		vo.setPassword("1234");
		return vo;
	}
	
	@RequestMapping("/resStringListBody.json")
	public List<String> resJsonStringListBody() {
		List<String> list = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			list.add(String.valueOf(i));
		}
		return list;
	}

	@RequestMapping("/resVOListBody.json")
	public List<MemberVO> resJsonVOListBody() {
		List<MemberVO> list = new ArrayList<>();
		for (int i = 1; i < 4; i++) {
			MemberVO vo = new MemberVO();
			vo.setId("sbc");
			vo.setName("sbc");
			vo.setPassword("1234");
			list.add(vo);
		}
		return list;
	}
}

