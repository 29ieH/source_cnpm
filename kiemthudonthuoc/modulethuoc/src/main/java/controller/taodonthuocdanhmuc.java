package controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.donThuocDao;

/**
 * Servlet implementation class taodonthuocdanhmuc
 */
public class taodonthuocdanhmuc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public taodonthuocdanhmuc() {
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
			String idtStr = request.getParameter("idt");
			String idbnStr = request.getParameter("idbn");
			String idBs = request.getParameter("idbs");
			int idtInt = 0;
			int idbnInt = 0;
			int idBsInt = 0;
			try {
				idtInt = Integer.parseInt(idtStr);
				idbnInt = Integer.parseInt(idbnStr);
				idBsInt = Integer.parseInt(idBs);
				int iddt = new donThuocDao().createDonThuoc(idbnInt,idBsInt);
				if(iddt!=0) {
					ServletContext context = getServletContext();
					context.setAttribute("idT", idtInt);
					context.setAttribute("idDT", iddt);
					response.sendRedirect("/module/views/taodonthuocct.jsp");
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
