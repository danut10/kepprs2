package ro.kepler.kepres.web.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ro.kepler.kepres.app.dao.DaoAtasament;
import ro.kepler.kepres.app.dao.DaoAtasament1;
import ro.kepler.kepres.common.dataRecords.Atasament;

@Controller
@RequestMapping("/atasament")
public class ControllerAtasament {
	
	private String viewname = "atasament";
	
	@SuppressWarnings("unused")
	@Autowired private DaoAtasament1 dao1;
	@Autowired private DaoAtasament dao;
	
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
	private String create(HttpServletRequest request, @ModelAttribute("record") Atasament atasament) throws IOException {	
		//String workingDirectory = System.getProperty("user.dir");
		//String workingDirectory = request.getServletContext().getRealPath("");
		String workingDirectory = new File(".").getCanonicalPath();
		atasament.setUrl(workingDirectory + "\\src\\main\\webapp\\WEB-INF\\downloads\\KEPRES2.sql");
		
		Date date = new Date();
		atasament.setDtUpload(date);

		dao.create(atasament);
		Integer id = atasament.getId();
		return "redirect: view?id=" + id;
	}		

	@RequestMapping("/update")
	private String update(@ModelAttribute("record") Atasament atasament) {
		dao.update(atasament);
		return "redirect:view?id=" + atasament.getId();
	}		

	@RequestMapping("/delete")
	private String delete(@RequestParam("id") Integer id) {
		dao.delete(id);
		return "redirect:list";
	}		
	
	@RequestMapping("/download")
	private String download(HttpServletResponse response, @RequestParam("id") Integer id) throws IOException {
		Atasament record = dao.read(id);
		if(Files.exists(Paths.get(record.getUrl()))) {
			//response.setContentType(record.getTipFisier().toString());
			response.setContentType("application/pdf");
			response.addHeader("Content-Disposition", "attachment; filename=" + FilenameUtils.getBaseName(new File(record.getUrl()).getPath()));
			Files.copy(new File(record.getUrl()).toPath(), response.getOutputStream());
			response.getOutputStream().flush();
		}
		System.out.println(record.getUrl());
		
		/*if(Files.exists(Paths.get("C:\\Users\\intern\\workspace\\projects\\kepres2Web\\src\\main\\webapp\\WEB-INF\\downloads\\KEPRES2.sql"))) {
			//response.setContentType("application/pdf");
			response.addHeader("Content-Disposition", "attachment; filename=Kepres2.sql");
			Files.copy(new File("C:\\Users\\intern\\workspace\\projects\\kepres2Web\\src\\main\\webapp\\WEB-INF\\downloads\\KEPRES2.sql").toPath(), response.getOutputStream());
            response.getOutputStream().flush();
		}*/
		
		return "redirect:view?id=" + id;
	}
}
