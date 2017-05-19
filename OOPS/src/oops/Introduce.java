package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class Introduce extends JFrame {

	private JPanel contentPane;
	final int frame_Height = 900;
	final int frame_Width = 1300;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Introduce frame = new Introduce();
//					frame.visible(true,frame);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});		
//	}

	
	/**
	 * Create the frame.
	 */
	public Introduce() {
		setTitle("Introduce");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setBounds(100, 100, frame_Width, frame_Height);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblIntroduce = new JLabel("Introduce");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addComponent(lblIntroduce)
					.addContainerGap(331, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(23)
					.addComponent(lblIntroduce)
					.addContainerGap(202, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}

}
