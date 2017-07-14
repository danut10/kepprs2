package ro.kepler.kepres.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import ro.kepler.kepres.common.dataRecords.TestObject;

public interface DaoDiacritice  {

	public List<TestObject> readList();
	public TestObject read(@Param("id") Integer id);
	public void delete(@Param("id") Integer id);
	public void update(@Param("record") TestObject record);
	public void create(@Param("record") TestObject record);

}