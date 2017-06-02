package oops.step;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import oops.BackSound;
import oops.End;
import oops.Main;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TwoStep extends JFrame implements Step{

	private JPanel contentPane;
	private String caution;
	private BackSound Sound;
	private ImageIcon image;
	final int frame_Height = 900;
	final int frame_Width = 1300;
	private int window;
	private Main main;
	private int score;
	private TwoStep_Question panel_1;// question 1
	private TwoStep_Question panel_2;// question 2
	private TwoStep_Question panel_3;// question 3
	private TwoStep_Question panel_4;// question 4
	private String answer;
	private int lifenum;
	private ImageIcon life;// life image
	private ArrayList<JLabel> imageArray;
	private ThreeStep threestep;

	@Override
	public void setSound(boolean start, BackSound sound) {
		this.Sound = sound;

		sound.mulist(start);
	}

	@Override
	public void showlife(int num,ArrayList<JLabel> imgaeArray) {

		if (num <= 0) {
			dispose();
			setSound(false, Sound);
			End end = new End();
			end.setVisible(true);
		} else {

			for (int i = 0; i < 5; i++) {
				imageArray.get(i).setVisible(false);
			}
			for (int i = 0; i < num; i++) {
				imageArray.get(i).setVisible(true);
			}
		}

	}

	/**
	 * Create the frame.
	 */
	public TwoStep(Main main_input) {

		this.main = main_input;
		setTitle("Two Step");
		setBounds(100, 100, frame_Width, frame_Height);
		Sound = new BackSound("game2");
		setSound(true, Sound);
		caution = "Do you really want to close the window? If you close the window, you need to solve the problem again from the beginning.";
		image = new ImageIcon("step2.png");

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
					dispose();
					setSound(false, Sound);
					main.setSound(true, Sound);
					main.setVisible(true);
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
		panel_1 = new TwoStep_Question(1);
		panel_1.setBackground(Color.WHITE);
		panel_2 = new TwoStep_Question(2);
		panel_2.setBackground(Color.WHITE);
		panel_3 = new TwoStep_Question(3);
		panel_3.setBackground(Color.WHITE);
		panel_4 = new TwoStep_Question(4);
		panel_4.setBackground(Color.WHITE);

		panel_1.setVisible(true);
		panel_2.setVisible(false);
		panel_3.setVisible(false);
		panel_4.setVisible(false);

		
		JLabel lblNewLabel = new JLabel(life);
		JLabel lblNewLabel_1 = new JLabel(life);
		JLabel lblNewLabel_2 = new JLabel(life);
		JLabel lblNewLabel_3 = new JLabel(life);
		JLabel lblNewLabel_4 = new JLabel(life);
		
		imageArray = new ArrayList<JLabel>();
		imageArray.add(lblNewLabel);
		imageArray.add(lblNewLabel_1);
		imageArray.add(lblNewLabel_2);
		imageArray.add(lblNewLabel_3);
		imageArray.add(lblNewLabel_4);
		lifenum = 3;
		showlife(lifenum, imageArray);
		panel_1.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = panel_1.getTextField_1().getText().trim();
				answer = answer.toLowerCase();
				panel_1.setAnswer(answer);
				if (panel_1.getAnswer().equals(panel_1.getAnswer_select().get(0))) {
					score = score + 5;
				} else
					lifenum = lifenum - 1;
				JOptionPane.showMessageDialog(null, "Your score is " + score);
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				showlife(lifenum, imageArray);

			}

		});
		panel_2.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = panel_2.getTextField_1().getText().trim();
				answer = answer.toLowerCase();
				panel_2.setAnswer(answer);

				if (panel_2.getAnswer().equals(panel_2.getAnswer_select().get(1))) {
					score = score + 5;
				} else
					lifenum = lifenum - 1;
				JOptionPane.showMessageDialog(null, "Your score is " + score);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(true);
				panel_4.setVisible(false);
				showlife(lifenum, imageArray);
			}

		});
		panel_3.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = panel_3.getTextField_1().getText().trim();
				answer = answer.toLowerCase();
				panel_3.setAnswer(answer);
				if (panel_3.getAnswer().equals(panel_3.getAnswer_select().get(2))) {
					score = score + 5;
				} else
					lifenum = lifenum - 1;
				JOptionPane.showMessageDialog(null, "Your score is " + score);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(true);
				showlife(lifenum, imageArray);

			}

		});
		panel_4.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = panel_4.getTextField_1().getText().trim();
				answer = answer.toLowerCase();
				panel_4.setAnswer(answer);
				if (panel_4.getAnswer().equals(panel_4.getAnswer_select().get(3))) {
					score = score + 5;
				} else
					lifenum = lifenum - 1;
				JOptionPane.showMessageDialog(null, "Your score is " + score);
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				showlife(lifenum,imageArray);
				
				//exit the Step2 & show the Step3
				dispose();
				setSound(false,Sound);
				threestep = new ThreeStep(main);
				threestep.setVisible(true);

			}

		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(31).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(10)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
								.addGap(29)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 241,
										GroupLayout.PREFERRED_SIZE)
								.addGap(36)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 194,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 186,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 184,
										GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(97, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(29)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 498,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE))
						.addGap(146)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(Alignment.TRAILING,
												gl_contentPane.createSequentialGroup()
														.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 155,
																GroupLayout.PREFERRED_SIZE)
														.addGap(3)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
										.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)))
						.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}
}