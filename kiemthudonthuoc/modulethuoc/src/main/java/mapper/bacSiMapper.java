package mapper;

import java.sql.ResultSet;

import model.bacSi;

public class bacSiMapper implements rowMapper<bacSi> {

	public bacSi mapRow(ResultSet rs) {
		try {
			int idBacSi = rs.getInt("idBacSi");
			String taiKhoan = rs.getString("taiKhoan");
			String matKhau = rs.getString("matKhau");
			String tenBacSi = rs.getNString("tenBacSi");
			String gioiTinh = rs.getNString("gioiTinh");
			int tuoi = rs.getInt("tuoi");
			int trangThai = rs.getInt("trangThai");
			bacSi newBS = new bacSi(idBacSi, taiKhoan, matKhau, tenBacSi, gioiTinh, tuoi, trangThai);
			return newBS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
