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
import oops.User;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ThreeStep extends JFrame implements Step {

	private JPanel contentPane;
	private String caution;
	private BackSound Sound;
	private ImageIcon image;
	final int frame_Height = 900;
	final int frame_Width = 1300;
	private int window;
	private Main main;
	private int score;
	private ThreeStep_Question panel_1;// question 1
	private ThreeStep_Question panel_2;// question 2
	private ThreeStep_Question panel_3;// question 3
	private ThreeStep_Question panel_4;// question 4
	private String answer;
	private int num;
	private int lifenum;
	private ImageIcon life;// life image
	private FourStep fourstep;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private ArrayList<JLabel> imageArray;

	/**
	 * Launch the application.
	 */
	@Override
	public int getScore(){
		return score;
	}
	
	@Override
	public void setSound(boolean start, BackSound sound) {
		this.Sound = sound;
		Sound.mulist(start);
	}

	@Override
	public void showlife(int num, ArrayList<JLabel> imageArray,User user) {
		if (num <= 0) {
			dispose();
			setSound(false, Sound);
			End end = new End(user);
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
	public ThreeStep(Main main_input,User user) {

		this.main = main_input;
		setTitle("Three Step");
		setBounds(100, 100, frame_Width, frame_Height);

		Sound = new BackSound("game3");
		setSound(true, Sound);

		caution = "Do you really want to close the window? If you close the window, you need to solve the problem again from the beginning.";
		image = new ImageIcon("step3.png");

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

					main.setVisible(true);
					main.setSound(true);
					dispose();
					setSound(false, Sound);
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
		panel_1 = new ThreeStep_Question(1);
		panel_1.setBackground(Color.WHITE);
		panel_2 = new ThreeStep_Question(2);
		panel_2.setBackground(Color.WHITE);
		panel_3 = new ThreeStep_Question(3);
		panel_3.setBackground(Color.WHITE);
		panel_4 = new ThreeStep_Question(4);
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
		showlife(lifenum, imageArray,user);

		panel_1.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = panel_1.getTextField_1().getText().trim();
				answer = answer.toLowerCase();
				panel_1.setAnswer(answer);
				num = Integer.parseInt(panel_1.getComboBox().getSelectedItem().toString());
				panel_1.setNum(num);
				if (panel_1.getAnswer().equals(panel_1.getAnswer_select().get(0))
						&& (panel_1.getNum() == (panel_1.getAnswer_num().get(0)))) {
					score = score + 5;
				} else
					lifenum = lifenum - 1;
				
				
				JOptionPane.showMessageDialog(null, "Your score is " + user.score());
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				showlife(lifenum, imageArray,user);

			}

		});
		panel_2.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = panel_2.getTextField_1().getText().trim();
				answer = answer.toLowerCase();
				panel_2.setAnswer(answer);
				num = Integer.parseInt(panel_2.getComboBox().getSelectedItem().toString().trim());
				panel_2.setNum(num);

				if (panel_2.getAnswer().equals(panel_2.getAnswer_select().get(1))
						&& (panel_2.getNum() == (panel_2.getAnswer_num().get(1)))) {
					score = score + 5;
				} else
					lifenum = lifenum - 1;
				JOptionPane.showMessageDialog(null, "Your score is " + user.score());
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(true);
				panel_4.setVisible(false);
				showlife(lifenum, imageArray,user);
			}

		});
		panel_3.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = panel_3.getTextField_1().getText().trim();
				answer = answer.toLowerCase();
				panel_3.setAnswer(answer);
				num = Integer.parseInt(panel_3.getComboBox().getSelectedItem().toString().trim());
				panel_3.setNum(num);
				if (panel_3.getAnswer().equals(panel_3.getAnswer_select().get(2))
						&& (panel_3.getNum() == (panel_3.getAnswer_num().get(2)))) {
					score = score + 5;
				} else
					lifenum = lifenum - 1;
				JOptionPane.showMessageDialog(null, "Your score is " + user.score());
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(true);
				showlife(lifenum, imageArray,user);

			}

		});
		panel_4.getBtnA().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer = panel_4.getTextField_1().getText().trim();
				answer = answer.toLowerCase();
				panel_4.setAnswer(answer);
				num = Integer.parseInt(panel_4.getComboBox().getSelectedItem().toString().trim());
				panel_4.setNum(num);
				if (panel_4.getAnswer().equals(panel_4.getAnswer_select().get(3))
						&& (panel_4.getNum() == (panel_4.getAnswer_num().get(3)))) {
					score = score + 5;
				} else
					lifenum = lifenum - 1;
				JOptionPane.showMessageDialog(null, "Your score is " + user.score());
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel_3.setVisible(false);
				panel_4.setVisible(false);
				showlife(lifenum, imageArray,user);

				if(lifenum!=0){
				/* Exit the step3 & Open the step4 */
				dispose();
				setSound(false, Sound);
				fourstep = new FourStep(main,user);
				user.step(fourstep);
				fourstep.setVisible(true);
				}
			}

		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(31).addGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(10)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
								.addGap(32)
								.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 259,
										GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 256,
										GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE,
										190, GroupLayout.PREFERRED_SIZE)
								.addGap(18).addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
								.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(341, Short.MAX_VALUE)))));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(29)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 498,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(
								gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
										.createSequentialGroup().addGap(18).addGroup(gl_contentPane
												.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
														.createSequentialGroup()
														.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																.addComponent(lblNewLabel_2, Alignment.LEADING,
																		GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
																.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE,
																		292, Short.MAX_VALUE))
														.addContainerGap())
												.addGroup(gl_contentPane.createSequentialGroup()
														.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 301,
																GroupLayout.PREFERRED_SIZE)
														.addGap(3))))
										.addGroup(Alignment.LEADING,
												gl_contentPane.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE,
																		315, Short.MAX_VALUE)
																.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))));
		contentPane.setLayout(gl_contentPane);
	}
}
