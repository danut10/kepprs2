package ro.kepler.kepprt.web.bogdanvisan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.kepler.kepres.app.bogdan.Tree;

/**
 * Servlet implementation class TreeServlet
 */
public class TreeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");

    PrintWriter out = response.getWriter();

    String nrRamuri;
    
    nrRamuri = request.getParameter("nrRamuri");
    
	Tree tree = new Tree(Integer.parseInt(nrRamuri));
	
	Consola console = new Consola();
	
	console.showTree(tree, out);
	
	
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
