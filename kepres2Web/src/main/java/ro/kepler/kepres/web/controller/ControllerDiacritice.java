package ro.kepler.kepres.web.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.kepler.kepres.app.dao.DaoDiacritice;
import ro.kepler.kepres.common.dataRecords.Diacritice;

@Controller
@RequestMapping("/diacritice")
public class ControllerDiacritice {
	
	private String viewname = "diacritice";
	
	
	@SuppressWarnings("unused")
	@Autowired private DaoDiacritice dao;
	
	@RequestMapping("/list")
	private String list(Model model) {
		List<Diacritice> recordList = dao.readList();
		model.addAttribute("recordList", recordList);
		model.addAttribute("screenStatus", "list");
		return viewname;
	}
	
	@RequestMapping("/view")
	private String view(@RequestParam("id") Integer id, Model model) {
		Diacritice record = dao.read(id);
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "view");
		return viewname;
	}	
	
	@RequestMapping("/add")
	private String add(Model model) {
		Diacritice record = new Diacritice();
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "add");
		return viewname;
	}	

	@RequestMapping("/edit")
	private String edit(@RequestParam("id") Integer id, Model model) {
		Diacritice record = dao.read(id);
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "edit");
		return viewname;
	}	

	@RequestMapping("/create")
	private String create(@ModelAttribute("record") Diacritice diacritice) throws IOException {
		//atasament.setUrl("c:\\basedir\\DataTree.java");
		
		//Date date = new Date();
		//atasament.setDtUpload(date);

		dao.create(diacritice);
		Integer id = diacritice.getId();
		return "redirect:view?id=" + id;
	}		

	@RequestMapping("/update")
	private String update(@ModelAttribute("record") Diacritice diacritice) {
		dao.update(diacritice);
		return "redirect:view?id=" + diacritice.getId();
	}		

	@RequestMapping("/delete")
	private String delete(@RequestParam("id") Integer id) {
		dao.delete(id);
		return "redirect:list";
	}		
	/*
	@RequestMapping("/download")
	private void download(HttpServletResponse response, @RequestParam("id") Integer id) throws IOException {
		Atasament record = dao.read(id);
		if(Files.exists(Paths.get(record.getUrl()))) {
			//response.setContentType(record.getTipFisier().toString());
			response.setContentType("application/pdf");
			response.addHeader("Content-Disposition", "attachment; filename=" + FilenameUtils.getBaseName(new File(record.getUrl()).getPath()));
			Files.copy(new File(record.getUrl()).toPath(), response.getOutputStream());
			response.getOutputStream().flush();
		}
		System.out.println(record.getUrl());
		
	} 
	
	@RequestMapping("/upload")
	private String upload(Model model) {
		model.addAttribute("url", "c:\\basedir\\DataTree.java");
		return viewname;
	}
	*/
}
