package ro.kepler.kepres.web.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ro.kepler.kepres.app.dao.DaoTestObject;
import ro.kepler.kepres.common.dataRecords.TestObject;

@Controller
@RequestMapping("/testObject")
public class ControllerTestObject {
	
	private String viewname = "testObject";
	
	@Autowired private DaoTestObject dao;
	
	@RequestMapping("/view")
	private String view(@RequestParam("id") Integer id, Model model) {
		TestObject record = dao.read(id);
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "view");
		return viewname;
	}	
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	private String create(@ModelAttribute("record") TestObject testObject) throws IOException {
		dao.create(testObject);
		return "redirect:view?id=" + testObject.getId();
	}		

	@RequestMapping(value = "/update", method = RequestMethod.GET)
	private String update(@ModelAttribute("record") TestObject testObject) {
		dao.update(testObject);
		return "redirect:view?id=" + testObject.getId();
	}		
}
