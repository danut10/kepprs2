package ro.kepler.kepprt.kepres2.app.alexenache;

public class DataTree {

	private int heigth;
	private int width;
	private byte[][] treeMatrix;
	private char background = ' ';
	private char foreground = '*';
	
	public int getHeigth() { return heigth; }
	public void setHeigth(int heigth) { this.heigth = heigth; }
	
	public int getWidth() { return width; }
	public void setWidth(int width) { this.width = width; }
	
	public byte[][] getTreeMatrix() { return treeMatrix; }
	public void setTreeMatrix(byte[][] treeMatrix) { this.treeMatrix = treeMatrix; }
	
	public char getBackground() { return background; }
	public void setBackground(char background) { this.background = background; }
	
	public char getForeground() { return foreground; }
	public void setForeground(char foreground) { this.foreground = foreground; }
	
}
