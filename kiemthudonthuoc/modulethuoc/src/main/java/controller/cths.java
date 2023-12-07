package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ServiceImp.donThuocImp;
import ServiceImp.hoSoBenhNhamImp;
import model.donThuoc;
import model.hoSoBenhNhan;

/**
 * Servlet implementation class cths
 */
public class cths extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cths() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String idStr = request.getParameter("id");
		int idInt = 0;
		try {
			idInt = Integer.parseInt(idStr);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		hoSoBenhNhan model = new hoSoBenhNhamImp().findByOne(idInt);
		if(model!=null) {
			List<donThuoc> listDonThuoc = new donThuocImp().listOfBn(idInt);
			ServletContext context = getServletContext();
			context.setAttribute("model", model);
			if(listDonThuoc!=null) {
				context.setAttribute("listDonThuoc", listDonThuoc);
			}
			response.sendRedirect("/modulethuoc/views/chitiethosobn.jsp");
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
