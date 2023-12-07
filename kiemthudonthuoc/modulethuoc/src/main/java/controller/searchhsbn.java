package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ServiceImp.hoSoBenhNhamImp;
import model.hoSoBenhNhan;

/**
 * Servlet implementation class searchhsbn
 */
public class searchhsbn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchhsbn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(false);
		if(session!=null) {
			String name = request.getParameter("name");
			String namez = "%"+name+"%";
			List<hoSoBenhNhan> listOfName = new hoSoBenhNhamImp().listOfName(namez);
			if(listOfName!=null) {
				ServletContext context = getServletContext();
				context.setAttribute("nameSearch", name);
				context.setAttribute("listOfName", listOfName);
				response.sendRedirect("/modulethuoc/views/searchhosobenhnhan.jsp");
			}else {
				response.sendRedirect("/modulethuoc/views/searchhosobenhnhan.jsp");
			}
	 }
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
