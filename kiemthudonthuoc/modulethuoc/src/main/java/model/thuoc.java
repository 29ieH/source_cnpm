package model;

import java.sql.Date;

public class thuoc {
private int idThuoc;
private int idLoaiThuoc;
private String tenThuoc;
private int soLuongTrongKho;
private float doseMin;
private float doseMax;
private float frequency;
private Date ngayHetHan;
private String moTaThuoc;
private String donVi;
public thuoc(int idThuoc, int idLoaiThuoc, String tenThuoc, int soLuongTrongKho, float doseMin, float doseMax,
		float frequency, Date ngayHetHan, String moTaThuoc, String donVi) {
	this.idThuoc = idThuoc;
	this.idLoaiThuoc = idLoaiThuoc;
	this.tenThuoc = tenThuoc;
	this.soLuongTrongKho = soLuongTrongKho;
	this.doseMin = doseMin;
	this.doseMax = doseMax;
	this.frequency = frequency;
	this.ngayHetHan = ngayHetHan;
	this.moTaThuoc = moTaThuoc;
	this.donVi = donVi;
}
public thuoc(String tenThuoc) {
	this.tenThuoc = tenThuoc;
}
public float getDoseMin() {
	return doseMin;
}
public void setDoseMin(float doseMin) {
	this.doseMin = doseMin;
}
public float getDoseMax() {
	return doseMax;
}
public void setDoseMax(float doseMax) {
	this.doseMax = doseMax;
}
public float getFrequency() {
	return frequency;
}
public void setFrequency(float frequency) {
	this.frequency = frequency;
}
public int getIdThuoc() {
	return idThuoc;
}
public void setIdThuoc(int idThuoc) {
	this.idThuoc = idThuoc;
}
public int getIdLoaiThuoc() {
	return idLoaiThuoc;
}
public void setIdLoaiThuoc(int idLoaiThuoc) {
	this.idLoaiThuoc = idLoaiThuoc;
}
public String getTenThuoc() {
	return tenThuoc;
}
public void setTenThuoc(String tenThuoc) {
	this.tenThuoc = tenThuoc;
}
public int getSoLuongTrongKho() {
	return soLuongTrongKho;
}
public void setSoLuongTrongKho(int soLuongTrongKho) {
	this.soLuongTrongKho = soLuongTrongKho;
}
public String getDonVi() {
	return donVi;
}
public void setDonVi(String donVi) {
	this.donVi = donVi;
}
public Date getNgayHetHan() {
	return ngayHetHan;
}
public void setNgayHetHan(Date ngayHetHan) {
	this.ngayHetHan = ngayHetHan;
}
public String getMoTaThuoc() {
	return moTaThuoc;
}
public void setMoTaThuoc(String moTaThuoc) {
	this.moTaThuoc = moTaThuoc;
}
@Override
public String toString() {
	return "thuoc [idThuoc=" + idThuoc + ", idLoaiThuoc=" + idLoaiThuoc + ", tenThuoc=" + tenThuoc
			+ ", soLuongTrongKho=" + soLuongTrongKho + ", doseMin=" + doseMin + ", doseMax=" + doseMax + ", frequency="
			+ frequency + ", ngayHetHan=" + ngayHetHan + ", moTaThuoc=" + moTaThuoc + ", donVi=" + donVi + "]";
}

}
