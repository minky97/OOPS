package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Join extends JFrame {

   private JPanel contentPane;
   private JTextField textField;
   private ArrayList<String> userlist;
   private String id;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               Join frame = new Join();
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
   public Join() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      contentPane.setLayout(new BorderLayout(0, 0));
      setContentPane(contentPane);

      JPanel panel = new JPanel();
      panel.setBorder(new TitledBorder(null, "Log-in", TitledBorder.LEADING, TitledBorder.TOP, null, null));
      contentPane.add(panel, BorderLayout.CENTER);

      JLabel lblId = new JLabel("ID: ");

      JButton btnJoin = new JButton("Join");
      JLabel login_warning = new JLabel();
      JLabel join_warning = new JLabel();

      textField = new JTextField();
      textField.setColumns(10);

      JButton btnLogin = new JButton("Log-in");
      btnLogin.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(btnLogin)) {
               id=textField.getText();
               if(userlist.contains(id)){
                  //게임스타트로 전환해야함
               }
               else{
                  login_warning.setText(id+"doesn't exist.\tPlease input existing id or create new id");
               }
            }
            if(e.getSource().equals(btnJoin)){
               id=textField.getText();
               if(userlist.contains(id)){
                  join_warning.setText(id+"exist already.\tPlease input new id");
               }
               else{
                  userlist.add(id);
               }
                  
            }
         }
      });

   GroupLayout gl_panel = new GroupLayout(
         panel);gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup().addGap(60).addComponent(lblId).addPreferredGap(ComponentPlacement.RELATED).addComponent(textField,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE).addGap(14).addComponent(btnLogin)).addGroup(gl_panel.createSequentialGroup().addGap(164).addComponent(btnJoin))).addContainerGap(114,Short.MAX_VALUE)));gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel.createSequentialGroup().addGap(26).addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblId).addComponent(textField,GroupLayout.PREFERRED_SIZE,GroupLayout.DEFAULT_SIZE,GroupLayout.PREFERRED_SIZE).addComponent(btnLogin)).addGap(38).addComponent(btnJoin).addContainerGap(98,Short.MAX_VALUE)));panel.setLayout(gl_panel);
}


