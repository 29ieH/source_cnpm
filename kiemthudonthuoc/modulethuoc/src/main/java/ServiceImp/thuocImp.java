package ServiceImp;

import java.util.List;

import dao.thuocDao;
import ifService.thuocIF;
import model.chiTietDonThuoc;
import model.fakeModel;
import model.thuoc;

public class thuocImp implements thuocIF {
	public List<String> listNameOfCtdt(List<chiTietDonThuoc> lctdt) {
		return new thuocDao().nameOfId(lctdt);
	}

	public thuoc getThuocById(int id) {
		return new thuocDao().ThuocOfId(id);
	}

	public String checkLieuDung(List<fakeModel> list) {
		return new thuocDao().checkLieuDung(list);
	}
}
