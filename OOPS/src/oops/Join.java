package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Join extends JFrame {

	private JPanel contentPane_1;
	private Login log;
	final int frame_Height = 900;
	final int frame_Width = 1300;
	private Font f1;
	private ImageIcon image;
	private JTextField textField_1;
	private JTextField textField;
	private String id;
	private String pw;
	private ArrayList<String> id_list;
	private ArrayList<String> pw_list;

	public Join(Login log_input) {
		this.log = log_input;
		setTitle("Sign");
		setBounds(100, 100, frame_Width, frame_Height);

		f1 = new Font("Times", Font.BOLD, 40);

		image = new ImageIcon("sign.png");

		contentPane_1 = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		id_list = new ArrayList();
		pw_list = new ArrayList();

		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane_1);

		JButton btnJoin = new JButton("Join");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id = textField.getText();
				pw = textField_1.getText();
				if (log.getuser_list().contains(id)) {//check that already exist user.
					JOptionPane.showMessageDialog(null, "It already exist.");
				} else {
					JOptionPane.showMessageDialog(null, "Success join !");
					id_list.add(id);
					pw_list.add(pw);
					log.setuser_list(id_list, pw_list);
					log.setVisible(true);
					dispose();
				}
			}
		});

		JLabel lblId = new JLabel("ID :");
		lblId.setFont(f1);
		JLabel lblPassword = new JLabel("PassWord : ");
		lblPassword.setFont(f1);
		textField_1 = new JTextField();
		textField_1.setColumns(10);

		textField = new JTextField();
		textField.setColumns(10);

		GroupLayout gl_contentPane_1 = new GroupLayout(contentPane_1);
		gl_contentPane_1.setHorizontalGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane_1.createSequentialGroup().addGap(123)
						.addGroup(gl_contentPane_1.createParallelGroup(Alignment.TRAILING).addComponent(lblPassword)
								.addComponent(lblId))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 337,
										Short.MAX_VALUE)
								.addComponent(textField, Alignment.TRAILING))
						.addGap(46).addComponent(btnJoin, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(556, Short.MAX_VALUE)));
		gl_contentPane_1.setVerticalGroup(gl_contentPane_1.createParallelGroup(Alignment.LEADING).addGroup(
				gl_contentPane_1.createSequentialGroup().addContainerGap(522, Short.MAX_VALUE).addGroup(gl_contentPane_1
						.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING,
								gl_contentPane_1.createSequentialGroup()
										.addComponent(btnJoin, GroupLayout.PREFERRED_SIZE, 64,
												GroupLayout.PREFERRED_SIZE)
										.addGap(247))
						.addGroup(Alignment.TRAILING, gl_contentPane_1.createSequentialGroup().addGroup(gl_contentPane_1
								.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane_1.createSequentialGroup()
										.addGroup(gl_contentPane_1.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblId).addComponent(textField, GroupLayout.PREFERRED_SIZE,
														42, GroupLayout.PREFERRED_SIZE))
										.addGap(74).addComponent(lblPassword)))
								.addGap(211)))));
		contentPane_1.setLayout(gl_contentPane_1);
	}

}
