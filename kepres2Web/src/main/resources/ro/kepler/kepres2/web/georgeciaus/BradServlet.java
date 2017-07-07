
public class BradServlet {

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ro.kepler.kepres2.consola.george.Brad;

public class BradServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BradServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		int nrRamuri = Integer.parseInt(request.getParameter("nrRamuri"));
		Brad brad = new Brad(nrRamuri());
		for (int i = 0; i < brad.nrLinii + 2; i++) {
			for (int j = 0; j < brad.nrColoane; j++)
				out.print(brad.matrice[i][j]);
			out.println();
		}
	}

}}

@Override  
protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
        throws ServletException, IOException {  
    doPost(req, resp);  
}
}