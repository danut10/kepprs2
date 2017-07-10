package ro.kepler.kepres.common.dataRecords;

import java.util.Date;

public class Atasament {
	private Integer id;
	private String titlu;
	private String url;
	private Date dtUpload;
	private String memo;
	
	public Integer getId() { return id; }
	public void setId(Integer id) { this.id = id; }
	
	public String getTitlu() { return titlu; }
	public void setTitlu(String titlu) { this.titlu = titlu; }
	
	public String getUrl() { return url; }
	public void setUrl(String url) { this.url = url; }
	
	public Date getDtUpload() { return dtUpload; }
	public void setDtUpload(Date dtUpload) { this.dtUpload = dtUpload; }
	
	public String getMemo() { return memo; }
	public void setMemo(String memo) { this.memo = memo; }
	
}
