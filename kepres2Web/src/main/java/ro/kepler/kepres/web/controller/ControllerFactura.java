package ro.kepler.kepres.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ro.kepler.kepres.common.dataRecords.Factura;

@Controller
public class ControllerFactura {
	
	@RequestMapping("/factura")
	private String list(Model model) {
		List<Factura> listaFactura = new ArrayList<>();
		Factura f1 = new Factura();
		f1.setSerie("abc");
		f1.setNumar(1234);
		f1.setSuma(3500);
		listaFactura.add(f1);
		
		return "factura";
	}
}
