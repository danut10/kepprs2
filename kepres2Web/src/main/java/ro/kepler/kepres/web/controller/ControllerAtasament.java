package ro.kepler.kepres.web.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ro.kepler.kepres.common.dataRecords.Atasament;

@Controller
public class ControllerAtasament {
	
	@RequestMapping("/atasament/list")
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
	}

}
