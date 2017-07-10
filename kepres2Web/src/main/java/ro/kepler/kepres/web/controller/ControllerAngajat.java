package ro.kepler.kepres.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("angajat")
public class ControllerAngajat {
	
	private String viewname = "angajat";
	
	@RequestMapping("/list")
	private String list(Model model) {
		return viewname;
	}

}
