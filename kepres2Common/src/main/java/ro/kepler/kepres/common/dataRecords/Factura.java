package ro.kepler.kepres.common.dataRecords;

import java.util.Date;

public class Factura {

	private Integer id;
	private String serie;
	private Integer numar;
	private String dtEmitere;
	private String dtScadenta;
	private double suma;
	private double tva;
	private double total;
	private Boolean draft;
	private String memo;
	private Angajat angajat;
	
	public Integer getId() { return id; }
	public Factura setId(Integer id) {	this.id = id; return this; }
	
	public String getSerie() { return serie; }
	public Factura setSerie(String serie) { this.serie = serie; return this; }
	
	public Integer getNumar() { return numar; }
	public Factura setNumar(Integer numar) { this.numar = numar; return this; }
	
	public String getDtEmitere() { return dtEmitere; }
	public Factura setDtEmitere(String dtEmitere) { this.dtEmitere = dtEmitere; return this; }
	
	public String getDtScadenta() { return dtScadenta; }
	public Factura setDtScadenta(String dtScadenta) { this.dtScadenta = dtScadenta; return this; }
	
	public double getSuma() { return suma; }
	public Factura setSuma(double suma) { this.suma = suma; return this; }
	
	public double getTva() { return tva; }
	public Factura setTva(double tva) { this.tva = tva; return this; }
	
	public double getTotal() { return total; }
	public Factura setTotal(double total) { this.total = total; return this; }
	
	public Boolean getDraft() { return draft; }
	public Factura setDraft(Boolean draft) { this.draft = draft; return this; }
	
	public String getMemo() { return memo; }
	public Factura setMemo(String memo) { this.memo = memo; return this; }
	
	public Angajat getAngajat() { return angajat; }
	public Factura setAngajat(Angajat angajat) { this.angajat = angajat; return this; }
	
	
	
}
