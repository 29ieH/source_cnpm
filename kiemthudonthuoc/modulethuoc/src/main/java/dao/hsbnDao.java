package dao;

import java.util.List;

import mapper.hoSoBenhNhanMapper;
import model.hoSoBenhNhan;

public class hsbnDao  extends abstractDao<hoSoBenhNhan> {
	public List<hoSoBenhNhan> listAll(){
		String Sql = "select * from hosobenhnhan";
		return query(Sql, new hoSoBenhNhanMapper());
	}
	public List<hoSoBenhNhan> listOffIndex(int offset,int maxItemsPage){
		String sql = "select * from hosobenhnhan order by tenBenhNhan asc OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
		return query(sql, new hoSoBenhNhanMapper(), offset,maxItemsPage);
	}
	public int countAll() {
		String sql = "select count(idHoSoBenhNhan) from hosobenhnhan";
		return  count(sql);
	}
	public List<hoSoBenhNhan> findOfName(String name){
		String sql = "select * from hosobenhnhan where tenBenhNhan like ? order by tenBenhNhan asc ";
		return query(sql, new hoSoBenhNhanMapper(), name);
	}
	public List<hoSoBenhNhan> findOfById(int id){
		String sql = "select * from hosobenhnhan where idHoSoBenhNhan = ?";
		return query(sql,new hoSoBenhNhanMapper(), id);
	}
	
	public static void main(String[] args) {
	}
}
