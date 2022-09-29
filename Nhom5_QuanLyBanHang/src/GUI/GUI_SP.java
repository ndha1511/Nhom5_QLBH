package GUI;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Connect.ConnectDB;
import dao.DAO_SanPham;
import entity.SanPham;

public class GUI_SP extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txt_timSP;
	private JTextField txt_timLoaiSP;
	private JTextField txt_maLoaiSP;
	private JTextField txt_tenLoaiSP;
	private JTable tb_loaiSP, tb_ncc;
	private DefaultTableModel tb_model, tb_modelNCC;
	private JTextField txt_timNCC;
	private JTextField txt_maNCC;
	private JTextField textField_2;
	private JTextField txt_tenNCC;
	private JComboBox<String> cbb_gia, cbb_ncc, cbb_tinhTrang, cbb_loaiSP;
	private JScrollPane scr_loaiSP, scr_ncc, scr_sp;
	private JButton btn_timNCC;
	private JButton btn_xoaNCC;
	private JButton btn_xoaRong2;
	private JButton btn_themNCC;
	private JButton btn_suaNCC;
	private JLabel lb_maNCC;
	private JLabel lb_diaChiNCC;
	private JLabel lb_tenNCC;
	private JButton btn_themLoai;
	private JButton btn_xoaLoai;
	private JButton btn_suaLoai;
	private JButton btn_xoaRong;
	private JButton btn_timLoaiSP;
	private JButton btn_timSP;
	private JButton btn_themSP;
	private JPanel pn_dssp;

	/**
	 * Create the panel.
	 */
	public GUI_SP() {
		setLayout(null);

		JTabbedPane tabbedSP = new JTabbedPane(JTabbedPane.TOP);
		tabbedSP.setBounds(10, 11, 1040, 608);
		add(tabbedSP);

		/**
		 * Quản lý sản phẩm.
		 */
		try {
			ConnectDB.getInstance().connect();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JPanel pn_QLSP = new JPanel();
		tabbedSP.addTab("Quản lý sản phẩm", null, pn_QLSP, null);
		pn_QLSP.setLayout(null);

		JPanel pn_khungdssp = new JPanel();
		pn_khungdssp.setBorder(new LineBorder(new Color(0, 0, 0)));
		pn_khungdssp.setBounds(10, 136, 1015, 440);
		pn_QLSP.add(pn_khungdssp);
		pn_khungdssp.setLayout(null);

		JLabel lb_dssp = new JLabel("Danh sách sản phẩm");
		lb_dssp.setFont(new Font("Tahoma", Font.BOLD, 14));
		lb_dssp.setBounds(435, 20, 150, 15);
		pn_khungdssp.add(lb_dssp);

		scr_sp = new JScrollPane();
		scr_sp.setBounds(10, 45, 995, 384);
		pn_khungdssp.add(scr_sp);

		pn_dssp = new JPanel();
		scr_sp.setViewportView(pn_dssp);
		GroupLayout gl_pn_dssp = new GroupLayout(pn_dssp);
		gl_pn_dssp.setHorizontalGroup(
			gl_pn_dssp.createParallelGroup(Alignment.LEADING)
				.addGap(0, 995, Short.MAX_VALUE)
		);
		gl_pn_dssp.setVerticalGroup(
			gl_pn_dssp.createParallelGroup(Alignment.LEADING)
				.addGap(0, 384, Short.MAX_VALUE)
		);
		pn_dssp.setLayout(gl_pn_dssp);

		JLabel lb_loaiSP = new JLabel("Loại sản phẩm:");
		lb_loaiSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_loaiSP.setBounds(10, 55, 100, 25);
		pn_QLSP.add(lb_loaiSP);

		cbb_loaiSP = new JComboBox<>();
		cbb_loaiSP.setBounds(130, 55, 150, 25);
		pn_QLSP.add(cbb_loaiSP);

		JLabel lb_tinhTrang = new JLabel("Tình trạng:");
		lb_tinhTrang.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_tinhTrang.setBounds(10, 100, 100, 25);
		pn_QLSP.add(lb_tinhTrang);

		cbb_tinhTrang = new JComboBox<>();
		cbb_tinhTrang.setBounds(130, 100, 150, 25);
		pn_QLSP.add(cbb_tinhTrang);

		cbb_gia = new JComboBox<>();
		cbb_gia.setBounds(370, 55, 150, 25);
		pn_QLSP.add(cbb_gia);

		cbb_ncc = new JComboBox<>();
		cbb_ncc.setBounds(680, 55, 150, 25);
		pn_QLSP.add(cbb_ncc);

		JLabel lb_gia = new JLabel("Giá:");
		lb_gia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_gia.setBounds(320, 55, 50, 25);
		pn_QLSP.add(lb_gia);

		JLabel lb_ncc = new JLabel("Nhà cung cấp:");
		lb_ncc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_ncc.setBounds(560, 55, 100, 25);
		pn_QLSP.add(lb_ncc);

		btn_themSP = new JButton("Thêm mới");
		btn_themSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_themSP.setBounds(900, 10, 100, 30);
		pn_QLSP.add(btn_themSP);

		btn_timSP = new JButton("Tìm");
		btn_timSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_timSP.setBounds(310, 10, 100, 30);
		pn_QLSP.add(btn_timSP);
		
		
		/*panelSanPham.setLayout(new BoxLayout(panelSanPham, BoxLayout.Y_AXIS));
		ArrayList<SanPham> listSanPham=new DAO_SanPham().getAllSanPham();
		for (SanPham sanPham : listSanPham) {
			GroupPanel group=new GroupPanel(sanPham);
			panelSanPham.add(group);
		}	*/
		pn_dssp.setLayout(new BoxLayout(pn_dssp, BoxLayout.Y_AXIS));
		ArrayList<SanPham> list=new DAO_SanPham().getAllSanPham();
		for (SanPham sanPham : list) {
			GroupPanel group=new GroupPanel(sanPham);
			pn_dssp.add(group);
		}

		/**
		 * Quản lý loại sản phẩm
		 */
		txt_timSP = new JTextField();
		txt_timSP.setBounds(10, 10, 300, 30);
		pn_QLSP.add(txt_timSP);
		txt_timSP.setColumns(10);

		JPanel pn_loaiSP = new JPanel();
		tabbedSP.addTab("Quản lý loại sản phẩm", null, pn_loaiSP, null);
		pn_loaiSP.setLayout(null);

		JLabel lb_maLoaiSP = new JLabel("Mã loại:");
		lb_maLoaiSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_maLoaiSP.setBounds(10, 70, 100, 30);
		pn_loaiSP.add(lb_maLoaiSP);

		JLabel lb_tenLoaiSP = new JLabel("Tên loại:");
		lb_tenLoaiSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_tenLoaiSP.setBounds(10, 120, 100, 30);
		pn_loaiSP.add(lb_tenLoaiSP);

		txt_timLoaiSP = new JTextField();
		txt_timLoaiSP.setBounds(10, 10, 300, 30);
		pn_loaiSP.add(txt_timLoaiSP);
		txt_timLoaiSP.setColumns(10);

		btn_timLoaiSP = new JButton("Tìm");
		btn_timLoaiSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_timLoaiSP.setBounds(310, 10, 100, 30);
		pn_loaiSP.add(btn_timLoaiSP);

		txt_maLoaiSP = new JTextField();
		txt_maLoaiSP.setColumns(10);
		txt_maLoaiSP.setBounds(110, 70, 900, 30);
		pn_loaiSP.add(txt_maLoaiSP);

		txt_tenLoaiSP = new JTextField();
		txt_tenLoaiSP.setColumns(10);
		txt_tenLoaiSP.setBounds(110, 120, 900, 30);
		pn_loaiSP.add(txt_tenLoaiSP);

		btn_themLoai = new JButton("Thêm");
		btn_themLoai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_themLoai.setBounds(110, 180, 100, 30);
		pn_loaiSP.add(btn_themLoai);

		btn_xoaLoai = new JButton("Xóa");
		btn_xoaLoai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_xoaLoai.setBounds(330, 180, 100, 30);
		pn_loaiSP.add(btn_xoaLoai);

		btn_suaLoai = new JButton("Sửa");
		btn_suaLoai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_suaLoai.setBounds(550, 180, 100, 30);
		pn_loaiSP.add(btn_suaLoai);

		btn_xoaRong = new JButton("Xóa rỗng");
		btn_xoaRong.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_xoaRong.setBounds(770, 180, 100, 30);
		pn_loaiSP.add(btn_xoaRong);

		String tieuDeCot[] = { "Mã loại", "Tên loại" };
		tb_model = new DefaultTableModel(tieuDeCot, 0);

		scr_loaiSP = new JScrollPane();
		scr_loaiSP.setBounds(10, 248, 1015, 321);
		pn_loaiSP.add(scr_loaiSP);

		tb_loaiSP = new JTable();
		scr_loaiSP.setViewportView(tb_loaiSP);
		tb_loaiSP.setModel(tb_model);

		/**
		 * Quản lý nhà cung cấp
		 */
		JPanel pn_QLNCC = new JPanel();
		tabbedSP.addTab("Quản lý nhà cung cấp", null, pn_QLNCC, null);
		pn_QLNCC.setLayout(null);

		txt_timNCC = new JTextField();
		txt_timNCC.setBounds(10, 10, 300, 30);
		pn_QLNCC.add(txt_timNCC);
		txt_timNCC.setColumns(10);

		txt_maNCC = new JTextField();
		txt_maNCC.setColumns(10);
		txt_maNCC.setBounds(160, 70, 300, 30);
		pn_QLNCC.add(txt_maNCC);

		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(160, 120, 840, 30);
		pn_QLNCC.add(textField_2);

		txt_tenNCC = new JTextField();
		txt_tenNCC.setColumns(10);
		txt_tenNCC.setBounds(700, 70, 300, 30);
		pn_QLNCC.add(txt_tenNCC);

		btn_timNCC = new JButton("Tìm");
		btn_timNCC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_timNCC.setBounds(310, 10, 100, 30);
		pn_QLNCC.add(btn_timNCC);

		btn_xoaNCC = new JButton("Xóa");
		btn_xoaNCC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_xoaNCC.setBounds(330, 180, 100, 30);
		pn_QLNCC.add(btn_xoaNCC);

		btn_xoaRong2 = new JButton("Xóa rỗng");
		btn_xoaRong2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_xoaRong2.setBounds(770, 180, 100, 30);
		pn_QLNCC.add(btn_xoaRong2);

		btn_themNCC = new JButton("Thêm");
		btn_themNCC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_themNCC.setBounds(110, 180, 100, 30);
		pn_QLNCC.add(btn_themNCC);

		btn_suaNCC = new JButton("Sửa");
		btn_suaNCC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_suaNCC.setBounds(550, 180, 100, 30);
		pn_QLNCC.add(btn_suaNCC);

		lb_maNCC = new JLabel("Mã nhà cung cấp:");
		lb_maNCC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_maNCC.setBounds(10, 70, 150, 30);
		pn_QLNCC.add(lb_maNCC);

		lb_diaChiNCC = new JLabel("Địa chỉ:");
		lb_diaChiNCC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_diaChiNCC.setBounds(10, 120, 150, 30);
		pn_QLNCC.add(lb_diaChiNCC);

		lb_tenNCC = new JLabel("Tên nhà cung cấp:");
		lb_tenNCC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_tenNCC.setBounds(550, 70, 150, 30);
		pn_QLNCC.add(lb_tenNCC);

		String tieuDe[] = { "Mã nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ" };
		tb_modelNCC = new DefaultTableModel(tieuDe, 0);

		scr_ncc = new JScrollPane();
		scr_ncc.setBounds(10, 248, 1015, 321);
		pn_QLNCC.add(scr_ncc);

		
		
		tb_ncc = new JTable();
		scr_ncc.setViewportView(tb_ncc);
		tb_ncc.setModel(tb_modelNCC);
		btn_themSP.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj.equals(btn_themSP)) {
			new GUI_ThemSP().setVisible(true);
		}

	}
}
