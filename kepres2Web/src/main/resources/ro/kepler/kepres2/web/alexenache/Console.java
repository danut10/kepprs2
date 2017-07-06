package ro.kepler.kepres2.web.alexenache;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

public class Console {

	public void write(VerifyInput input, HttpServletResponse response) throws ServletException, IOException {
		
		Tree tree;
		if(input.getType() == 1) {
			tree = new NormalTree(input.getBranches());
		}
		else {
			tree = new TriangularTree(input.getBranches());
		}
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<style>");
		out.println("body {");
		out.println("font-family: monospace;");
		out.println("}");
		out.println("</style");
		out.println("<body>");
		DataTree dataTree = tree.getDataTree();
		byte[][] treeMatrix = dataTree.getTreeMatrix();
		char background = dataTree.getBackground();
		for(int i = 0; i < dataTree.getHeigth(); ++i) {
			
			for(int j = 0; j < dataTree.getWidth(); ++j) {
				//System.out.print(treeMatrix[i][j]);
				if(treeMatrix[i][j] == 0) {
					if(background == ' '){
						out.print("&nbsp;");
					}
					else {
						out.print(background);
					}
				}
				else {
					out.print(dataTree.getForeground());
				}
			}
			out.print("<br>");
			//System.out.println();
		}
		

		out.println("</html>");
		out.println("</body>");
	}
}
