package mapper;

import java.sql.ResultSet;

import model.chiTietDonThuoc;

public class chiTietDonThuocMapper implements rowMapper<chiTietDonThuoc> {

	public chiTietDonThuoc mapRow(ResultSet rs) {
		try {
			int idDonThuoc = rs.getInt("idDonThuoc");
			int idThuoc = rs.getInt("idThuoc");
			float soLuongUongTrenMotLan = rs.getFloat("dose");
			float soLanUongTrenMotNgay = rs.getFloat("frequency");
			int soLuongMua = rs.getInt("soLuong");
			String danDoCuaBacSy = rs.getNString("danDoCuaBacSi");
			chiTietDonThuoc newCTDT = new chiTietDonThuoc(idDonThuoc, idThuoc, soLuongUongTrenMotLan, soLanUongTrenMotNgay, soLuongMua, danDoCuaBacSy);
			return newCTDT;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}