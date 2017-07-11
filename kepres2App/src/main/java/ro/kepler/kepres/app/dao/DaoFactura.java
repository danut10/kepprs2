package ro.kepler.kepres.app.dao;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.springframework.stereotype.Component;

import ro.kepler.kepres.common.dataRecords.Factura;

@Component
public class DaoFactura {
	
	private Hashtable<Integer, Factura> tabela;
	private Integer lastId = 3;
	
	public DaoFactura() {
		tabela = new Hashtable<>();
		tabela.put(1, new Factura().setId(1).setSerie("AAA").setNumar(123));
		tabela.put(2, new Factura().setId(2).setSerie("BBB").setNumar(456));
		tabela.put(3, new Factura().setId(3).setSerie("CCC").setNumar(789));
		
	}
	
	public List<Factura> readList() {
		List<Factura> recordList = new ArrayList<Factura>(tabela.values());
		return recordList;
	}
	
	public Factura read(Integer id) {
		Factura record = tabela.get(id);
		return record;
	}

	public Integer create(Factura factura) {
		Integer id = ++lastId;
		factura.setId(id);
		tabela.put(id, factura);
		return id;
	}

	public void delete(Integer id) {
		tabela.remove(id);
		
	}

	public void update(Factura factura) {
		tabela.put(factura.getId(), factura);
	}
	

}
