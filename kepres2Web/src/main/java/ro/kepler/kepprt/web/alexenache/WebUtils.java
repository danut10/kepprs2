package ro.kepler.kepprt.web.alexenache;

import ro.kepler.kepprt.kepres2.app.alexenache.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebUtils {

	public Tree readTree(HttpServletRequest request) throws Exception {
		
		int branches = Integer.parseInt(request.getParameter("numberOfBranches"));
		int type = Integer.parseInt(request.getParameter("typeOfTree"));
			
		if(branches <= 0 || (type != 1 && type != 2)) {
			throw(new Exception());
		}
		
		if(type == 1) {
			return new NormalTree(branches);
		}
		else {
			return new TriangularTree(branches);
		}
	}
	
	public void writeTree(Tree tree, HttpServletResponse response) throws ServletException, IOException {
		
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
