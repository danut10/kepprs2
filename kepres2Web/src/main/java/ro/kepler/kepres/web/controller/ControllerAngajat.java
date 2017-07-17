package ro.kepler.kepres.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.kepler.kepres.app.dao.DaoAngajat;
import ro.kepler.kepres.common.dataRecords.Angajat;
import ro.kepler.kepres.common.utils.Pager;

@Controller
@RequestMapping("/angajat")
public class ControllerAngajat {
	
	private String viewname = "angajat";
	private String screenTitle = "Angajați";
	
	@Autowired private DaoAngajat dao;
	
	@ModelAttribute
	private void initModel(Model model) {
		model.addAttribute("screenTitle", screenTitle);		
	}
	
	@RequestMapping("/list")
	private String list(Model model) {
		List<Angajat> recordList = dao.readList();
		model.addAttribute("recordList", recordList);
		model.addAttribute("screenStatus", "list");
		
		Pager pager = new Pager().setRecordCount(200).setPageNo(14).setPageSize(10).setChapterSize(5);
		pager.build();
		model.addAttribute("pager", pager);
		
		return viewname;
	}
	
	@RequestMapping("/view")
	private String view(@RequestParam("id") Integer id, Model model) {
		Angajat record = dao.read(id);
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "view");
		return viewname;
	}	

	@RequestMapping("/add")
	private String add(Model model) {
		Angajat record = new Angajat();
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "add");
		return viewname;
	}	

	@RequestMapping("/edit")
	private String edit(@RequestParam("id") Integer id, Model model) {
		Angajat record = dao.read(id);
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "edit");
		return viewname;
	}	
	
	@RequestMapping("/create")
	private String create(@ModelAttribute("record") Angajat angajat) {
		dao.create(angajat);
		Integer id = angajat.getId();
		return "redirect: view?id=" + id;
	}		

	@RequestMapping("/update")
	private String update(@ModelAttribute("record") Angajat angajat) {
		dao.update(angajat);
		return "redirect: view?id=" + angajat.getId();
	}		

	@RequestMapping("/delete")
	private String delete(@RequestParam("id") Integer id) {
		dao.delete(id);
		return "redirect: list";
	}		
}
