package oops;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TwoStep_Question extends JPanel {

	/**
	 * Create the panel.
	 */
	private int check=1;
	private File q1;
	private String a;
	private String answer;
	private File q;
	private File q2;
	private File q3;
	private File q4;
	private int score;
	private ArrayList<String> select;
	private ArrayList<String> answer_select;
	private Font f1;
	private JTextField textField_1;
	private TwoStep_Question two;
	private JButton btnA;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	
	public TwoStep_Question(int num) {

		f1 = new Font("Times", Font.BOLD, 14);

		
		JScrollPane scrollPane = new JScrollPane();


		JLabel lblAnswer = new JLabel("Answer :");
		lblAnswer.setFont(new Font("Times New Roman", Font.BOLD, 23));
		textField_1 = new JTextField();
		textField_1.setColumns(10);

		answer = textField_1.getText().trim();
		answer = answer.toLowerCase();

		
//		two = new TwoStep_Question();
		this.check=1;
		String reader = "";
		
		try {
			q1 = new File("step2-1.txt");
			q2 = new File("step2-2.txt");
			q3 = new File("step2-3.txt");
			q4 = new File("step2-4.txt");

			switch (num) {
			case 1:
				q = q1;
				break;
			case 2:
				q = q2;
				break;
			case 3:
				q = q3;
				break;
			case 4:
				q = q4;
				break;
			}
			BufferedReader br = new BufferedReader(new FileReader(q));
			a = "";
			while ((reader = br.readLine()) != null) {
				a += reader;
				a += "\n";
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		btnA = new JButton("A");
		select = new ArrayList<String>();
		
		answer_select = new ArrayList<String>();

		switch (num) {
		case 1:
			select.add("1) class practice");
			select.add("2) [] args\r\n");
			select.add("3) int num;");
			select.add("4) num);\r\n");
			answer_select.add(0, "+num);");
			break;
		case 2:
			select.add("1) \\Users\\이은영\\Desktop\\sun\\game1.wav\";");
			select.add("2) Music();");
			select.add("3) 3player.play(game1)");
			select.add("4) ");
			answer_select.add(0, "\\\\Users\\\\이은영\\\\Desktop\\\\sun\\\\game1.wav\";");
			break;
		case 3:
			select.add("1) int number() {;");
			select.add("2) plus = a+b;");
			select.add("3) \n }");
			select.add("4) ");
			answer_select.add(0, "return");
			break;
		case 4:
			select.add("1) int a, int b) {");
			select.add("2) return a-b;");
			select.add("3) Else if (b<a) {");
			select.add("4) ");
			answer_select.add(0, "else");
			break;
		}

		
		chckbxNewCheckBox = new JCheckBox(select.get(0));

		chckbxNewCheckBox_1 = new JCheckBox(select.get(1));

		chckbxNewCheckBox_2 = new JCheckBox(select.get(2));

		chckbxNewCheckBox_3 = new JCheckBox(select.get(3));
		
		chckbxNewCheckBox.setFont(f1);
		chckbxNewCheckBox.setBackground(Color.white);

		chckbxNewCheckBox_1.setFont(f1);
		chckbxNewCheckBox_1.setBackground(Color.white);

		chckbxNewCheckBox_2.setFont(f1);
		chckbxNewCheckBox_2.setBackground(Color.white);

		chckbxNewCheckBox_3.setFont(f1);
		chckbxNewCheckBox_3.setBackground(Color.white);
		
		btnA.setFont(new Font("굴림", Font.BOLD, 49));
		btnA.setForeground(Color.MAGENTA);
		btnA.setBackground(Color.CYAN);

		
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num == 1) {

					if (chckbxNewCheckBox_3.isSelected() && !chckbxNewCheckBox_2.isSelected()
							&& !chckbxNewCheckBox_1.isSelected() && !chckbxNewCheckBox.isSelected()) {

						score = score + 3;
						if (answer.equals(answer_select.get(0))) {
							score = score + 3;
						}
						JOptionPane.showMessageDialog(null, "Your score is " + score);
						check=2;
//						two = new TwoStep_Question();

					}

				} else if (num == 2) {

					chckbxNewCheckBox_3.setVisible(false);
					if (chckbxNewCheckBox.isSelected() && !chckbxNewCheckBox_1.isSelected()
							&& !chckbxNewCheckBox_2.isSelected()) {
						score = score + 3;
						if (answer.equals(answer_select.get(0)))
							score = score + 3;

					}
					JOptionPane.showMessageDialog(null, "Your score is " + score);
					check=3;
//					two = new TwoStep_Question();

				} else if (num == 3) {

					chckbxNewCheckBox_3.setVisible(false);
					if (!chckbxNewCheckBox.isSelected() && !chckbxNewCheckBox_1.isSelected()
							&& chckbxNewCheckBox_2.isSelected()) {
						score = score + 3;
						if (answer.equals(answer_select.get(0)))
							score = score + 3;

					}
					JOptionPane.showMessageDialog(null, "Your score is " + score);
					check=4;
//					two = new TwoStep_Question();
					

				} else if (num == 4) {
					chckbxNewCheckBox_3.setVisible(false);
					if (!chckbxNewCheckBox.isSelected() && !chckbxNewCheckBox_1.isSelected()
							&& chckbxNewCheckBox_2.isSelected()) {
						score = score + 3;
						if (answer.equals(answer_select.get(0)))
							score = score + 3;

					}
					JOptionPane.showMessageDialog(null, "Your score is " + score);

				}

			}

		});
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(27)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(9).addComponent(chckbxNewCheckBox)
										.addGap(80).addComponent(chckbxNewCheckBox_1).addGap(78)
										.addComponent(chckbxNewCheckBox_2).addGap(71).addComponent(chckbxNewCheckBox_3)
										.addContainerGap())
								.addGroup(groupLayout.createSequentialGroup().addGroup(groupLayout
										.createParallelGroup(Alignment.LEADING)
										.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 621,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(Alignment.TRAILING,
												groupLayout.createSequentialGroup().addGap(49).addComponent(lblAnswer)
														.addPreferredGap(ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 372,
																GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
										.addComponent(btnA, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
										.addGap(32)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(28).addComponent(scrollPane,
										GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE))
								.addGroup(
										groupLayout.createSequentialGroup().addGap(56).addComponent(btnA,
												GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(chckbxNewCheckBox_1).addComponent(chckbxNewCheckBox_2)
												.addComponent(chckbxNewCheckBox))
										.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
								.addGroup(Alignment.TRAILING,
										groupLayout.createSequentialGroup().addComponent(chckbxNewCheckBox_3)
												.addGap(40)))
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAnswer))
						.addGap(37)));

		JTextArea textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		setLayout(groupLayout);
		textArea_1.setText(a);
		textArea_1.setFont(f1);
		textArea_1.setEditable(false);

	}

}
