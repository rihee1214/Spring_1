package com.iu.s1.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/member/memberJoin", method = RequestMethod.GET)
	public String memberJoin() {
		System.out.println("MemberJoin");
		return "member/memberJoin";
	}
	
	//회원 가입 코드 진행
	@RequestMapping(value = "/member/memberJoin", method = RequestMethod.POST)
	public String memberJoin2(MemberDTO mDTO)throws Exception {
		
		int result = memberService.memberJoin(mDTO);
		
		if(result>0) {
			System.out.println("가입성공");
		}else {
			System.out.println("가입실패");
		}
		
		return "member/memberJoin";
	}
	
	@RequestMapping(value = "/member/memberLogin", method = RequestMethod.GET)
	public String memberLogin() {
		
		System.out.println("MemberLogin");
		
		return "member/memberLogin";
	}
	
	@RequestMapping(value = "/member/memberLogin", method = RequestMethod.POST)
	public ModelAndView memberLogin(MemberDTO memberDTO, ModelAndView modelAndView) throws Exception {
		System.out.println("MemberLogin OK");
		memberDTO = memberService.memberLogin(memberDTO);
		modelAndView.addObject("dto", memberDTO);
		modelAndView.setViewName("member/memberPage");
		
		return modelAndView;
	}
}
