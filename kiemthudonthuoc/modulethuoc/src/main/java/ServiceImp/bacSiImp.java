package ServiceImp;

import java.util.List;

import dao.bacSiDao;
import ifService.bacSiIF;
import model.bacSi;

public class bacSiImp implements bacSiIF {

	public List<bacSi> listAll() {
		return new bacSiDao().listAll();
	}

	public bacSi getLogin(String taiKhoan, String matKhau) {
		return new bacSiDao().Login(taiKhoan, matKhau);
	}

	public bacSi getBacSiOfIddt(int idDt) {
		List<bacSi> result = new bacSiDao().getByIdDt(idDt); 
		if(result!=null) {
			return result.get(0);	
		}
		return null;
	}
	public static void main(String[] args) {
		int id = 3;
		bacSi rs = new bacSiImp().getBacSiOfIddt(id);
		System.out.println(rs);
	}
}
