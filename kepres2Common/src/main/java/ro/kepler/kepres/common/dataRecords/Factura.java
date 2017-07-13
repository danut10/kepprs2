package ro.kepler.kepres.common.dataRecords;

import java.util.Date;

public class Factura {

	private Integer id;
	private String serie;
	private String numar;
	private Date dtEmitere;
	private Date dtScadenta;
	private double suma;
	private double tva;
	private double total;
	private int draft;
	private String memo;
	private Angajat angajat;
	
	public Integer getId() { return id; }
	public Factura setId(Integer id) {	this.id = id; return this; }
	
	public String getSerie() { return serie; }
	public Factura setSerie(String serie) { this.serie = serie; return this; }
	
	public String getNumar() { return numar; }
	public Factura setNumar(String numar) { this.numar = numar; return this; }
	
	public Date getDtEmitere() { return dtEmitere; }
	public Factura setDtEmitere(Date dtEmitere) { this.dtEmitere = dtEmitere; return this; }
	
	public Date getDtScadenta() { return dtScadenta; }
	public Factura setDtScadenta(Date dtScadenta) { this.dtScadenta = dtScadenta; return this; }
	
	public double getSuma() { return suma; }
	public Factura setSuma(double suma) { this.suma = suma; return this; }
	
	public double getTva() { return tva; }
	public Factura setTva(double tva) { this.tva = tva; return this; }
	
	public double getTotal() { return total; }
	public Factura setTotal(double total) { this.total = total; return this; }
	
	public int getDraft() { return draft; }
	public Factura setDraft(int draft) { this.draft = draft; return this; }
	
	public String getMemo() { return memo; }
	public Factura setMemo(String memo) { this.memo = memo; return this; }
	
	public Angajat getAngajat() { return angajat; }
	public Factura setAngajat(Angajat angajat) { this.angajat = angajat; return this; }
}
