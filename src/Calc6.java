/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author npcnp
 */
public class Calc6 extends javax.swing.JFrame {

    /**
     * Creates new form Calc6
     */
    public Calc6() {
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

        closeButton = new javax.swing.JButton();
        txtRemainingBalance = new javax.swing.JTextField();
        txtMonthlyPayment = new javax.swing.JTextField();
        txtInterestRate = new javax.swing.JTextField();
        txtNewLoanTerm = new javax.swing.JTextField();
        txtNewInterestRate = new javax.swing.JTextField();
        txtPoints = new javax.swing.JTextField();
        txtCostFees = new javax.swing.JTextField();
        txtCashOutAmount = new javax.swing.JTextField();
        lblCurrentLoan = new javax.swing.JLabel();
        lblNewLoan = new javax.swing.JLabel();
        lblRemainingBalance = new javax.swing.JLabel();
        lblMonthlyPayment = new javax.swing.JLabel();
        lblCurrentInterestRate = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        lblNewLoanTerm = new javax.swing.JLabel();
        lblNewInterestRate = new javax.swing.JLabel();
        lblPoints = new javax.swing.JLabel();
        lblCostsFees = new javax.swing.JLabel();
        lblCashOut = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblYear = new javax.swing.JLabel();
        lblPercent2 = new javax.swing.JLabel();
        lblPercent1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        closeButton.setText("Close");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        txtRemainingBalance.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtRemainingBalance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRemainingBalanceKeyTyped(evt);
            }
        });

        txtMonthlyPayment.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtMonthlyPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMonthlyPaymentKeyTyped(evt);
            }
        });

        txtInterestRate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtInterestRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInterestRateKeyTyped(evt);
            }
        });

        txtNewLoanTerm.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNewLoanTerm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNewLoanTermKeyTyped(evt);
            }
        });

        txtNewInterestRate.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtNewInterestRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNewInterestRateKeyTyped(evt);
            }
        });

        txtPoints.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtPoints.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPointsKeyTyped(evt);
            }
        });

        txtCostFees.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCostFees.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostFeesKeyTyped(evt);
            }
        });

        txtCashOutAmount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtCashOutAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCashOutAmountKeyTyped(evt);
            }
        });

        lblCurrentLoan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCurrentLoan.setText("Current Loan");
        lblCurrentLoan.setToolTipText("");

        lblNewLoan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNewLoan.setText("New Loan");

        lblRemainingBalance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRemainingBalance.setText("Remaining Balance:");

        lblMonthlyPayment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMonthlyPayment.setText("Monthly payment:");

        lblCurrentInterestRate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCurrentInterestRate.setText("Interest Rate:");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "I know my remaining balance", "I know the original loan amount" }));

        lblNewLoanTerm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNewLoanTerm.setText("New Loan Term:");

        lblNewInterestRate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNewInterestRate.setText("Interest Rate:");

        lblPoints.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPoints.setText("Points:");

        lblCostsFees.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCostsFees.setText("Costs and Fees:");

        lblCashOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCashOut.setText("Cash Out Amount:");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        btnCalculate.setText("Calculate");
        btnCalculate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalculateMouseClicked(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        lblYear.setText("Year(s)");

        lblPercent2.setText("%");

        lblPercent1.setText("%");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lblMonthlyPayment, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblRemainingBalance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblCurrentInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblPercent1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtRemainingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMonthlyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(lblCurrentLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblNewLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(closeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblNewInterestRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCostsFees, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCashOut, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(lblNewLoanTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNewLoanTerm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNewInterestRate)
                                    .addComponent(txtPoints)
                                    .addComponent(txtCostFees)
                                    .addComponent(txtCashOutAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPercent2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(closeButton)
                        .addGap(15, 15, 15)
                        .addComponent(lblNewLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNewLoanTerm)
                            .addComponent(txtNewLoanTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNewInterestRate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(txtNewInterestRate)
                            .addComponent(lblPercent2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCostsFees, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCostFees, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCashOut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCashOutAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblCurrentLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRemainingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRemainingBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMonthlyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMonthlyPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCurrentInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPercent1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeButtonMouseClicked

    private void txtRemainingBalanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRemainingBalanceKeyTyped
        Helper.consumeNotNumbersAllowDecimal(txtRemainingBalance, evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtRemainingBalanceKeyTyped

    private void txtMonthlyPaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMonthlyPaymentKeyTyped
        Helper.consumeNotNumbersAllowDecimal(txtMonthlyPayment, evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtMonthlyPaymentKeyTyped

    private void txtInterestRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInterestRateKeyTyped
        Helper.consumeNotNumbersAllowDecimal(txtInterestRate, evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtInterestRateKeyTyped

    private void txtNewLoanTermKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewLoanTermKeyTyped
        Helper.consumeNotNumbersAllowDecimal(txtNewLoanTerm, evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewLoanTermKeyTyped

    private void txtNewInterestRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNewInterestRateKeyTyped
        Helper.consumeNotNumbersAllowDecimal(txtNewInterestRate, evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewInterestRateKeyTyped

    private void txtPointsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPointsKeyTyped
        Helper.consumeNotNumbersAllowDecimal(txtPoints, evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtPointsKeyTyped

    private void txtCostFeesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostFeesKeyTyped
        Helper.consumeNotNumbersAllowDecimal(txtCostFees, evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostFeesKeyTyped

    private void txtCashOutAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCashOutAmountKeyTyped
        Helper.consumeNotNumbersAllowDecimalAndNeg(txtCashOutAmount, evt);        // TODO add your handling code here:
    }//GEN-LAST:event_txtCashOutAmountKeyTyped

    private void btnCalculateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalculateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalculateMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
                // TODO add your handling code here:
    }//GEN-LAST:event_btnClearMouseClicked

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
            java.util.logging.Logger.getLogger(Calc6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCashOut;
    private javax.swing.JLabel lblCostsFees;
    private javax.swing.JLabel lblCurrentInterestRate;
    private javax.swing.JLabel lblCurrentLoan;
    private javax.swing.JLabel lblMonthlyPayment;
    private javax.swing.JLabel lblNewInterestRate;
    private javax.swing.JLabel lblNewLoan;
    private javax.swing.JLabel lblNewLoanTerm;
    private javax.swing.JLabel lblPercent1;
    private javax.swing.JLabel lblPercent2;
    private javax.swing.JLabel lblPoints;
    private javax.swing.JLabel lblRemainingBalance;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtCashOutAmount;
    private javax.swing.JTextField txtCostFees;
    private javax.swing.JTextField txtInterestRate;
    private javax.swing.JTextField txtMonthlyPayment;
    private javax.swing.JTextField txtNewInterestRate;
    private javax.swing.JTextField txtNewLoanTerm;
    private javax.swing.JTextField txtPoints;
    private javax.swing.JTextField txtRemainingBalance;
    // End of variables declaration//GEN-END:variables
}
