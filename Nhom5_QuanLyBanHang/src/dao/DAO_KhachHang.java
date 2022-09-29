package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Connect.ConnectDB;
import entity.KhachHang;
import entity.LoaiKhachHang;
import entity.LoaiSanPham;
import entity.NhaCungCap;
import entity.SanPham;

public class DAO_KhachHang {
	

	
	public ArrayList<KhachHang> getAllKhachHang(){
		ArrayList<KhachHang> list=new ArrayList<KhachHang>();
		try {
			String sql="Select * from KhachHang";
			Connection con=ConnectDB.getConnection();
			Statement statement=con.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next()) {
				String makh=rs.getString(1);
				String tenkh=rs.getString(2);
				String sdt=rs.getString(3);
				boolean gioitinh=rs.getBoolean(4);
				LoaiKhachHang loai=new LoaiKhachHang(rs.getString(5));
				KhachHang khach=new KhachHang(makh, tenkh, sdt, gioitinh, loai);
				list.add(khach);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/*public boolean themSanPham(SanPham a) {
		ConnectDB.getInstance();
		Connection con=ConnectDB.getConnection();
		PreparedStatement statement;
		try {
			String sql="insert into SanPham values(?,?,?,?,?,?,?,?,?,?)";
			statement=con.prepareStatement(sql);
			statement.setString(1,a.getMaSanPham());
			statement.setString(2,a.getTenSanPham());
			statement.setInt(3,a.getSoLuongTon());
			statement.setString(4,a.getXuatxu());
			statement.setString(5, a.getMota());
			statement.setDouble(6, a.getGiaNhap());
			statement.setDouble(7, a.getGiaBan());
			statement.setString(8, a.getHinhAnh());
			statement.setString(9, a.getLoaiSanPham().getMaLoaiSanPham());
			statement.setString(10,a.getNhaCungCap().getMaNhaCungCap());
			int kq=statement.executeUpdate();
			statement.close();
			if(kq==1) {
				return true;
			}else {
				return false;
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return false;
		}
	}*/
	
	


}
