package ro.kepler.kepres.web.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import ro.kepler.kepres.app.dao.DaoAtasament;
import ro.kepler.kepres.common.dataRecords.Atasament;

@Controller
@RequestMapping("/atasament")
public class ControllerAtasament {
	
	private String viewname = "atasament";
	private String screenTitle = "Ataşamente";
	
	@Autowired private DaoAtasament dao;
	
	/*
	 * statusuri ecran 
	 */
	
	@ModelAttribute
	private void initModel(Model model) {
		model.addAttribute("screenTitle", screenTitle);		
	}
	
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
	private String add(Model model) throws ParseException {
		Atasament record = new Atasament();
		/*record.setUrl(url);
	    Date date = new Date();
		record.setDtUpload(date);*/
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
		atasament.setDtUpload(new Date());
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
	@ResponseBody
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
	
	@RequestMapping(value = "/upload", method=RequestMethod.POST)
	private String uploadPost(@RequestParam("filecontent") MultipartFile filecontent) throws IOException {
		UUID uuid = UUID.randomUUID();
		
		String basedir = "c:\\basedir";
		String filepath = basedir + "\\" + uuid.toString() + ".txt";
		byte[] bytes = filecontent.getBytes();
		
		BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(filepath));
		stream.write(bytes);
		stream.close();
		
		return "redirect:list";
	}
	
	@RequestMapping("/open")
	@ResponseBody
	private void open(HttpServletResponse response, @RequestParam("id") Integer id) throws IOException {
		Atasament record = dao.read(id);
		if(Files.exists(Paths.get(record.getUrl()))) {
			Files.copy(new File(record.getUrl()).toPath(), response.getOutputStream());
			response.getOutputStream().flush();
		}
	}
	
	@RequestMapping(value="/excel")
	private String excel(@RequestParam("id") Integer id) throws IOException {
			
		
				HSSFWorkbook workbook = new HSSFWorkbook();
				HSSFSheet sheet = workbook.createSheet("TEST");
				
				List<Atasament> recordList = dao.readList();
				
				Row rowHeading = null;
				for(int j = 0; j < recordList.size(); j++ ){
					rowHeading = sheet.createRow(j);
					rowHeading.createCell(0).setCellValue(recordList.get(j).getTitlu());
					rowHeading.createCell(1).setCellValue(recordList.get(j).getMemo());
				}
				for(int i = 0; i < recordList.size(); i++) {
					/*CellStyle stylerowHeading = workbook.createCellStyle();
					Font font = workbook.createFont();
					font.setBold(true);
					font.setFontName(HSSFFont.FONT_ARIAL);
					font.setFontHeightInPoints((short) 11);
					stylerowHeading.setFont(font);
					rowHeading.getCell(i).setCellStyle(stylerowHeading);
					*/
					//Salvare excel
					
					FileOutputStream out = new FileOutputStream(new File("c:\\test\\GEORGE.xls"));
					workbook.write(out);
					out.close();
					workbook.close();
					}
				return "redirect:view?id=" + id;
	}
	
}
