import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author npcnp
 */
public class parentInterface extends javax.swing.JFrame {

    /**
     * Creates new form parentInterface
     */
    public parentInterface() {
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

        calculator1 = new javax.swing.JButton();
        calculator2 = new javax.swing.JButton();
        calculator3 = new javax.swing.JButton();
        rentVsBuyCalculator = new javax.swing.JButton();
        calculator5 = new javax.swing.JButton();
        calculator6 = new javax.swing.JButton();
        calculator7 = new javax.swing.JButton();
        calculator8 = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

<<<<<<< HEAD
        calculator1.setText("Down Payment Calculator");
=======
        calculator1.setText("Currency Calculator ");
>>>>>>> e01acf814d063c6097ef153d917206b167ae2a9b
        calculator1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculator1MouseClicked(evt);
            }
        });

        calculator2.setText("Interest Calculator");
        calculator2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculator2MouseClicked(evt);
            }
        });

        calculator3.setText("Auto Loan Calculator");
        calculator3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculator3MouseClicked(evt);
            }
        });

        rentVsBuyCalculator.setText("Rent vs Buy Calculator");
        rentVsBuyCalculator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentVsBuyCalculatorMouseClicked(evt);
            }
        });

        calculator5.setText("Mortgage Calculator");
        calculator5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculator5MouseClicked(evt);
            }
        });

        calculator6.setText("Refinance Calculator");
        calculator6.setToolTipText("");
        calculator6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculator6MouseClicked(evt);
            }
        });

        calculator7.setText("Roth IRA Calculator");
        calculator7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculator7MouseClicked(evt);
            }
        });

        calculator8.setText("Down Payment Calculator");
        calculator8.setToolTipText("");
        calculator8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculator8MouseClicked(evt);
            }
        });

        quitButton.setText("Quit");
        quitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(73, Short.MAX_VALUE)
=======
                .addContainerGap(115, Short.MAX_VALUE)
>>>>>>> e01acf814d063c6097ef153d917206b167ae2a9b
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calculator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
<<<<<<< HEAD
                            .addComponent(calculator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                            .addComponent(rentVsBuyCalculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
>>>>>>> e01acf814d063c6097ef153d917206b167ae2a9b
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calculator5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculator6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculator7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(calculator8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(quitButton)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(quitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculator1)
                    .addComponent(calculator5))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculator2)
                    .addComponent(calculator6))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculator3)
                    .addComponent(calculator7))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentVsBuyCalculator)
                    .addComponent(calculator8))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitButtonMouseClicked
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_quitButtonMouseClicked

    private void calculator1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculator1MouseClicked
        // TODO add your handling code here:
        new Calc1().setVisible(true);

    }//GEN-LAST:event_calculator1MouseClicked

    private void calculator2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculator2MouseClicked
        // TODO add your handling code here:
        new Calc2().setVisible(true);
    }//GEN-LAST:event_calculator2MouseClicked

    private void calculator3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculator3MouseClicked
        // TODO add your handling code here:
        new Calc3().setVisible(true);
    }//GEN-LAST:event_calculator3MouseClicked

    private void rentVsBuyCalculatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentVsBuyCalculatorMouseClicked
        // TODO add your handling code here:
        new Calc4().setVisible(true);
    }//GEN-LAST:event_rentVsBuyCalculatorMouseClicked

    private void calculator5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculator5MouseClicked
        new Calc5().setVisible(true);
    }//GEN-LAST:event_calculator5MouseClicked

    private void calculator6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculator6MouseClicked
        new Calc6().setVisible(true);
    }//GEN-LAST:event_calculator6MouseClicked

    private void calculator7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculator7MouseClicked
        new Calc7().setVisible(true);
    }//GEN-LAST:event_calculator7MouseClicked

    private void calculator8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculator8MouseClicked
        new Calc8().setVisible(true);
    }//GEN-LAST:event_calculator8MouseClicked

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
            java.util.logging.Logger.getLogger(parentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parentInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parentInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculator1;
    private javax.swing.JButton calculator2;
    private javax.swing.JButton calculator3;
    private javax.swing.JButton calculator5;
    private javax.swing.JButton calculator6;
    private javax.swing.JButton calculator7;
    private javax.swing.JButton calculator8;
    private javax.swing.JButton quitButton;
    private javax.swing.JButton rentVsBuyCalculator;
    // End of variables declaration//GEN-END:variables
}
