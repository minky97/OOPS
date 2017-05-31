package oops;

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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TwoStep extends JFrame {

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

	/**
	 * Launch the application.
	 */
	public void setSound(boolean start,BackSound sound) {
		this.Sound = sound;
		
		sound.mulist(start);
	}

	public void showlife(int num,ImageIcon life) {
		
		if(num<=0)
			dispose();
		else{
			
			for(int i=0;i<num;i++){
				imageArray.get(i).setVisible(true);
			}
			for(int i=num;i<5-num;i++){
				imageArray.get(i).setVisible(false);
			}
		}
			
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoStep frame = new TwoStep();
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
	public TwoStep() {

		setTitle("Two Step");
		setBounds(100, 100, frame_Width, frame_Height);
		Sound = new BackSound("game2");
		setSound(true,Sound);
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
		
		
		/*Life image Array*/
		this.imageArray = new ArrayList<JLabel>();
		for(int i=0;i<5;i++){
			imageArray.add(new JLabel(life));
		}
		
		

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
					setSound(false,Sound);
				}

			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				setSound(false,Sound);
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



		lifenum = 3;

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
				showlife(lifenum,life);

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
				showlife(lifenum,life);
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
				showlife(lifenum,life);

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
				showlife(lifenum,life);

			}

		});
		
		

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(31)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(imageArray.get(0), GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(49)
											.addComponent(imageArray.get(1), GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
											.addGap(95)
											.addComponent(imageArray.get(3), GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE))))
								.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 900, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(535)
							.addComponent(imageArray.get(2), GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
					.addComponent(imageArray.get(4), GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
					.addGap(84))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_4, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(imageArray.get(0), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addGap(3))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(imageArray.get(1), GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(imageArray.get(3), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(imageArray.get(2), GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
								.addComponent(imageArray.get(4), GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
