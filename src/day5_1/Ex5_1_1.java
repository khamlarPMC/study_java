/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class Ex5_1_1 extends javax.swing.JFrame {

    /**
     * Creates new form Ex5_1_1
     */
    public Ex5_1_1() {
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

        jButton1 = new javax.swing.JButton();
        operate = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtnum1 = new javax.swing.JTextField();
        rdplus = new javax.swing.JRadioButton();
        rdMinus = new javax.swing.JRadioButton();
        rdMulty = new javax.swing.JRadioButton();
        rdDivide = new javax.swing.JRadioButton();
        txtnum2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCal = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Saysettha Web", 0, 18)); // NOI18N
        jLabel1.setText("ປ້ອມຈຳນວນທີ່1");

        operate.add(rdplus);
        rdplus.setFont(new java.awt.Font("Saysettha Web", 0, 18)); // NOI18N
        rdplus.setText("ບວກ");

        operate.add(rdMinus);
        rdMinus.setFont(new java.awt.Font("Saysettha Web", 0, 18)); // NOI18N
        rdMinus.setText("ລົບ");

        operate.add(rdMulty);
        rdMulty.setFont(new java.awt.Font("Saysettha Web", 0, 18)); // NOI18N
        rdMulty.setText("ຄູນ");

        operate.add(rdDivide);
        rdDivide.setFont(new java.awt.Font("Saysettha Web", 0, 18)); // NOI18N
        rdDivide.setText("ຫານ");

        jLabel2.setFont(new java.awt.Font("Saysettha Web", 0, 18)); // NOI18N
        jLabel2.setText("ປ້ອມຈຳນວນທີ່2");

        btnCal.setBackground(new java.awt.Color(0, 255, 153));
        btnCal.setFont(new java.awt.Font("Saysettha Web", 0, 18)); // NOI18N
        btnCal.setText("ຄຳນວນ");
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(255, 51, 51));
        btnClear.setFont(new java.awt.Font("Saysettha Web", 0, 18)); // NOI18N
        btnClear.setText("ຍົກເລີກ");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Saysettha Web", 0, 18)); // NOI18N
        jLabel3.setText("ຜົນໄດ້ຮັບ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(rdplus)
                            .addGap(49, 49, 49)
                            .addComponent(rdMinus)
                            .addGap(38, 38, 38)
                            .addComponent(rdMulty)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdDivide))
                        .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel2))
                            .addComponent(txtnum2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCal, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtResult))))
                .addGap(0, 133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnum1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdplus)
                    .addComponent(rdMinus)
                    .addComponent(rdMulty)
                    .addComponent(rdDivide))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCal)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed

        if (txtnum1.getText().equals("") || txtnum2.getText().equals("") || operate.getSelection() == null) {
            JOptionPane.showMessageDialog(rootPane, "Please enter all field");
            return;
        }
        rdplus.setActionCommand("+");
        rdMinus.setActionCommand("-");
        rdMulty.setActionCommand("*");
        rdDivide.setActionCommand("/");

        String symbol;
        float num1, num2, result;

        num1 = Float.parseFloat(txtnum1.getText());
        num2 = Float.parseFloat(txtnum2.getText());
        symbol = operate.getSelection().getActionCommand();

        switch (symbol) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;

            default:
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(rootPane, "can't not divide by zero!");
                    txtResult.setText("");
                    txtnum2.requestFocus();
                    return;

                } else {
                    result = num1 / num2;

                }
                break;

        }
        txtResult.setText(Float.toString(result));

    }//GEN-LAST:event_btnCalActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        int data;
        data = JOptionPane.showConfirmDialog(rootPane, "Would  you like to clear form ?", "Comfirm", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);

        if (data != 0) {
            return;
        }
        txtnum1.setText("");
        txtnum2.setText("");
        txtResult.setText("");
        operate.clearSelection();
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(Ex5_1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ex5_1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ex5_1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ex5_1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ex5_1_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.ButtonGroup operate;
    private javax.swing.JRadioButton rdDivide;
    private javax.swing.JRadioButton rdMinus;
    private javax.swing.JRadioButton rdMulty;
    private javax.swing.JRadioButton rdplus;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtnum1;
    private javax.swing.JTextField txtnum2;
    // End of variables declaration//GEN-END:variables
}