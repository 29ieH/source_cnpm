package ifService;

import java.util.List;

import model.donThuoc;

public interface donThuocIF {
	List<donThuoc> listOfBn(int id);
	public int createDonThuoc(int idbn,int idbs);
	public boolean delete(int iddt);
}
