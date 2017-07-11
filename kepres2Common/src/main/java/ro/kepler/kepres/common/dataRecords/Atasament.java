package ro.kepler.kepres.common.dataRecords;

import java.util.Date;

public class Atasament {
	private Integer id;
	private String titlu;
	private String url;
	private Date dtUpload;
	private String memo;
	private TipFisier tipFisier;
	private Angajat angajat;
	
	public Integer getId() { return id; }
	public Atasament setId(Integer id) { this.id = id; return this; }
	
	public String getTitlu() { return titlu; }
	public Atasament setTitlu(String titlu) { this.titlu = titlu; return this; }
	
	public String getUrl() { return url; }
	public Atasament setUrl(String url) { this.url = url; return this; }
	
	public Date getDtUpload() { return dtUpload; }
	public Atasament setDtUpload(Date dtUpload) { this.dtUpload = dtUpload; return this; }
	
	public String getMemo() { return memo; }
	public Atasament setMemo(String memo) { this.memo = memo; return this; }
	
	public TipFisier getTipFisier() { return tipFisier; }
	public Atasament setTipFisier(TipFisier tipFisier) {	this.tipFisier = tipFisier;	return this; }
	
	public Angajat getAngajat() { return angajat; }
	public Atasament setAngajat(Angajat angajat) { this.angajat = angajat; return this; }
	
	
	
}
