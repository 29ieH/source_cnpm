package mapper;

import java.sql.ResultSet;

import model.loaiThuoc;

public class loaiThuocMapper implements rowMapper<loaiThuoc>  {

	public loaiThuoc mapRow(ResultSet rs) {
		try {
			int idLoaiThuoc = rs.getInt("idLoaiThuoc");
			String tenLoaiThuoc = rs.getNString("tenLoaiThuoc");
			loaiThuoc newLoaiThuoc = new loaiThuoc(idLoaiThuoc, tenLoaiThuoc);
			return newLoaiThuoc;
		} catch (Exception e) {
			return null;
		}
	}

}
