package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sun.jdi.connect.spi.Connection;

import Connect.ConnectDB;

import entity.LoaiSanPham;

public class DAO_LoaiSanPham {
	


		public ArrayList<LoaiSanPham> getAllLoaiSanPham(){
			ArrayList<LoaiSanPham> list=new ArrayList<LoaiSanPham>();
			try {
				String sql="Select * from LoaiSanPham";
				java.sql.Connection con=ConnectDB.getConnection();
				Statement statement=con.createStatement();
				ResultSet rs=statement.executeQuery(sql);
				while(rs.next()) {
					String maLoaiSanPham=rs.getString(1);
					String tenLoaiSanPham=rs.getString(2);
					LoaiSanPham loai=new LoaiSanPham(maLoaiSanPham, tenLoaiSanPham);
					list.add(loai);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		public LoaiSanPham timLoaiSanPham(String maLoaiSanPham) {
			ArrayList<LoaiSanPham> list=new DAO_LoaiSanPham().getAllLoaiSanPham();
			for (LoaiSanPham dto_LoaiSP : list) {
				if(dto_LoaiSP.getMaLoaiSanPham().equals(maLoaiSanPham)) {
					return dto_LoaiSP;
				}
			}
			return null;
		}
		
		
	

}
