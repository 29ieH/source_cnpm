package ServiceImp;

import java.util.List;

import dao.donThuocDao;
import ifService.donThuocIF;
import model.donThuoc;

public class donThuocImp implements donThuocIF {

	public List<donThuoc> listOfBn(int id) {
		return new donThuocDao().listOfBn(id);
	}

	public int createDonThuoc(int idbn, int idbs) {
		return new donThuocDao().createDonThuoc(idbn, idbs);
	}

	public boolean delete(int iddt) {
		return new donThuocDao().deleteDonThuoc(iddt);
	}
}
