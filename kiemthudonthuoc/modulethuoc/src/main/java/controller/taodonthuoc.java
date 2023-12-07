package controller;

import java.io.IOException;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ServiceImp.thuocImp;
import dao.chiTietDTDao;
import dao.donThuocDao;
import dao.thuocDao;
import model.chiTietDonThuoc;
import model.fakeModel;
import model.thuoc;

/**
 * Servlet implementation class taodonthuoc
 */
public class taodonthuoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public taodonthuoc() {
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
			String idbn = request.getParameter("idbn");
			String idbs = request.getParameter("idbs");
			String tenThuoc = request.getParameter("name");
			String doseStr = request.getParameter("dose");
			String frequencyStr = request.getParameter("frequency");
			String amountStr = request.getParameter("amount");
			String comment = request.getParameter("comments");
			float dose = 0;
			float frequency = 0;
			int amount = 0;
			int idbnInt =0;
			int idbsInt =0;
			try {
				String error ="";
				List<thuoc> listResult = new thuocDao().listOfName(tenThuoc);
				dose = Float.parseFloat(doseStr);
				frequency = Float.parseFloat(frequencyStr);
				amount = Integer.parseInt(amountStr);
				idbnInt = Integer.parseInt(idbn);
				idbsInt = Integer.parseInt(idbs);
				int idThuoc = 0;
				if(listResult!=null) {
					thuoc rsThuoc = listResult.get(0);
					if(dose<rsThuoc.getDoseMin()) {
						error +="Liều dùng quá thấp !";
					}else if(dose>rsThuoc.getDoseMax()) {
						error +="Liều dùng quá cao !";
					}else if(frequency>rsThuoc.getFrequency()) {
						error +="Tần suất dùng quá cao !";
					}else if((dose*frequency)<1||(dose*frequency)>(rsThuoc.getDoseMax()*rsThuoc.getFrequency())) {
						error +="Số lượng chỉ định thuốc không phù hợp";
					}
					idThuoc = rsThuoc.getIdThuoc();
				}
				if(error.length()>0) {
					request.setAttribute("notifi", error);
					RequestDispatcher rsd = request.getRequestDispatcher("/views/themthuocmoi.jsp");
					rsd.forward(request, response);
				}else {
					int iddt = new donThuocDao().createDonThuoc(idbnInt, idbsInt);
					boolean check = false;
					check = new chiTietDTDao().addctdt(iddt,idThuoc, dose, frequency, amount, comment);
					if(check) {
						List<chiTietDonThuoc> listOfId = new chiTietDTDao().listOfIdDt(iddt);
						List<String> listTenThuoc = new thuocImp().listNameOfCtdt(listOfId);
						ServletContext context = getServletContext();
						context.setAttribute("listName", listTenThuoc);
						context.setAttribute("listOfId", listOfId);
						response.sendRedirect("/modulethuoc/views/themthuocmoi.jsp");
					}
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
