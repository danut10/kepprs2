package ro.kepler.kepres.common.dataRecords;

public class Angajat {
	
	private Integer id;
	private String cod;
	private String nume;
	private String memo;
	
	public Integer getId() { return id;	}
	public Angajat setId(Integer id) {	this.id = id; return this; }
	
	public String getCod() { return cod; }
	public Angajat setCod(String cod) { this.cod = cod; return this;}
	
	public String getNume() { return nume; }
	public Angajat setNume(String nume) { this.nume = nume; return this;}
	
	public String getMemo() { return memo; }
	public Angajat setMemo(String memo) { this.memo = memo; return this;}

}
