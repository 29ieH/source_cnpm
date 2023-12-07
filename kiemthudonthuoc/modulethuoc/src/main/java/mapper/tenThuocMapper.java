package mapper;

import java.sql.Date;
import java.sql.ResultSet;

import model.thuoc;

public class tenThuocMapper implements rowMapper<thuoc> {

	public thuoc mapRow(ResultSet rs) {
		try {
			String tenThuoc = rs.getNString("tenThuoc");
			thuoc newThuoc = new thuoc(tenThuoc);
			return newThuoc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
