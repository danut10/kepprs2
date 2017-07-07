package ro.kepler.kepprt.web.alexenache;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.kepler.kepprt.app.alexenache.Tree;

public class ServletTree extends HttpServlet {
	
//    public ServletClass() {
//        super();
//    }
//    

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			WebUtils utils = new WebUtils();
			Tree tree = utils.readTree(request);
			utils.writeTree(tree, response);
		} catch (Exception e) {
			response.sendRedirect("index.jsp");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
}
