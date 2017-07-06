package ro.kepler.kepres2.consola.alexenache;
public class NormalTree implements Tree{
	
	private int branches;
	private int currentRow;
	private byte[][] treeMatrix;
	DataTree matrix;
	
	NormalTree(int branches) {
		
		this.branches = branches;
		this.currentRow = 0;
		treeMatrix = new byte[sum(branches + 1) + 1][2 * sum(branches) + 1];
		matrix = new DataTree();
		matrix.setHeigth(sum(branches + 1) + 1);
		matrix.setWidth(2 * sum(branches) + 1);
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

		createLength(sum(branches) - sum(row), (byte)0, 0);
		createLength(1, (byte)1, sum(branches) - sum(row));
		createLength(2 * sum(row), (byte)1, sum(branches) - sum(row) + 1);
		createLength(sum(branches) - sum(row), (byte)0, sum(branches) + sum(row) + 1);

	}

	private void createLength(int length, byte character, int start) {

		for (int k = 0; k < length; ++k) {
			treeMatrix[currentRow][k + start] = character;
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
