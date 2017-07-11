package ro.kepler.kepres.common.dataRecords;

public class CotaTVA {
	
	private Integer id;
	private String cod;
	private String nume;
	private double procent;
	private String memo;
	
	public Integer getId() { return id; }
	public CotaTVA setId(Integer id) { this.id = id; return this; }
	
	public String getCod() { return cod; }
	public CotaTVA setCod(String cod) { this.cod = cod; return this; }
	
	public String getNume() { return nume; }
	public CotaTVA setNume(String nume) { this.nume = nume; return this; }
	
	public double getProcent() { return procent; }
	public CotaTVA setProcent(double procent) { this.procent = procent; return this; }
	
	public String getMemo() { return memo; }
	public CotaTVA setMemo(String memo) { this.memo = memo; return this; }
	
}
