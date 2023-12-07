package model;

public class fakedtb {
	private int idt;
	private float dose;
	private float frequency;
	private int soluong;
	private int idThuoc;
	private String danDoBacSi;
	public fakedtb(int idt, float dose, float frequency, int soluong, int idThuoc, String danDoBacSi) {
		super();
		this.idt = idt;
		this.dose = dose;
		this.frequency = frequency;
		this.soluong = soluong;
		this.idThuoc = idThuoc;
		this.danDoBacSi = danDoBacSi;
	}
	public int getIdt() {
		return idt;
	}
	public void setIdt(int idt) {
		this.idt = idt;
	}
	public float getDose() {
		return dose;
	}
	public void setDose(float dose) {
		this.dose = dose;
	}
	public float getFrequency() {
		return frequency;
	}
	public void setFrequency(float frequency) {
		this.frequency = frequency;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public int getIdThuoc() {
		return idThuoc;
	}
	public void setIdThuoc(int idThuoc) {
		this.idThuoc = idThuoc;
	}
	public String getDanDoBacSi() {
		return danDoBacSi;
	}
	public void setDanDoBacSi(String danDoBacSi) {
		this.danDoBacSi = danDoBacSi;
	}
	@Override
	public String toString() {
		return "fakedtb [idt=" + idt + ", dose=" + dose + ", frequency=" + frequency + ", soluong=" + soluong
				+ ", idThuoc=" + idThuoc + ", danDoBacSi=" + danDoBacSi + "]";
	}
	
}
