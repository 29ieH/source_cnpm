package model;

public class loaiThuoc {
	private int idLoaiThuoc;
	private String tenLoaiThuoc;
	public loaiThuoc(int idLoaiThuoc, String tenLoaiThuoc) {
		this.idLoaiThuoc = idLoaiThuoc;
		this.tenLoaiThuoc = tenLoaiThuoc;
	}
	public int getIdLoaiThuoc() {
		return idLoaiThuoc;
	}
	public void setIdLoaiThuoc(int idLoaiThuoc) {
		this.idLoaiThuoc = idLoaiThuoc;
	}
	public String getTenLoaiThuoc() {
		return tenLoaiThuoc;
	}
	public void setTenLoaiThuoc(String tenLoaiThuoc) {
		this.tenLoaiThuoc = tenLoaiThuoc;
	}
	@Override
	public String toString() {
		return "loaiThuoc [idLoaiThuoc=" + idLoaiThuoc + ", tenLoaiThuoc=" + tenLoaiThuoc + "]";
	}
	
	

}
