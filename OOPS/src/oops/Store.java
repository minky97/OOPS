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
	private JLabel time_ = new JLabel(new ImageIcon("time.png"));
	private JLabel hint_ = new JLabel(new ImageIcon("hint.png"));
	private JLabel life_ = new JLabel(new ImageIcon("heart.png"));
	private JLabel time_coin = new JLabel(new ImageIcon("coin.png"));
	private JLabel hint_coin = new JLabel(new ImageIcon("coin.png"));
	private JLabel life_coin = new JLabel(new ImageIcon("coin.png"));
	private JTextField textField_1;

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
		
		JPanel panel_time = new JPanel();
		
		JPanel panel_hint = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_life, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_time, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_hint, GroupLayout.PREFERRED_SIZE, 223, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(panel_life, GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
						.addComponent(panel_time, 0, 0, Short.MAX_VALUE)
						.addComponent(panel_hint, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(39, Short.MAX_VALUE))
		);
		
		JLabel lblTime = new JLabel("time");
		
		JLabel time_image = new JLabel(new ImageIcon("time.png"));
		
		JTextArea txtrYouCanGet_1 = new JTextArea();
		txtrYouCanGet_1.setText("you can get 10 seconds.\r\nThe time gives you more\r\ntime to solve question.");
		
		JLabel label2_coin = new JLabel(new ImageIcon("coin.png"));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JButton btnBuy_1 = new JButton("BUY");
		GroupLayout gl_panel_time = new GroupLayout(panel_time);
		gl_panel_time.setHorizontalGroup(
			gl_panel_time.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_time.createSequentialGroup()
					.addGap(98)
					.addComponent(lblTime)
					.addContainerGap(106, Short.MAX_VALUE))
				.addGroup(gl_panel_time.createSequentialGroup()
					.addContainerGap(101, Short.MAX_VALUE)
					.addGroup(gl_panel_time.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrYouCanGet_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(time_image, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
					.addGap(27))
				.addGroup(Alignment.LEADING, gl_panel_time.createSequentialGroup()
					.addGap(26)
					.addComponent(label2_coin, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(92, Short.MAX_VALUE))
				.addGroup(gl_panel_time.createSequentialGroup()
					.addContainerGap(100, Short.MAX_VALUE)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(45))
				.addGroup(gl_panel_time.createSequentialGroup()
					.addContainerGap(146, Short.MAX_VALUE)
					.addComponent(btnBuy_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
					.addGap(79))
		);
		gl_panel_time.setVerticalGroup(
			gl_panel_time.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_time.createSequentialGroup()
					.addGap(34)
					.addComponent(lblTime)
					.addGap(34)
					.addComponent(time_image, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(txtrYouCanGet_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label2_coin, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnBuy_1)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_time.setLayout(gl_panel_time);
		
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
		
		JTextArea txtrYouCanGet = new JTextArea();
		txtrYouCanGet.setText("you can get 1 life.\r\nThe life gives you a \r\none more chance to\r\nsolve question.\r\n");
		GroupLayout gl_panel_life = new GroupLayout(panel_life);
		gl_panel_life.setHorizontalGroup(
			gl_panel_life.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_life.createSequentialGroup()
					.addGroup(gl_panel_life.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_life.createSequentialGroup()
							.addGap(35)
							.addComponent(txtrYouCanGet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_life.createSequentialGroup()
							.addContainerGap()
							.addComponent(life_image, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_life.createSequentialGroup()
							.addGap(88)
							.addComponent(lblLife))
						.addGroup(gl_panel_life.createSequentialGroup()
							.addGap(27)
							.addComponent(label1_coin, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(17, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_life.createSequentialGroup()
					.addContainerGap(38, Short.MAX_VALUE)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(34))
				.addGroup(gl_panel_life.createSequentialGroup()
					.addGap(73)
					.addComponent(btnBuy, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(80, Short.MAX_VALUE))
		);
		gl_panel_life.setVerticalGroup(
			gl_panel_life.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_life.createSequentialGroup()
					.addGap(34)
					.addComponent(lblLife)
					.addGap(27)
					.addComponent(life_image, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(txtrYouCanGet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(label1_coin, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addComponent(btnBuy)
					.addContainerGap())
		);
		panel_life.setLayout(gl_panel_life);
		contentPane.setLayout(gl_contentPane);
	}
}
