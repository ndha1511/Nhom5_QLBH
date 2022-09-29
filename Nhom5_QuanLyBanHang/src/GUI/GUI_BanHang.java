package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class GUI_BanHang extends JPanel {

	private JPanel panel_hoaDonCHo;
	private JScrollPane scrollPane_6;
	private JTable table_7;
	private JPanel panel_gioHang;
	private JScrollPane scrollPane_7;
	private JTable table_8;
	private JButton btn_xoaSanPham;
	private JButton btn_xoaHet;
	private JPanel panel_danhSachSanPham;
	private JLabel lb_timKiemsp;
	private JTextField textField_17;
	private JLabel lb_gia;
	private JComboBox cbb_sanPham_1;
	private JScrollPane scrollPane_8;
	private JPanel panel_sp;
	private JPanel panel_sp1;
	private JPanel panel_sp1_1;
	private JLabel lb_anhSanPham_1;
	private Component lb_tenSanPham_1;
	private JLabel lb_giaSanPham_1;
	private JTextField textField_28;
	private JLabel lb_donViGia_1;
	private JButton btn_cong_1;
	private Component btn_tru_1;
	private JLabel lb_mau_1;
	private JLabel lb_kichThuoc_1;
	private JComboBox comboBox_14;
	private Component comboBox_13_2;
	private JButton btn_themVaoGio_1;
	private JButton btn_chiTiet_1;
	private JLabel lb_anhSanPham;
	private Component lb_tenSanPham;
	private Component lb_giaSanPham;
	private JTextField txt_soLuong;
	private JButton btn_themVaoGio;
	private Component btn_chiTiet;
	private JComponent panel_donHang;
	private JPanel panel_thongTinKhachHang;
	private JLabel lb_maKhachHang;
	private JTextField txt_maKhachHang;
	private JLabel lb_tenKhachHang;
	private JTextField textField_19;
	private Component btn_chonKhachHang;
	private JButton btn_thayDoiKhachHang;
	private JLabel lb_maHoaDon;
	private JTextField txt_maHoaDon;
	private JLabel lb_giamGia;
	private JButton bnt_thanhToan;
	private JButton btn_huyHoaDon;
	private JButton btn_lamMoi;
	private JLabel lb_donViTongTien;
	private Component lb_donViGiamGia;
	private JLabel lb_donViTienNhan;
	private Component lb_donViTienThua;
	private Component lb_donViThue;
	private Component lb_tongTien1;
	private Component lb_giamGia1;
	private Component lb_tienThua1;
	private Component lb_thue1;
	private JTextField txt_tienNhan;

	/**
	 * Create the panel.
	 */
	public GUI_BanHang() {
		this.setBackground(Color.WHITE);
		this.setBounds(0, 54, 1060, 630);
		this.setLayout(null);
		
		panel_hoaDonCHo = new JPanel();
		panel_hoaDonCHo.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192)), "H\u00F3a \u0111\u01A1n ch\u1EDD", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		panel_hoaDonCHo.setBackground(Color.WHITE);
		panel_hoaDonCHo.setBounds(10, 0, 677, 137);
		this.add(panel_hoaDonCHo);
		panel_hoaDonCHo.setLayout(null);
		
		scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(10, 20, 657, 107);
		panel_hoaDonCHo.add(scrollPane_6);
		
		table_7 = new JTable();
		table_7.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"M\u00E3 h\u00F3a \u0111\u01A1n", "Ng\u00E0y l\u1EADp", "Nh\u00E2n vi\u00EAn l\u1EADp", "Kh\u00E1ch h\u00E0ng "
			}
		));
		scrollPane_6.setViewportView(table_7);
		
		panel_gioHang = new JPanel();
		panel_gioHang.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192)), "Gi\u1ECF h\u00E0ng", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		panel_gioHang.setBackground(Color.WHITE);
		panel_gioHang.setBounds(10, 138, 677, 153);
		this.add(panel_gioHang);
		panel_gioHang.setLayout(null);
		
		scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(10, 26, 498, 111);
		panel_gioHang.add(scrollPane_7);
		
		table_8 = new JTable();
		table_8.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "\u0110\u01A1n gi\u00E1", "S\u1ED1 l\u01B0\u1EE3ng "
			}
		));
		scrollPane_7.setViewportView(table_8);
		
		btn_xoaSanPham = new JButton("Xóa sản phẩm");
		btn_xoaSanPham.setBounds(528, 53, 114, 32);
		panel_gioHang.add(btn_xoaSanPham);
		
		btn_xoaHet = new JButton("Xóa hết");
		btn_xoaHet.setBounds(528, 105, 114, 32);
		panel_gioHang.add(btn_xoaHet);
		
		panel_danhSachSanPham = new JPanel();
		panel_danhSachSanPham.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192)), "Danh s\u00E1ch s\u1EA3n ph\u1EA9m", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		panel_danhSachSanPham.setBackground(Color.WHITE);
		panel_danhSachSanPham.setBounds(10, 292, 677, 328);
		this.add(panel_danhSachSanPham);
		
		lb_timKiemsp = new JLabel("Tìm kiếm sản phẩm:");
		lb_timKiemsp.setBounds(10, 26, 119, 13);
		
		textField_17 = new JTextField();
		textField_17.setBounds(117, 23, 96, 19);
		textField_17.setColumns(10);
		
		JLabel lb_sanPham = new JLabel("Sản phẩm:");
		lb_sanPham.setBounds(245, 26, 119, 13);
		
		JComboBox cbb_sanPham = new JComboBox();
		cbb_sanPham.setBounds(327, 22, 113, 21);
		
		lb_gia = new JLabel("Giá:");
		lb_gia.setBounds(473, 26, 59, 13);
		
		cbb_sanPham_1 = new JComboBox();
		cbb_sanPham_1.setBounds(528, 22, 113, 21);
		panel_danhSachSanPham.setLayout(null);
		
		scrollPane_8 = new JScrollPane();
		scrollPane_8.setBounds(10, 49, 656, 279);
		panel_danhSachSanPham.add(scrollPane_8);
		
		panel_sp = new JPanel();
		panel_sp.setBackground(Color.WHITE);
		scrollPane_8.setViewportView(panel_sp);
		
		panel_sp1 = new JPanel();
		panel_sp1.setBackground(Color.WHITE);
		
		panel_sp1_1 = new JPanel();
		panel_sp1_1.setLayout(null);
		panel_sp1_1.setBackground(Color.WHITE);
		
		lb_anhSanPham_1 = new JLabel("");
		lb_anhSanPham_1.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\QuanLyBanHang1\\src\\img\\delete-icon-13.jpg"));
		lb_anhSanPham_1.setBounds(10, 10, 100, 98);
		panel_sp1_1.add(lb_anhSanPham_1);
		
		lb_tenSanPham_1 = new JLabel("Áo thun");
		lb_tenSanPham_1.setBounds(137, 24, 45, 13);
		panel_sp1_1.add(lb_tenSanPham_1);
		
		lb_giaSanPham_1 = new JLabel("2500000");
		lb_giaSanPham_1.setBounds(137, 54, 45, 11);
		panel_sp1_1.add(lb_giaSanPham_1);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(168, 78, 28, 19);
		panel_sp1_1.add(textField_28);
		
		lb_donViGia_1 = new JLabel("VND");
		lb_donViGia_1.setBounds(189, 53, 45, 13);
		panel_sp1_1.add(lb_donViGia_1);
		
		btn_cong_1 = new JButton("+");
		btn_cong_1.setBounds(199, 78, 45, 21);
		panel_sp1_1.add(btn_cong_1);
		
		btn_tru_1 = new JButton("-");
		btn_tru_1.setBounds(120, 78, 45, 21);
		panel_sp1_1.add(btn_tru_1);
		
		lb_mau_1 = new JLabel("Màu:");
		lb_mau_1.setBounds(301, 33, 53, 13);
		panel_sp1_1.add(lb_mau_1);
		
		lb_kichThuoc_1 = new JLabel("Kích thước:");
		lb_kichThuoc_1.setBounds(301, 62, 69, 13);
		panel_sp1_1.add(lb_kichThuoc_1);
		
		comboBox_14 = new JComboBox();
		comboBox_14.setBounds(364, 28, 60, 18);
		panel_sp1_1.add(comboBox_14);
		
		comboBox_13_2 = new JComboBox();
		comboBox_13_2.setBounds(364, 58, 60, 18);
		panel_sp1_1.add(comboBox_13_2);
		
		btn_themVaoGio_1 = new JButton("Thêm vào giỏ");
		btn_themVaoGio_1.setBounds(515, 49, 100, 21);
		panel_sp1_1.add(btn_themVaoGio_1);
		
		btn_chiTiet_1 = new JButton("Chi tiết");
		btn_chiTiet_1.setBounds(515, 87, 100, 21);
		panel_sp1_1.add(btn_chiTiet_1);
		GroupLayout gl_panel_sp = new GroupLayout(panel_sp);
		gl_panel_sp.setHorizontalGroup(
			gl_panel_sp.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_sp.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_sp.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_sp1, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_sp1_1, GroupLayout.PREFERRED_SIZE, 625, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		gl_panel_sp.setVerticalGroup(
			gl_panel_sp.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_sp.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_sp1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_sp1_1, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(14, Short.MAX_VALUE))
		);
		panel_sp1.setLayout(null);
		
		lb_anhSanPham = new JLabel("");
		lb_anhSanPham.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\QuanLyBanHang1\\src\\img\\delete-icon-13.jpg"));
		lb_anhSanPham.setBounds(10, 10, 100, 98);
		panel_sp1.add(lb_anhSanPham);
		
		lb_tenSanPham = new JLabel("Áo thun");
		lb_tenSanPham.setBounds(137, 24, 45, 13);
		panel_sp1.add(lb_tenSanPham);
		
		lb_giaSanPham = new JLabel("2500000");
		lb_giaSanPham.setBounds(137, 54, 45, 11);
		panel_sp1.add(lb_giaSanPham);
		
		txt_soLuong = new JTextField();
		txt_soLuong.setBounds(168, 78, 28, 19);
		panel_sp1.add(txt_soLuong);
		txt_soLuong.setColumns(10);
		
		JLabel lb_donViGia = new JLabel("VND");
		lb_donViGia.setBounds(189, 53, 45, 13);
		panel_sp1.add(lb_donViGia);
		
		JButton btn_cong = new JButton("+");
		btn_cong.setBounds(199, 78, 45, 21);
		panel_sp1.add(btn_cong);
		
		JButton btn_tru = new JButton("-");
		btn_tru.setBounds(120, 78, 45, 21);
		panel_sp1.add(btn_tru);
		
		JLabel lb_mau = new JLabel("Màu:");
		lb_mau.setBounds(301, 33, 53, 13);
		panel_sp1.add(lb_mau);
		
		JLabel lb_kichThuoc = new JLabel("Kích thước:");
		lb_kichThuoc.setBounds(301, 62, 69, 13);
		panel_sp1.add(lb_kichThuoc);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setBounds(364, 28, 60, 18);
		panel_sp1.add(comboBox_13);
		
		JComboBox comboBox_13_1 = new JComboBox();
		comboBox_13_1.setBounds(364, 58, 60, 18);
		panel_sp1.add(comboBox_13_1);
		
		btn_themVaoGio = new JButton("Thêm vào giỏ");
		btn_themVaoGio.setBounds(515, 49, 100, 21);
		panel_sp1.add(btn_themVaoGio);
		
		btn_chiTiet = new JButton("Chi tiết");
		btn_chiTiet.setBounds(515, 87, 100, 21);
		panel_sp1.add(btn_chiTiet);
		panel_sp.setLayout(gl_panel_sp);
		panel_danhSachSanPham.add(lb_timKiemsp);
		panel_danhSachSanPham.add(textField_17);
		panel_danhSachSanPham.add(lb_sanPham);
		panel_danhSachSanPham.add(cbb_sanPham);
		panel_danhSachSanPham.add(cbb_sanPham_1);
		panel_danhSachSanPham.add(lb_gia);
		
		panel_donHang = new JPanel();
		panel_donHang.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192)), "\u0110\u01A1n h\u00E0ng", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		panel_donHang.setBackground(Color.WHITE);
		panel_donHang.setBounds(708, 0, 342, 620);
		this.add(panel_donHang);
		panel_donHang.setLayout(null);
		
		panel_thongTinKhachHang = new JPanel();
		panel_thongTinKhachHang.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY));
		panel_thongTinKhachHang.setBackground(Color.WHITE);
		panel_thongTinKhachHang.setBounds(10, 23, 322, 78);
		panel_donHang.add(panel_thongTinKhachHang);
		panel_thongTinKhachHang.setLayout(null);
		
		lb_maKhachHang = new JLabel("Mã khách hàng:");
		lb_maKhachHang.setBounds(10, 18, 94, 13);
		panel_thongTinKhachHang.add(lb_maKhachHang);
		
		txt_maKhachHang = new JTextField();
		txt_maKhachHang.setEditable(false);
		txt_maKhachHang.setBounds(109, 15, 108, 19);
		panel_thongTinKhachHang.add(txt_maKhachHang);
		txt_maKhachHang.setColumns(10);
		
		lb_tenKhachHang = new JLabel("Tên khách hàng:");
		lb_tenKhachHang.setBounds(10, 44, 94, 13);
		panel_thongTinKhachHang.add(lb_tenKhachHang);
		
		textField_19 = new JTextField();
		textField_19.setText("");
		textField_19.setBounds(109, 41, 108, 19);
		panel_thongTinKhachHang.add(textField_19);
		textField_19.setColumns(10);
		
		btn_chonKhachHang = new JButton("Chọn");
		btn_chonKhachHang.setBounds(227, 11, 85, 27);
		panel_thongTinKhachHang.add(btn_chonKhachHang);
		
		btn_thayDoiKhachHang = new JButton("Thay đổi");
		btn_thayDoiKhachHang.setBounds(227, 40, 85, 27);
		panel_thongTinKhachHang.add(btn_thayDoiKhachHang);
		
		lb_maHoaDon = new JLabel("Mã hóa đơn:");
		lb_maHoaDon.setBounds(10, 128, 78, 13);
		panel_donHang.add(lb_maHoaDon);
		
		JButton btn_taoHoaDon = new JButton("Tạo");
		btn_taoHoaDon.setBounds(240, 121, 85, 27);
		panel_donHang.add(btn_taoHoaDon);
		
		JLabel lb_tongTien = new JLabel("Tổng tiền:");
		lb_tongTien.setBounds(10, 183, 78, 13);
		panel_donHang.add(lb_tongTien);
		
		txt_maHoaDon = new JTextField();
		txt_maHoaDon.setEditable(false);
		txt_maHoaDon.setBounds(98, 125, 96, 19);
		panel_donHang.add(txt_maHoaDon);
		txt_maHoaDon.setColumns(10);
		
		lb_giamGia = new JLabel("Giảm giá");
		lb_giamGia.setBounds(10, 225, 78, 13);
		panel_donHang.add(lb_giamGia);
		
		JLabel lb_tienNhan = new JLabel("Tiền nhận:");
		lb_tienNhan.setBounds(10, 331, 78, 13);
		panel_donHang.add(lb_tienNhan);
		
		JLabel lb_tienThua = new JLabel("Tiền thừa:");
		lb_tienThua.setBounds(10, 381, 78, 13);
		panel_donHang.add(lb_tienThua);
		
		JLabel lb_thue = new JLabel("Thuế:");
		lb_thue.setBounds(10, 278, 78, 13);
		panel_donHang.add(lb_thue);
		
		bnt_thanhToan = new JButton("Thanh toán");
		bnt_thanhToan.setFont(new Font("Tahoma", Font.PLAIN, 25));
		bnt_thanhToan.setBounds(36, 531, 279, 64);
		panel_donHang.add(bnt_thanhToan);
		
		btn_huyHoaDon = new JButton("Hủy hóa đơn");
		btn_huyHoaDon.setBounds(36, 488, 124, 33);
		panel_donHang.add(btn_huyHoaDon);
		
		btn_lamMoi = new JButton("Làm mới");
		btn_lamMoi.setBounds(196, 488, 124, 33);
		panel_donHang.add(btn_lamMoi);
		
		lb_donViTongTien = new JLabel("VND");
		lb_donViTongTien.setBounds(218, 183, 34, 13);
		panel_donHang.add(lb_donViTongTien);
		
		lb_donViGiamGia = new JLabel("VND");
		lb_donViGiamGia.setBounds(218, 225, 34, 13);
		panel_donHang.add(lb_donViGiamGia);
		
		lb_donViTienNhan = new JLabel("VND");
		lb_donViTienNhan.setBounds(218, 331, 34, 13);
		panel_donHang.add(lb_donViTienNhan);
		
		lb_donViTienThua = new JLabel("VND");
		lb_donViTienThua.setBounds(218, 381, 34, 13);
		panel_donHang.add(lb_donViTienThua);
		
		lb_donViThue = new JLabel("%");
		lb_donViThue.setBounds(218, 278, 34, 13);
		panel_donHang.add(lb_donViThue);
		
		lb_tongTien1 = new JLabel("5000000");
		lb_tongTien1.setBounds(98, 183, 78, 13);
		panel_donHang.add(lb_tongTien1);
		
		lb_giamGia1 = new JLabel("100000");
		lb_giamGia1.setBounds(98, 225, 78, 13);
		panel_donHang.add(lb_giamGia1);
		
		lb_tienThua1 = new JLabel("300000");
		lb_tienThua1.setBounds(98, 381, 78, 13);
		panel_donHang.add(lb_tienThua1);
		
		lb_thue1 = new JLabel("8");
		lb_thue1.setBounds(98, 278, 78, 13);
		panel_donHang.add(lb_thue1);
		
		txt_tienNhan = new JTextField();
		txt_tienNhan.setBounds(98, 328, 96, 19);
		panel_donHang.add(txt_tienNhan);
		txt_tienNhan.setColumns(10); 
		
	}

}
