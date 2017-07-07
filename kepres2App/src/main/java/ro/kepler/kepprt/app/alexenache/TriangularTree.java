package ro.kepler.kepprt.app.alexenache;
public class TriangularTree implements Tree {

	private int branches;
	private int currentRow;
	private byte[][] treeMatrix;
	DataTree matrix;
	
	public TriangularTree(int branches) {
		
		this.branches = branches;
		this.currentRow = 0;
		treeMatrix = new byte[sum(branches + 1) + 1][2 * branches + 1];
		matrix = new DataTree();
		matrix.setHeigth(sum(branches + 1) + 1);
		matrix.setWidth(2 * branches + 1);
		createTree();
	}

	
	public DataTree getDataTree() {
		return matrix;
	}
	
	/*
	 * Private functions below 
	*/
	
	private void createTree() {
		
		for (int i = 1; i <= branches; ++i) {
			
			createBranch(i);
		}
		
		createRoot();
		matrix.setTreeMatrix(treeMatrix);
	}

	private void createBranch(int branchNumber) {

		for (int j = 0; j <= branchNumber; ++j) {

			createRow(j);

			currentRow++;
		}
	}

	private void createRow(int row) {

		createLength(branches - row, (byte)0, 0);
		createLength(1, (byte)1, branches - row);
		createLength(2 * row, (byte)1, branches - row + 1);
		createLength(branches - row, (byte)0, branches + row + 1);

	}

	private void createLength(int length, byte i, int start) {

		for (int k = 0; k < length; ++k) {
			treeMatrix[currentRow][k + start] = i;
		}
	}
	
	private void createRoot() {
		
		createBranch(0);
		createBranch(0);		
	}
	
	private int sum(int number) {
		return number * (number + 1) / 2;
	}
}
