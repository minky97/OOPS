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
	private ArrayList<String> userlist_id ;
	private ArrayList<String> userlist_pw ;
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
	private JLabel lblNewLabel;
	private JButton btnLogin;
	
	public int getindex_user() {
		return index;
	}

	public void setlog_in(boolean login) {
		this.log_in = login;
	}

	public boolean getlog_in() {
		return log_in;
	}

	public ArrayList<String> getuser_list() {
		return userlist_id;
	}

	
	public void join(ArrayList<String>id_list,ArrayList<String>pw_list) {// join

		
		
		id = textField.getText();
		pw=textField_1.getText();
		if (userlist_id.contains(id)) {
			JOptionPane.showMessageDialog(null, id + "exist already.\tPlease input new id");
		} else {
			id_list.add(id);
			pw_list.add(pw);
			JOptionPane.showMessageDialog(null, "Success join ! you can do log-in.");
		}
	}

	public Login(Main main_input) {
	
		this.main = main_input;
		setTitle("Login");
		setBounds(100, 100, frame_Width, frame_Height);
	
		f1 = new Font("Times", Font.BOLD, 40);
		
		image = new ImageIcon("login.png");
		
		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblID = new JLabel("ID :");
		lblID.setFont(f1);
		JLabel lblPassword = new JLabel("password :");
		lblPassword.setFont(f1);
		
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("If you don't have id , click the button \"Join\".");
		
		userlist_id = new ArrayList();
		userlist_pw = new ArrayList();
		
		JButton btnJoin = new JButton("Join");
		btnJoin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnJoin)) {
					join(userlist_id,userlist_pw);
				}
			}

			});

		log_in = false;
		
		btnLogin = new JButton("Log-in");
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnLogin)) {
					id = textField.getText();
					pw=textField_1.getText();
					if (userlist_id.contains(id)) {
						setlog_in(true);
						index = userlist_id.indexOf(id);
						if(!pw.equals(userlist_pw.get(index)))
							JOptionPane.showMessageDialog(null, "Passwords do not correct !");
						else{
						JOptionPane.showMessageDialog(null, "Welcome !");
						start = new Start(main, log_in);
						}
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


		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(392, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblPassword)
								.addComponent(lblID))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, 309, 309, 309)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE))
							.addGap(75)
							.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(208)
							.addComponent(btnJoin, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 115, GroupLayout.PREFERRED_SIZE)))
					.addGap(317))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(290)
					.addComponent(lblNewLabel)
					.addContainerGap(692, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(430)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblID)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(61)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPassword))
					.addGap(72)
					.addComponent(btnJoin, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel)
					.addContainerGap(128, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(507, Short.MAX_VALUE)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(292))
		);
		getContentPane().setLayout(groupLayout);
	}
}

