package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Connect.ConnectDB;
import entity.LoaiSanPham;
import entity.NhaCungCap;
import entity.SanPham;

public class DAO_SanPham {
	

	
		public ArrayList<SanPham> getAllSanPham(){
			ArrayList<SanPham> list=new ArrayList<SanPham>();
			try {
				String sql="Select * from SanPham";
				Connection con=ConnectDB.getConnection();
				Statement statement=con.createStatement();
				ResultSet rs=statement.executeQuery(sql);
				while(rs.next()) {
					String maSanPham=rs.getString(1);
					String tenSanPham=rs.getString(2);
					int soLuongTon=rs.getInt(3);
					String xuatxu=rs.getString(4);
					String mota=rs.getString(5);
					double giaNhap=rs.getDouble(6);
					double giaBan=rs.getDouble(7);
					String hinhAnh=rs.getString(8);
					String maLoai=rs.getString(9);
					LoaiSanPham loai=new DAO_LoaiSanPham().timLoaiSanPham(maLoai);
					String  maNhaCungCap=rs.getString(10);
					NhaCungCap ncc=new DAO_NhaCungCap().timNCC(maNhaCungCap);
					SanPham sp=new SanPham(maSanPham, tenSanPham, soLuongTon, xuatxu, mota, giaNhap, giaBan, hinhAnh, loai, ncc);
					list.add(sp);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		public boolean themSanPham(SanPham a) {
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
		}
		
		
	

}
