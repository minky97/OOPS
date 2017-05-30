package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

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
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.Icon;
import java.awt.Color;

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
	private Font f1;
	private JLabel time_ = new JLabel(new ImageIcon("time.png"));
	private JLabel hint_ = new JLabel(new ImageIcon("hint.png"));
	private JLabel life_ = new JLabel(new ImageIcon("heart.png"));
	private JLabel time_coin = new JLabel(new ImageIcon("coin.png"));
	private JLabel hint_coin = new JLabel(new ImageIcon("coin.png"));
	private JLabel life_coin = new JLabel(new ImageIcon("coin.png"));
	private JTextField textField_1;
	private JTextField textField_2;

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
		setBounds(100, 100, 757, 747);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		f1 = new Font("Times", Font.BOLD, 40);
		
		JPanel panel_life = new JPanel();
		panel_life.setBackground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{138, 53, 0};
		gbl_panel.rowHeights = new int[]{56, 188, 104, 51, 92, 27, 29, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel label = new JLabel("Time");
		label.setFont(new Font("Dialog", Font.BOLD, 40));
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.NORTHEAST;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 0;
		panel.add(label, gbc_label);
		
		JLabel label_1 = new JLabel(new ImageIcon("time.png"));
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.fill = GridBagConstraints.BOTH;
		gbc_label_1.gridwidth = 2;
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 1;
		panel.add(label_1, gbc_label_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("you can get 10 seconds.\r\nThe time gives you more\r\ntime to solve question.");
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.anchor = GridBagConstraints.NORTH;
		gbc_textArea.gridwidth = 2;
		gbc_textArea.insets = new Insets(0, 0, 5, 0);
		gbc_textArea.gridx = 0;
		gbc_textArea.gridy = 2;
		panel.add(textArea, gbc_textArea);
		
		JLabel label_2 = new JLabel((Icon) null);
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 4;
		panel.add(label_2, gbc_label_2);
		
		JLabel lblX = new JLabel("x2");
		lblX.setFont(new Font("Dialog", Font.BOLD, 40));
		GridBagConstraints gbc_lblX = new GridBagConstraints();
		gbc_lblX.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblX.insets = new Insets(0, 0, 5, 0);
		gbc_lblX.gridx = 1;
		gbc_lblX.gridy = 4;
		panel.add(lblX, gbc_lblX);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTH;
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 5;
		panel.add(textField_1, gbc_textField_1);
		
		JButton button = new JButton("BUY");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				timenum=0;
				try{
				String s2 = textField_1.getText();
				timenum = Integer.parseInt(s2);
				}catch(NumberFormatException e2){
					JOptionPane.showMessageDialog(null,"ERROR: Please input only positive integers.");
				}
				if(coin<timenum*1) JOptionPane.showMessageDialog(null,"You don't have enough coin to buy it!!");
				else JOptionPane.showMessageDialog(null,"You get"+timenum*10+"seconds.");
			}
		});
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.NORTHEAST;
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 0;
		gbc_button.gridy = 6;
		panel.add(button, gbc_button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{138, 53, 0};
		gbl_panel_1.rowHeights = new int[]{56, 188, 104, 51, 92, 27, 29, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblHint = new JLabel("Hint");
		lblHint.setFont(new Font("Dialog", Font.BOLD, 40));
		GridBagConstraints gbc_lblHint = new GridBagConstraints();
		gbc_lblHint.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblHint.insets = new Insets(0, 0, 5, 5);
		gbc_lblHint.gridx = 0;
		gbc_lblHint.gridy = 0;
		panel_1.add(lblHint, gbc_lblHint);
		
		JLabel label_5 = new JLabel(new ImageIcon("hint.png"));
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.fill = GridBagConstraints.BOTH;
		gbc_label_5.gridwidth = 2;
		gbc_label_5.insets = new Insets(0, 0, 5, 0);
		gbc_label_5.gridx = 0;
		gbc_label_5.gridy = 1;
		panel_1.add(label_5, gbc_label_5);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("you can get 1 hint.\r\nThe hint helps you to\r\nsolve question easier.");
		GridBagConstraints gbc_textArea_1 = new GridBagConstraints();
		gbc_textArea_1.anchor = GridBagConstraints.NORTH;
		gbc_textArea_1.gridwidth = 2;
		gbc_textArea_1.insets = new Insets(0, 0, 5, 0);
		gbc_textArea_1.gridx = 0;
		gbc_textArea_1.gridy = 2;
		panel_1.add(textArea_1, gbc_textArea_1);
		
		JLabel label_6 = new JLabel((Icon) null);
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.fill = GridBagConstraints.BOTH;
		gbc_label_6.insets = new Insets(0, 0, 5, 5);
		gbc_label_6.gridx = 0;
		gbc_label_6.gridy = 4;
		panel_1.add(label_6, gbc_label_6);
		
		JLabel lblX_1 = new JLabel("x1");
		lblX_1.setFont(new Font("Dialog", Font.BOLD, 40));
		GridBagConstraints gbc_lblX_1 = new GridBagConstraints();
		gbc_lblX_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblX_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblX_1.gridx = 1;
		gbc_lblX_1.gridy = 4;
		panel_1.add(lblX_1, gbc_lblX_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.anchor = GridBagConstraints.NORTH;
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 5;
		panel_1.add(textField_2, gbc_textField_2);
		
		JButton button_1 = new JButton("BUY");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hintnum=0;
				try{
				String s3 = textField_2.getText();
				hintnum = Integer.parseInt(s3);
				}catch(NumberFormatException e3){
					JOptionPane.showMessageDialog(null,"ERROR: Please input only positive integers.");
				}
				if(coin<hintnum*2) JOptionPane.showMessageDialog(null,"You don't have enough coin to buy it!!");
				else JOptionPane.showMessageDialog(null,"You get"+hintnum+"hint.");
			}
		});
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.NORTHEAST;
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 0;
		gbc_button_1.gridy = 6;
		panel_1.add(button_1, gbc_button_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_life, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_life, GroupLayout.PREFERRED_SIZE, 630, GroupLayout.PREFERRED_SIZE)
					.addGap(36))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(36, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 630, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 630, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		GridBagLayout gbl_panel_life = new GridBagLayout();
		gbl_panel_life.rowHeights = new int[] {56, 188, 104, 51, 92, 27, 29, 0};
		gbl_panel_life.columnWidths = new int[]{138, 53, 0};
		gbl_panel_life.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_life.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panel_life.setLayout(gbl_panel_life);
		
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
		
		JLabel lblLife = new JLabel("Life");
		lblLife.setFont(f1);
		GridBagConstraints gbc_lblLife = new GridBagConstraints();
		gbc_lblLife.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblLife.insets = new Insets(0, 0, 5, 5);
		gbc_lblLife.gridx = 0;
		gbc_lblLife.gridy = 0;
		panel_life.add(lblLife, gbc_lblLife);
		
		JLabel life_image = new JLabel(new ImageIcon("heart.png"));
		GridBagConstraints gbc_life_image = new GridBagConstraints();
		gbc_life_image.fill = GridBagConstraints.BOTH;
		gbc_life_image.insets = new Insets(0, 0, 5, 0);
		gbc_life_image.gridwidth = 2;
		gbc_life_image.gridx = 0;
		gbc_life_image.gridy = 1;
		panel_life.add(life_image, gbc_life_image);
		
		JTextArea txtrYouCanGet = new JTextArea();
		txtrYouCanGet.setText("you can get 1 life.\r\nThe life gives you a \r\none more chance to\r\nsolve question.\r\n");
		GridBagConstraints gbc_txtrYouCanGet = new GridBagConstraints();
		gbc_txtrYouCanGet.anchor = GridBagConstraints.NORTH;
		gbc_txtrYouCanGet.insets = new Insets(0, 0, 5, 0);
		gbc_txtrYouCanGet.gridwidth = 2;
		gbc_txtrYouCanGet.gridx = 0;
		gbc_txtrYouCanGet.gridy = 2;
		panel_life.add(txtrYouCanGet, gbc_txtrYouCanGet);
		
		JLabel label1_coin = new JLabel(new ImageIcon("coin.png"));
		GridBagConstraints gbc_label1_coin = new GridBagConstraints();
		gbc_label1_coin.fill = GridBagConstraints.BOTH;
		gbc_label1_coin.insets = new Insets(0, 0, 5, 5);
		gbc_label1_coin.gridx = 0;
		gbc_label1_coin.gridy = 4;
		panel_life.add(label1_coin, gbc_label1_coin);
		
		JLabel lblNewLabel = new JLabel("x3");
		lblNewLabel.setFont(f1);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 4;
		panel_life.add(lblNewLabel, gbc_lblNewLabel);
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTH;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 2;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 5;
		panel_life.add(textField, gbc_textField);
		
		JButton btnBuy = new JButton("BUY");
		btnBuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lifenum=0;
				try{
				String s = textField.getText();
				lifenum = Integer.parseInt(s);
				}catch(NumberFormatException n){
					JOptionPane.showMessageDialog(null,"ERROR: Please input only positive integers.");
				}
				if(coin<lifenum*3) JOptionPane.showMessageDialog(null,"You don't have enough coin to buy it!!");
				else JOptionPane.showMessageDialog(null,"You get"+lifenum+"life.");
			}
		});
		GridBagConstraints gbc_btnBuy = new GridBagConstraints();
		gbc_btnBuy.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnBuy.insets = new Insets(0, 0, 0, 5);
		gbc_btnBuy.gridx = 0;
		gbc_btnBuy.gridy = 6;
		panel_life.add(btnBuy, gbc_btnBuy);
		contentPane.setLayout(gl_contentPane);
	}
}
