package ro.kepler.kepres.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ro.kepler.kepres.common.dataRecords.Atasament;

@Controller
public class ControllerAtasament {
	
	@RequestMapping("/atasament/list")
	private String list(Model model) {
		List<Atasament> recordList = new ArrayList<>();
		
		Atasament a1 = new Atasament();
		a1.setTitlu("vasile");
		recordList.add(a1);
		
		Atasament a2 = new Atasament();
		a2.setTitlu("ionel");
		recordList.add(a2);

		model.addAttribute("recordList", recordList);
		return "atasament";
	}

}
