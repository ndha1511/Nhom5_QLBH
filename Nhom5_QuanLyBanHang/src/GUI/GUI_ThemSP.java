package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

public class GUI_ThemSP extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_tenSP;
	private JTextField txt_giaNhap;
	private JTextField txt_giaBan;
	private JTextField txt_soLuong;
	private JTextField txt_mauSac;
	private JTextField txt_maSP;
	private JTextField txt_xuatXu;
	private JComboBox<String> cbb_ncc, cbb_loaiSP, cbb_kichThuocSP;
	private JButton btn_themAnh;
	private JButton btn_Luu;
	private JButton btn_Thoat;
	private JPanel pn_anh;
	private JLabel lb_anh;
	private JButton btn_tru;
	private JButton btn_cong;
	private int i = 1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					GUI_ThemSP frame = new GUI_ThemSP();
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
	public GUI_ThemSP() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb_tieuDe = new JLabel("Thêm sản phẩm");
		lb_tieuDe.setFont(new Font("Tahoma", Font.BOLD, 16));
		lb_tieuDe.setBounds(340, 10, 150, 20);
		contentPane.add(lb_tieuDe);
		
		
		
		JLabel lb_tenSP = new JLabel("Tên sản phẩm:");
		lb_tenSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_tenSP.setBounds(200, 40, 100, 30);
		contentPane.add(lb_tenSP);
		
		JLabel lb_giaNhap = new JLabel("Giá nhập:");
		lb_giaNhap.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_giaNhap.setBounds(200, 90, 100, 30);
		contentPane.add(lb_giaNhap);
		
		JLabel lb_giaBan = new JLabel("Giá bán:");
		lb_giaBan.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_giaBan.setBounds(200, 140, 100, 30);
		contentPane.add(lb_giaBan);
		
		pn_anh = new JPanel();
		pn_anh.setBackground(new Color(0, 255, 0));
		pn_anh.setBounds(10, 40, 170, 170);
		contentPane.add(pn_anh);
		pn_anh.setLayout(null);
		
		lb_anh = new JLabel("");
		lb_anh.setBounds(10, 11, 150, 148);
		pn_anh.add(lb_anh);
		
		JLabel lb_maSP = new JLabel("Mã sản phẩm:");
		lb_maSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_maSP.setBounds(520, 40, 100, 30);
		contentPane.add(lb_maSP);
		
		JLabel lb_xuatXu = new JLabel("Xuất xứ:");
		lb_xuatXu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_xuatXu.setBounds(520, 90, 100, 30);
		contentPane.add(lb_xuatXu);
		
		JLabel lb_ncc = new JLabel("Nhà cung cấp:");
		lb_ncc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_ncc.setBounds(520, 140, 100, 30);
		contentPane.add(lb_ncc);
		
		JLabel lb_soLuong = new JLabel("Số lượng:");
		lb_soLuong.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_soLuong.setBounds(200, 190, 100, 30);
		contentPane.add(lb_soLuong);
		
		JLabel lb_mauSac = new JLabel("Màu sắc:");
		lb_mauSac.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_mauSac.setBounds(200, 240, 100, 30);
		contentPane.add(lb_mauSac);
		
		JLabel lb_moTa = new JLabel("Mô tả:");
		lb_moTa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_moTa.setBounds(200, 290, 100, 30);
		contentPane.add(lb_moTa);
		
		JLabel lb_loaiSP = new JLabel("Loại:");
		lb_loaiSP.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_loaiSP.setBounds(520, 190, 100, 30);
		contentPane.add(lb_loaiSP);
		
		JLabel lb_kichThuoc = new JLabel("Kích thước:");
		lb_kichThuoc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lb_kichThuoc.setBounds(520, 240, 100, 30);
		contentPane.add(lb_kichThuoc);
		
		btn_themAnh = new JButton("Thêm ảnh");
		btn_themAnh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_themAnh.setBounds(10, 220, 170, 40);
		contentPane.add(btn_themAnh);
		
		btn_Luu = new JButton("Lưu");
		btn_Luu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_Luu.setBounds(500, 470, 150, 40);
		contentPane.add(btn_Luu);
		
		btn_Thoat = new JButton("Thoát");
		btn_Thoat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_Thoat.setBounds(670, 470, 150, 40);
		contentPane.add(btn_Thoat);
		
		txt_tenSP = new JTextField();
		txt_tenSP.setBounds(300, 40, 200, 30);
		contentPane.add(txt_tenSP);
		txt_tenSP.setColumns(10);
		
		txt_giaNhap = new JTextField();
		txt_giaNhap.setColumns(10);
		txt_giaNhap.setBounds(300, 90, 200, 30);
		contentPane.add(txt_giaNhap);
		
		txt_giaBan = new JTextField();
		txt_giaBan.setColumns(10);
		txt_giaBan.setBounds(300, 140, 200, 30);
		contentPane.add(txt_giaBan);
		
		txt_soLuong = new JTextField();
		txt_soLuong.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txt_soLuong.setColumns(10);
		txt_soLuong.setBounds(360, 190, 81, 30);
		contentPane.add(txt_soLuong);
		txt_soLuong.setText("       "+i + "");
		
		btn_tru = new JButton("-");
		btn_tru.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_tru.setBounds(300, 190, 60, 30);
		contentPane.add(btn_tru);
		
		btn_cong = new JButton("+");
		btn_cong.setBounds(440, 190, 60, 30);
		contentPane.add(btn_cong);
		
		txt_mauSac = new JTextField();
		txt_mauSac.setColumns(10);
		txt_mauSac.setBounds(300, 240, 200, 30);
		contentPane.add(txt_mauSac);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Courier New", Font.PLAIN, 12));
		textArea.setBounds(300, 290, 520, 150);
		contentPane.add(textArea);
		
		txt_maSP = new JTextField();
		txt_maSP.setColumns(10);
		txt_maSP.setBounds(620, 40, 200, 30);
		contentPane.add(txt_maSP);
		
		txt_xuatXu = new JTextField();
		txt_xuatXu.setColumns(10);
		txt_xuatXu.setBounds(620, 90, 200, 30);
		contentPane.add(txt_xuatXu);
		
		cbb_ncc = new JComboBox<>();
		cbb_ncc.setBounds(620, 140, 200, 30);
		contentPane.add(cbb_ncc);
		
		cbb_loaiSP = new JComboBox<>();
		cbb_loaiSP.setBounds(620, 190, 200, 30);
		contentPane.add(cbb_loaiSP);
		
		cbb_kichThuocSP = new JComboBox<>();
		cbb_kichThuocSP.setBounds(620, 240, 200, 30);
		contentPane.add(cbb_kichThuocSP);
		btn_themAnh.addActionListener(this);
		btn_cong.addActionListener(this);
		btn_tru.addActionListener(this);
		btn_Thoat.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		JFileChooser fc = new JFileChooser();
		
		
		if(obj.equals(btn_themAnh)) {
			int returnVal = fc.showOpenDialog(this);
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				File f = fc.getSelectedFile();
				ImageIcon img = new ImageIcon(f.getAbsolutePath());
				Image resizeImg = resizeImg(img.getImage(), 150, 148);
				ImageIcon img2 = new ImageIcon(resizeImg);
				lb_anh.setIcon(img2);
				pn_anh.setBackground(Color.black);
			}
			
		} else if(obj.equals(btn_tru)) {
			if(i > 0) {
				txt_soLuong.setText("       "+(--i) + "");
			}
		} else if(obj.equals(btn_cong)) {
			txt_soLuong.setText("       "+(++i) + "");
		} else if(obj.equals(btn_Thoat)) {
			System.exit(0);
		}
		
		
	}
	public Image resizeImg(Image img, int width, int height) {
		Image resize = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		return resize;
	}
}
