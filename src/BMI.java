
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author matth
 */
public class BMI extends javax.swing.JFrame {

    /**
     * Creates new form BMI
     */
    public BMI() {
        initComponents();
        Helper.webScraper();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Close");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jTextField1.setName("textField1"); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton2.setText("calculate");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel2.setText("feet");

        jLabel3.setText("inches");

        jLabel4.setText("weight in pounds");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))))
                        .addGap(0, 293, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        if (jButton2.isEnabled())
        {
            
            if (jTextField1.getText().isEmpty())
            {
                jLabel1.setText("Feet can't be empty!");
                jTextField1.requestFocus();
                JOptionPane.showMessageDialog(null, "Feet can't be empty.");
                return;
            }
            
            if (jTextField2.getText().isEmpty())
            {
                jLabel1.setText("Inches can't be empty!");
                jTextField2.requestFocus();
                JOptionPane.showMessageDialog(null, "Inches can't be empty.");
                return;                
            }
            
            if (jTextField3.getText().isEmpty())
            {
                jLabel1.setText("Weight can't be empty!");
                jTextField3.requestFocus();
                JOptionPane.showMessageDialog(null, "Weight can't be empty.");
                return;                
            }
            
            if (Double.parseDouble(jTextField1.getText()) == 0)
            {
                if (Double.parseDouble(jTextField2.getText()) == 0)
                {
                    jTextField1.requestFocus();
                    jTextField1.setText("");
                    jTextField2.setText("");
                    JOptionPane.showMessageDialog(null, "You can't be 0 feet and 0 inches tall...");
                    jLabel1.setText("Height error.");
                    return;
                }
            }
            
            if (Helper.isValidNumber(jTextField1.getText()))
            {
                if (Helper.isValidNumber(jTextField2.getText()))
                {
                    double feet = Double.parseDouble(jTextField1.getText());
                    double inches = Double.parseDouble(jTextField2.getText());
                    
                    if (inches >= 12)
                    {
                        jTextField2.setText("");
                        jTextField2.requestFocus();
                        JOptionPane.showMessageDialog(null, "You entered a height in inches greater than or equal to 12. This is not valid.");
                        return;
                    }

                    double feetToInches = feet * 12;

                    double totalInches = feetToInches + inches;

                    if (Helper.isValidNumber(jTextField3.getText()))
                    {
                        double weight = Double.parseDouble(jTextField3.getText());

                        double numerator = weight * 703;
                        double denominator = totalInches * totalInches;

                        double BMI = numerator / denominator;

                        jLabel1.setText(String.valueOf(BMI));

                        if (BMI < 18.5)
                        {
                            jLabel5.setText("You are underweight.");
                        }

                        else if (BMI < 24.9)
                        {
                            jLabel5.setText("You are normal weight.");
                        }

                        else if (BMI <= 29.9)
                        {
                            jLabel5.setText("You are overweight.");
                        }

                        else if (BMI > 29.9)
                        {
                            jLabel5.setText("You are obese.");
                        }

                        else
                        {
                            jLabel5.setText("ERROR");
                        }
                    }

                    else
                    {
                        jLabel1.setText("Invalid weight!");
                        jTextField3.setText("");
                        jTextField3.requestFocus();
                        JOptionPane.showMessageDialog(null, "You entered an invalid weight! Make sure it's a positive number.");
                        return;
                    }
                }

                else
                {
                    jLabel1.setText("Invalid inches!");
                    jTextField2.setText("");
                    jTextField2.requestFocus();
                    JOptionPane.showMessageDialog(null, "You entered an invalid height in inches! Make sure it's a positive number.");
                    return;
                }

            }

            else
            {
                jLabel1.setText("Invalid feet!");
                jTextField1.setText("");
                jTextField1.requestFocus();
                JOptionPane.showMessageDialog(null, "You entered an invalid height in feet! Make sure it's a positive number.");
                return;
            }
        
        }
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
//        if (!jTextField1.getText().trim().isEmpty())
//        {
//            if (!jTextField2.getText().trim().isEmpty())
//            {
//                if (!jTextField3.getText().trim().isEmpty())
//                {
//                    jButton2.setEnabled(true);
//                }
//                
//                else
//                {
//                    jButton2.setEnabled(false);
//                }
//            }
//            
//            else
//            {
//                jButton2.setEnabled(false);
//            }
//        }
//        
//        else
//        {
//            jButton2.setEnabled(false);
//        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
//        if (!jTextField1.getText().trim().isEmpty())
//        {
//            if (!jTextField2.getText().trim().isEmpty())
//            {
//                if (!jTextField3.getText().trim().isEmpty())
//                {
//                    jButton2.setEnabled(true);
//                }
//                
//                else
//                {
//                    jButton2.setEnabled(false);
//                }
//            }
//            
//            else
//            {
//                jButton2.setEnabled(false);
//            }
//        }
//        
//        else
//        {
//            jButton2.setEnabled(false);
//        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
//        if (!jTextField1.getText().trim().isEmpty())
//        {
//            if (!jTextField2.getText().trim().isEmpty())
//            {
//                if (!jTextField3.getText().trim().isEmpty())
//                {
//                    jButton2.setEnabled(true);
//                }
//                
//                else
//                {
//                    jButton2.setEnabled(false);
//                }
//            }
//            
//            else
//            {
//                jButton2.setEnabled(false);
//            }
//        }
//        
//        else
//        {
//            jButton2.setEnabled(false);
//        }
    }//GEN-LAST:event_jTextField3KeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new BMI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
