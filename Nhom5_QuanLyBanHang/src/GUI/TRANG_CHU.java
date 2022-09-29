package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connect.ConnectDB;
import dao.DAO_LoaiSanPham;
import entity.LoaiSanPham;
import entity.SanPham;

import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.border.CompoundBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Panel;

import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TRANG_CHU extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panel_SP;
	private JButton btnHD;
	private JButton btnGD;
	private JButton btnSP;
	private JButton btnKH;
	private JButton btnTK;
	private JButton btnNV;
	private JButton btnAU;
	private JButton btnDX;
	private JPanel panel_trangchu;
	private JPanel panel_NV;
	private JTextField txtma;
	private JTextField txthoten;
	private JLabel lbl_ngaysinh;
	private JTextField txtngay;
	private JLabel lbl_sdt;
	private JTextField txtSDT;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lbl_matkhau;
	private JPasswordField passwordField;
	private JPanel panel_Timkiem;
	private JLabel lbl_ma_1;
	private JPanel panel_button_1;
	private JButton btnSuaNV;
	private JButton btnlammoi;
	private JButton btnThemNV;
	private JButton btnXoaNV;
	private JPanel panel_dsnv;
	private JScrollPane scrollPane;
	private JTable table_1;
	private JTextField textField_2;
	private JPanel panel_SanPham;
	private JPanel panel_Chitietsanpham;
	private JTextField txt_masp;
	private JButton btnChitietsanpham;
	private JScrollPane scrollPane_1;
	private JTable table;
	private JPanel panel;
	private JLabel lblNewLabel_4;
	private JComboBox comboBox_2;
	private JLabel lblNewLabel_5;
	private JTextField textField_4;
	private JLabel lblNewLabel_6;
	private JTextField textField_5;
	private JLabel lblNewLabel_7;
	private JTextField textField_6;
	private JLabel lblNewLabel_8;
	private JTextField textField_7;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JLabel lblNewLabel_11;
	private JComboBox comboBox_5;
	private JLabel lblNewLabel_12;
	private JComboBox comboBox_6;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JComboBox comboBox_7;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnThemsp;
	private JButton btnSuasp;
	private JButton btnLammoisp;
	private JButton btnXoasp;
	private JPanel panel_Locsanpham_1;
	private JPanel panel_Danhmuc_1;
	private JPanel panel_Xuatxu_1;
	private JPanel panel_Timkiemsp_1;
	private JLabel lblNewLabel_16;
	private JComboBox comboBox_8;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JScrollPane scrollPane_2;
	private JTable table_2;
	private JTextField textField_8;
	private JTextField textField_10;
	private JTextField textField_9;
	private JPanel panel_Locsanpham;
	private JPanel panel_Timkiemsp;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_21;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_22;
	private JComboBox comboBox_9;
	private JPanel panel_11;
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
	private JPanel panel_LocKhachHang;
	private JTextField txt_timKiemKhachHang;
	private JTable table_3;
	private JLabel lb_GT;
	private JPanel panel_7;
	private JScrollPane scrollPane_lichSuGiaoDich;
	private JTable table_4;
	private JLabel lbl_vaitro;
	private JComboBox comboBox11;
	private JTabbedPane tabbedPane_SP;
	private JPanel panel_KH;
	private JPanel panel_HD;
	private JPanel panel_hoaDon;
	private JLabel lb_timKiemHoaDon;
	private JPanel panel_tongTien;
	private JPanel panel_TG;
	private JScrollPane scrollPane_hoaDon;
	private JLabel lb_tongTien2;
	private JComboBox cbb_tongTien;
	private JLabel lb_thang;
	private JComboBox cbb_thang;
	private JLabel lb_nam;
	private JComboBox cbb_nam;
	private JTable table_hoaDon;
	private JPanel panel_hoaDonChiTiet;
	private JScrollPane scrollPane_hoaDonChiTiet;
	private JTable table_hoaDonChiTiet;
	private JPanel panel_BH;
	private JPanel panel_hoaDonCHo;
	private JPanel panel_gioHang;
	private JPanel panel_danhSachSanPham;
	private JPanel panel_donHang;
	private JScrollPane scrollPane_6;
	private JTable table_7;
	private JScrollPane scrollPane_7;
	private JTable table_8;
	private JButton btn_xoaSanPham;
	private JButton btn_xoaHet;
	private JLabel lb_timKiemsp;
	private JPanel panel_thongTinKhachHang;
	private JLabel lb_maKhachHang;
	private JTextField txt_maKhachHang;
	private JLabel lb_tenKhachHang;
	private JTextField textField_19;
	private JButton btn_chonKhachHang;
	private JButton btn_thayDoiKhachHang;
	private JLabel lb_maHoaDon;
	private JTextField txt_maHoaDon;
	private JButton bnt_thanhToan;
	private JButton btn_huyHoaDon;
	private JButton btn_lamMoi;
	private JLabel lb_donViTongTien;
	private JLabel lb_donViGiamGia;
	private JLabel lb_donViTienNhan;
	private JLabel lb_donViTienThua;
	private JLabel lb_donViThue;
	private JPanel panel_AU;
	private JLabel lblNewLabel_35;
	private JLabel lblNewLabel_36;
	private JLabel lblNewLabel_37;
	private JLabel lblNewLabel_38;
	private JLabel lblNewLabel_39;
	private JTextField textField_17;
	private JLabel lb_gia;
	private JComboBox cbb_sanPham_1;
	private JPanel panel_sp;
	private JPanel panel_sp1;
	private JScrollPane scrollPane_8;
	private JLabel lb_anhSanPham;
	private JLabel lb_tenSanPham;
	private JLabel lb_giaSanPham;
	private JTextField txt_soLuong;
	private JButton btn_themVaoGio;
	private JButton btn_chiTiet;
	private JPanel panel_sp1_1;
	private JLabel lb_anhSanPham_1;
	private JLabel lb_tenSanPham_1;
	private JLabel lb_giaSanPham_1;
	private JTextField textField_28;
	private JLabel lb_donViGia_1;
	private JButton btn_cong_1;
	private JButton btn_tru_1;
	private JLabel lb_mau_1;
	private JLabel lb_kichThuoc_1;
	private JComboBox comboBox_14;
	private JComboBox comboBox_13_2;
	private JButton btn_themVaoGio_1;
	private JButton btn_chiTiet_1;
	private JLabel lb_tongTien1;
	private JLabel lb_giamGia;
	private JLabel lb_giamGia1;
	private JLabel lb_tienThua1;
	private JLabel lb_thue1;
	private JTextField txt_tienNhan;
	private JTextField textField_16;
	private JButton btn_timKiem;
	private JPanel panel_right;
	private GUI_HoaDon panelHoaDon;
	private GUI_ThongKe panelThongKe;
	private GUI_KhachHang panelKhachHang;
	private GUI_BanHang panelBanHang;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TRANG_CHU frame = new TRANG_CHU();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TRANG_CHU() {
		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1305, 721);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel_CHINH = new JPanel();
		panel_CHINH.setBounds(0, 0, 1284, 695);
		contentPane.add(panel_CHINH);
		panel_CHINH.setLayout(null);
		
		
		
		// GIAO DIEN TRÁI// ********************************************************************************************************************************************************************
				/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		JPanel panel_left = new JPanel();
		panel_left.setBackground(new Color(255, 125, 125));
		panel_left.setForeground(new Color(0, 0, 0));
		panel_left.setBounds(0, 0, 229, 685);
		panel_CHINH.add(panel_left);
		GridBagLayout gbl_panel_left = new GridBagLayout();
		gbl_panel_left.columnWidths = new int[]{229, 0};
		gbl_panel_left.rowHeights = new int[]{30, 128, 47, 47, 47, 47, 47, 47, 47, 47, 0};
		gbl_panel_left.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_left.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_left.setLayout(gbl_panel_left);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(255, 64, 64));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\Girls-Blue-Dress-icon (2).png"));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.NORTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel_left.add(lblNewLabel, gbc_lblNewLabel);
		
		btnHD = new JButton("Hóa đơn");
		btnHD.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\order-removebg-preview (1) (1).png"));
		btnHD.setForeground(new Color(255, 255, 191));
		btnHD.setBackground(new Color(255, 125, 125));
		btnHD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHD.setBorder(null);
		btnHD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnHD = new GridBagConstraints();
		gbc_btnHD.fill = GridBagConstraints.BOTH;
		gbc_btnHD.insets = new Insets(0, 0, 5, 0);
		gbc_btnHD.gridx = 0;
		gbc_btnHD.gridy = 2;
		panel_left.add(btnHD, gbc_btnHD);
		btnHD.addActionListener(this);
		
		btnGD = new JButton("Giao dịch");
		btnGD.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\giaodich-removebg-preview (2) (1).png"));
		btnGD.setForeground(new Color(255, 255, 191));
		btnGD.setBackground(new Color(255, 125, 125));
		btnGD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGD.setBorder(null);
		GridBagConstraints gbc_btnGD = new GridBagConstraints();
		gbc_btnGD.fill = GridBagConstraints.BOTH;
		gbc_btnGD.insets = new Insets(0, 0, 5, 0);
		gbc_btnGD.gridx = 0;
		gbc_btnGD.gridy = 3;
		panel_left.add(btnGD, gbc_btnGD);
		btnGD.addActionListener(this);
		
		btnSP = new JButton("Sản phẩm");
		btnSP.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\sảnpham (1).png"));
		btnSP.setForeground(new Color(255, 255, 191));
		btnSP.setBackground(new Color(255, 125, 125));
		btnSP.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSP.setBorder(null);
		GridBagConstraints gbc_btnSP = new GridBagConstraints();
		gbc_btnSP.fill = GridBagConstraints.BOTH;
		gbc_btnSP.insets = new Insets(0, 0, 5, 0);
		gbc_btnSP.gridx = 0;
		gbc_btnSP.gridy = 4;
		panel_left.add(btnSP, gbc_btnSP);
		
			
		
			
			
			btnSP.addActionListener(this);
		
		btnKH = new JButton("Khách hàng");
		btnKH.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\khách_hang-removebg-preview (1).png"));
		btnKH.setForeground(new Color(255, 255, 191));
		btnKH.setBackground(new Color(255, 125, 125));
		btnKH.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnKH.setBorder(null);
		GridBagConstraints gbc_btnKH = new GridBagConstraints();
		gbc_btnKH.fill = GridBagConstraints.BOTH;
		gbc_btnKH.insets = new Insets(0, 0, 5, 0);
		gbc_btnKH.gridx = 0;
		gbc_btnKH.gridy = 5;
		panel_left.add(btnKH, gbc_btnKH);
		btnKH.addActionListener(this);
		
		btnTK = new JButton("Thống kê");
		btnTK.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\thongke-removebg-preview (1).png"));
		btnTK.setForeground(new Color(255, 255, 191));
		btnTK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTK.setBackground(new Color(255, 125, 125));
		btnTK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTK.setBorder(null);
		GridBagConstraints gbc_btnTK = new GridBagConstraints();
		gbc_btnTK.fill = GridBagConstraints.BOTH;
		gbc_btnTK.insets = new Insets(0, 0, 5, 0);
		gbc_btnTK.gridx = 0;
		gbc_btnTK.gridy = 6;
		panel_left.add(btnTK, gbc_btnTK);
		
		btnNV = new JButton("Nhân viên");
		btnNV.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\khachhang-removebg-preview (2) (1).png"));
		btnNV.setForeground(new Color(255, 255, 191));
		btnNV.setBackground(new Color(255, 125, 125));
		btnNV.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNV.setBorder(null);
		GridBagConstraints gbc_btnNV = new GridBagConstraints();
		gbc_btnNV.fill = GridBagConstraints.BOTH;
		gbc_btnNV.insets = new Insets(0, 0, 5, 0);
		gbc_btnNV.gridx = 0;
		gbc_btnNV.gridy = 7;
		panel_left.add(btnNV, gbc_btnNV);
		btnNV.addActionListener(this);
		
		btnAU = new JButton("about us");
		btnAU.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\about-removebg-preview (1) (1).png"));
		btnAU.setForeground(new Color(255, 255, 191));
		btnAU.setBackground(new Color(255, 125, 125));
		btnAU.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAU.setBorder(null);
		GridBagConstraints gbc_btnAU = new GridBagConstraints();
		gbc_btnAU.fill = GridBagConstraints.BOTH;
		gbc_btnAU.insets = new Insets(0, 0, 5, 0);
		gbc_btnAU.gridx = 0;
		gbc_btnAU.gridy = 8;
		panel_left.add(btnAU, gbc_btnAU);
		btnAU.addActionListener(this);
		
		btnDX = new JButton("Đăng xuất");
		btnDX.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\dãnguat-removebg-preview (1).png"));
		btnDX.setForeground(new Color(255, 255, 191));
		btnDX.setBackground(new Color(255, 125, 125));
		btnDX.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDX.setBorder(null);
		GridBagConstraints gbc_btnDX = new GridBagConstraints();
		gbc_btnDX.fill = GridBagConstraints.BOTH;
		gbc_btnDX.gridx = 0;
		gbc_btnDX.gridy = 9;
		panel_left.add(btnDX, gbc_btnDX);
		btnDX.addActionListener(this);
		

		// GIAO DIEN PHẢI// ********************************************************************************************************************************************************************
				/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		panel_right = new JPanel();
		panel_right.setBackground(new Color(206, 255, 255));
		panel_right.setBounds(229, 0, 1069, 685);
		panel_CHINH.add(panel_right);
		panel_right.setLayout(null);
		
		
		
		
		// GIAO DIEN BÁN HÀNG// ********************************************************************************************************************************************************************
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		panel_BH = new JPanel();
		panel_BH.setBackground(Color.WHITE);
		panel_BH.setBounds(0, 54, 1060, 630);
		panel_right.add(panel_BH);
		panel_BH.setLayout(null);
		
		panel_hoaDonCHo = new JPanel();
		panel_hoaDonCHo.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192)), "H\u00F3a \u0111\u01A1n ch\u1EDD", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		panel_hoaDonCHo.setBackground(Color.WHITE);
		panel_hoaDonCHo.setBounds(10, 0, 677, 137);
		panel_BH.add(panel_hoaDonCHo);
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
		panel_BH.add(panel_gioHang);
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
		panel_BH.add(panel_danhSachSanPham);
		
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
		panel_BH.add(panel_donHang);
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
		
		
		
		
		// GIAO DIEN HÓA ĐƠN// ********************************************************************************************************************************************************************
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		
		
		
		
		//GIAO DIỆN KHÁCH HÀNG//*************************************************************************************************************************************************************
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	   
		
		// GIAO DIỆN SẢN PHẨM//************************************************************************************************************************************************************
		
		
		
		
		// GIAO DIỆN NHÂN VIÊN//************************************************************************************************************************************************************
		
		
		
		//GIAO DIỆN ABOUT US // ****************************************************************************************************************************************************************
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
	    panel_AU = new JPanel();
		panel_AU.setBackground(new Color(255, 213, 213));
		panel_AU.setBounds(0, 54, 1060, 630);
		panel_right.add(panel_AU);
		panel_AU.setLayout(null);
		
		lblNewLabel_35 = new JLabel("OUR TEAM");
		lblNewLabel_35.setForeground(Color.RED);
		lblNewLabel_35.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_35.setBounds(446, 10, 246, 65);
		panel_AU.add(lblNewLabel_35);
		
		lblNewLabel_36 = new JLabel("");
		lblNewLabel_36.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\Downloads\\Minh (1).jpg"));
		lblNewLabel_36.setBounds(22, 91, 219, 233);
		panel_AU.add(lblNewLabel_36);
		
		lblNewLabel_37 = new JLabel("");
		lblNewLabel_37.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\Downloads\\PHI Minh (1).jpg"));
		lblNewLabel_37.setBounds(22, 360, 219, 233);
		panel_AU.add(lblNewLabel_37);
		
		lblNewLabel_38 = new JLabel("");
		lblNewLabel_38.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\Downloads\\Anh (1).jpg"));
		lblNewLabel_38.setBounds(541, 85, 219, 233);
		panel_AU.add(lblNewLabel_38);
		
		lblNewLabel_39 = new JLabel("");
		lblNewLabel_39.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\Downloads\\Chuong (1).jpg"));
		lblNewLabel_39.setBounds(541, 360, 219, 233);
		panel_AU.add(lblNewLabel_39);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(898, 10, 45, 13);
		panel_right.add(lblNewLabel_1); 
		
	
		btnSP.addActionListener(this);
		btnNV.addActionListener(this);
		btnHD.addActionListener(this);
		btnKH.addActionListener(this);
		btnTK.addActionListener(this);
		btnAU.addActionListener(this);
		btnDX.addActionListener(this);
		btnGD.addActionListener(this);
		
		panel_BH.setVisible(false);
		panel_AU.setVisible(false);
		
		
		panelBanHang=new GUI_BanHang();
		panelKhachHang=new GUI_KhachHang();
		panelHoaDon=new GUI_HoaDon();
		panelThongKe=new GUI_ThongKe();
		panel_SanPham=new GUI_SP();
		panel_right.add(panel_SanPham);
		
		panel_right.add(panelBanHang);
		panel_right.add(panelHoaDon);
		panel_right.add(panelThongKe);
		panel_right.add(panelKhachHang);
		
		panelHoaDon.setBounds(0, 54, 1060, 630);
		panelThongKe.setBounds(0, 54, 1060, 630);
		panelKhachHang.setBounds(0, 54, 1060, 630);
		panel_SanPham.setBounds(0, 54, 1060, 630);
		panel_AU.setVisible(true);
		panelHoaDon.setVisible(false);
		panelThongKe.setVisible(false);
		panelKhachHang.setVisible(false);
		panel_SanPham.setVisible(false);
		panelBanHang.setVisible(false);
		
	}
	/*private void doDuLieuVaoComboboxLoaiSanPham() {
		ArrayList<LoaiSanPham> list=new DAO_LoaiSanPham().getAllLoaiSanPham();
		for (LoaiSanPham loaiSanPham : list) {
			cbx_LoaiSanPham.addItem(loaiSanPham.getMaLoaiSanPham());
		}
	}
	private void doDuLieuVaoComboboxNhaCungCap() {
		ArrayList<NhaCungCap> list=new DAO_NhaCungCap().getAllNhaCungCap();
		for (NhaCungCap ncc : list) {
			cbx_NhaCungCap.addItem(ncc.getMaNhaCungCap().toString());
		}
	}*/
	private void doDulieuSP() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj.equals(btnSP)) {
			panel_AU.setVisible(false);
			panelHoaDon.setVisible(false);
			panelThongKe.setVisible(false);
			panelKhachHang.setVisible(false);
			panel_SanPham.setVisible(true);
		
		}
		else if(obj.equals(btnKH)) {
		
			panel_AU.setVisible(false);
			panelHoaDon.setVisible(false);
			panelThongKe.setVisible(false);
			panelKhachHang.setVisible(true);
			panel_SanPham.setVisible(false);
		}
		else if(obj.equals(btnNV)) {
			
		}
		else if(obj.equals(btnHD)) {
			panel_SanPham.setVisible(false);
			panel_AU.setVisible(false);
			panelThongKe.setVisible(false);
			panelHoaDon.setVisible(true);
			panelKhachHang.setVisible(false);
			panel_SanPham.setVisible(false);
			
			
		}
		else if(obj.equals(btnGD)) {
			panelBanHang.setVisible(true);
			panel_AU.setVisible(false);
			panelThongKe.setVisible(false);
			panelHoaDon.setVisible(false);
			panelKhachHang.setVisible(false);
			panel_SanPham.setVisible(false);
		}
		else if(obj.equals(btnAU)) {
			
		}else if(obj.equals(btnTK)) {
			panel_SanPham.setVisible(false);
			panel_AU.setVisible(false);
			panelHoaDon.setVisible(false);
			panelThongKe.setVisible(true);
			panelKhachHang.setVisible(false);
			panelBanHang.setVisible(false);
			
		}
		
	}
}
