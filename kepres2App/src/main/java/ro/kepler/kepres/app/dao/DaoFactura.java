package ro.kepler.kepres.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ro.kepler.kepres.common.dataRecords.Factura;


public interface DaoFactura  {

	public List<Factura> readList();
	public Factura read(@Param("id") Integer id);
	public void delete(@Param("id") Integer id);
	public void update(@Param("record") Factura record);
	public void create(@Param("record") Factura record);

}
