package GUI;

import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class GUI_HoaDon extends JPanel {

	private JPanel panel_hoaDon;
	private JLabel lb_timKiemHoaDon;
	private JPanel panel_tongTien;
	private JLabel lb_tongTien2;
	private JComboBox cbb_tongTien;
	private JPanel panel_TG;
	private JLabel lb_thang;
	private JComboBox cbb_thang;
	private JLabel lb_nam;
	private JComboBox cbb_nam;
	private JScrollPane scrollPane_hoaDon;
	private JTable table_hoaDon;
	private JTextField textField_16;
	private JButton btn_timKiem;
	private JComponent panel_hoaDonChiTiet;
	private JScrollPane scrollPane_hoaDonChiTiet;
	private JTable table_hoaDonChiTiet;

	/**
	 * Create the panel.
	 */
	public GUI_HoaDon() {
		
		this.setBackground(Color.WHITE);
		//this.setBounds(0, 54, 1060, 630);
		
		this.setLayout(null);
		
		panel_hoaDon = new JPanel();
		panel_hoaDon.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192)), "H\u00F3a \u0111\u01A1n", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		panel_hoaDon.setBackground(Color.WHITE);
		panel_hoaDon.setBounds(10, 10, 1015, 364);
		this.add(panel_hoaDon);
		panel_hoaDon.setLayout(null);
		
		lb_timKiemHoaDon = new JLabel("Tìm kiếm hóa đơn:");
		lb_timKiemHoaDon.setBounds(28, 30, 136, 13);
		panel_hoaDon.add(lb_timKiemHoaDon);
		
		panel_tongTien = new JPanel();
		panel_tongTien.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY));
		panel_tongTien.setBackground(Color.WHITE);
		panel_tongTien.setBounds(486, 30, 209, 62);
		panel_hoaDon.add(panel_tongTien);
		panel_tongTien.setLayout(null);
		
		lb_tongTien2 = new JLabel("Tổng tiền:");
		lb_tongTien2.setBounds(9, 9, 176, 13);
		panel_tongTien.add(lb_tongTien2);
		
		cbb_tongTien = new JComboBox();
		cbb_tongTien.setBounds(9, 26, 176, 21);
		panel_tongTien.add(cbb_tongTien);
		
		panel_TG = new JPanel();
		panel_TG.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY, Color.LIGHT_GRAY));
		panel_TG.setBackground(Color.WHITE);
		panel_TG.setBounds(771, 30, 209, 62);
		panel_hoaDon.add(panel_TG);
		panel_TG.setLayout(null);
		
		lb_thang = new JLabel("Tháng");
		lb_thang.setBounds(9, 9, 29, 13);
		panel_TG.add(lb_thang);
		
		cbb_thang = new JComboBox();
		cbb_thang.setBounds(9, 26, 75, 21);
		panel_TG.add(cbb_thang);
		
		lb_nam = new JLabel("Năm");
		lb_nam.setBounds(88, 9, 21, 13);
		panel_TG.add(lb_nam);
		
		cbb_nam = new JComboBox();
		cbb_nam.setBounds(88, 26, 75, 21);
		panel_TG.add(cbb_nam);
		
		scrollPane_hoaDon = new JScrollPane();
		scrollPane_hoaDon.setBounds(28, 102, 952, 252);
		panel_hoaDon.add(scrollPane_hoaDon);
		
		table_hoaDon = new JTable();
		table_hoaDon.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 h\u00F3a \u0111\u01A1n", "T\u1ED5ng ti\u1EC1n", "Thanh to\u00E1n", "Ti\u1EC1n th\u1EEBa", "Ti\u1EC1n nh\u1EADn", "Ng\u00E0y l\u1EADp h\u00F3a \u0111\u01A1n", "Tr\u1EA1ng th\u00E1i thanh to\u00E1n", "M\u00E3 NV", "T\u00EAn NV", "M\u00E3 KH", "T\u00EAn KH", "Ghi ch\u00FA"
			}
		));
		scrollPane_hoaDon.setViewportView(table_hoaDon);
		
		textField_16 = new JTextField();
		textField_16.setBounds(131, 27, 96, 19);
		panel_hoaDon.add(textField_16);
		textField_16.setColumns(10);
		
		btn_timKiem = new JButton("Tìm kiếm");
		btn_timKiem.setBounds(245, 26, 85, 21);
		panel_hoaDon.add(btn_timKiem);
		
		panel_hoaDonChiTiet = new JPanel();
		panel_hoaDonChiTiet.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192), new Color(192, 192, 192)), "H\u00F3a \u0111\u01A1n chi ti\u1EBFt", TitledBorder.LEADING, TitledBorder.ABOVE_TOP, null, null));
		panel_hoaDonChiTiet.setBackground(Color.WHITE);
		panel_hoaDonChiTiet.setBounds(10, 384, 1015, 231);
		this.add(panel_hoaDonChiTiet);
		panel_hoaDonChiTiet.setLayout(null);
		
		scrollPane_hoaDonChiTiet = new JScrollPane();
		scrollPane_hoaDonChiTiet.setBounds(27, 27, 956, 194);
		panel_hoaDonChiTiet.add(scrollPane_hoaDonChiTiet);
		
		table_hoaDonChiTiet = new JTable();
		table_hoaDonChiTiet.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 h\u00F3a \u0111\u01A1n", "M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n gi\u00E1", "Thu\u1EBF", "Th\u00E0nh ti\u1EC1n"
			}
		));
		scrollPane_hoaDonChiTiet.setViewportView(table_hoaDonChiTiet);
	}

}
