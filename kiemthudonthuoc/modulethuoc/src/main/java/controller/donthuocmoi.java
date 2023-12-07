package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ServiceImp.hoSoBenhNhamImp;
import dao.thuocDao;
import model.hoSoBenhNhan;
import model.thuoc;

/**
 * Servlet implementation class donthuocmoi
 */
public class donthuocmoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public donthuocmoi() {
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
			String idBnStr = request.getParameter("idBn");
			int idBnInt = 0;
			try {
				idBnInt = Integer.parseInt(idBnStr);
				hoSoBenhNhan hsbn = new hoSoBenhNhamImp().findByOne(idBnInt);
				if(hsbn!=null) {
					List<thuoc> listThuoc = new thuocDao().listAll();
					ServletContext context = getServletContext();
					context.setAttribute("hsbn", hsbn);
					context.setAttribute("listThuoc", listThuoc);
					response.sendRedirect("/modulethuoc/views/themthuocmoi.jsp");
				}
			} catch (Exception e) {
				// TODO: handle exception
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
