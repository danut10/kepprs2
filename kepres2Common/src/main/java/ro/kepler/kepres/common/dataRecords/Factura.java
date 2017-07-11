package ro.kepler.kepres.common.dataRecords;

import java.util.Date;

public class Factura {

	private Integer id;
	private String serie;
	private Integer numar;
	private Date dtEmitere;
	private Date dtScadenta;
	private float suma;
	private float tva;
	private float total;
	private Boolean draft;
	private String memo;
	
	public Integer getId() { return id; }
	public Factura setId(Integer id) {	this.id = id; return this; }
	
	public String getSerie() { return serie; }
	public Factura setSerie(String serie) { this.serie = serie; return this; }
	
	public Integer getNumar() { return numar; }
	public Factura setNumar(Integer numar) { this.numar = numar; return this; }
	
	public Date getDtEmitere() { return dtEmitere; }
	public Factura setDtEmitere(Date dtEmitere) { this.dtEmitere = dtEmitere; return this; }
	
	public Date getDtScadenta() { return dtScadenta; }
	public Factura setDtScadenta(Date dtScadenta) { this.dtScadenta = dtScadenta; return this; }
	
	public float getSuma() { return suma; }
	public Factura setSuma(float suma) { this.suma = suma; return this; }
	
	public float getTva() { return tva; }
	public Factura setTva(float tva) { this.tva = tva; return this; }
	
	public float getTotal() { return total; }
	public Factura setTotal(float total) { this.total = total; return this; }
	
	public Boolean getDraft() { return draft; }
	public Factura setDraft(Boolean draft) { this.draft = draft; return this; }
	
	public String getMemo() { return memo; }
	public Factura setMemo(String memo) { this.memo = memo; return this; }
	
}
