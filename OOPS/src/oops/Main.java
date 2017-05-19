package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Main extends JFrame {

	private JPanel contentPane;
	private ImageIcon image;
	private Font f1;
	final int frame_Height = 900;
	final int frame_Width = 1300;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("OOPS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, frame_Width, frame_Height);
		
		image = new ImageIcon("image.png");
		
		contentPane = new JPanel(){ 
	         public void paintComponent(Graphics g) {
	             g.drawImage(image.getImage(), 0, 0, null);
	             setOpaque(false);
	             super.paintComponent(g);
	          }
	       };
;
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		 f1 = new Font("µ¸¿ò", Font.BOLD, 15);

		
		
		setContentPane(contentPane);
		
		JButton btnStart = new JButton("Start");
		btnStart.setFont(f1);
		
		JButton btnIntroduce = new JButton("Introduce");
		btnIntroduce.setFont(f1);
		
		JButton btnSetting = new JButton("Setting");
		btnSetting.setFont(f1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(f1);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(529)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnExit, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
						.addComponent(btnSetting, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
						.addComponent(btnIntroduce, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
						.addComponent(btnStart, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
					.addGap(507))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(475, Short.MAX_VALUE)
					.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(btnIntroduce, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(btnSetting, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addGap(88))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
