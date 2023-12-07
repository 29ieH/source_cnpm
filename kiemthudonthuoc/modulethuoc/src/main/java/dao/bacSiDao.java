package dao;

import java.util.ArrayList;
import java.util.List;

import mapper.bacSiMapper;
import model.bacSi;

public class bacSiDao extends abstractDao<bacSi>{
	public List<bacSi> listAll(){
		String sql = "Select * from bacSi";
		return query(sql, new bacSiMapper());
	}
	public bacSi Login(String taiKhoan,String matKhau) {
		List<bacSi> result = listAll();
		for (bacSi bacSi : result) {
			if(bacSi.getTaiKhoan().equals(taiKhoan)) {
				if(bacSi.getMatKhau().equals(matKhau)) {
					return bacSi;
				}
			}
		}
		return null;
	}
	public List<bacSi> getByIdDt(int idDT){
		String sql = " select distinct bs.idBacSi,tenBacSi,gioiTinh,tuoi,taikhoan,matkhau,trangthai from bacSi as bs \r\n" + 
				" join donthuoc as dt on dt.idBacSi = bs.idBacSi where idDonThuoc = ?";
		return query(sql, new bacSiMapper(), idDT);
	}
	public static void main(String[] args) {
		int id = 9;
		List<bacSi> rs = new bacSiDao().getByIdDt(id);
		System.out.println(rs);
	}
}

