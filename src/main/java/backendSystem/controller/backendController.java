package backendSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import _model.MembersBean;

@SessionAttributes("Mem_LoginOK")
@Controller
public class backendController {
	// 這裡放不需登入的轉址


	
	// 轉址(navbar)
	@PostMapping(value = "/backendSystem/navbar")
	public String navbar(Model model) {
		return "backendSystem/navbar";
	}

	// 轉址(sidebar,判斷權限)
	@PostMapping(value = "/backendSystem/sidebar")
	public String sidebarSelect(@ModelAttribute("Mem_LoginOK") MembersBean mem, Model model) {

		switch (mem.getPrivilegeId()) {
		case 2:
			return "backendSystem/sideBar/sideBar_webAdmin";
		case 3:
			return "backendSystem/sideBar/sideBar_salesManger";
		case 4:
			return "backendSystem/sideBar/sideBar_purchaseManger";
		case 5:
			return "backendSystem/sideBar/sideBar_stockManger";
		case 6:
			return "backendSystem/sideBar/sideBar_customerService";
		case 7:
			return "backendSystem/sideBar/sideBar_admin";
		default:
			return "backendSystem/coworkerLogin";
		}
	}

	// 轉址(Login page)
	@RequestMapping("/backendSystem/coworkerLogin")
	public String LoginPage(Model model) {
		return "backendSystem/coworkerLogin";
	}

	// 轉址(Login 忘記密碼請求)
	@GetMapping(value = "/memberSystem/coworkerfPW")
	public String coworkerForgetPW(Model model) {
		return "memberSystem/coworkerforgetPWPage";
	}

	// 轉址(忘記密碼)
	@GetMapping(value = "/memberSystem/memberPW")
	public String memberPW(Model model) {
		return "memberSystem/MemberPWPage";
	}

}