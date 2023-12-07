package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.loaiThuocDao;
import dao.thuocDao;
import model.loaiThuoc;
import model.thuoc;

/**
 * Servlet implementation class danhmucthuoc
 */
public class danhmucthuoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public danhmucthuoc() {
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
		List<loaiThuoc> allLoaiThuoc = new loaiThuocDao().listAll();
		if(allLoaiThuoc!=null) {
		ServletContext context = getServletContext();
		context.setAttribute("listLoaiThuoc", allLoaiThuoc);
		response.sendRedirect("/modulethuoc/views/danhmucthuoc.jsp");
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
