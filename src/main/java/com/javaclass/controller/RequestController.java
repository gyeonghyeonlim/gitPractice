package com.javaclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaclass.model.MemberVO;

@Controller
@RequestMapping("re")
public class RequestController {
	
	@RequestMapping(value={"/a.do", "/b.do"})
	public String test() {
		System.out.println("a.do 요청");
		// 뷰페이지 지정
		// ***************************************
		// 스프링 컨트롤러에서 매핑 함수의 리턴값이 String 인 경우는
		//		**** 문자열 반환이 아니라
		//		**** 뷰페이지 지정
		return "home"; // -> /WEB-INF/views/ + home + .jsp
	}
	
	@RequestMapping(value="/c.do", params={"id=kim"})
	public void test2() {
		System.out.println("re/c.do 요청");
		//*********************************************
		// 스프링 컨트롤러에서 매핑 함수의 리턴값이 void인 경우는
		// 		**** 리턴값이 없다는 신호가 아니라
		//		**** 자동으로 뷰 페이지를 지정
		//		a.do 	->	/WEB-INF/views/ + a + .jsp
		//		re/c.do	->	/WEB-INF/views/ + re + / c + .jsp
	}
	
	@RequestMapping(value="request.do", method=RequestMethod.POST)
	public void test3(@ModelAttribute("vo") MemberVO vo) {
		System.out.println("re/request.do 요청");
		System.out.println(vo.getName()+"님 환영합니다.");
		
	}
}
