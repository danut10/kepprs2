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
	public void setId(Integer id) {	this.id = id; }
	
	public String getSerie() { return serie; }
	public void setSerie(String serie) { this.serie = serie; }
	
	public Integer getNumar() { return numar; }
	public void setNumar(Integer numar) { this.numar = numar; }
	
	public Date getDtEmitere() { return dtEmitere; }
	public void setDtEmitere(Date dtEmitere) { this.dtEmitere = dtEmitere; }
	
	public Date getDtScadenta() { return dtScadenta; }
	public void setDtScadenta(Date dtScadenta) { this.dtScadenta = dtScadenta; }
	
	public float getSuma() { return suma; }
	public void setSuma(float suma) { this.suma = suma; }
	
	public float getTva() { return tva; }
	public void setTva(float tva) { this.tva = tva; }
	
	public float getTotal() { return total; }
	public void setTotal(float total) { this.total = total; }
	
	public Boolean getDraft() { return draft; }
	public void setDraft(Boolean draft) { this.draft = draft; }
	
	public String getMemo() { return memo; }
	public void setMemo(String memo) { this.memo = memo; }
	
}
