package entity;

import java.util.Objects;

public class SanPham {
	private String maSanPham;
	private String tenSanPham;
	private int soLuongTon;
	private String xuatxu;
	private String mota;
	private double giaNhap;
	private double giaBan;
	private String hinhAnh;
	private  LoaiSanPham loaiSanPham;
	private NhaCungCap nhaCungCap;
	public String getMaSanPham() {
		return maSanPham;
	}
	public void setMaSanPham(String maSanPham) {
		this.maSanPham = maSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public int getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public String getXuatxu() {
		return xuatxu;
	}
	public void setXuatxu(String xuatxu) {
		this.xuatxu = xuatxu;
	}
	public String getMota() {
		return mota;
	}
	public void setMota(String mota) {
		this.mota = mota;
	}
	public double getGiaNhap() {
		return giaNhap;
	}
	public void setGiaNhap(double giaNhap) {
		this.giaNhap = giaNhap;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public LoaiSanPham getLoaiSanPham() {
		return loaiSanPham;
	}
	public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}
	public NhaCungCap getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(NhaCungCap nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maSanPham);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SanPham other = (SanPham) obj;
		return Objects.equals(maSanPham, other.maSanPham);
	}
	public SanPham(String maSanPham, String tenSanPham, int soLuongTon, String xuatxu, String mota, double giaNhap,
			double giaBan, String hinhAnh, LoaiSanPham loaiSanPham, NhaCungCap nhaCungCap) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.soLuongTon = soLuongTon;
		this.xuatxu = xuatxu;
		this.mota = mota;
		this.giaNhap = giaNhap;
		this.giaBan = giaBan;
		this.hinhAnh = hinhAnh;
		this.loaiSanPham = loaiSanPham;
		this.nhaCungCap = nhaCungCap;
	}
	
}
