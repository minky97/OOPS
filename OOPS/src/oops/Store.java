package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Store extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private int coin;
	private int life;
	private int time;
	private int hint;
	private int lifenum;
	private int timenum;
	private int hintnum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Store frame = new Store();
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
	public Store() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 735);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_life = new JPanel();
		
		JPanel panel_hint = new JPanel();
		
		JPanel panel_time = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_life, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addGap(2)
					.addComponent(panel_hint, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addGap(1)
					.addComponent(panel_time, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_hint, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(panel_life, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 524, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(145, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_time, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JLabel lblTime = new JLabel("time");
		
		JLabel label = new JLabel("");
		GroupLayout gl_panel_hint = new GroupLayout(panel_hint);
		gl_panel_hint.setHorizontalGroup(
			gl_panel_hint.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_hint.createSequentialGroup()
					.addGroup(gl_panel_hint.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_hint.createSequentialGroup()
							.addGap(98)
							.addComponent(lblTime))
						.addGroup(gl_panel_hint.createSequentialGroup()
							.addGap(70)
							.addComponent(label)))
					.addContainerGap(89, Short.MAX_VALUE))
		);
		gl_panel_hint.setVerticalGroup(
			gl_panel_hint.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_hint.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTime)
					.addGap(37)
					.addComponent(label)
					.addContainerGap(430, Short.MAX_VALUE))
		);
		panel_hint.setLayout(gl_panel_hint);
		
		JLabel lblLife = new JLabel("Life");
		
		JLabel life_image = new JLabel(new ImageIcon("heart.png"));
		
		JLabel label1_coin = new JLabel(new ImageIcon("coin.png"));
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lifenum=0;
				try{
				String s = textField.getText();
				lifenum = Integer.parseInt(s);
				if(coin<lifenum*3) JOptionPane.showMessageDialog(null,"You don't have enough coin to buy it!!","Message",JOptionPane.WARNING_MESSAGE);
				else JOptionPane.showMessageDialog(null,"You get"+lifenum+"life.","Message", JOptionPane.INFORMATION_MESSAGE);
				}catch(NumberFormatException e){
					JOptionPane.showMessageDialog(null,"ERROR: Please input only positive integers.","Message", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		textField.setColumns(10);
		
		JButton btnBuy = new JButton("BUY");
		
		JTextArea textArea = new JTextArea();
		GroupLayout gl_panel_life = new GroupLayout(panel_life);
		gl_panel_life.setHorizontalGroup(
			gl_panel_life.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_life.createSequentialGroup()
					.addGroup(gl_panel_life.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_life.createSequentialGroup()
							.addGap(88)
							.addComponent(lblLife))
						.addGroup(gl_panel_life.createSequentialGroup()
							.addGap(17)
							.addComponent(life_image, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_life.createSequentialGroup()
							.addGap(17)
							.addComponent(label1_coin, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_life.createSequentialGroup()
							.addGap(27)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_life.createSequentialGroup()
							.addGap(74)
							.addComponent(btnBuy))
						.addGroup(gl_panel_life.createSequentialGroup()
							.addGap(32)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		gl_panel_life.setVerticalGroup(
			gl_panel_life.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_life.createSequentialGroup()
					.addGap(15)
					.addComponent(lblLife)
					.addGap(18)
					.addComponent(life_image, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(label1_coin, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnBuy)
					.addContainerGap(20, Short.MAX_VALUE))
		);
		panel_life.setLayout(gl_panel_life);
		contentPane.setLayout(gl_contentPane);
	}
}
