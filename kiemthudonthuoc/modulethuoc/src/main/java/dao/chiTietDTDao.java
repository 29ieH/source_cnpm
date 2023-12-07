package dao;

import java.util.List;

import mapper.chiTietDonThuocMapper;
import model.chiTietDonThuoc;
import model.fakeModel;

public class chiTietDTDao extends abstractDao<chiTietDonThuoc> {
	
	public List<chiTietDonThuoc> listOfIdDt(int iddt){
		String sql = "select * from chitietdonthuoc where idDonThuoc = ?";
		return query(sql, new chiTietDonThuocMapper(), iddt);
	}
	public List<chiTietDonThuoc> listOfDate(int idbn){
		String sql = "select * from chitietdonthuoc where idDonThuoc = ?";
		return query(sql, new chiTietDonThuocMapper(),idbn);
	}
	public boolean addctdt(int iddt,int idt,float dose,float frequency,int soluong,String nd) {
		try {
			String sql = "insert into chitietdonthuoc values(?,?,?,?,?,?)";
			save(sql, iddt,idt,dose,frequency,soluong,nd);
		} catch (Exception e) {
			return true;
		}
		return true;
	}
	public boolean createCtdt(List<fakeModel> list) {
		boolean check = false;
		for (fakeModel model : list) {
			check = addctdt(model.getIddt(), model.getIdThuoc(), model.getDose(), model.getFrequency(), model.getSoluong(), model.getDanDoBacSi());
		}
		return check;
	}
	
	public static void main(String[] args) {
		int iddt = 10;
		int idt = 6;
		float dose = 1;
		float frequency = 2;
		int soluong = 2;
		String nd = "Uống sau bữa ăn";
		boolean check = false;
		check = new chiTietDTDao().addctdt(iddt, idt, dose, frequency, soluong, nd);
		System.out.println(check);
	}
}
