package ifService;

import java.util.List;

import model.chiTietDonThuoc;
import model.fakeModel;

public interface chiTietDonThuocIF {
	public List<chiTietDonThuoc> listOfIdDt(int iddt);
	public boolean createCTDT(List<fakeModel> list);
}
