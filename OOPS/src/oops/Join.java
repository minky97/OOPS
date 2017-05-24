package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Join extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private ArrayList<String> userlist;
	private String id;
	final int frame_Height = 900;
	final int frame_Width = 1300;
	private Main main;
	private Start start;
	private OOPSTest oopstest;
	private int index; // check user id index
	private boolean log_in; // check log in
	private ImageIcon image;
	private Font f1;

	public int getindex_user() {
		return index;
	}
	public void setlog_in(boolean login){
		this.log_in=login;
	}

	public boolean getlog_in() {
		return log_in;
	}

	public ArrayList<String> getuser_list() {
		return userlist;
	}

	/**
	 * Create the frame.
	 */
	public Join(Main main_input) {
		this.main = main_input;
		setBounds(100, 100, frame_Width, frame_Height);
		image = new ImageIcon("login.png");

		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		f1 = new Font("Times", Font.BOLD, 40);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Log-in", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.CENTER);

		userlist = new ArrayList();

		JLabel lblId = new JLabel("ID: ");
		lblId.setFont(f1);

		JButton btnJoin = new JButton("Join");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnJoin)) {
					id = textField.getText();
					if (userlist.contains(id)) {
						JOptionPane.showMessageDialog(null,id + "exist already.\tPlease input new id");
					} else {
						userlist.add(id);
						JOptionPane.showMessageDialog(null, "Success join ! you can do log-in.");
					}

				}			
			}
		});

		log_in = false;

		textField = new JTextField();
		textField.setColumns(10);

		JButton btnLogin = new JButton("Log-in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnLogin)) {
					id = textField.getText();
					if (userlist.contains(id)) {
						setlog_in(true);
						index = userlist.indexOf(id);
						JOptionPane.showMessageDialog(null, "Welcome !");
						start = new Start(main, log_in);
					} else if (!userlist.contains(id)) {
						setlog_in(false);
						JOptionPane.showMessageDialog(null,
								id + " doesn't exist.\tPlease input existing id or create new id");
					}

				}
			}
		});
		this.addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowClosing(WindowEvent e) {
				main.setVisible(true);
				dispose();
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup()
						.addGap(292).addComponent(lblId, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 354, GroupLayout.PREFERRED_SIZE).addGap(61)
						.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup().addGap(593).addComponent(btnJoin,
								GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(368, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addGap(286)
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
				.addGap(83).addComponent(btnJoin, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(356, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
	}
}
