package mapper;

import java.sql.Date;
import java.sql.ResultSet;

import model.thuoc;

public class thuocMapper implements rowMapper<thuoc> {

	public thuoc mapRow(ResultSet rs) {
		try {
			int idThuoc = rs.getInt("idThuoc");
			int idLoaiThuoc = rs.getInt("idLoaiThuoc");
			String tenThuoc = rs.getNString("tenThuoc");
			int soLuongTrongKho = rs.getInt("soLuongTrongKho");
			float doseMin = rs.getFloat("doseMin");
			float doseMax = rs.getFloat("doseMax");
			float frequency = rs.getFloat("frequency");
			Date ngayHetHan = rs.getDate("ngayHetHan");
			String moTaThuoc = rs.getNString("moTaThuoc");
			String donVi = rs.getNString("donVi");
			thuoc newThuoc = new thuoc(idThuoc, idLoaiThuoc, tenThuoc, soLuongTrongKho, doseMin, doseMax, frequency, ngayHetHan, moTaThuoc, donVi);
			return newThuoc;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
