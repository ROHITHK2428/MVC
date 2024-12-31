package com.bootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bootmvc.model.Student123;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("add-student")
	public String add(ModelMap m, @RequestParam("id") int id, @RequestParam("name") String name) {
		Student123 s = new Student123();
		s.setId(id);
		s.setName(name);
		m.addAttribute("s2", s);
		return "result";
	}
}	
//	@RequestMapping("add-student")
//	public String addStudent(@ModelAttribute("s2") Student123 s1)
//	{
//		return "result";
//	}
//}

