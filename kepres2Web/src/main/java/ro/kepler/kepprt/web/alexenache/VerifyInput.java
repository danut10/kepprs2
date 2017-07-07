package ro.kepler.kepprt.web.alexenache;

import javax.servlet.http.HttpServletRequest;

public class VerifyInput {
	
	private int branches;
	private int type;
	private boolean result;
	
	VerifyInput(HttpServletRequest request) {
		try {
			branches = Integer.parseInt(request.getParameter("numberOfBranches"));
			type = Integer.parseInt(request.getParameter("typeOfTree"));
			
			if(branches <= 0 || (type != 1 && type != 2)) {
				result = false;
				return;
			}
			
			result = true;
		}
		catch(Exception e) {
			result = false;
		}
	}

	public boolean getResult() { return result; }
	
	public int getBranches() { return branches; }
	
	public int getType() { return type; }
}
