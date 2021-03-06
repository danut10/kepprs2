package ro.kepler.kepres.web.controller;


import java.io.FileNotFoundException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import ro.kepler.kepres.app.dao.DaoFactura;
import ro.kepler.kepres.common.dataRecords.Factura;
import ro.kepler.kepres.common.utils.Pager;


@Controller
@RequestMapping("/factura")
public class ControllerFactura {
	
	private String viewname = "factura";
	private String screenTitle = "Facturi";
	
	@Autowired
	private DaoFactura dao;
	
	@ModelAttribute
	private void initModel(Model model) {
		model.addAttribute("screenTitle", screenTitle);		
	}
	
	@RequestMapping("/list")
	private String list(Model model) {
		List<Factura> recordList = dao.readList();
		model.addAttribute("recordList", recordList);
		model.addAttribute("screenStatus", "list");
		
		Pager pager = new Pager().setRecordCount(200).setPageNo(14).setPageSize(10).setChapterSize(5);
		pager.build();
		model.addAttribute("pager", pager);
		
		return viewname;
	}
	
	@RequestMapping("/view")
	private String view(@RequestParam("id") Integer id, Model model) {
		Factura record = dao.read(id);
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "view");
		return viewname;
	}	

	@RequestMapping("/add")
	private String add(Model model) {
		Factura record = new Factura();
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "add");
		return viewname;
	}	

	@RequestMapping("/edit")
	private String edit(@RequestParam("id") Integer id, Model model) {
		Factura record = dao.read(id);
		model.addAttribute("record", record);
		model.addAttribute("screenStatus", "edit");
		return viewname;
	}	
	
	@RequestMapping("/create")
	private String create(@ModelAttribute("record") Factura factura) {
		dao.create(factura);
		Integer id = factura.getId();
		return "redirect: view?id=" + id;
	}		

	@RequestMapping("/update")
	private String update(@ModelAttribute("record") Factura factura) {
		dao.update(factura);
		return "redirect: view?id=" + factura.getId();
	}		

	@RequestMapping("/delete")
	private String delete(@RequestParam("id") Integer id) {
		dao.delete(id);
		return "redirect: list";
	}
	
	@RequestMapping("/print")
	private void print(HttpServletRequest request, HttpServletResponse response, @RequestParam("id") Integer id) throws Exception {
		 Document document = new Document();
		 try {
			 	Factura record = dao.read(id);
			    response.setContentType("application/pdf");
				PdfWriter.getInstance(document, response.getOutputStream());
				document.open();
		        Paragraph p = new Paragraph();
		        p.add("Data emitere: " + record.getDtEmitere()
		        	  +"\n" + "Serie: "+ record.getSerie() 
		              +"\n" + "Numar" + record.getNumar()
		        );
		        p.setAlignment(Element.ALIGN_LEFT);
		        document.add(p);
		        document.close();
	         
		} catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
	     }
	}
}