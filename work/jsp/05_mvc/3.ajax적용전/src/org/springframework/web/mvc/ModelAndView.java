package org.springframework.web.mvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.mvc.C;
import org.springframework.web.mvc.P;

public class ModelAndView {
	private String view;
	private Map<String, Object> model = new HashMap<>();
	
	public ModelAndView() {}
	public ModelAndView(String view) {
		this.view = view;
	}
	
	public void addAttribute(String key, Object value) {
		model.put(key, value);
	}
	public void setView(String view) {
		this.view = view;
	}
	public String getView() {
		return view;
	}
	public Map<String, Object> getModel() {
		return model;
	}
	
	public static void main(String[] args) {
		P p = new C();
		p.call();
		p.tell();
//		p.msg();
	}
}
class P {
	public void call() {
		System.out.println("p");
	}
	public void tell() {
		System.out.println("p");
	}
}
class C extends P {
	public void call() {
		System.out.println("c");
	}
	public void msg() {
		System.out.println("c");
		
	}
}








