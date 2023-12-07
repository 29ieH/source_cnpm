package model;

import java.sql.Date;

public class abstractModel {
	protected Date ngayTao;
	protected Date ngayCapNhap;
	public Date getNgayTao() {
		return ngayTao;
	}
	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}
	public Date getNgayCapNhap() {
		return ngayCapNhap;
	}
	public void setNgayCapNhap(Date ngayCapNhap) {
		this.ngayCapNhap = ngayCapNhap;
	}
}
