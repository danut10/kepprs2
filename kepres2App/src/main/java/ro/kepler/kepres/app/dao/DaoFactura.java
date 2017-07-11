package ro.kepler.kepres.app.dao;

import java.util.Hashtable;

import org.springframework.stereotype.Component;


import ro.kepler.kepres.common.dataRecords.Factura;

@Component
public class DaoFactura {
	
	private Hashtable<Integer, Factura> tabela;
	private Integer lastId = 3;
	
	public DaoFactura() {
		tabela = new Hashtable<>();
	
		
	}
	

}
