package GUI;

import java.awt.Color;
import java.awt.Container;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import dao.DAO_KhachHang;
import entity.KhachHang;

public class GUI_KhachHang extends JPanel {

	private JTextField txt_maKhachHang1;
	private JTextField txt_tenKhachHang;
	private JTextField txt_SDT;
	private JLabel lb_email;
	private JTextField txt_email;
	private JLabel lb_loaiKhachHang;
	private JRadioButton rad_moi;
	private JRadioButton rad_cu;
	private JPanel panel_4;
	private JButton btn_suaKhachHang;
	private JButton btn_xoaKhachHang;
	private JButton btn_lamMoiKhachHang;
	private JPanel panel_DanhSachKhachHang;
	private Container panel_KH;
	private JPanel panel_LocKhachHang;
	private JLabel lb_GT;
	private JTextField txt_timKiemKhachHang;
	private JPanel panel_7;
	private JScrollPane scrollPane_lichSuGiaoDich;
	private JTable table_4;
	private JTable table_3;
	private DefaultTableModel model;
	private JTable table_danhsachkhachhang;
	private DefaultTableModel modelKH;

	/**
	 * Create the panel.
	 */
	public GUI_KhachHang() {
		
			this.setBackground(Color.WHITE);
			this.setLayout(null);
			
			JPanel panel_thongtinkhachhang = new JPanel();
			panel_thongtinkhachhang.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192)), "Th\u00F4ng tin kh\u00E1ch h\u00E0ng", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
			panel_thongtinkhachhang.setBackground(Color.WHITE);
			panel_thongtinkhachhang.setBounds(10, 10, 1015, 216);
			this.add(panel_thongtinkhachhang);
			panel_thongtinkhachhang.setLayout(null);
			
			JLabel lb_maKhachHang1 = new JLabel("Mã khách hàng:");
			lb_maKhachHang1.setBounds(30, 38, 97, 13);
			panel_thongtinkhachhang.add(lb_maKhachHang1);
			
			txt_maKhachHang1 = new JTextField();
			txt_maKhachHang1.setBounds(151, 35, 163, 19);
			panel_thongtinkhachhang.add(txt_maKhachHang1);
			txt_maKhachHang1.setColumns(10);
			
			JLabel lb_tenKhachHang1 = new JLabel("Tên khách hàng:");
			lb_tenKhachHang1.setBounds(30, 75, 97, 13);
			panel_thongtinkhachhang.add(lb_tenKhachHang1);
			
			txt_tenKhachHang = new JTextField();
			txt_tenKhachHang.setColumns(10);
			txt_tenKhachHang.setBounds(151, 72, 163, 19);
			panel_thongtinkhachhang.add(txt_tenKhachHang);
			
			JLabel lb_gioiTinh = new JLabel("Giới tính:");
			lb_gioiTinh.setBounds(30, 115, 45, 13);
			panel_thongtinkhachhang.add(lb_gioiTinh);
			
			JRadioButton rad_nam = new JRadioButton("Nam");
			rad_nam.setBackground(Color.WHITE);
			rad_nam.setBounds(151, 111, 54, 21);
			panel_thongtinkhachhang.add(rad_nam);
			
			JRadioButton rad_nu = new JRadioButton("Nữ");
			rad_nu.setBackground(Color.WHITE);
			rad_nu.setBounds(213, 111, 55, 21);
			panel_thongtinkhachhang.add(rad_nu);
			
			JLabel lb_SDT = new JLabel("Số điện thoại:");
			lb_SDT.setBounds(30, 157, 107, 13);
			panel_thongtinkhachhang.add(lb_SDT);
			
			txt_SDT = new JTextField();
			txt_SDT.setColumns(10);
			txt_SDT.setBounds(151, 154, 163, 19);
			panel_thongtinkhachhang.add(txt_SDT);
			
			lb_email = new JLabel("Email:");
			lb_email.setBounds(395, 38, 72, 13);
			panel_thongtinkhachhang.add(lb_email);
			
			txt_email = new JTextField();
			txt_email.setColumns(10);
			txt_email.setBounds(489, 35, 163, 19);
			panel_thongtinkhachhang.add(txt_email);
			
			lb_loaiKhachHang = new JLabel("Loại khách hàng:");
			lb_loaiKhachHang.setBounds(395, 75, 107, 13);
			panel_thongtinkhachhang.add(lb_loaiKhachHang);
			
			rad_moi = new JRadioButton("Mới");
			rad_moi.setBackground(Color.WHITE);
			rad_moi.setBounds(489, 71, 54, 21);
			panel_thongtinkhachhang.add(rad_moi);
			
			rad_cu = new JRadioButton("Cũ");
			rad_cu.setBackground(Color.WHITE);
			rad_cu.setBounds(562, 71, 91, 21);
			panel_thongtinkhachhang.add(rad_cu);
			
			panel_4 = new JPanel();
			panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY));
			panel_4.setBackground(Color.WHITE);
			panel_4.setBounds(815, 23, 176, 183);
			panel_thongtinkhachhang.add(panel_4);
			panel_4.setLayout(null);
			
			JButton btn_themKhachHang = new JButton("Thêm");
			btn_themKhachHang.setBounds(31, 10, 121, 34);
			panel_4.add(btn_themKhachHang);
			
			btn_suaKhachHang = new JButton("Sửa");
			btn_suaKhachHang.setBounds(31, 54, 121, 34);
			panel_4.add(btn_suaKhachHang);
			
			btn_xoaKhachHang = new JButton("Xóa");
			btn_xoaKhachHang.setBounds(31, 98, 121, 34);
			panel_4.add(btn_xoaKhachHang);
			
			btn_lamMoiKhachHang = new JButton("Làm mới");
			btn_lamMoiKhachHang.setBounds(31, 142, 121, 34);
			panel_4.add(btn_lamMoiKhachHang);
			
			panel_DanhSachKhachHang = new JPanel();
			panel_DanhSachKhachHang.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192), new Color(255, 255, 255)), "Danh s\u00E1ch kh\u00E1ch h\u00E0ng", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
			panel_DanhSachKhachHang.setBackground(Color.WHITE);
			panel_DanhSachKhachHang.setBounds(10, 236, 1015, 379);
			this.add(panel_DanhSachKhachHang);
			panel_DanhSachKhachHang.setLayout(null);
			
			panel_LocKhachHang = new JPanel();
			panel_LocKhachHang.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192)), "L\u1ECDc", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
			panel_LocKhachHang.setBackground(Color.WHITE);
			panel_LocKhachHang.setBounds(787, 91, 218, 241);
			panel_DanhSachKhachHang.add(panel_LocKhachHang);
			panel_LocKhachHang.setLayout(null);
			
			lb_GT = new JLabel("Giới tính:");
			lb_GT.setBounds(28, 62, 45, 13);
			panel_LocKhachHang.add(lb_GT);
			
			JComboBox cbb_gt = new JComboBox();
			cbb_gt.setBounds(28, 85, 147, 21);
			panel_LocKhachHang.add(cbb_gt);
			
			JLabel lb_loaiKhachHang1 = new JLabel("Loại khách hàng:");
			lb_loaiKhachHang1.setBounds(28, 152, 116, 13);
			panel_LocKhachHang.add(lb_loaiKhachHang1);
			
			JComboBox cbb_loaiKhachHang = new JComboBox();
			cbb_loaiKhachHang.setBounds(28, 175, 147, 21);
			panel_LocKhachHang.add(cbb_loaiKhachHang);
			
			JTabbedPane tab_thongTinKhachHang = new JTabbedPane(JTabbedPane.TOP);
			tab_thongTinKhachHang.setBounds(10, 20, 752, 349);
			panel_DanhSachKhachHang.add(tab_thongTinKhachHang);
			
			JPanel panel_6 = new JPanel();
			panel_6.setBackground(Color.WHITE);
			tab_thongTinKhachHang.addTab("Thông tin cá nhân", null, panel_6, null);
			panel_6.setLayout(null);
			
			JLabel lb_timKiemKhachHang = new JLabel("Tìm kiếm:");
			lb_timKiemKhachHang.setBounds(10, 23, 71, 13);
			panel_6.add(lb_timKiemKhachHang);
			
			txt_timKiemKhachHang = new JTextField();
			txt_timKiemKhachHang.setBounds(105, 20, 632, 19);
			panel_6.add(txt_timKiemKhachHang);
			txt_timKiemKhachHang.setColumns(10);
			
			JScrollPane scrollPane_danhSachKhachHang = new JScrollPane();
			scrollPane_danhSachKhachHang.setBounds(10, 54, 727, 258);
			panel_6.add(scrollPane_danhSachKhachHang);
			
			String head[]= {"mã khách hàng","tên khách hàng","SDT","giới tính","mã loại"};
			modelKH=new DefaultTableModel(head,0);
			table_danhsachkhachhang=new JTable(modelKH);
			scrollPane_danhSachKhachHang.setViewportView(table_danhsachkhachhang);
			
			
			panel_7 = new JPanel();
			panel_7.setBackground(Color.WHITE);
			tab_thongTinKhachHang.addTab("Lịch sử giao dịch", null, panel_7, null);
			panel_7.setLayout(null);
			
			scrollPane_lichSuGiaoDich = new JScrollPane();
			scrollPane_lichSuGiaoDich.setBounds(10, 10, 727, 302);
			panel_7.add(scrollPane_lichSuGiaoDich);
			
			table_4 = new JTable();
			table_4.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"T\u00EAn kh\u00E1ch h\u00E0ng", "SDT", "Ng\u00E0y giao d\u1ECBch", "T\u00EAn s\u1EA3n ph\u1EA9m", "S\u1ED1 l\u01B0\u1EE3ng", "Gi\u00E1 b\u00E1n", "T\u1ED5ng ti\u1EC1n"
				}
			));
			scrollPane_lichSuGiaoDich.setViewportView(table_4); 
			
			doDulieuKH();
	}
	
	public void doDulieuKH() {
		ArrayList<KhachHang> list=new DAO_KhachHang().getAllKhachHang();
		for (KhachHang khachHang : list) {
			modelKH.addRow(new Object[]{khachHang.getMaKH(),khachHang.getHoTen(),khachHang.getSDT(),khachHang.isGioiTinh()?"Nữ":"Nam",khachHang.getLoaiKh().getMaLoai()});
		}
	}

}
