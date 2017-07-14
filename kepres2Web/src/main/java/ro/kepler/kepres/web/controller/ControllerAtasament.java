package ro.kepler.kepres.web.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@Autowired private DaoAtasament dao;
	
	/*
	 * statusuri ecran 
	 */
	
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
	private String add(@ModelAttribute("url") String url, @ModelAttribute("date") String dateString, Model model) throws ParseException {
		Atasament record = new Atasament();
		record.setUrl(url);
	    /*DateFormat df = new SimpleDateFormat("dd/MM/yy");
	    Date date = df.parse(dateString);
	    System.out.println(date);
		//record.setDtUpload(new Date());*/
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
	
	/*
	 * operatii DB 
	 */
	
	@RequestMapping("/create")
	private String create(@ModelAttribute("record") Atasament atasament) throws IOException {
		/**/
		//atasament.setUrl(url);
		
		atasament.setDtUpload(new Date());
		System.out.println(atasament);
		dao.create(atasament);
		Integer id = atasament.getId();
		return "redirect:view?id=" + id;
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
	
	/*
	 * partea de upload / download
	 */
	
	@RequestMapping("/download")
	private void download(HttpServletResponse response, @RequestParam("id") Integer id) throws IOException {
		Atasament record = dao.read(id);
		if(Files.exists(Paths.get(record.getUrl()))) {
			//response.setContentType(record.getTipFisier().toString());
			//response.setContentType("application/pdf");
			response.addHeader("Content-Disposition", "attachment; filename=" + record.getTitlu() + ".txt");
			//response.addHeader("Content-Disposition", "attachment; filename=" + FilenameUtils.getBaseName(new File(record.getUrl()).getPath()));
			Files.copy(new File(record.getUrl()).toPath(), response.getOutputStream());
			response.getOutputStream().flush();
		}
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.GET)
	private String uploadGet(Model model) {
		model.addAttribute("screenStatus", "upload");
		return viewname;
	}	
	
	@SuppressWarnings("unused")
	@RequestMapping(value = "/upload", method=RequestMethod.POST)
	private String uploadPost(@RequestParam("filecontent") MultipartFile filecontent) throws IOException {
		UUID uuid = UUID.randomUUID();
		
		String basedir = "c:\\basedir";
		String filepath = "c:\\basedir\\" + uuid.toString() + ".txt";
		byte[] bytes = filecontent.getBytes();
		
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(filepath));
		stream.write(bytes);
		stream.close();
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
		
		return "redirect:add?url=" + filepath + "&date=" + df.format(new Date()) +"/";
	}	
	
}
