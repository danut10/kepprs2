package ro.kepler.kepres.common.dataRecords;

public class TipFisier {

	private Integer id;
	private String nume;
	private String extensii;
	
	public Integer getId() { return id; }
	public void setId(Integer id) {	this.id = id; }
	
	public String getNume() { return nume; }
	public void setNume(String nume) { this.nume = nume; }
	
	public String getExtensii() { return extensii; }
	public void setExtensii(String extensii) { this.extensii = extensii; }
	
	@Override
	public String toString() {
		return "TipFisier [id=" + id + ", nume=" + nume + ", extensii=" + extensii + "]";
	}

}
