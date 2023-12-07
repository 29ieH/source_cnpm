package model;

import java.sql.Date;

public class hoSoBenhNhan {
	private int idHoSoBenhNhan;
	private String tenBenhNhan;
	private int tuoi;
	private String gioiTinh;
	private String diaChi;
	private String soDienThoai;
	private String nhomMau;
	private float canNang;
	private String benhLy;
	private Date ngayKham;
	private int daTungDenKham;
	public hoSoBenhNhan(int idHoSoBenhNhan, String tenBenhNhan, int tuoi, String gioiTinh, String diaChi,
			String soDienThoai, String nhomMau, float canNang, String benhLy, Date ngayKham) {
		super();
		this.idHoSoBenhNhan = idHoSoBenhNhan;
		this.tenBenhNhan = tenBenhNhan;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.nhomMau = nhomMau;
		this.canNang = canNang;
		this.benhLy = benhLy;
		this.ngayKham = ngayKham;
	}
	public hoSoBenhNhan(int idHoSoBenhNhan, String tenBenhNhan, int tuoi, String gioiTinh, String diaChi,
			String soDienThoai, String nhomMau, float canNang, String benhLy, Date ngayKham, int daTungDenKham) {
		super();
		this.idHoSoBenhNhan = idHoSoBenhNhan;
		this.tenBenhNhan = tenBenhNhan;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.nhomMau = nhomMau;
		this.canNang = canNang;
		this.benhLy = benhLy;
		this.ngayKham = ngayKham;
		this.daTungDenKham = daTungDenKham;
	}
	@Override
	public String toString() {
		return "hoSoBenhNhan [idHoSoBenhNhan=" + idHoSoBenhNhan + ", tenBenhNhan=" + tenBenhNhan + ", tuoi=" + tuoi
				+ ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + ", soDienThoai=" + soDienThoai + ", nhomMau="
				+ nhomMau + ", canNang=" + canNang + ", benhLy=" + benhLy + ", ngayKham=" + ngayKham
				+ ", daTungDenKham=" + daTungDenKham + "]";
	}
	public int getIdHoSoBenhNhan() {
		return idHoSoBenhNhan;
	}
	public void setIdHoSoBenhNhan(int idHoSoBenhNhan) {
		this.idHoSoBenhNhan = idHoSoBenhNhan;
	}
	public String getTenBenhNhan() {
		return tenBenhNhan;
	}
	public void setTenBenhNhan(String tenBenhNhan) {
		this.tenBenhNhan = tenBenhNhan;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public String getNhomMau() {
		return nhomMau;
	}
	public void setNhomMau(String nhomMau) {
		this.nhomMau = nhomMau;
	}
	public float getCanNang() {
		return canNang;
	}
	public void setCanNang(float canNang) {
		this.canNang = canNang;
	}
	public String getBenhLy() {
		return benhLy;
	}
	public void setBenhLy(String benhLy) {
		this.benhLy = benhLy;
	}
	public Date getNgayKham() {
		return ngayKham;
	}
	public void setNgayKham(Date ngayKham) {
		this.ngayKham = ngayKham;
	}
	public int getDaTungDenKham() {
		return daTungDenKham;
	}
	public void setDaTungDenKham(int daTungDenKham) {
		this.daTungDenKham = daTungDenKham;
	}
	

}
