package model;

import java.sql.Date;

public class donThuoc {
private int idDonThuoc;
private int idHoSoBenhNhan;
private Date ngayKeDon;
public donThuoc(int idDonThuoc, int idHoSoBenhNhan, Date ngayKeDon) {
	this.idDonThuoc = idDonThuoc;
	this.idHoSoBenhNhan = idHoSoBenhNhan;
	this.ngayKeDon = ngayKeDon;
}
public int getIdDonThuoc() {
	return idDonThuoc;
}
public void setIdDonThuoc(int idDonThuoc) {
	this.idDonThuoc = idDonThuoc;
}
public int getIdHoSoBenhNhan() {
	return idHoSoBenhNhan;
}
public void setIdHoSoBenhNhan(int idHoSoBenhNhan) {
	this.idHoSoBenhNhan = idHoSoBenhNhan;
}
public Date getNgayKeDon() {
	return ngayKeDon;
}
public void setNgayKeDon(Date ngayKeDon) {
	this.ngayKeDon = ngayKeDon;
}
@Override
public String toString() {
	return "donThuoc [idDonThuoc=" + idDonThuoc + ", idHoSoBenhNhan=" + idHoSoBenhNhan + ", ngayKeDon=" + ngayKeDon
			+ "]";
}
}
