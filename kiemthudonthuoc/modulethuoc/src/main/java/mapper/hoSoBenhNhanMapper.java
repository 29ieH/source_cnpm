package mapper;

import java.sql.Date;
import java.sql.ResultSet;

import model.hoSoBenhNhan;

public class hoSoBenhNhanMapper implements rowMapper<hoSoBenhNhan> {

	public hoSoBenhNhan mapRow(ResultSet rs) {
		try {
		int idHoSoBenhNhan = rs.getInt("idHoSoBenhNhan");
		String tenBenhNhan = rs.getNString("tenBenhNhan");
		int tuoi = rs.getInt("tuoi");
		String gioiTinh = rs.getNString("gioiTinh");
		String diaChi = rs.getNString("diaChi");
		String soDienThoai = rs.getString("soDienThoai");
		String nhomMau = rs.getString("nhomMau");
		float canNang = rs.getFloat("canNang");
		String benhLy = rs.getNString("benhLy");
		Date ngayKham = rs.getDate("ngayKham");
		int daTungDenKham = rs.getInt("daTungDenKham");
		hoSoBenhNhan newHSBN = new hoSoBenhNhan(idHoSoBenhNhan, tenBenhNhan, tuoi, gioiTinh, diaChi, soDienThoai, nhomMau, canNang, benhLy, ngayKham, daTungDenKham);
		return newHSBN;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
