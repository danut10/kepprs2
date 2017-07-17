package ro.kepler.kepres.common.utils;

public class Sorter {
	public String sorterField;
	public String sorterDirection;
	
	public Sorter() { }
	
	public Sorter(String fieldName, String direction) {
		this.sorterField = fieldName;
		this.sorterDirection = direction;
	}
	
	public String getSorterField() { return sorterField; }
	public void setSorterField(String fieldName) { this.sorterField = fieldName; }

	public String getSorterDirection() { return sorterDirection; }
	public void setSorterDirection(String direction) { this.sorterDirection = direction; }
}

