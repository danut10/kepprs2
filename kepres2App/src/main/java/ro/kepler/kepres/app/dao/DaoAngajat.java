package ro.kepler.kepres.app.dao;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.springframework.stereotype.Component;

import ro.kepler.kepres.common.dataRecords.Angajat;

@Component
public class DaoAngajat {
	
	private Hashtable<Integer, Angajat> tabela;
	private Integer lastId = 3;
	
	public DaoAngajat() {
		tabela = new Hashtable<>();
		tabela.put(1, new Angajat().setId(1).setCod("AEN").setNume("Alex Enache"));
		tabela.put(2, new Angajat().setId(2).setCod("ATM").setNume("Alex Toma"));
		tabela.put(3, new Angajat().setId(3).setCod("IBV").setNume("Bogdan Visan"));
	}

	public List<Angajat> readList() {
		List<Angajat> recordList = new ArrayList<Angajat>(tabela.values());
		return recordList;
	}
	
	public Angajat read(Integer id) {
		Angajat record = tabela.get(id);
		return record;
	}

	public Integer create(Angajat angajat) {
		Integer id = ++lastId;
		angajat.setId(id);
		tabela.put(id, angajat);
		return id;
	}

	public void delete(Integer id) {
		tabela.remove(id);
		
	}

	public void update(Angajat angajat) {
		tabela.put(angajat.getId(), angajat);
	}
}
