package model;

public class lieuDung {
	private int idLieuDung;
	private int idThuoc;
	private float lieuDungMaxMotLan;
	private float tanSoSuDungMaxTrenNgay;
	private String donVi;
	private String doiTuongSuDung;
	public lieuDung(int idLieuDung, int idThuoc, float lieuDungMaxMotLan, float tanSoSuDungMaxTrenNgay, String donVi,
			String doiTuongSuDung) {
		super();
		this.idLieuDung = idLieuDung;
		this.idThuoc = idThuoc;
		this.lieuDungMaxMotLan = lieuDungMaxMotLan;
		this.tanSoSuDungMaxTrenNgay = tanSoSuDungMaxTrenNgay;
		this.donVi = donVi;
		this.doiTuongSuDung = doiTuongSuDung;
	}
	public lieuDung(int idLieuDung, int idThuoc, float lieuDungMaxMotLan, float tanSoSuDungMaxTrenNgay, String donVi) {
		this.idLieuDung = idLieuDung;
		this.idThuoc = idThuoc;
		this.lieuDungMaxMotLan = lieuDungMaxMotLan;
		this.tanSoSuDungMaxTrenNgay = tanSoSuDungMaxTrenNgay;
		this.donVi = donVi;
	}
	public int getIdLieuDung() {
		return idLieuDung;
	}
	public void setIdLieuDung(int idLieuDung) {
		this.idLieuDung = idLieuDung;
	}
	public int getIdThuoc() {
		return idThuoc;
	}
	public void setIdThuoc(int idThuoc) {
		this.idThuoc = idThuoc;
	}
	public float getLieuDungMaxMotLan() {
		return lieuDungMaxMotLan;
	}
	public void setLieuDungMaxMotLan(float lieuDungMaxMotLan) {
		this.lieuDungMaxMotLan = lieuDungMaxMotLan;
	}
	public float getTanSoSuDungMaxTrenNgay() {
		return tanSoSuDungMaxTrenNgay;
	}
	public void setTanSoSuDungMaxTrenNgay(float tanSoSuDungMaxTrenNgay) {
		this.tanSoSuDungMaxTrenNgay = tanSoSuDungMaxTrenNgay;
	}
	public String getDonVi() {
		return donVi;
	}
	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}
	public String getDoiTuongSuDung() {
		return doiTuongSuDung;
	}
	public void setDoiTuongSuDung(String doiTuongSuDung) {
		this.doiTuongSuDung = doiTuongSuDung;
	}
	@Override
	public String toString() {
		return "lieuDung [idLieuDung=" + idLieuDung + ", idThuoc=" + idThuoc + ", lieuDungMaxMotLan="
				+ lieuDungMaxMotLan + ", tanSoSuDungMaxTrenNgay=" + tanSoSuDungMaxTrenNgay + ", donVi=" + donVi
				+ ", doiTuongSuDung=" + doiTuongSuDung + "]";
	}
	
	
}
