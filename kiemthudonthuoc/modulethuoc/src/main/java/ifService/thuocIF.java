package ifService;

import java.util.List;

import model.chiTietDonThuoc;
import model.fakeModel;
import model.thuoc;

public interface thuocIF {
	List<String> listNameOfCtdt(List<chiTietDonThuoc> lctdt);
	thuoc getThuocById(int id);
	public String checkLieuDung(List<fakeModel> list);
}
