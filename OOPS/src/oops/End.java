package oops;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class End extends JFrame {

   private JPanel contentPane;
   private String id;
   private int score;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               End frame = new End();
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
   public End() {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 450, 300);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      
      JPanel panel = new JPanel();
      panel.setForeground(Color.BLUE);
      panel.setBackground(Color.WHITE);
      panel.setBorder(new TitledBorder(null, "End", TitledBorder.LEADING, TitledBorder.TOP, null, null));
      
      JLabel lblOopsTheEnd = new JLabel("OOPS! THE END!");
      lblOopsTheEnd.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 41));
      
      JLabel userScore = new JLabel("User: "+id);
      userScore.setForeground(Color.BLUE);
      userScore.setFont(new Font("Arial Black", Font.BOLD, 25));
      JLabel userId = new JLabel("Score: "+score);
      userId.setForeground(Color.RED);
      userId.setFont(new Font("Arial Black", Font.PLAIN, 25));
      GroupLayout gl_panel = new GroupLayout(panel);
      gl_panel.setHorizontalGroup(
         gl_panel.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel.createSequentialGroup()
               .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                  .addGroup(gl_panel.createSequentialGroup()
                     .addGap(57)
                     .addComponent(lblOopsTheEnd))
                  .addGroup(gl_panel.createSequentialGroup()
                     .addGap(169)
                     .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                        .addComponent(userId)
                        .addComponent(userScore))))
               .addContainerGap(291, Short.MAX_VALUE))
      );
      gl_panel.setVerticalGroup(
         gl_panel.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_panel.createSequentialGroup()
               .addGap(32)
               .addComponent(lblOopsTheEnd)
               .addGap(42)
               .addComponent(userScore)
               .addPreferredGap(ComponentPlacement.RELATED)
               .addComponent(userId)
               .addContainerGap(16, Short.MAX_VALUE))
      );
      panel.setLayout(gl_panel);
      GroupLayout gl_contentPane = new GroupLayout(contentPane);
      gl_contentPane.setHorizontalGroup(
         gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addGroup(gl_contentPane.createSequentialGroup()
               .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
               .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      gl_contentPane.setVerticalGroup(
         gl_contentPane.createParallelGroup(Alignment.LEADING)
            .addComponent(panel, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
      );
      contentPane.setLayout(gl_contentPane);
   }


