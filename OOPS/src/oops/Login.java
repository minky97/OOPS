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

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private ArrayList<String> userlist_id;
	private ArrayList<String> userlist_pw;
	private String id;
	private String pw;
	final int frame_Height = 900;
	final int frame_Width = 1300;
	private Main main;
	private Start start;
	private OOPSTest oopstest;
	private int index; // check user id index
	private boolean log_in; // check log in
	private ImageIcon image;
	private Font f1;
	private JTextField textField_1;

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
		return userlist_id;
	}

	/**
	 * Create the frame.
	 */
	
	public void join(){//join
		
	}
	public Login(Main main_input) {//login
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

		userlist_id = new ArrayList();
		userlist_pw = new ArrayList();

		JLabel lblId = new JLabel("ID: ");
		lblId.setFont(f1);

		JLabel lblPassword = new JLabel("PASSWORD :");
		lblPassword.setFont(f1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("If you don't have id , click the button \"Join\".");

		
		JButton btnJoin = new JButton("Join");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnJoin)) {
					
					join();
					
//					id = textField.getText();
//					if (userlist_id.contains(id)) {
//						JOptionPane.showMessageDialog(null,id + "exist already.\tPlease input new id");
//					} else {
//						userlist_id.add(id);
//						JOptionPane.showMessageDialog(null, "Success join ! you can do log-in.");
//					}

				}			
			}

			private void join() {
				// TODO Auto-generated method stub
				
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
					if (userlist_id.contains(id)) {
						setlog_in(true);
						index = userlist_id.indexOf(id);
						JOptionPane.showMessageDialog(null, "Welcome !");
						start = new Start(main, log_in);
					} else if (!userlist_id.contains(id)) {
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
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(261)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblPassword)
						.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addComponent(textField_1)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
					.addGap(61)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(368, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(545, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnJoin, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(558))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(286)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPassword)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(67)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnJoin, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addContainerGap(295, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}

