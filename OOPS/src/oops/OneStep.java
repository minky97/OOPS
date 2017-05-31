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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;

public class OneStep extends JFrame {

	private JPanel contentPane;
	private String caution;
	private BackSound Sound;
	private ImageIcon image;
	final int frame_Height = 900;
	final int frame_Width = 1300;
	private int window;
	private Main main;
	private int score;
	private OneStep_Question panel_1;
	private OneStep_Question panel_2;
	private OneStep_Question panel_3;
	private String answer;
	private int lifenum;
	private ImageIcon life;// life image

	private TwoStep twostep;
	/**
	 * Launch the application.
	 */
	public void setSound(boolean start,BackSound sound) {
		this.Sound = sound;
		sound.mulist(start);
	}

	public void showlife(int num, JLabel label1, JLabel label2, JLabel label3) {
		if (num == 3) {
			label1.setVisible(true);
			label2.setVisible(true);
			label3.setVisible(true);
		} else if (num == 2) {
			label1.setVisible(true);
			label2.setVisible(true);
			label3.setVisible(false);
		} else if (num == 1) {
			label1.setVisible(true);
			label2.setVisible(false);
			label3.setVisible(false);
		} else if (num <= 0) {
			dispose();
			End end = new End();
			end.setVisible(true);
		}
	}



	/**
	 * Create the frame.
	 */
	public OneStep(Main main_input) {

		this.main = main_input;
		main = new Main();
		
		Sound = new BackSound("game1");
		setTitle("One Step");
		setBounds(100, 100, frame_Width, frame_Height);
		setSound(true,Sound);
		caution = "Do you really want to close the window? If you close the window, you need to solve the problem again from the beginning.";
		image = new ImageIcon("step1.png");

		life = new ImageIcon("life.png");
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
					setSound(false,Sound);
					setSound(false,Sound);
					 main.setSound(true);
					 main.setVisible(true);
					dispose();
				}

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

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		
		panel_1 = new OneStep_Question(1);
		panel_1.setBackground(Color.WHITE);
		panel_2 = new OneStep_Question(2);
		panel_2.setBackground(Color.WHITE);
		panel_3 = new OneStep_Question(3);
		panel_3.setBackground(Color.WHITE);

		panel_1.setVisible(true);
		panel_2.setVisible(false);
		panel_3.setVisible(false);

		JLabel lblNewLabel = new JLabel(life);
		JLabel lblNewLabel_1 = new JLabel(life);
		JLabel lblNewLabel_2 = new JLabel(life);

		lifenum = 3;

		panel_1.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = panel_1.getTextField_1().getText().trim();
				answer = answer.toLowerCase();
				if (answer.equals(panel_1.getAnswer_select().get(0))) {
					score = score + 3;
				} else
					lifenum = lifenum - 1;
				JOptionPane.showMessageDialog(null, "Your score is " + score);
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				panel_3.setVisible(false);
				showlife(lifenum, lblNewLabel, lblNewLabel_1, lblNewLabel_2);
				
			}

		});
		panel_2.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = panel_2.getTextField_1().getText();
				answer = answer.toLowerCase();

				if (answer.equals(panel_2.getAnswer_select().get(1))) {
					score = score + 3;
				} else
					lifenum = lifenum - 1;
				JOptionPane.showMessageDialog(null, "Your score is " + score);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(true);
				showlife(lifenum, lblNewLabel, lblNewLabel_1, lblNewLabel_2);
				
			}

		});
		panel_3.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = panel_3.getTextField_1().getText();
				if (answer.equals(panel_3.getAnswer_select().get(2))) {
					score = score + 3;
				} else
					lifenum = lifenum - 1;
				JOptionPane.showMessageDialog(null, "Your score is " + score);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				showlife(lifenum, lblNewLabel, lblNewLabel_1, lblNewLabel_2);
				dispose();
				setSound(false,Sound);
				twostep = new TwoStep(main);
				twostep.setVisible(true);
			}

		});


		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(31).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(29)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 110,
										GroupLayout.PREFERRED_SIZE)
								.addGap(55).addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 121,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(341, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(29)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
						.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}
}
