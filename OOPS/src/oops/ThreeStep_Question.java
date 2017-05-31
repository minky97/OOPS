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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ThreeStep_Question extends JPanel {

	/**
	 * Create the panel.
	 */
	private int check = 1;
	private File q1;
	private String a;
	private String answer;
	private int num;
	private File q;
	private File q2;
	private File q3;
	private File q4;
	
	private ArrayList<String> answer_select;
	private ArrayList<Integer> answer_num;
	private Font f1;
	private JTextField textField_1;
	private JButton btnA;


	public JTextField getTextField_1() {
		return textField_1;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num<0)
			System.out.println("error");
		this.num = num;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public ArrayList<Integer> getAnswer_num() {
		return answer_num;
	}

	public void setAnswer_num(ArrayList<Integer> answer_num) {
		if(answer_select==null)
			System.out.println("error");
		this.answer_num = answer_num;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		if(answer==null)
			System.out.println("error!");
		this.answer = answer;
	}

	public ArrayList<String> getAnswer_select() {
		return answer_select;
	}

	public void setAnswer_select(ArrayList<String> answer_select) {
		if(answer_select==null)
			System.out.println("error");
		this.answer_select = answer_select;
	}

	public JButton getBtnA() {
		return btnA;
	}

	public void setBtnA(JButton btnA) {
		this.btnA = btnA;
		btnA.setFont(new Font("굴림", Font.BOLD, 49));
		btnA.setForeground(Color.MAGENTA);
		btnA.setBackground(Color.CYAN);
		
		
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {// capsulation 해야댐
		this.check = check;
	}

	public ThreeStep_Question(int num) {

		f1 = new Font("Times", Font.BOLD, 14);

		JScrollPane scrollPane = new JScrollPane();

		JLabel lblAnswer = new JLabel("Answer :");
		lblAnswer.setFont(new Font("Times New Roman", Font.BOLD, 23));
		textField_1 = new JTextField();
		textField_1.setColumns(10);

		answer = textField_1.getText().trim();
		answer = answer.toLowerCase();
		setAnswer(answer);
		
		//몇번체크했는지
		//num = Integer.parseInt(comboBox.getSelectedItem().toString().trim());
		//num = num.toLowerCase();
		//setNum(num);
		
		

		this.check = 1;
		String reader = "";

		try {
			q1 = new File("step3-1.txt");
			q2 = new File("step3-2.txt");
			q3 = new File("step3-3.txt");
			q4 = new File("step3-4.txt");

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

		//답체크
		btnA = new JButton("A");
		setBtnA(btnA);
		answer_select = new ArrayList<String>();
		answer_select.add("+");
		answer_select.add("\\");
		answer_select.add("return");
		answer_select.add("else");
		setAnswer_select(answer_select);
		
		answer_select = new ArrayList<String>();
		answer_select.add("+");
		answer_select.add("\\");
		answer_select.add("return");
		answer_select.add("else");
		setAnswer_select(answer_select);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		
		JLabel lblNewLabel = new JLabel("* Select the number that error has been occured and write something that is required for correction.");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));

	
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addGap(18)
									.addComponent(lblAnswer)
									.addGap(18)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
								.addComponent(scrollPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 621, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnA, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))
					.addGap(54))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnA, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAnswer)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(65)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
					.addGap(59))
		);

		JTextArea textArea_1 = new JTextArea();
		scrollPane.setViewportView(textArea_1);
		setLayout(groupLayout);
		textArea_1.setText(a);
		textArea_1.setFont(f1);
		textArea_1.setEditable(false);

	}
}
