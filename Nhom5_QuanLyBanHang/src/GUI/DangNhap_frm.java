package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPasswordField;

public class DangNhap_frm extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhap_frm frame = new DangNhap_frm();
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
	public DangNhap_frm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(null);
		lblNewLabel.setBounds(10, 11, 208, 347);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 255, 255));
		panel.setBounds(218, 11, 294, 347);
		contentPane.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(149, 130, 119, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("ĐĂNG NHẬP");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(89, 63, 131, 34);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Tên đăng nhập:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 132, 100, 14);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Mật khẩu:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 177, 100, 14);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.setBackground(new Color(255, 153, 0));
		btnNewButton.setIcon(new ImageIcon(DangNhap_frm.class.getResource("/img/Login-in-icon.png")));
		btnNewButton.setBounds(89, 239, 131, 34);
		panel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(149, 175, 119, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(DangNhap_frm.class.getResource("/img/user2.jpg")));
		lblNewLabel_4.setBounds(120, 130, 26, 20);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("New label");
		lblNewLabel_4_1.setIcon(new ImageIcon(DangNhap_frm.class.getResource("/img/preferences-desktop-user-password-icon.png")));
		lblNewLabel_4_1.setBounds(120, 175, 26, 20);
		panel.add(lblNewLabel_4_1);
	}
}
