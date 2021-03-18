package com.iu.s1.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String memberJoin2(String id, String pw, String name, String email, String phone)throws Exception {
		MemberDTO mDTO = new MemberDTO();
		mDTO.setId(id);
		mDTO.setPw(pw);
		mDTO.setName(name);
		mDTO.setEmail(email);
		mDTO.setPhone(phone);
		
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
	public String memberLogin2(HttpServletRequest request) throws Exception {
		System.out.println("MemberLogin OK");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setId(id);
		memberDTO.setPw(pw);
		
		memberDTO = memberService.memberLogin(memberDTO);
		
		System.out.println(memberDTO);
		return "member/memberLogin";
	}
}
