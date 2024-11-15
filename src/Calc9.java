
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author npcnp
 */
public class Calc9 extends javax.swing.JFrame {

    /**
     * Creates new form Calc9
     */
    public Calc9() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        originalLoanTermTextField = new javax.swing.JTextField();
        interestRateTextField = new javax.swing.JTextField();
        remainingTermYearsTextField = new javax.swing.JTextField();
        originalLoanAmount = new javax.swing.JLabel();
        originalLoanTermLabel = new javax.swing.JLabel();
        interestRateLabel = new javax.swing.JLabel();
        remainingTermLabel = new javax.swing.JLabel();
        originalLoanAmountTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        extraPaymentPerMonthTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        remainingTermMonthsTextField = new javax.swing.JTextField();
        outputWithLoanTermLabel = new javax.swing.JLabel();
        calculateLeftSideButton = new javax.swing.JButton();
        leftErrorLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 101, 0));

        originalLoanTermTextField.setText("0");
        originalLoanTermTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                originalLoanTermTextFieldKeyTyped(evt);
            }
        });

        interestRateTextField.setText("0");
        interestRateTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                interestRateTextFieldKeyTyped(evt);
            }
        });

        remainingTermYearsTextField.setText("0");
        remainingTermYearsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                remainingTermYearsTextFieldKeyTyped(evt);
            }
        });

        originalLoanAmount.setText(" Original loan amount");

        originalLoanTermLabel.setText("Original loan term");

        interestRateLabel.setText("Interest rate");

        remainingTermLabel.setText("Remaining term");

        originalLoanAmountTextField.setText("0");
        originalLoanAmountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                originalLoanAmountTextFieldKeyTyped(evt);
            }
        });

        jLabel2.setText("   $");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel3.setText("% Per year");

        jLabel4.setText("Years");

        jLabel5.setText("Years");

        jPanel2.setBackground(new java.awt.Color(96, 0, 21));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jLabel6.setText("Per month");

        jLabel7.setText("Extra payments");

        jLabel8.setText("$");

        extraPaymentPerMonthTextField.setText("0");
        extraPaymentPerMonthTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                extraPaymentPerMonthTextFieldKeyTyped(evt);
            }
        });

        jLabel9.setText("Months");

        remainingTermMonthsTextField.setText("0");
        remainingTermMonthsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                remainingTermMonthsTextFieldKeyTyped(evt);
            }
        });

        outputWithLoanTermLabel.setText("Output label");

        calculateLeftSideButton.setText("Calculate ");
        calculateLeftSideButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateLeftSideButtonMouseClicked(evt);
            }
        });

        leftErrorLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        leftErrorLabel.setText("Error label");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(leftErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputWithLoanTermLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(extraPaymentPerMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(calculateLeftSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(remainingTermLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(interestRateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(originalLoanTermLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(originalLoanAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(remainingTermMonthsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(originalLoanAmountTextField)
                                    .addComponent(originalLoanTermTextField)
                                    .addComponent(interestRateTextField)
                                    .addComponent(remainingTermYearsTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(originalLoanAmount)
                    .addComponent(originalLoanAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(originalLoanTermLabel)
                    .addComponent(originalLoanTermTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interestRateLabel)
                    .addComponent(interestRateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remainingTermLabel)
                    .addComponent(remainingTermYearsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(remainingTermMonthsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(extraPaymentPerMonthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(leftErrorLabel)
                .addGap(18, 18, 18)
                .addComponent(calculateLeftSideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(outputWithLoanTermLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(96, 0, 21));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mortgage Payoff Calculator");

        jPanel3.setBackground(new java.awt.Color(255, 101, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(312, 352));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Close.setText("Close");
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Close)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Close)
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void originalLoanAmountTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_originalLoanAmountTextFieldKeyTyped
        Helper.consumeNotNumbersAllowDecimal(originalLoanAmountTextField, evt);
    }//GEN-LAST:event_originalLoanAmountTextFieldKeyTyped

    private void originalLoanTermTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_originalLoanTermTextFieldKeyTyped
        Helper.consumeNotNumbers(originalLoanTermTextField, evt);
    }//GEN-LAST:event_originalLoanTermTextFieldKeyTyped

    private void interestRateTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_interestRateTextFieldKeyTyped
        Helper.consumeNotNumbersAllowDecimal(interestRateTextField, evt);        
    }//GEN-LAST:event_interestRateTextFieldKeyTyped

    private void remainingTermYearsTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_remainingTermYearsTextFieldKeyTyped
        Helper.consumeNotNumbers(remainingTermYearsTextField, evt);        
    }//GEN-LAST:event_remainingTermYearsTextFieldKeyTyped

    private void remainingTermMonthsTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_remainingTermMonthsTextFieldKeyTyped
        Helper.consumeNotNumbers(remainingTermMonthsTextField, evt);        
    }//GEN-LAST:event_remainingTermMonthsTextFieldKeyTyped

    private void extraPaymentPerMonthTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_extraPaymentPerMonthTextFieldKeyTyped
        Helper.consumeNotNumbersAllowDecimal(extraPaymentPerMonthTextField, evt);        
    }//GEN-LAST:event_extraPaymentPerMonthTextFieldKeyTyped

    private void calculateLeftSideButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateLeftSideButtonMouseClicked
        // This is where the magic happens
        leftErrorLabel.setText("");
        
        try {
            double originalLoanAmountDouble = Double.parseDouble(originalLoanAmountTextField.getText());
            double originalLoanTermDouble = Double.parseDouble(originalLoanTermTextField.getText());
            double interestRateDouble;
            double remainingTermYearsDouble;
            double remainingTermMonthsDouble;
            double extraPaymentPerMonthDouble;
            double amountAlreadyPaid;

            if (extraPaymentPerMonthTextField.getText().equals("")) 
            {
                extraPaymentPerMonthDouble = 0;
            } else {
                extraPaymentPerMonthDouble = Double.parseDouble(extraPaymentPerMonthTextField.getText());
            }                       
                         
                    
            if (remainingTermYearsTextField.getText().equals("")) 
            {
                remainingTermYearsDouble = 0;
            } else {
                remainingTermYearsDouble = Double.parseDouble(remainingTermYearsTextField.getText());
            }        
            
            if (remainingTermMonthsTextField.getText().equals("")) 
            {
                remainingTermMonthsDouble = 0;
            } else {
                remainingTermMonthsDouble = Double.parseDouble(remainingTermMonthsTextField.getText());
            }
            
            if (interestRateTextField.getText().equals("")) 
            {
                interestRateDouble = 0;
            } else {
                interestRateDouble = Double.parseDouble(interestRateTextField.getText());
            }            
            
            
            if (interestRateDouble == 0){
                leftErrorLabel.setText("Your interest rate box is empty and will be seen as a zero");
            }            
                        
            if (originalLoanAmountDouble == 0 || originalLoanTermDouble == 0){
                leftErrorLabel.setText("Make sure the first two boxes are more than zero");
                JOptionPane.showMessageDialog(this, "The first two boxes need a number above zero.");
                return;
            }
            
            if (remainingTermMonthsDouble + remainingTermYearsDouble == 0){ // I am making sure the remaining loan term is not zero
                leftErrorLabel.setText("Make sure the remaining loan term is more than zero");
                JOptionPane.showMessageDialog(this, "The remaing term needs to be above zero.");
                return;
            }
            
            // testing ends and logic starts
            
            interestRateDouble = interestRateDouble / 12 / 100;
            double totalMonths = (remainingTermYearsDouble * 12) + remainingTermMonthsDouble;  
            
            // test this
            double monthlyPayment = originalLoanAmountDouble * (interestRateDouble * 
                    Math.pow(1 + interestRateDouble, totalMonths)) / (Math.pow(1 + interestRateDouble, totalMonths) - 1);
            
            
            double originalRemainingDif = (originalLoanTermDouble * 12) - totalMonths;
            double buildUp = 0;
            
            while (originalRemainingDif > 0){
                buildUp = monthlyPayment * (1 + interestRateDouble) + monthlyPayment; // extra payment might not be correct
                originalRemainingDif = originalRemainingDif - 1;
            }
            

            double totalPayment = monthlyPayment + extraPaymentPerMonthDouble;
            int months = 0;
            double balance = originalLoanAmountDouble - buildUp; // subtract the amount already paid here

            while (balance > 0) {
                balance = balance * (1 + interestRateDouble) - totalPayment;
                months++;

            }
        outputWithLoanTermLabel.setText(String.valueOf(months));
            
        } catch (NumberFormatException e) {
           
            if (originalLoanAmountTextField.getText().equals("") || originalLoanTermTextField.getText().equals("") ||
                    interestRateTextField.getText().equals("")){
                leftErrorLabel.setText("Make sure the first five boxes have the correct number");
                JOptionPane.showMessageDialog(this, "Make sure the first five boxes have the correct number");

            } else {
                leftErrorLabel.setText("Please look over the numbers entered.");
            }
        }
        
    }//GEN-LAST:event_calculateLeftSideButtonMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

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
            java.util.logging.Logger.getLogger(Calc9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc9().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton calculateLeftSideButton;
    private javax.swing.JTextField extraPaymentPerMonthTextField;
    private javax.swing.JLabel interestRateLabel;
    private javax.swing.JTextField interestRateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel leftErrorLabel;
    private javax.swing.JLabel originalLoanAmount;
    private javax.swing.JTextField originalLoanAmountTextField;
    private javax.swing.JLabel originalLoanTermLabel;
    private javax.swing.JTextField originalLoanTermTextField;
    private javax.swing.JLabel outputWithLoanTermLabel;
    private javax.swing.JLabel remainingTermLabel;
    private javax.swing.JTextField remainingTermMonthsTextField;
    private javax.swing.JTextField remainingTermYearsTextField;
    // End of variables declaration//GEN-END:variables
}
