package ro.kepler.kepres.common.utils;

public class DataQuery {
	
	private DataFilter filter;
	private Sorter sorter;
	
	public DataQuery() { }
	
	public DataFilter getFilter() { return filter; }
	public DataQuery setFilter(DataFilter filter) { this.filter = filter; return this; }

	public Sorter getSorter() { return sorter; }
	public DataQuery setSorter(Sorter sorter) { this.sorter = sorter; return this; }

}

