package ifService;

import java.util.List;

import model.bacSi;
import model.thuoc;

public interface bacSiIF {
	public List<bacSi> listAll();
	public bacSi getLogin(String taiKhoan,String matKhau);
	public bacSi getBacSiOfIddt(int idDt);
	
}
