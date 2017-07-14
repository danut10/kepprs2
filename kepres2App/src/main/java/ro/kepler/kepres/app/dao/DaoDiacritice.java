package ro.kepler.kepres.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ro.kepler.kepres.common.dataRecords.Diacritice;

public interface DaoDiacritice  {

	public List<Diacritice> readList();
	public Diacritice read(@Param("id") Integer id);
	public void delete(@Param("id") Integer id);
	public void update(@Param("record") Diacritice record);
	public void create(@Param("record") Diacritice record);

}