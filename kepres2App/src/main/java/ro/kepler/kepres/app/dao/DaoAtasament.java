package ro.kepler.kepres.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import ro.kepler.kepres.common.dataRecords.Atasament;

public interface DaoAtasament  {

	public List<Atasament> readList();
	public Atasament read(@Param("id") Integer id);
	public void delete(@Param("id") Integer id);
	public void update(@Param("record") Atasament record);
	public void create(@Param("record") Atasament record);

}
