
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author npcnp
 */
public class Calc3 extends javax.swing.JFrame {

    /**
     * Creates new form Calc3
     */
    public Calc3() {
        initComponents();
        jLabel6.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        closeButton.setText("Close");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        jTextField1.setText("$");

        jTextField4.setText("$");

        jTextField5.setText("$0");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setText("Calculate Monthly Payment");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setText("Car Price (in $)");

        jLabel2.setText("Loan Term (in years)");

        jLabel3.setText("Interest Rate (in %)");

        jLabel4.setText("Down Payment (in $)");

        jLabel5.setText("Trade-In Value (if paid off. in $)");

        jLabel6.setText("jLabel6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 581, Short.MAX_VALUE)
                .addComponent(closeButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jTextField4)
                            .addComponent(jTextField3)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(closeButton)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(28, 28, 28)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(0, 112, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String carPriceString = jTextField1.getText();
        String loanTermYearsString = jTextField2.getText();
        String interestRateString = jTextField3.getText();
        String downPaymentString = jTextField4.getText();
        String tradeInValueString = jTextField5.getText();
        
        double carPrice = 0;
        double loanTermMonths = 0;
        double interestRate = 0;
        double downPayment = 0;
        double tradeInValue = 0;
        
        if (carPriceString.equals(""))
        {
            JOptionPane.showMessageDialog(this, "You must enter a valid car price!", "Alert", JOptionPane.WARNING_MESSAGE);
            jTextField1.requestFocus();
            jTextField1.setText("$");
            return;
        }
        
        if (downPaymentString.equals(""))
        {
            JOptionPane.showMessageDialog(this, "You must enter a valid down payment!", "Alert", JOptionPane.WARNING_MESSAGE);
            jTextField4.requestFocus();
            jTextField4.setText("$");
            return; 
        }
        
        if (tradeInValueString.equals(""))
        {
            JOptionPane.showMessageDialog(this, "You must enter a valid trade in value! If you do not have one, enter 0!", "Alert", JOptionPane.WARNING_MESSAGE);
            jTextField5.requestFocus();
            jTextField5.setText("$0");
            return;
        }
        
        if (carPriceString.charAt(0) == '$')
        {
            carPriceString = carPriceString.substring(1);
        }
        
        if (downPaymentString.charAt(0) == '$')
        {
            downPaymentString = downPaymentString.substring(1);
        }
        
        if (tradeInValueString.charAt(0) == '$')
        {
            tradeInValueString = tradeInValueString.substring(1);
        }
        
        if (Helper.isValidNumber(carPriceString))
        {
            carPrice = Double.parseDouble(carPriceString);
        }
        
        else
        {
            JOptionPane.showMessageDialog(this, "You must enter a valid car price!", "Alert", JOptionPane.WARNING_MESSAGE);
            jTextField1.requestFocus();
            jTextField1.setText("$");
            return;
        }
        
         if (Helper.isValidNumber(loanTermYearsString))
        {
            loanTermMonths = (Double.parseDouble(loanTermYearsString)) * 12;
        }
        
        else
        {
            JOptionPane.showMessageDialog(this, "You must enter a valid loan term!", "Alert", JOptionPane.WARNING_MESSAGE);
            jTextField2.requestFocus();
            jTextField2.setText("");
            return;
        }
        
         if (Helper.isValidNumber(interestRateString))
        {
            interestRate = Double.parseDouble(interestRateString);
            if (interestRate > 100)
            {
                JOptionPane.showMessageDialog(this, "Your interest rate can not be greater than 100%!", "Alert", JOptionPane.WARNING_MESSAGE);
                jTextField3.requestFocus();
                jTextField3.setText("");
                return;
            }
        }
        
        else
        {
            JOptionPane.showMessageDialog(this, "You must enter a valid interest rate!", "Alert", JOptionPane.WARNING_MESSAGE);
            jTextField3.requestFocus();
            jTextField3.setText("");
            return;
        }
         
        if (Helper.isValidNumber(downPaymentString))
        {
            downPayment = Double.parseDouble(downPaymentString);
        }
        
        else
        {
            JOptionPane.showMessageDialog(this, "You must enter a valid down payment!", "Alert", JOptionPane.WARNING_MESSAGE);
            jTextField4.requestFocus();
            jTextField4.setText("$");
            return;
        }

        if (Helper.isValidNumber(tradeInValueString))
        {
            tradeInValue = Double.parseDouble(tradeInValueString);
        }
        
        else
        {
            JOptionPane.showMessageDialog(this, "You must enter a valid trade in! If you do not have one, enter 0.", "Alert", JOptionPane.WARNING_MESSAGE);
            jTextField5.requestFocus();
            jTextField5.setText("$");
            return;
        }
        
        if (downPayment > carPrice)
        {
            JOptionPane.showMessageDialog(this, "Your down payment can not be greater than the car price!", "Alert", JOptionPane.WARNING_MESSAGE);
            jTextField4.requestFocus();
            jTextField4.setText("$");
            return;
        }
        
        double principal = carPrice - downPayment - tradeInValue;
        double interestBy100 = interestRate / 100;
        double interestMonthly = interestBy100 / 12;
        double answer = Helper.computeAutoLoan(principal, interestMonthly, loanTermMonths);
        String formattedAnswer = Helper.formatDouble(answer);
        
        jLabel6.setText("You would owe $" + formattedAnswer + " a month.");
        jLabel6.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(Calc3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
