package dao;

import java.util.List;

import mapper.loaiThuocMapper;
import model.loaiThuoc;

public class loaiThuocDao extends abstractDao<loaiThuoc> {
	public List<loaiThuoc> listAll(){
		String sql = "select * from loaithuoc";
		return query(sql, new loaiThuocMapper());
	}
}
