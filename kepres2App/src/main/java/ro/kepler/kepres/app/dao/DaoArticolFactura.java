package ro.kepler.kepres.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ro.kepler.kepres.common.dataRecords.ArticolFactura;
import ro.kepler.kepres.common.dataRecords.Factura;


public interface DaoArticolFactura  {

	public List<ArticolFactura> readList();
	public ArticolFactura read(@Param("factura") String factura);
	public void delete(@Param("factura") String factura);
	public void update(@Param("record") ArticolFactura record);
	public void create(@Param("record") ArticolFactura record);

}