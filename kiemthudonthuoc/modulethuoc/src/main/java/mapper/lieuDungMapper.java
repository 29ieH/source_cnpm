package mapper;

import java.sql.ResultSet;

import model.lieuDung;

public class lieuDungMapper implements rowMapper<lieuDung> {

	public lieuDung mapRow(ResultSet rs) {
		try {
			int idLieuDung = rs.getInt("idLieuDung");
			int idThuoc = rs.getInt("idThuoc");
			float lieuDungMaxMotLan = rs.getFloat("lieuDungMaxTrenMotLan");
			float tanSoSuDungMaxTrenNgay = rs.getFloat("tanSoSuDungMaxTrenNgay");
			String donVi = rs.getNString("donVi");
			String doiTuongSuDung = rs.getNString("doiTuongSuDung");
			lieuDung newLieuDung = new lieuDung(idLieuDung, idThuoc, lieuDungMaxMotLan, tanSoSuDungMaxTrenNgay, donVi, doiTuongSuDung);
			return newLieuDung;
		} catch (Exception e) {
			return null;
		}
	}

}
