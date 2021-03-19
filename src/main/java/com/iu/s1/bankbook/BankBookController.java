package com.iu.s1.bankbook;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;
	
	@RequestMapping(value = "/bankbook/bankbookList")
	public ModelAndView bankbookList(ModelAndView mav) throws Exception{
		System.out.println("BankBookList");
		mav.addObject("bblist",bankBookService.bankBookList());
		mav.setViewName("bankbook/bankbookList");
		return mav;
	}
	
	@RequestMapping(value = "/bankbook/bankbookAdd")
	public void bankbookAdd() {
		System.out.println("BankBookAdd");
	}
	
	@RequestMapping(value = "/bankbook/bankbookAdd", method = RequestMethod.POST)
	public void bankbookAdd(BankBookDTO bDTO)throws Exception{
		System.out.println("BankBookAdd");
		bankBookService.bankBookAdd(bDTO);
		System.out.println("입력 성공");
	}
	
	@RequestMapping(value = "/bankbook/bankbookSelect")
	public void bankbookSelect(BankBookDTO bDTO,HttpServletRequest request) throws Exception {
		System.out.println("BankBookSelect");
		request.setAttribute("dto", bankBookService.bankBookSelect(bDTO));
	}
	
	@RequestMapping(value = "/bankbook/bankbookUpdate")
	public void bankbookUpdate() {
		System.out.println("BankBookUpdate");
	}
	
	@RequestMapping(value = "/bankbook/bankbookRemove")
	public void bankbookRemove() {
		System.out.println("BankBookRemove");
	}
}
