package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class l extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					l frame = new l();
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
	public l() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(396, 283, 306, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setBounds(396, 331, 306, 38);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("ĐĂNG NHẬP");
		btnNewButton.setBackground(new Color(255, 184, 149));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(355, 379, 347, 38);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\logonho11.jpg"));
		lblNewLabel_1.setBounds(519, 228, 36, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\user.png"));
		lblNewLabel_2.setBounds(365, 288, 31, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Đăng Nhập");
		lblNewLabel.setFont(new Font("Sitka Small", Font.ITALIC, 25));
		lblNewLabel.setForeground(new Color(255, 74, 74));
		lblNewLabel.setBounds(482, 141, 143, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\icon2.png"));
		lblNewLabel_2_1.setBounds(365, 336, 31, 26);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblnhNn = new JLabel("ảnh nền");
		lblnhNn.setBackground(new Color(255, 255, 255));
		lblnhNn.setIcon(new ImageIcon("C:\\Users\\CONG MINH\\eclipse-workspace\\dasdad\\src\\img\\login.jpg"));
		lblnhNn.setBounds(0, 0, 1101, 584);
		contentPane.add(lblnhNn);
	}
}
