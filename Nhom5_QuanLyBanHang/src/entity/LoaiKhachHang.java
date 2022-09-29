package entity;

import java.util.Objects;

public class LoaiKhachHang {
	private String maLoai;
	private String tenLoai;
	public LoaiKhachHang() {
	
	}
	public LoaiKhachHang(String maLoai) {
	
		this.maLoai = maLoai;
	}
	public LoaiKhachHang(String maLoai, String tenLoai) {
	
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
	}
	public String getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maLoai);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoaiKhachHang other = (LoaiKhachHang) obj;
		return Objects.equals(maLoai, other.maLoai);
	}
	@Override
	public String toString() {
		return "LoaiKhachHang [maLoai=" + maLoai + ", tenLoai=" + tenLoai + "]";
	}
	
	
}
