package bubbasoft.possum.servlet;

import java.io.IOException;

import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EvaluateServlet
 */
public class EvaluateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EvaluateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.addHeader("Content-type", "text/plain");
		/* This is PROBABLY not the right way to do this - you could probably
		 * share the engines and making them would be cheaper
		 */
		ScriptEngine jython = new ScriptEngineManager().getEngineByName("python");
		ScriptContext ctx = jython.getContext();
		ctx.setWriter(response.getWriter());
		ctx.setAttribute("PEOPLE", request.getSession(true).getAttribute("PEOPLE"), ScriptContext.ENGINE_SCOPE);
		try {
		  jython.eval(request.getParameter("script"));
		} catch (Exception e) {
		  e.printStackTrace(response.getWriter());
		}
	}
}
