package ro.kepler.kepres.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ro.kepler.kepres.app.dao.DaoAtasament;
import ro.kepler.kepres.common.dataRecords.Atasament;

@Controller
@RequestMapping("/atasament")
public class ControllerAtasament {
	
	private String viewname = "atasament";
	
	@Autowired
	private DaoAtasament dao;
	
	@RequestMapping("/list")
	private String list(Model model) {
		List<Atasament> recordList = dao.readList();
		model.addAttribute("recordList", recordList);
		model.addAttribute("screenStatus", "list");
		return viewname;
	}
	
	@RequestMapping("/view")
	private String view(@RequestParam("id") Integer id, Model model) {
		Atasament record = dao.read(id);
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "view");
		return viewname;
	}	
	
	@RequestMapping("/add")
	private String add(Model model) {
		Atasament record = new Atasament();
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "add");
		return viewname;
	}	

	@RequestMapping("/edit")
	private String edit(@RequestParam("id") Integer id, Model model) {
		Atasament record = dao.read(id);
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "edit");
		return viewname;
	}	
	
	@RequestMapping("/create")
	private String create(@ModelAttribute("record") Atasament atasament) {
		Integer id = dao.create(atasament);
		return "redirect: view?id=" + id;
	}		

	@RequestMapping("/update")
	private String update(@ModelAttribute("record") Atasament atasament) {
		dao.update(atasament);
		return "redirect: view?id=" + atasament.getId();
	}		

	@RequestMapping("/delete")
	private String delete(@RequestParam("id") Integer id) {
		dao.delete(id);
		return "redirect: list";
	}		
	
	@RequestMapping("/download")
	private String download(@RequestParam("id") Integer id) {
		System.out.println("Suntem in download");
		return "redirect: view?id=" + id;
	}
	
	/*@RequestMapping("/atasament/list")
	private String list(Model model) {
		try	{
			List<Atasament> recordList = new ArrayList<>();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Atasament a1 = new Atasament();
			Date d1 = sdf.parse("21/12/2012");
			a1.setTitlu("vasile");
			a1.setDtUpload(d1);
			recordList.add(a1);
			
			Atasament a2 = new Atasament();
			Date d2 = sdf.parse("11/10/2017");
			a2.setTitlu("ionel");
			a2.setDtUpload(d2);
			recordList.add(a2);
	
			model.addAttribute("recordList", recordList);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return "atasament";
	}*/

}
