/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package P3_2418061_2;

/**
 *
 * @author farmaardan
 */
public class GUI_antrianWahana extends javax.swing.JFrame {

    /**
     * Creates new form GUI_antrianWahana
     */
    public GUI_antrianWahana() {
        initComponents();
        wahanaAir wahana = new wahanaAir("Water Slide", 1);
        txtNW.setText(wahana.namaWahana);
        txtAS.setText(Integer.toString(wahana.nomorAntrian));
        wahana.ambilAntrian();
        txtAB.setEnabled(false);
        txtAB.setText(Integer.toString(wahana.nomorAntrian));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNW = new javax.swing.JTextField();
        txtAB = new javax.swing.JTextField();
        txtAS = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        memoANTRIAN = new javax.swing.JTextArea();
        btnREFRESH = new javax.swing.JButton();
        btnCETAK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ANTRIAN WAHANA");

        jLabel2.setText("Nama Wahana");

        jLabel3.setText("Antrian Sekarang");

        jLabel4.setText("Antrian Berikutnya");

        txtNW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNWActionPerformed(evt);
            }
        });

        txtAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtABActionPerformed(evt);
            }
        });

        memoANTRIAN.setColumns(20);
        memoANTRIAN.setRows(5);
        jScrollPane1.setViewportView(memoANTRIAN);

        btnREFRESH.setText("Refresh Antrian");
        btnREFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnREFRESHActionPerformed(evt);
            }
        });

        btnCETAK.setText("CETAK");
        btnCETAK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCETAKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNW, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(txtAS)
                                    .addComponent(txtAB))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnREFRESH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCETAK)
                        .addGap(103, 103, 103))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnREFRESH)
                    .addComponent(btnCETAK))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private wahanaAir wahana = new wahanaAir("Water Slide", 1);
    private void btnREFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnREFRESHActionPerformed
        // TODO add your handling code here:
        
        int antrianSekarang = wahana.ambilAntrian();

        // Set teks pada GUI
        txtNW.setText(wahana.namaWahana);
        txtAS.setText(Integer.toString(antrianSekarang));

        // Menampilkan antrian selanjutnya
        txtAB.setEnabled(false);
        txtAB.setText(Integer.toString(wahana.lanjutAntrian));
    }//GEN-LAST:event_btnREFRESHActionPerformed

    private void btnCETAKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCETAKActionPerformed
        // TODO add your handling code here:
        
        memoANTRIAN.append("Antrian Wahana"+ "\n");
        memoANTRIAN.append("Wahana: " + wahana.namaWahana + "\n");
        memoANTRIAN.append("Nomor Antrian: " + wahana.nomorAntrian + "\n");
        memoANTRIAN.append("Nomor Antrian Berikutnya: " + wahana.lanjutAntrian + "\n");
        memoANTRIAN.append("-----------------------------\n");
    }//GEN-LAST:event_btnCETAKActionPerformed

    private void txtABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtABActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtABActionPerformed

    private void txtNWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNWActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_antrianWahana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_antrianWahana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_antrianWahana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_antrianWahana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_antrianWahana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCETAK;
    private javax.swing.JButton btnREFRESH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea memoANTRIAN;
    private javax.swing.JTextField txtAB;
    private javax.swing.JTextField txtAS;
    private javax.swing.JTextField txtNW;
    // End of variables declaration//GEN-END:variables
}
