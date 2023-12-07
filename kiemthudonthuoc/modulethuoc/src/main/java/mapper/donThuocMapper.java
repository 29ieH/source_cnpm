package mapper;

import java.sql.Date;
import java.sql.ResultSet;

import model.donThuoc;

public class donThuocMapper implements rowMapper<donThuoc> {

	public donThuoc mapRow(ResultSet rs) {
		try {
			int idDonThuoc = rs.getInt("idDonThuoc");
			int idHoSoBenhNhan = rs.getInt("idHoSoBenhNhan");
			Date ngayKeDon = rs.getDate("ngayKeDon");
			donThuoc newDonThuoc = new donThuoc(idDonThuoc, idHoSoBenhNhan, ngayKeDon);
			return newDonThuoc;
		} catch (Exception e) {
			return null;
		}
	}

}
