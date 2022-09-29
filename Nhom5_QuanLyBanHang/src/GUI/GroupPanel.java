package GUI;

import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import entity.SanPham;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class GroupPanel extends JPanel {
	private static final long serialVersionUID = 1L;
    private JLabel label1     = new JLabel("");
    private JLabel labelGia     = new JLabel("Giá:");
    private JLabel label3     = new JLabel("Sản Phẩm:");
    JScrollPane sp = new JScrollPane();
    private final JButton btnNewButton = new JButton("Xem Chi Tiết");
    private final JButton btnNewButton_1 = new JButton("Xoá");
	private JLabel lbl_GiaSanPham;
	private JLabel lblTenSanPham;

    public GroupPanel(SanPham sanPham) {
    	setBackground(Color.CYAN);
        this.setBorder(BorderFactory.createTitledBorder(sanPham.getMaSanPham()));
        
        lbl_GiaSanPham = new JLabel(""+sanPham.getGiaBan());
        
        
        lblTenSanPham = new JLabel(""+sanPham.getTenSanPham());
        GroupLayout l = new GroupLayout(this);
        l.setHorizontalGroup(
        	l.createParallelGroup(Alignment.LEADING)
        		.addGroup(l.createSequentialGroup()
        			.addComponent(label1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        			.addGap(55)
        			.addGroup(l.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, l.createSequentialGroup()
        					.addComponent(label3)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblTenSanPham, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
        					.addGap(54)
        					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 47, Short.MAX_VALUE)
        					.addGap(18)
        					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        					.addGap(20))
        				.addGroup(l.createSequentialGroup()
        					.addComponent(labelGia, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lbl_GiaSanPham, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGap(20))
        );
        l.setVerticalGroup(
        	l.createParallelGroup(Alignment.LEADING)
        		.addGroup(l.createSequentialGroup()
        			.addGroup(l.createParallelGroup(Alignment.BASELINE)
        				.addComponent(label1, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
        				.addGroup(l.createSequentialGroup()
        					.addGroup(l.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lbl_GiaSanPham)
        						.addComponent(labelGia, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
        					.addGap(1)
        					.addGroup(l.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnNewButton)
        						.addComponent(lblTenSanPham)
        						.addComponent(btnNewButton_1)
        						.addComponent(label3))))
        			.addContainerGap(42, Short.MAX_VALUE))
        );
        l.setAutoCreateGaps(true);
        l.setAutoCreateContainerGaps(true);
        
        ImageIcon imgicon=new  ImageIcon(sanPham.getHinhAnh());
       // Image resize = imgicon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        this.setLayout(l);
        l.setAutoCreateGaps(true);
        l.setAutoCreateContainerGaps(true);

      // sp.setToolTipText("test");
       // sp.add(this);
    }
}


