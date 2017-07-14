package ro.kepler.kepres.app.dao;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.springframework.stereotype.Component;

import ro.kepler.kepres.common.dataRecords.Factura;

@Component
public class DaoFactura1 {
	
	private Hashtable<Integer, Factura> tabela;
	private Integer lastId = 3;
	
	public DaoFactura1() {
		tabela = new Hashtable<>();
		tabela.put(1, new Factura().setId(1).setSerie("AAA").setNumar("123").setDtEmitere(null).setDtScadenta(null).setSuma(2132).setTva(0.09).setDraft(true));
		tabela.put(2, new Factura().setId(2).setSerie("BBB").setNumar("456").setDtEmitere(null).setDtScadenta(null).setSuma(2323.33).setTva(0.12).setDraft(true));
		tabela.put(3, new Factura().setId(3).setSerie("CCC").setNumar("789").setDtEmitere(null).setDtScadenta(null).setSuma(6545).setTva(0.24).setDraft(true));
		
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
