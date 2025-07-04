/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package P8_2418061;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author farmaardan
 */
public class GUI_Wahana extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Wahana
     */
    public GUI_Wahana() {
        initComponents();
        txtHarga.setText("Pilih Wahana & Jumlah Tiket");
        txtTotal.setText("Klik Refresh Info");
        
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
        cmb_pilih = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        btnINFO = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        cmb_jt = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtBatal = new javax.swing.JButton();
        txtClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("GUI WAHANA");

        jLabel2.setText("Pilihan Wahana");

        cmb_pilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Roller Coaster", "Water Slide" }));
        cmb_pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_pilihActionPerformed(evt);
            }
        });

        jLabel4.setText("Harga Tiket");

        btnINFO.setText("Refresh Info");
        btnINFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINFOActionPerformed(evt);
            }
        });

        jLabel5.setText("Jumlah Tiket");

        jLabel6.setText("Total");

        cmb_jt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Wahana", "Jumlah Tiket", "Total"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel7.setText("NAMA");

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtBatal.setText("BATAL");
        txtBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatalActionPerformed(evt);
            }
        });

        txtClose.setText("CLOSE");
        txtClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmb_pilih, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmb_jt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 29, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnINFO)))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addGap(44, 44, 44)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBatal)
                        .addGap(50, 50, 50)
                        .addComponent(txtClose)
                        .addGap(56, 56, 56))))
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(cmb_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmb_jt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(btnINFO))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnHapus)
                            .addComponent(txtBatal)
                            .addComponent(txtClose))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnINFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINFOActionPerformed
        // TODO add your handling code here:
        //harga tiket
        if(cmb_pilih.getSelectedIndex() == 0){
            rollerCoaster rc = new rollerCoaster(); 
            txtHarga.setEnabled(false);
            txtHarga.setText(Double.toString(rc.hargaWahana(50000)));
            txtTotal.setEnabled(false);
            // jumlah tiket
            switch (cmb_jt.getSelectedIndex()) {
                case 0 -> txtTotal.setText(Integer.toString(rc.hargaWahana(50000)*1));
                case 1 -> txtTotal.setText(Integer.toString(rc.hargaWahana(50000)*2));
                case 2 -> txtTotal.setText(Integer.toString(rc.hargaWahana(50000)*3));
                case 3 -> txtTotal.setText(Integer.toString(rc.hargaWahana(50000)*4));
                case 4 -> txtTotal.setText(Integer.toString(rc.hargaWahana(50000)*5));
                default -> {
                }
            }
        }
        else if(cmb_pilih.getSelectedIndex() == 1){
            waterSlide ws = new waterSlide();
            txtHarga.setEnabled(false);
            txtHarga.setText(Double.toString(ws.hargaWahana(25000)));
            txtTotal.setEnabled(false);
            // jumlah tiket
            switch (cmb_jt.getSelectedIndex()) {
                case 0 -> txtTotal.setText(Integer.toString(ws.hargaWahana(25000)*1));
                case 1 -> txtTotal.setText(Integer.toString(ws.hargaWahana(25000)*2));
                case 2 -> txtTotal.setText(Integer.toString(ws.hargaWahana(25000)*3));
                case 3 -> txtTotal.setText(Integer.toString(ws.hargaWahana(25000)*4));
                case 4 -> txtTotal.setText(Integer.toString(ws.hargaWahana(25000)*5));
                default -> {
                }
            }
        }
        
        
    }//GEN-LAST:event_btnINFOActionPerformed

    private void cmb_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_pilihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_pilihActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        String Harga = null, jt = null, wahana = null;
        if(cmb_pilih.getSelectedIndex() == 0){
            wahana = "Roller Coaster";
            rollerCoaster rc = new rollerCoaster(); 
            txtHarga.setEnabled(false);
            txtHarga.setText(Integer.toString(rc.hargaWahana(50000)));
            // jumlah tiket
            switch (cmb_jt.getSelectedIndex()) {
                case 0 -> {txtTotal.setText(Integer.toString(rc.hargaWahana(50000)*1)); jt = "1"; Harga = Integer.toString(rc.hargaWahana(50000)*1);}
                case 1 -> {txtTotal.setText(Integer.toString(rc.hargaWahana(50000)*2)); jt = "2"; Harga = Integer.toString(rc.hargaWahana(50000)*2);}
                case 2 -> {txtTotal.setText(Integer.toString(rc.hargaWahana(50000)*3)); jt = "3"; Harga = Integer.toString(rc.hargaWahana(50000)*3);}
                case 3 -> {txtTotal.setText(Integer.toString(rc.hargaWahana(50000)*4)); jt = "4"; Harga = Integer.toString(rc.hargaWahana(50000)*4);}
                case 4 -> {txtTotal.setText(Integer.toString(rc.hargaWahana(50000)*5)); jt = "5"; Harga = Integer.toString(rc.hargaWahana(50000)*5);}
                default -> {
                }
            }
        }
        else if(cmb_pilih.getSelectedIndex() == 1){
            wahana = "Water Slide";
            waterSlide ws = new waterSlide();
            txtHarga.setEnabled(false);
            txtHarga.setText(Double.toString(ws.hargaWahana(25000)));
            // jumlah tiket
            switch (cmb_jt.getSelectedIndex()) {
                case 0 -> {txtTotal.setText(Integer.toString(ws.hargaWahana(25000)*1)); jt = "1"; Harga = Integer.toString(ws.hargaWahana(25000)*1);}
                case 1 -> {txtTotal.setText(Integer.toString(ws.hargaWahana(25000)*2)); jt = "2"; Harga = Integer.toString(ws.hargaWahana(25000)*2);}
                case 2 -> {txtTotal.setText(Integer.toString(ws.hargaWahana(25000)*3)); jt = "3"; Harga = Integer.toString(ws.hargaWahana(25000)*3);}
                case 3 -> {txtTotal.setText(Integer.toString(ws.hargaWahana(25000)*4)); jt = "4"; Harga = Integer.toString(ws.hargaWahana(25000)*4);}
                case 4 -> {txtTotal.setText(Integer.toString(ws.hargaWahana(25000)*5)); jt = "5"; Harga = Integer.toString(ws.hargaWahana(25000)*5);}
                default -> {
                }
            }
        
        }
        //peringatan
        if(txtNama.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Tolong Masukkan Data!");
        }
        //masuknya data ke tabel
        else {
           
            
            String data[] =
            {
                txtNama.getText(),
                wahana,
                jt,
                Harga
            };
            DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();
            tblModel.addRow(data);
            
            JOptionPane.showMessageDialog(this, "Data Berhasil Masuk!");
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(this, "Pilih data untuk dihapus!");
        }
        else {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.removeRow(row);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatalActionPerformed
        // TODO add your handling code here:
        txtHarga.setEnabled(true);
        txtTotal.setEnabled(true);
        txtHarga.setText("Pilih Wahana & Jumlah Tiket");
        txtTotal.setText("Klik Refresh Info");
        txtNama.setText("");
        cmb_pilih.setSelectedIndex(0);
        cmb_jt.setSelectedIndex(0);
    }//GEN-LAST:event_txtBatalActionPerformed

    private void txtCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_txtCloseActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Wahana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Wahana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Wahana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Wahana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI_Wahana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnINFO;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cmb_jt;
    private javax.swing.JComboBox<String> cmb_pilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton txtBatal;
    private javax.swing.JButton txtClose;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
