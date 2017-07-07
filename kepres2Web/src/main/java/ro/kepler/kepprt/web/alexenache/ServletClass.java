package ro.kepler.kepprt.web.alexenache;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletClass extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public ServletClass() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		VerifyInput input = new VerifyInput(request);
		
		if(input.getResult() == false) {
				response.sendRedirect("index.jsp");
		}
		else {
			
			Console console = new Console();
			console.write(input, response);
			
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
}
