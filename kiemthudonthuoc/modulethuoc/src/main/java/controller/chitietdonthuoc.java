package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ServiceImp.bacSiImp;
import ServiceImp.chiTietDonThuocImp;
import ServiceImp.thuocImp;
import model.bacSi;
import model.chiTietDonThuoc;

/**
 * Servlet implementation class chitietdonthuoc
 */
public class chitietdonthuoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public chitietdonthuoc() {
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
			String idDonThuoc = request.getParameter("iddt");
			String idBenhNhan = request.getParameter("idbn");
			int idDonThuocInt = 0;
			int idBenhNhanInt = 0;
			try {
				idDonThuocInt = Integer.parseInt(idDonThuoc);
				idBenhNhanInt = Integer.parseInt(idBenhNhan);
				List<chiTietDonThuoc> listctdt = new chiTietDonThuocImp().listOfIdDt(idDonThuocInt);
				if(listctdt!=null) {
					List<String> tenThuoc = new thuocImp().listNameOfCtdt(listctdt);
					bacSi bacSi = new bacSiImp().getBacSiOfIddt(idDonThuocInt);
					ServletContext context = getServletContext();
					context.setAttribute("listCtdt", listctdt);
					context.setAttribute("listName", tenThuoc);
					context.setAttribute("bacSi", bacSi);
					System.out.println(tenThuoc);
					response.sendRedirect("/modulethuoc/views/chitietdonthuoc.jsp");
				}else {
					response.sendRedirect("/modulethuoc/views/chitietdonthuoc.jsp");
				}
			} catch (Exception e) {
				e.printStackTrace();
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
