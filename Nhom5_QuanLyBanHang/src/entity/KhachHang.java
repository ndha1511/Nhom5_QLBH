package entity;

import java.util.Objects;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private String SDT;
	private boolean gioiTinh;
	private LoaiKhachHang loaiKh;
	public KhachHang() {
	
	}
	public KhachHang(String maKH) {
	
		this.maKH = maKH;
	}
	public KhachHang(String maKH, String hoTen, String sDT, boolean gioiTinh, LoaiKhachHang loaiKh) {
	
		this.maKH = maKH;
		this.hoTen = hoTen;
		SDT = sDT;
		this.gioiTinh = gioiTinh;
		this.loaiKh = loaiKh;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public LoaiKhachHang getLoaiKh() {
		return loaiKh;
	}
	public void setLoaiKh(LoaiKhachHang loaiKh) {
		this.loaiKh = loaiKh;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maKH);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KhachHang other = (KhachHang) obj;
		return Objects.equals(maKH, other.maKH);
	}
	@Override
	public String toString() {
		return "KhachHang [maKH=" + maKH + ", hoTen=" + hoTen + ", SDT=" + SDT + ", gioiTinh=" + gioiTinh + ", loaiKh="
				+ loaiKh + "]";
	}
	
	
}
