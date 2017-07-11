package ro.kepler.kepres.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import ro.kepler.kepres.common.dataRecords.Angajat;

public interface DaoAngajat  {

	public List<Angajat> readList();
	public Angajat read(@Param("id") Integer id);
	public void delete(@Param("id") Integer id);
	public void update(@Param("record") Angajat record);
	public void create(@Param("record") Angajat record);

}
