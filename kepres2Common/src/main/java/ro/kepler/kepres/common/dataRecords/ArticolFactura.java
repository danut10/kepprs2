package ro.kepler.kepres.common.dataRecords;

import java.util.Date;

public class ArticolFactura {

	private String factura;
	private Integer nrCrt;
	private String um;
	private Integer cantiatea;
	private double pret_unitar;
	private double suma;
	private double tva;
	private double total;
	private String descriere;

	public String getFactura() { return factura; }
    public ArticolFactura setFactura(String factura) { this.factura = factura; return this; }

	public Integer getNrCrt() { return nrCrt; }
    public ArticolFactura setNrCrt(Integer nrCrt) { this.nrCrt = nrCrt; return this; }

	public String getUm() { return um; }
    public ArticolFactura setUm(String um) { this.um = um; return this; }

	public Integer getCantiatea() { return cantiatea; }
    public ArticolFactura setCantiatea(Integer cantiatea) { this.cantiatea = cantiatea; return this; }

	public double getPret_unitar() { return pret_unitar; }
    public ArticolFactura setPret_unitar(double pret_unitar) { this.pret_unitar = pret_unitar; return this; }

	public double getSuma() { return suma; }
    public ArticolFactura setSuma(double suma) { this.suma = suma; return this; }

	public double getTva() { return tva; }
    public ArticolFactura setTva(double tva) { this.tva = tva; return this; }

	public double getTotal() { return total; }
    public ArticolFactura setTotal(double total) { this.total = total; return this; }

	public String getDescriere() { return descriere; }
    public ArticolFactura setDescriere(String descriere) { this.descriere = descriere; return this; }

}
