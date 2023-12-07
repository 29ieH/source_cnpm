package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ServiceImp.hoSoBenhNhamImp;
import model.hoSoBenhNhan;

/**
 * Servlet implementation class dtbhsbn
 */
@WebServlet("/dtb-hsbn")
public class dtbhsbn extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dtbhsbn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		String methods =  request.getParameter("methods");
		String name = request.getParameter("name");
		String pageStr = request.getParameter("page");
		String maxItemsPageStr = request.getParameter("maxItemsPage");
		int page = 1;
		int maxItemsPage = 5;
		List<hoSoBenhNhan> listResult = new ArrayList<hoSoBenhNhan>();
		try {
			page = Integer.parseInt(pageStr);
			maxItemsPage = Integer.parseInt(maxItemsPageStr);
			int totalPage = 0;
			int totalItems = new hoSoBenhNhamImp().count();
			int offset = (page-1)*maxItemsPage;
			listResult = new hoSoBenhNhamImp().listOfIndex(offset, maxItemsPage);
//			Tính tổng page
			if(totalItems%maxItemsPage!=0) {
				 totalPage = (totalItems/maxItemsPage)+1;
			}else {
				 totalPage = totalItems/maxItemsPage;
			}
			ServletContext context = getServletContext();
			request.setAttribute("currentPage", page);
			request.setAttribute("totalPage", totalPage);
			request.setAttribute("listResult", listResult);
			RequestDispatcher rsd = request.getRequestDispatcher("/views/home.jsp"); 
			rsd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
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
