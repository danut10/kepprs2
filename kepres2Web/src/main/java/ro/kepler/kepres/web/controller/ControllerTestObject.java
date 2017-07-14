package ro.kepler.kepres.web.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.kepler.kepres.app.dao.DaoDiacritice;
import ro.kepler.kepres.common.dataRecords.TestObject;

@Controller
@RequestMapping("/diacritice")
public class ControllerTestObject {
	
	private String viewname = "testObject";
	
	
	@SuppressWarnings("unused")
	@Autowired private DaoDiacritice dao;
	
	@RequestMapping("/view")
	private String view(@RequestParam("id") Integer id, Model model) {
		TestObject record = dao.read(id);
		model.addAttribute("record", record);
		return viewname;
	}	
	
	@RequestMapping("/create")
	private String create(@ModelAttribute("record") TestObject testObject) throws IOException {
		dao.create(testObject);
		Integer id = testObject.getId();
		return "redirect:view?id=" + id;
	}		

	@RequestMapping("/update")
	private String update(@ModelAttribute("record") TestObject testObject) {
		dao.update(testObject);
		return "redirect:view?id=" + testObject.getId();
	}		
}
