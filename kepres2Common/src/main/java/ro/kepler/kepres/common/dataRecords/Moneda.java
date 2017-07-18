package ro.kepler.kepres.common.dataRecords;

public class Moneda {

	private Integer id;
	private String cod;
	private String nume;
	private Boolean implicita;
	private Boolean referinta;
	
	public Integer getId() { return id; }
	public Moneda setId(Integer id) { this.id = id; return this; }
	
	public String getCod() { return cod; }
	public Moneda setCod(String cod) { this.cod = cod; return this; }
	
	public Boolean getImplicita() {	return implicita; }
	public Moneda setImplicita(Boolean implicita) { this.implicita = implicita; return this; }
	
	public Boolean getReferinta() {	return referinta; }
	public Moneda setReferinta(Boolean referinta) { this.referinta = referinta; return this; }
	
	public String getNume() { return nume; }
	public Moneda setNume(String nume) { this.nume = nume; return this; }
	
}
