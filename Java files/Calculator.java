import  javax.swing.*;
import  java.awt.*;
import  java.awt.event.*;

//package calculations;

public class Calculator extends JFrame
 {

    double firstnum;
    double secondnum;
    double result;
    String operations;
    
    /**
     * Creates new form Calculator
     */
    public Calculator()
	{
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() 
	{

        jtxtDisplay = new  JTextField();
        jbtn1 = new JButton();
        jbtn2 = new  JButton();
        jbtn3 = new  JButton();
        jbtn4 = new  JButton();
        jbtn5 = new  JButton();
        jbtn6 = new  JButton();
        jbtn7 = new  JButton();
        jbtn8 = new  JButton();
        jbtn9 = new  JButton();
        jbtn10 = new  JButton();
        jbtn11 = new  JButton();
        jbtn12 = new  JButton();
        jbtn13 = new  JButton();
        jbtn14 = new  JButton();
        jbtn15 = new  JButton();
        jbtn16 = new  JButton();
        jbtn18 = new  JButton();
        jbtn19 = new  JButton();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
		
        setTitle("JAVA Calculator");
		setLayout(null);
		setLocation(490,120);
		setResizable(false);
        setBackground(new Color(255, 255, 255));

        jtxtDisplay.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(JTextField.RIGHT);

        jbtn1.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jbtn1.setText("1");
        jbtn1.setToolTipText("");
        jbtn1.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
			{
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn2.setText("2");
        jbtn2.setToolTipText("");
        jbtn2.addActionListener(new  ActionListener()
			{
            public void actionPerformed(ActionEvent evt)
			{
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn3.setText("3");
        jbtn3.setToolTipText("");
        jbtn3.addActionListener(new   ActionListener() {
            public void actionPerformed(ActionEvent evt) 
			{
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn4.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn4.setText("4");
        jbtn4.setToolTipText("");
        jbtn4.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
			{
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn5.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn5.setText("5");
        jbtn5.setToolTipText("");
        jbtn5.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent evt)
			{
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn6.setText("6");
        jbtn6.setToolTipText("");
        jbtn6.addActionListener(new ActionListener() 
		{
            public void actionPerformed(  ActionEvent evt)
			{
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn7.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn7.setText("7");
        jbtn7.setToolTipText("");
        jbtn7.addActionListener(new   ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
			{
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn8.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn8.setText("8");
        jbtn8.setToolTipText("");
        jbtn8.addActionListener(new ActionListener()
		{
            public void actionPerformed(  ActionEvent evt)
			{
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn9.setText("x");
        jbtn9.setToolTipText("");
        jbtn9.addActionListener(new ActionListener()
		{
		public void actionPerformed(  ActionEvent evt)
			{
				jbtn9ActionPerformed(evt);
			}
		});
		 jbtn10.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn10.setText("+/-");
        jbtn10.setToolTipText("");
        jbtn10.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent evt)
			{
                jbtn10ActionPerformed(evt);
            }
        });

        jbtn11.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn11.setText(".");
        jbtn11.setToolTipText("");
        jbtn11.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
			{
                jbtn11ActionPerformed(evt);
            }
        });

        jbtn12.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn12.setText("9");
        jbtn12.setToolTipText("");
        jbtn12.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent evt)
			{
                jbtn12ActionPerformed(evt);
            }
        });

        jbtn13.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn13.setText("0");
        jbtn13.setToolTipText("");
        jbtn13.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
			{
                jbtn13ActionPerformed(evt);
            }
        });

        jbtn14.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn14.setText("+");
        jbtn14.setToolTipText("");
        jbtn14.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
			{
                jbtn14ActionPerformed(evt);
            }
        });

        jbtn15.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn15.setText("-");
        jbtn15.setToolTipText("");
        jbtn15.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent evt)
			{
                jbtn15ActionPerformed(evt);
            }
        });

        jbtn16.setFont(new  Font("Tahoma", 1, 18)); // NOI18N
        jbtn16.setText("/");
        jbtn16.setToolTipText("");
        jbtn16.addActionListener(new ActionListener()
		{
            public void actionPerformed(ActionEvent evt) 
			{
                jbtn16ActionPerformed(evt);
            }
        });

        jbtn18.setFont(new  Font("Tahoma", 1, 24)); // NOI18N
        jbtn18.setText("C");
        jbtn18.setToolTipText("");
        jbtn18.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent evt) 
			{
                jbtn18ActionPerformed(evt);
            }
        });

        jbtn19.setFont(new  Font("Tahoma", 1, 24)); // NOI18N
        jbtn19.setText("=");
        jbtn19.setToolTipText("Created by Neeraj Using JDK1.8");
        jbtn19.addActionListener(new ActionListener() 
		{
            public void actionPerformed(ActionEvent evt)
			{
                jbtn19ActionPerformed(evt);
            }
        });

        GroupLayout layout = new  GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtxtDisplay)
                    .addGroup(layout.createParallelGroup( GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtn5,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn1,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                .addComponent(jbtn2,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE)
                                .addComponent(jbtn6,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn3,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn4,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn7,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn8,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn14,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn15,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtn10)
                            .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtn11,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE))
                        .addGroup( GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn16,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn9,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbtn12,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbtn13,  GroupLayout.PREFERRED_SIZE, 63,  GroupLayout.PREFERRED_SIZE))
                                .addComponent(jbtn18,  GroupLayout.PREFERRED_SIZE, 132,  GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtn19,  GroupLayout.PREFERRED_SIZE, 132,  GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtDisplay,  GroupLayout.PREFERRED_SIZE, 64,  GroupLayout.PREFERRED_SIZE)
                .addPreferredGap( LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn1,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn2,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn3,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn4,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn5,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn7,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn8,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn12,  GroupLayout.Alignment.TRAILING,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn13,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn14,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn15,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtn16,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtn9,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtn10,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn11,  GroupLayout.PREFERRED_SIZE, 57,  GroupLayout.PREFERRED_SIZE))
                .addPreferredGap( LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup( GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn18,  GroupLayout.PREFERRED_SIZE, 58,  GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn19,  GroupLayout.PREFERRED_SIZE, 58,  GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn15ActionPerformed(ActionEvent evt)
	{//GEN-FIRST:event_jbtn15ActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "-";
    }//GEN-LAST:event_jbtn15ActionPerformed

    private void jbtn2ActionPerformed(ActionEvent evt) 
	{//GEN-FIRST:event_jbtn2ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jbtn2.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn16ActionPerformed(ActionEvent evt)
	{//GEN-FIRST:event_jbtn16ActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "/";
    }//GEN-LAST:event_jbtn16ActionPerformed

    private void jbtn3ActionPerformed(ActionEvent evt) 
	{//GEN-FIRST:event_jbtn3ActionPerformed
       String Enternumber = jtxtDisplay.getText() + jbtn3.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn1ActionPerformed(ActionEvent evt) 
	{//GEN-FIRST:event_jbtn1ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jbtn1.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn4ActionPerformed(ActionEvent evt)
	{//GEN-FIRST:event_jbtn4ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jbtn4.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(ActionEvent evt)
	{//GEN-FIRST:event_jbtn5ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jbtn5.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(ActionEvent evt) 
	{//GEN-FIRST:event_jbtn6ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jbtn6.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(ActionEvent evt)
	{//GEN-FIRST:event_jbtn7ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jbtn7.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(ActionEvent evt) 
	{//GEN-FIRST:event_jbtn8ActionPerformed
        String Enternumber = jtxtDisplay.getText() + jbtn8.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn12ActionPerformed(ActionEvent evt)
	{//GEN-FIRST:event_jbtn12ActionPerformed
       String Enternumber = jtxtDisplay.getText() + jbtn12.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn12ActionPerformed

    private void jbtn13ActionPerformed(ActionEvent evt) 
	{//GEN-FIRST:event_jbtn13ActionPerformed
       String Enternumber = jtxtDisplay.getText() + jbtn13.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn13ActionPerformed

    private void jbtn14ActionPerformed(ActionEvent evt) 
	{//GEN-FIRST:event_jbtn14ActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "+";
    }//GEN-LAST:event_jbtn14ActionPerformed

    private void jbtn9ActionPerformed(ActionEvent evt) 
	{//GEN-FIRST:event_jbtn9ActionPerformed
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operations = "*";
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn10ActionPerformed(ActionEvent evt)
	{//GEN-FIRST:event_jbtn10ActionPerformed
       double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
       ops = ops * (-1);
       jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtn10ActionPerformed

    private void jbtn18ActionPerformed(ActionEvent evt)
	{//GEN-FIRST:event_jbtn18ActionPerformed
        jtxtDisplay.setText("");
    }//GEN-LAST:event_jbtn18ActionPerformed

    private void jbtn11ActionPerformed(ActionEvent evt) 
	{//GEN-FIRST:event_jbtn11ActionPerformed
        String EnterNumber = jtxtDisplay.getText()+ jbtn11.getText();
        jtxtDisplay.setText(EnterNumber);
    }//GEN-LAST:event_jbtn11ActionPerformed

    private void jbtn19ActionPerformed(ActionEvent evt)
	{//GEN-FIRST:event_jbtn19ActionPerformed

    String answer;
    secondnum = Double.parseDouble(jtxtDisplay.getText());
    if (operations == "+")
    {
        result = firstnum + secondnum;
        answer = String.format("%.0f",result);
        jtxtDisplay.setText(answer);
    
    }//GEN-LAST:event_jbtn19ActionPerformed

    else if (operations == "-")
    {
        result = firstnum -secondnum;
        answer = String.format("%.0f",result);
        jtxtDisplay.setText(answer);
    
    } 
    else if (operations == "*")
    {
        result = firstnum * secondnum;
        answer = String.format("%.0f",result);
        jtxtDisplay.setText(answer);
    
    } 
    else if (operations == "/")
    {
        result = firstnum / secondnum;
        answer = String.format("%.0f",result);
        jtxtDisplay.setText(answer);
    
    } 
    else if (operations == "%")
    {
        result = firstnum % secondnum;
        answer = String.format("%.0f",result);
        jtxtDisplay.setText(answer);
    
    } 
    }
    
    public static void main(String args[])
	{
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for ( UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
				{
                if ("Windows Classic".equals(info.getName()))
					{
                     UIManager.setLookAndFeel(info.getClassName());
						break;
					}
				}
			} 
			
		catch (ClassNotFoundException ex) 
		{
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
		catch (InstantiationException ex) 
		{
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
		catch (IllegalAccessException ex)
		{
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		catch ( UnsupportedLookAndFeelException ex)
		{
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         EventQueue.invokeLater(new Runnable()
		 {
            public void run() 
			{
                new Calculator().setVisible(true);
            }
         });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private  JButton jbtn1;
    private  JButton jbtn10;
    private  JButton jbtn11;
    private  JButton jbtn12;
    private  JButton jbtn13;
    private  JButton jbtn14;
    private  JButton jbtn15;
    private  JButton jbtn16;
    private  JButton jbtn18;
    private  JButton jbtn19;
    private  JButton jbtn2;
    private  JButton jbtn3;
    private  JButton jbtn4;
    private  JButton jbtn5;
    private  JButton jbtn6;
    private  JButton jbtn7;
    private  JButton jbtn8;
    private  JButton jbtn9;
    private  JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
