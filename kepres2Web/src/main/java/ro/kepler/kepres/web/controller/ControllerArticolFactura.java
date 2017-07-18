package ro.kepler.kepres.web.controller;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.kepler.kepres.app.dao.DaoArticolFactura;
import ro.kepler.kepres.common.dataRecords.ArticolFactura;

@Controller
@RequestMapping("/articolFactura")

public class ControllerArticolFactura {
private String viewname = "articolfactura";
	
	@Autowired
	private DaoArticolFactura dao;
	
	@RequestMapping("/list")
	private String list(Model model) {
		List<ArticolFactura> recordList = dao.readList();
		model.addAttribute("recordList", recordList);
		model.addAttribute("screenStatus", "list");
		return viewname;
	}
	
	@RequestMapping("/view")
	private String view(@RequestParam("factura") String factura, Model model) {
		ArticolFactura record = dao.read(factura);
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "view");
		return viewname;
	}	

	@RequestMapping("/add")
	private String add(Model model) {
		ArticolFactura record = new ArticolFactura();
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "add");
		return viewname;
	}	

	@RequestMapping("/edit")
	private String edit(@RequestParam("factura") String factura, Model model) {
		ArticolFactura record = dao.read(factura);
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "edit");
		return viewname;
	}	
	
	@RequestMapping("/create")
	private String create(@ModelAttribute("record") ArticolFactura articolFactura) {
		dao.create(articolFactura);
		String factura = articolFactura.getFactura();
		return "redirect: view?factura=" + factura;
	}		

	@RequestMapping("/update")
	private String update(@ModelAttribute("record") ArticolFactura factura) {
		dao.update(factura);
		return "redirect: view?factura=" + factura.getFactura();
	}		

	@RequestMapping("/delete")
	private String delete(@RequestParam("factura") String factura) {
		dao.delete(factura);
		return "redirect: list";
	}
	
	
	
}