

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    private String message;
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	message="This is my first servlet";
    	
    }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>"+message+"</h1>");
		//String username=request.getParameter("uname");
		//String password=request.getParameter("pwd");
		String search=request.getParameter("search");
		//out.println("<h2>"+username+"</h2>");
		//out.println("<h2>"+password+"</h2>");
		response.sendRedirect("https://www.google.com/search?q="+search);
		/*if(username.equals("admin"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("Loginservelet");
			rd.forward(request, response);
		}
		else
		{
			out.println("Not a valid username");
			RequestDispatcher rd=request.getRequestDispatcher("/login.html");
			rd.include(request, response);
		}*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

}

