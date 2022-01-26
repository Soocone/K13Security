package com.kosmo.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	
	//시큐리티 1단계: 기본페이지 사용하기
	/*
	 해당 요청명으로 접근하기 위해서는 USER 권한을 획득해야 한다. 
	 security-context1.xml에서 아래와 같이 설정하였음
	 <security:intercept-url pattern="/security1-1/**" access="hasRole('USER')" />
	 */
	@RequestMapping("/security1-1/index.do")
	public String security1() {
		return "09Security/Step1/index";
	}
	
	/*
	 별도의 권한없이 누구나 접근할 수 있는 요청명
	 security-context1.xml에서 아래와 같이 설정되어있음
	 <security:intercept-url pattern="/**" access="permitAll" />
	 */
	@RequestMapping("/security1-2/access.do")
	public String security1_1() {
		return "09Security/Step1/access";
	}
}
