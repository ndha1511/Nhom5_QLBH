package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Connect.ConnectDB;
import entity.LoaiSanPham;
import entity.NhaCungCap;

public class DAO_NhaCungCap {
	
		public ArrayList<NhaCungCap> getAllNhaCungCap(){
			ArrayList<NhaCungCap> list=new ArrayList<NhaCungCap>();
			try {
				String sql="Select * from NhaCungCap";
				java.sql.Connection con=ConnectDB.getConnection();
				Statement statement=con.createStatement();
				ResultSet rs=statement.executeQuery(sql);
				while(rs.next()) {
					String maNhaCungcap=rs.getString(1);
					String tenNhaCungCap=rs.getString(2);
					NhaCungCap ncc=new NhaCungCap(maNhaCungcap, tenNhaCungCap);
					list.add(ncc);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		public NhaCungCap timNCC(String maNCC) {
			ArrayList<NhaCungCap> list=new DAO_NhaCungCap().getAllNhaCungCap();
			for (NhaCungCap dto_ncc : list) {
				if(dto_ncc.getMaNhaCungCap().equals(maNCC)) {
					return dto_ncc;
				}
			}
			return null;
		}
}
