package oops.step;

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
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class ThreeStep_Question extends JPanel {

   /**
    * Create the panel.
    */
   private int check = 1;
   private File q1;
   private String a;
   private String answer;
   private String buttonNum;
   private File q;
   private File q2;
   private File q3;
   private File q4;
   
   private ArrayList<String> answer_select;
   private ArrayList<String> answer_num;
   private Font f1;
   private JTextField textField_1;
   private JButton btnA;
   private ButtonGroup buttonGroup;
   private JRadioButton radioButton1;
   private JRadioButton radioButton2;
   private JRadioButton radioButton3;

   

   public JRadioButton getRadioButton1() {
	return radioButton1;
}

public void setRadioButton1(JRadioButton radioButton1) {
	 if(radioButton1==null)
         System.out.println("error");
	this.radioButton1 = radioButton1;
}

public JRadioButton getRadioButton2() {
	return radioButton2;
}

public void setRadioButton2(JRadioButton radioButton2) {
	 if(radioButton2==null)
         System.out.println("error");
	this.radioButton2 = radioButton2;
}

public JRadioButton getRadioButton3() {
	return radioButton3;
}

public void setRadioButton3(JRadioButton radioButton3) {
	 if(radioButton3==null)
         System.out.println("error");
	this.radioButton3 = radioButton3;
}

public JTextField getTextField_1() {
      return textField_1;
   }
   
public ButtonGroup getButtonGroup() {
      return buttonGroup;
   }

   public void setButtonGroup(ButtonGroup buttonGroup) {
      if(buttonGroup==null)
         System.out.println("error");
      this.buttonGroup = buttonGroup;
   }


   public String getButtonNum() {
      return buttonNum;
   }

   public void setButtonNum(String buttonNum) {
      if(buttonNum==null)
         System.out.println("error");
      this.buttonNum = buttonNum;
   }

   public void setTextField_1(JTextField textField_1) {
      this.textField_1 = textField_1;
   }

   public ArrayList<String> getAnswer_num() {
      return answer_num;
   }

   public void setAnswer_num(ArrayList<String> answer_num) {
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
      btnA.setFont(new Font("±¼¸²", Font.BOLD, 49));
      btnA.setForeground(Color.MAGENTA);
      btnA.setBackground(Color.CYAN);
      
      
   }

   public int getCheck() {
      return check;
   }

   public void setCheck(int check) {// capsulation ÇØ¾ß´ï
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
      
      //buttonNum = buttonGroup.getSelection().getActionCommand();
      //setButtonNum(buttonNum);
      

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

      //´äÃ¼Å©
      btnA = new JButton("A");
      setBtnA(btnA);
      answer_select = new ArrayList<String>();
      answer_select.add("+");
      answer_select.add("\\");
      answer_select.add("return");
      answer_select.add("fos");
      setAnswer_select(answer_select);
      
      answer_num = new ArrayList<String>();
      answer_num.add("(3)");
      answer_num.add("(3)");
      answer_num.add("(1)");
      answer_num.add("(2)");
      setAnswer_num(answer_num);
      
   
      
      JLabel lblNewLabel = new JLabel("* Check the number that error has been occured and write something that is required for correction.");
      lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      
      JLabel lblanyModificationOr = new JLabel("(Any Modification or deletion is not allowed. Only addtion to the proper place is allowed.)");
      lblanyModificationOr.setFont(new Font("Times New Roman", Font.PLAIN, 20));
      
      JRadioButton radioButton1 = new JRadioButton("(1)");
      
      JRadioButton radioButton2 = new JRadioButton("(2)");
      
      JRadioButton radioButton3 = new JRadioButton("(3)");
      
      buttonGroup = new ButtonGroup();
      buttonGroup.add(radioButton1);
      buttonGroup.add(radioButton2);
      buttonGroup.add(radioButton3);

          

   
      GroupLayout groupLayout = new GroupLayout(this);
      groupLayout.setHorizontalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                  .addGroup(groupLayout.createSequentialGroup()
                     .addGap(39)
                     .addComponent(lblanyModificationOr))
                  .addGroup(groupLayout.createSequentialGroup()
                     .addGap(27)
                     .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 832, GroupLayout.PREFERRED_SIZE)
                        .addGroup(groupLayout.createSequentialGroup()
                           .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                              .addGroup(groupLayout.createSequentialGroup()
                                 .addComponent(lblAnswer)
                                 .addPreferredGap(ComponentPlacement.UNRELATED)
                                 .addComponent(radioButton1)
                                 .addGap(18)
                                 .addComponent(radioButton2)
                                 .addGap(18)
                                 .addComponent(radioButton3)
                                 .addGap(18)
                                 .addComponent(textField_1))
                              .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 621, GroupLayout.PREFERRED_SIZE))
                           .addPreferredGap(ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                           .addComponent(btnA, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)))))
               .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      groupLayout.setVerticalGroup(
         groupLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(groupLayout.createSequentialGroup()
               .addContainerGap()
               .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(lblanyModificationOr)
               .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
                  .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 294, GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnA, GroupLayout.PREFERRED_SIZE, 247, GroupLayout.PREFERRED_SIZE))
               .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                  .addComponent(lblAnswer)
                  .addComponent(radioButton1)
                  .addComponent(radioButton2)
                  .addComponent(radioButton3)
                  .addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
               .addGap(87))
      );

      JTextArea textArea_1 = new JTextArea();
      scrollPane.setViewportView(textArea_1);
      setLayout(groupLayout);
      textArea_1.setText(a);
      textArea_1.setFont(f1);
      textArea_1.setEditable(false);

   }
}