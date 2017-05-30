package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;

public class FourStep extends JFrame {

	private JPanel contentPane;
	private String caution;
	private BackSound Sound;
	private ImageIcon image;
	final int frame_Height = 900;
	final int frame_Width = 1300;
	private int window;
	private Main main;
	private int score;
	private FourStep_Question panel_1;
	private FourStep_Question panel_2;
	private FourStep_Question panel_3;
	private FourStep_Question panel_4;
	private String answer;
	/**
	 * Launch the application.
	 */
	public void setSound(boolean start) {
		Sound = new BackSound("game1");
		Sound.mulist(start);
	}
	



	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FourStep frame = new FourStep();
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
	public FourStep() {

		setTitle("Four Step");
		setBounds(100, 100, frame_Width, frame_Height);
		setSound(true);
		caution = "Do you really want to close the window? If you close the window, you need to solve the problem again from the beginning.";
		image = new ImageIcon("step4.png");

		contentPane = new JPanel() {
			public void paintComponent(Graphics g) {
				g.drawImage(image.getImage(), 0, 0, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

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
				window = JOptionPane.showConfirmDialog(null, caution, "Caution", JOptionPane.OK_CANCEL_OPTION,
						JOptionPane.WARNING_MESSAGE);
				if (window == JOptionPane.CANCEL_OPTION) {
					remove(window);
				} else if (window == JOptionPane.OK_OPTION) {

					dispose();
					setSound(false);
				}

			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				setSound(false);
				// main.setSound(true);
				// main.setVisible(true);
				dispose();
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub

			}
		});

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel_1 = new FourStep_Question(1);
		panel_1.setBackground(Color.WHITE);
		panel_2 = new FourStep_Question(2);
		panel_2.setBackground(Color.WHITE);
		panel_3 = new FourStep_Question(3);
		panel_3.setBackground(Color.WHITE);
		panel_4 = new FourStep_Question(4);
		panel_4.setBackground(Color.WHITE);
		
		panel_1.setVisible(true);
		panel_2.setVisible(false);
		panel_3.setVisible(false);
		panel_4.setVisible(false);
		
		panel_1.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				answer=panel_1.getTextField_1().getText().trim();
				answer=answer.toLowerCase();
				panel_1.setAnswer(answer);
					if (panel_1.getAnswer().equals(panel_1.getAnswer_select().get(0))) {
						score = score + 10;
					}
					JOptionPane.showMessageDialog(null, "Your score is " + score);
					panel_1.setVisible(false);
					panel_2.setVisible(true);
					panel_3.setVisible(false);
					panel_4.setVisible(false);
				

			}

		});
		panel_2.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer=panel_2.getTextField_1().getText().trim();
				answer=answer.toLowerCase();
				panel_2.setAnswer(answer);
					if (panel_2.getAnswer().equals(panel_2.getAnswer_select().get(1))) {
						score = score + 10;
					}
					JOptionPane.showMessageDialog(null, "Your score is " + score);
					panel_1.setVisible(false);
					panel_2.setVisible(false);
					panel_3.setVisible(true);
					panel_4.setVisible(false);
				

			}

		});
		panel_3.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer=panel_3.getTextField_1().getText().trim();
				answer=answer.toLowerCase();
				panel_3.setAnswer(answer);
					if (panel_3.getAnswer().equals(panel_3.getAnswer_select().get(2))) {
						score = score + 10;
					}
					JOptionPane.showMessageDialog(null, "Your score is " + score);
					panel_1.setVisible(false);
					panel_2.setVisible(false);
					panel_3.setVisible(false);
					panel_4.setVisible(true);
				

			}

		});
		panel_4.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer=panel_4.getTextField_1().getText().trim();
				answer=answer.toLowerCase();
				panel_4.setAnswer(answer);
					if (panel_4.getAnswer().equals(panel_4.getAnswer_select().get(3))) {
						score = score + 10;
					}
					JOptionPane.showMessageDialog(null, "Your score is " + score);
					dispose();
					End end = new End();
					end.setVisible(true);
				

			}

		});
		

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(341, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(31)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(341, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(31)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(341, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(31)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(341, Short.MAX_VALUE))
				
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(316, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(29)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(316, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(29)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(316, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGap(29)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(316, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
