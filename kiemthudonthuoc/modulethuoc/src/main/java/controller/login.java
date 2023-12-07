package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ServiceImp.bacSiImp;
import model.bacSi;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String taiKhoan = request.getParameter("taikhoan");
		String matKhau = request.getParameter("matkhau");
		bacSi result = new bacSiImp().getLogin(taiKhoan, matKhau);
		if(result!=null) {
			HttpSession session = request.getSession();
			session.setAttribute("modelBS", result);
			response.sendRedirect("/modulethuoc/dtb-hsbn?page=1&maxItemsPage=3");
		}else {
			String error = "Đăng nhập thất bại !.Vui lòng kiểm tra lại tài khoản hoặc mật khẩu";
			request.setAttribute("error",error);
			RequestDispatcher rsd = request.getRequestDispatcher("/index.jsp");
			rsd.forward(request, response);
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