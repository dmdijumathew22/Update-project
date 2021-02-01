package com.simplilear.hcl.phase3.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.simplilear.hcl.phase3.repository.UserEntity;
import com.simplilear.hcl.phase3.services.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	Optional<UserEntity> user;

	@GetMapping(path = "/")
	String hello() {
		return "user/index";
	}

	@PostMapping(path = "/find")
	String find(@RequestParam(name="userid") String userid, Model model) {
		user=userService.findById(userid);
		if(user.isPresent()) {
			System.out.println("here"+user.toString());
			model.addAttribute("id",user.get().getId());
			model.addAttribute("firstName", user.get().getFirstName());
			model.addAttribute("lastName",user.get().getLastName() );
			model.addAttribute("userid",user.get().getUserid() );
			model.addAttribute("email", user.get().getEmail());


			return "user/welcome";  
		}else {
			model.addAttribute("msg", "User not Found");
			return "user/index";
		}

	}

	@PostMapping(path ="/update")
	String update (@ModelAttribute("employee")UserEntity user, 
		      BindingResult result, ModelMap model) {
		System.out.println("here update"+user.toString());
			userService.update(user);	
			model.addAttribute("msg", "User Information Updated");
		
		return "user/index";
		
	}
}