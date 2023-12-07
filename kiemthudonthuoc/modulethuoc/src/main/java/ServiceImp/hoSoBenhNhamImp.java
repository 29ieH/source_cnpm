package ServiceImp;

import java.util.List;

import dao.hsbnDao;
import ifService.hoSoBenhNhanIF;
import model.hoSoBenhNhan;

public class hoSoBenhNhamImp implements hoSoBenhNhanIF {

	public List<hoSoBenhNhan> listAll() {
		return new hsbnDao().listAll();
	}

	public List<hoSoBenhNhan> listOfIndex(int offset, int maxItemsPage) {
		return new hsbnDao().listOffIndex(offset, maxItemsPage);
	}

	public int count() {
		return new hsbnDao().countAll();
	}

	public List<hoSoBenhNhan> listOfName(String name) {
		return new hsbnDao().findOfName(name);
	}

	public hoSoBenhNhan findByOne(int id) {
		List<hoSoBenhNhan> result = new hsbnDao().findOfById(id);
		if(result!=null) {
			return result.get(0);	
		}
		return null;
	}
}
