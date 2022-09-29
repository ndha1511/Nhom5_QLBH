package GUI;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Image;

import javax.swing.border.LineBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_ThongKe extends JPanel {
	private JTable table_SanPhamDaBan;
	private JTable table;
	private JTable table_SanPhamHetHang;
	private JTable table_SanPhamSapHetHang;
	private JTable table_1;
	private JTable table_ThongKeKhachHang;
	private JTable table_TKHoaDon;

	/**
	 * Create the panel.
	 */
	public GUI_ThongKe() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBackground(Color.WHITE);
		setLayout(null);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(527, 5, 5, 5);
		add(tabbedPane);
		
		JPanel panel_TkTongHoaDon = new JPanel();
		panel_TkTongHoaDon.setBackground(Color.CYAN);
		panel_TkTongHoaDon.setBounds(10, 5, 245, 150);
		add(panel_TkTongHoaDon);
		panel_TkTongHoaDon.setLayout(null);
		
		
	
		
		JLabel lblHoaDon = new JLabel("ICON HoaDon");
		lblHoaDon.setBounds(10, 11, 89, 128);
		lblHoaDon.setIcon(new ImageIcon(new ImageIcon("/HoáDon.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));

		panel_TkTongHoaDon.add(lblHoaDon);
		
		JLabel lblThongKeTongHoaDon = new JLabel("TỔNG HOÁ ĐƠN");
		lblThongKeTongHoaDon.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblThongKeTongHoaDon.setBounds(109, 22, 136, 21);
		panel_TkTongHoaDon.add(lblThongKeTongHoaDon);
		
		JLabel lbl_SoThongKeTongHoaDon = new JLabel("127");
		lbl_SoThongKeTongHoaDon.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lbl_SoThongKeTongHoaDon.setBounds(109, 54, 101, 85);
		panel_TkTongHoaDon.add(lbl_SoThongKeTongHoaDon);
		
		JPanel panel_TKTongKhachHang = new JPanel();
		panel_TKTongKhachHang.setBackground(Color.GREEN);
		panel_TKTongKhachHang.setBounds(272, 5, 245, 150);
		add(panel_TKTongKhachHang);
		panel_TKTongKhachHang.setLayout(null);
		
		JLabel lbl_iconKhachHang = new JLabel("ICON KhachHang");
		lbl_iconKhachHang.setBounds(10, 11, 100, 128);
		panel_TKTongKhachHang.add(lbl_iconKhachHang);
		
		JLabel lbL_titileTKTongKhachHang = new JLabel("TỔNG KHÁCH HÀNG");
		lbL_titileTKTongKhachHang.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbL_titileTKTongKhachHang.setBounds(115, 23, 120, 14);
		panel_TKTongKhachHang.add(lbL_titileTKTongKhachHang);
		
		JLabel lblNewLabel = new JLabel("37");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 37));
		lblNewLabel.setBounds(120, 48, 115, 91);
		panel_TKTongKhachHang.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		panel_2.setBounds(535, 5, 245, 150);
		add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbl_IconTongTienBan = new JLabel("ICON Tổng tiền bán");
		lbl_IconTongTienBan.setBounds(0, 0, 89, 139);
		panel_2.add(lbl_IconTongTienBan);
		
		JLabel lblNewLabel_1 = new JLabel("TỔNG TIỀN BÁN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(104, 21, 131, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1000.0000.000 VND");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(104, 56, 131, 83);
		panel_2.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.YELLOW);
		panel_3.setBounds(805, 5, 245, 150);
		add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("icon LoiNhuan");
		lblNewLabel_3.setBounds(0, 0, 108, 150);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("LỢI NHUẬN");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(86, 22, 149, 14);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("800.000.000 VND");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(86, 47, 149, 92);
		panel_3.add(lblNewLabel_5);
		
		JComboBox cbx_thoiGianThongKe = new JComboBox();
		cbx_thoiGianThongKe.setBounds(126, 167, 129, 30);
		add(cbx_thoiGianThongKe);
		
		JLabel lblNewLabel_6 = new JLabel("Thời gian");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 166, 106, 30);
		add(lblNewLabel_6);
		
		JTabbedPane tab_ThongKeSanPham = new JTabbedPane(JTabbedPane.TOP);
		tab_ThongKeSanPham.setBounds(10, 205, 1040, 414);
		add(tab_ThongKeSanPham);
		
		JPanel panel_ThongKeSanPham = new JPanel();
		tab_ThongKeSanPham.addTab("Thống Kê Sản Phẩm", null, panel_ThongKeSanPham, null);
		panel_ThongKeSanPham.setLayout(null);
		
		JTabbedPane tabSanPham = new JTabbedPane(JTabbedPane.TOP);
		tabSanPham.setBackground(Color.WHITE);
		tabSanPham.setBounds(0, 5, 1035, 381);
		panel_ThongKeSanPham.add(tabSanPham);
		
		JPanel panel_SanPhamDaBan = new JPanel();
		panel_SanPhamDaBan.setBackground(Color.WHITE);
		tabSanPham.addTab("Sản phẩm đã bán", null, panel_SanPhamDaBan, null);
		panel_SanPhamDaBan.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 1010, 197);
		panel_SanPhamDaBan.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "Gi\u00E1", "S\u1ED1 l\u01B0\u1EE3ng b\u00E1n", "Lo\u1EA1i s\u1EA3n ph\u1EA9m", "Nh\u00E0 cung c\u1EA5p", "T\u1ED5ng ti\u1EC1n b\u00E1n"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblTKSanPhamBanChayNhat = new JLabel("Sản phẩm bán chạy nhất");
		lblTKSanPhamBanChayNhat.setBounds(10, 219, 172, 28);
		panel_SanPhamDaBan.add(lblTKSanPhamBanChayNhat);
		
		JLabel lblSanPhamBanChayNhat = new JLabel("Áo");
		lblSanPhamBanChayNhat.setBounds(183, 226, 152, 14);
		panel_SanPhamDaBan.add(lblSanPhamBanChayNhat);
		
		JLabel lblLoiSnPhm = new JLabel("Loại sản phẩm bán chạy nhất");
		lblLoiSnPhm.setBounds(10, 258, 172, 28);
		panel_SanPhamDaBan.add(lblLoiSnPhm);
		
		JLabel lblLoaiSanPhamBanChayNhat = new JLabel("Áo");
		lblLoaiSanPhamBanChayNhat.setBounds(183, 265, 152, 14);
		panel_SanPhamDaBan.add(lblLoaiSanPhamBanChayNhat);
		
		JLabel lblLoiSnPhm_1 = new JLabel("Nhà cung cấp bán chạy nhất");
		lblLoiSnPhm_1.setBounds(10, 297, 172, 28);
		panel_SanPhamDaBan.add(lblLoiSnPhm_1);
		
		JLabel lbl_Nhacunngcapbanchaynhat = new JLabel("Áo");
		lbl_Nhacunngcapbanchaynhat.setBounds(183, 304, 152, 14);
		panel_SanPhamDaBan.add(lbl_Nhacunngcapbanchaynhat);
		
		JButton btn_Excel_SanPhamDaBan = new JButton("IN EXCEL");
		btn_Excel_SanPhamDaBan.setBounds(0, 330, 121, 23);
		panel_SanPhamDaBan.add(btn_Excel_SanPhamDaBan);
		
		
		
		JPanel panel_SanPhamHetHang = new JPanel();
		tabSanPham.addTab("Sản phẩm hết hàng", null, panel_SanPhamHetHang, null);
		panel_SanPhamHetHang.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 1020, 310);
		panel_SanPhamHetHang.add(scrollPane_1);
		
		table_SanPhamHetHang = new JTable();
		table_SanPhamHetHang.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "Gi\u00E1", "Lo\u1EA1i s\u1EA3n ph\u1EA9m", "Nh\u00E0 cunng c\u1EA5p"
			}
		));
		scrollPane_1.setViewportView(table_SanPhamHetHang);
		
		JButton btn_Excel_SanPhamHetHang = new JButton("IN EXCEL");
		btn_Excel_SanPhamHetHang.setBounds(0, 321, 121, 23);
		panel_SanPhamHetHang.add(btn_Excel_SanPhamHetHang);
		tabSanPham.setForegroundAt(1, Color.BLACK);
		
		JPanel panel_SanPhamSapHetHang = new JPanel();
		tabSanPham.addTab("Sản phẩm sắp hết hàng", null, panel_SanPhamSapHetHang, null);
		panel_SanPhamSapHetHang.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 1020, 312);
		panel_SanPhamSapHetHang.add(scrollPane_2);
		
		table_SanPhamSapHetHang = new JTable();
		table_SanPhamSapHetHang.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, "", null, null},
			},
			new String[] {
				"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "S\u1ED1 l\u01B0\u1EE3ng t\u1ED3n", "Lo\u1EA1i s\u1EA3n ph\u1EA9m", "Nh\u00E0 cung c\u1EA5p"
			}
		));
		table_SanPhamSapHetHang.getColumnModel().getColumn(0).setPreferredWidth(98);
		table_SanPhamSapHetHang.getColumnModel().getColumn(1).setPreferredWidth(103);
		table_SanPhamSapHetHang.getColumnModel().getColumn(3).setPreferredWidth(95);
		table_SanPhamSapHetHang.getColumnModel().getColumn(4).setPreferredWidth(90);
		scrollPane_2.setViewportView(table_SanPhamSapHetHang);
		
		JButton btn_Excel_SanPhamSapHetHang = new JButton("IN EXCEL");
		btn_Excel_SanPhamSapHetHang.setBounds(0, 323, 121, 23);
		panel_SanPhamSapHetHang.add(btn_Excel_SanPhamSapHetHang);
		
		JPanel panel_ThongKeDoanhThu = new JPanel();
		panel_ThongKeDoanhThu.setBackground(Color.WHITE);
		tab_ThongKeSanPham.addTab("Thống Kê Doanh Thu", null, panel_ThongKeDoanhThu, null);
		panel_ThongKeDoanhThu.setLayout(null);
		
		JPanel panel_chon = new JPanel();
		panel_chon.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_chon.setBounds(10, 11, 175, 327);
		panel_ThongKeDoanhThu.add(panel_chon);
		panel_chon.setLayout(null);
		
		JRadioButton rdb_hom = new JRadioButton("Biểu đồ");
		rdb_hom.setBounds(6, 151, 111, 23);
		panel_chon.add(rdb_hom);
		
		JRadioButton rdbtnBng = new JRadioButton("Bảng");
		rdbtnBng.setBounds(6, 195, 111, 23);
		panel_chon.add(rdbtnBng);
		
		JLabel lblNewLabel_7 = new JLabel("Chọn năm");
		lblNewLabel_7.setBounds(10, 82, 49, 14);
		panel_chon.add(lblNewLabel_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(6, 107, 74, 22);
		panel_chon.add(comboBox);
		
		JPanel panel_KetQuaThongKeDoanhThu = new JPanel();
		panel_KetQuaThongKeDoanhThu.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_KetQuaThongKeDoanhThu.setBounds(195, 11, 830, 364);
		panel_ThongKeDoanhThu.add(panel_KetQuaThongKeDoanhThu);
		panel_KetQuaThongKeDoanhThu.setLayout(null);
		
		JButton btn_InExcelDoanhThu = new JButton("IN EXCEL");
		btn_InExcelDoanhThu.setBounds(10, 349, 175, 23);
		panel_ThongKeDoanhThu.add(btn_InExcelDoanhThu);
		
		JPanel panel_ThongKeKhachHang = new JPanel();
		panel_ThongKeKhachHang.setBackground(Color.WHITE);
		tab_ThongKeSanPham.addTab("Thống Kê Khách Hàng", null, panel_ThongKeKhachHang, null);
		panel_ThongKeKhachHang.setLayout(null);
		
		JPanel panel_LuaChonThongKeKH = new JPanel();
		panel_LuaChonThongKeKH.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_LuaChonThongKeKH.setBounds(10, 11, 200, 327);
		panel_ThongKeKhachHang.add(panel_LuaChonThongKeKH);
		panel_LuaChonThongKeKH.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Hôm nay");
		rdbtnNewRadioButton.setBounds(16, 78, 111, 23);
		panel_LuaChonThongKeKH.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnTun = new JRadioButton("Tuần");
		rdbtnTun.setBounds(16, 128, 111, 23);
		panel_LuaChonThongKeKH.add(rdbtnTun);
		
		JRadioButton rdbtnThng = new JRadioButton("Tháng");
		rdbtnThng.setBounds(16, 176, 111, 23);
		panel_LuaChonThongKeKH.add(rdbtnThng);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(232, 11, 793, 364);
		panel_ThongKeKhachHang.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 783, 353);
		panel_1.add(scrollPane_3);
		
		table_ThongKeKhachHang = new JTable();
		table_ThongKeKhachHang.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
			},
			new String[] {
				"M\u00E3 kh\u00E1ch h\u00E0ng", "T\u00EAn kh\u00E1ch h\u00E0ng", "S\u1ED1 s\u1EA3n ph\u1EA9m mua", "T\u1ED5ng ti\u1EC1n mua"
			}
		));
		table_ThongKeKhachHang.getColumnModel().getColumn(1).setPreferredWidth(130);
		table_ThongKeKhachHang.getColumnModel().getColumn(2).setPreferredWidth(132);
		table_ThongKeKhachHang.getColumnModel().getColumn(3).setPreferredWidth(120);
		scrollPane_3.setViewportView(table_ThongKeKhachHang);
		
		table_1 = new JTable();
		table_1.setBounds(0, 0, 1, 1);
		panel_ThongKeKhachHang.add(table_1);
		
		JButton btn_InExcelKhachHang = new JButton("IN EXCEL");
		btn_InExcelKhachHang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_InExcelKhachHang.setBounds(10, 349, 200, 26);
		panel_ThongKeKhachHang.add(btn_InExcelKhachHang);
		
		JPanel panel_ThongKehoaDon = new JPanel();
		tab_ThongKeSanPham.addTab("Thống Kê Hoá Đơn", null, panel_ThongKehoaDon, null);
		panel_ThongKehoaDon.setLayout(null);
		
		JPanel panel_LuaChonThongKeKH_1 = new JPanel();
		panel_LuaChonThongKeKH_1.setLayout(null);
		panel_LuaChonThongKeKH_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_LuaChonThongKeKH_1.setBounds(10, 24, 200, 327);
		panel_ThongKehoaDon.add(panel_LuaChonThongKeKH_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Hôm nay");
		rdbtnNewRadioButton_1.setBounds(16, 78, 111, 23);
		panel_LuaChonThongKeKH_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnTun_1 = new JRadioButton("Tuần");
		rdbtnTun_1.setBounds(16, 128, 111, 23);
		panel_LuaChonThongKeKH_1.add(rdbtnTun_1);
		
		JRadioButton rdbtnThng_1 = new JRadioButton("Tháng");
		rdbtnThng_1.setBounds(16, 176, 111, 23);
		panel_LuaChonThongKeKH_1.add(rdbtnThng_1);
		
		JButton btn_InExcelHoaDon = new JButton("IN EXCEL");
		btn_InExcelHoaDon.setBounds(10, 349, 200, 26);
		panel_ThongKehoaDon.add(btn_InExcelHoaDon);
		
		JPanel panel = new JPanel();
		panel.setBounds(220, 24, 805, 320);
		panel_ThongKehoaDon.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(10, 11, 785, 298);
		panel.add(scrollPane_4);
		
		table_TKHoaDon = new JTable();
		table_TKHoaDon.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 Ho\u00E1 \u0110\u01A1n", "M\u00E3 Kh\u00E1ch h\u00E0ng", "M\u00E3 nh\u00E2n vi\u00EAn", "Th\u1EDDi gian", "T\u1ED5ng th\u00E0nh ti\u1EC1n"
			}
		));
		table_TKHoaDon.getColumnModel().getColumn(4).setPreferredWidth(105);
		scrollPane_4.setViewportView(table_TKHoaDon);

	}
}
