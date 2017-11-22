/*
 *   Dispatcher의 역활중에서 uri와 controller에 대한 정보 관리 부분을 처리 
 */
package org.springframework.web.mvc;

import java.util.HashMap;
import java.util.Map;

import kr.co.mlec.board.DeleteBoardController;
import kr.co.mlec.board.DetailBoardController;
import kr.co.mlec.board.ListBoardController;
import kr.co.mlec.board.ModifyBoardController;
import kr.co.mlec.board.ModifyFormBoardController;
import kr.co.mlec.board.WriteBoardController;
import kr.co.mlec.board.WriteFormBoardController;
import kr.co.mlec.login.LoginFormController;
import kr.co.mlec.login.LoginProcessController;
import kr.co.mlec.login.LogoutController;
import kr.co.mlec.main.MainController;

public class URLHandlerMapping {
	private Map<String, Controller> mappings = new HashMap<>();
	
	public URLHandlerMapping(String controllers) throws Exception {
		String[] arr = controllers.split(";");
		for (String info : arr) {
			String[] ctrlInfo = info.trim().split("=");
			mappings.put(
					ctrlInfo[0], 
					(Controller)(Class.forName(ctrlInfo[1]).newInstance())
			);
		}
	}
	
	public Controller getController(String uri) {
		return mappings.get(uri);
	}
}












