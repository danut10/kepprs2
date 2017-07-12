package ro.kepler.kepres.app.dao;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.springframework.stereotype.Component;

import ro.kepler.kepres.common.dataRecords.Atasament;

@Component
public class DaoAtasament1 {
	
	private Hashtable<Integer, Atasament> tabela;
	private Integer lastId = 3;
	
	public DaoAtasament1() {
		tabela = new Hashtable<>();
		tabela.put(1, new Atasament().setId(1).setTitlu("AEN").setMemo("Alex Enache"));
		tabela.put(2, new Atasament().setId(2).setTitlu("ATM").setMemo("Alex Toma"));
		tabela.put(3, new Atasament().setId(3).setTitlu("IBV").setMemo("Bogdan Visan"));
	}

	public List<Atasament> readList() {
		List<Atasament> recordList = new ArrayList<Atasament>(tabela.values());
		return recordList;
	}
	
	public Atasament read(Integer id) {
		Atasament record = tabela.get(id);
		return record;
	}

	public Integer create(Atasament atasament) {
		Integer id = ++lastId;
		atasament.setId(id);
		tabela.put(id, atasament);
		return id;
	}

	public void delete(Integer id) {
		tabela.remove(id);
		
	}

	public void update(Atasament atasament) {
		tabela.put(atasament.getId(), atasament);
	}
}
