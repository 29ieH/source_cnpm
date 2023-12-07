package ifService;

import java.util.List;

import model.hoSoBenhNhan;

public interface hoSoBenhNhanIF {
	List<hoSoBenhNhan> listAll();
	List<hoSoBenhNhan> listOfIndex(int offset,int maxItemsPage);
	int count();
	List<hoSoBenhNhan> listOfName(String name);
	hoSoBenhNhan findByOne(int id);
}
