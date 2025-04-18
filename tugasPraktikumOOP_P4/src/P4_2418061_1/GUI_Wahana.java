/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package P4_2418061_1;

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
        txtHT.setText("Pilih Wahana & Jumlah Tiket");
        txtJP.setText("Klik Refresh Info");
        
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
        txtHT = new javax.swing.JTextField();
        btnINFO = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtJP = new javax.swing.JTextField();
        cmb_jt = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        memoWahana = new javax.swing.JTextArea();
        btnCETAK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INHERITANCE dan ENKAPSULASI WAHANA");

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

        jLabel6.setText("Jumlah Pembayaran");

        cmb_jt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        memoWahana.setColumns(20);
        memoWahana.setRows(5);
        jScrollPane1.setViewportView(memoWahana);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_pilih, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmb_jt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnINFO)
                                    .addComponent(txtJP))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(254, 254, 254))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCETAK)
                                .addGap(115, 115, 115))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cmb_pilih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmb_jt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(btnINFO)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(btnCETAK)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnINFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINFOActionPerformed
        // TODO add your handling code here:
        
        //harga tiket
        if(cmb_pilih.getSelectedIndex() == 0){
            rollerCoaster rc = new rollerCoaster(); 
            txtHT.setEnabled(false);
            txtHT.setText(Integer.toString(rc.harga));
            // jumlah tiket
            if(cmb_jt.getSelectedIndex() == 0){
                txtJP.setText(Integer.toString(rc.harga*1));
            }
            else if(cmb_jt.getSelectedIndex() == 1){
                txtJP.setText(Integer.toString(rc.harga*2));
            }
            else if(cmb_jt.getSelectedIndex() == 2){
                txtJP.setText(Integer.toString(rc.harga*3));
            }
            else if(cmb_jt.getSelectedIndex() == 3){
                txtJP.setText(Integer.toString(rc.harga*4));
            }
            else if(cmb_jt.getSelectedIndex() == 4){
                txtJP.setText(Integer.toString(rc.harga*5));
            }
        }
        else if(cmb_pilih.getSelectedIndex() == 1){
            waterSlide ws = new waterSlide();
            txtHT.setEnabled(false);
            txtHT.setText(Integer.toString(ws.harga));
            // jumlah tiket
            if(cmb_jt.getSelectedIndex() == 0){
                txtJP.setText(Integer.toString(ws.harga*1));
            }
            else if(cmb_jt.getSelectedIndex() == 1){
                txtJP.setText(Integer.toString(ws.harga*2));
            }
            else if(cmb_jt.getSelectedIndex() == 2){
                txtJP.setText(Integer.toString(ws.harga*3));
            }
            else if(cmb_jt.getSelectedIndex() == 3){
                txtJP.setText(Integer.toString(ws.harga*4));
            }
            else if(cmb_jt.getSelectedIndex() == 4){
                txtJP.setText(Integer.toString(ws.harga*5));
            }
        }
        
        
    }//GEN-LAST:event_btnINFOActionPerformed

    private void btnCETAKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCETAKActionPerformed
        // TODO add your handling code here:
        if(cmb_pilih.getSelectedIndex() == 0){
            rollerCoaster rc = new rollerCoaster();
            rc.setKaryawan(5);
            memoWahana.append("\nInheritence dan Enkapsulasi Wahana\n");
            memoWahana.append("-----------------------------------------\n");
            memoWahana.append("Pilihan Wahana: " + rc.nama+"\n");
            memoWahana.append("Harga Tiket: " + rc.harga +"\n");
            memoWahana.append("Karyawan yang ditugaskan: " + rc.getKaryawan() +"\n");
            if(cmb_jt.getSelectedIndex() == 0){
                memoWahana.append("Jumlah Tiket: " + 1 +"\n");
                memoWahana.append("Jumlah Pemabayaran: " + Integer.toString(rc.harga*1) +"\n");
            }
            else if(cmb_jt.getSelectedIndex() == 1){
                memoWahana.append("Jumlah Tiket: " + 2 +"\n");
                memoWahana.append("Jumlah Pemabayaran: " + Integer.toString(rc.harga*2) +"\n");
            }
            else if(cmb_jt.getSelectedIndex() == 2){
                memoWahana.append("Jumlah Tiket: " + 3 +"\n");
                memoWahana.append("Jumlah Pemabayaran: " + Integer.toString(rc.harga*3) +"\n");
            }
            else if(cmb_jt.getSelectedIndex() == 3){
                memoWahana.append("Jumlah Tiket: " + 4 +"\n");
                memoWahana.append("Jumlah Pemabayaran: " + Integer.toString(rc.harga*4) +"\n");
            }
            else if(cmb_jt.getSelectedIndex() == 4){
                memoWahana.append("Jumlah Tiket: " + 5 +"\n");
                memoWahana.append("Jumlah Pemabayaran: " + Integer.toString(rc.harga*5) +"\n");
            }
            
        }
        else if(cmb_pilih.getSelectedIndex() == 1){
            waterSlide ws = new waterSlide();
            ws.setKaryawan(8);
            memoWahana.append("\nInheritence dan Enkapsulasi Wahana\n");
            memoWahana.append("-----------------------------------------\n");
            memoWahana.append("Pilihan Wahana: " + ws.nama+"\n");
            memoWahana.append("Harga Tiket: " + ws.harga +"\n");
            memoWahana.append("Karyawan yang ditugaskan: " + ws.getKaryawan() +"\n");
            if(cmb_jt.getSelectedIndex() == 0){
                memoWahana.append("Jumlah Tiket: " + 1 +"\n");
                memoWahana.append("Jumlah Pemabayaran: " + Integer.toString(ws.harga*1) +"\n");
            }
            else if(cmb_jt.getSelectedIndex() == 1){
                memoWahana.append("Jumlah Tiket: " + 2 +"\n");
                memoWahana.append("Jumlah Pemabayaran: " + Integer.toString(ws.harga*2) +"\n");
            }
            else if(cmb_jt.getSelectedIndex() == 2){
                memoWahana.append("Jumlah Tiket: " + 3 +"\n");
                memoWahana.append("Jumlah Pemabayaran: " + Integer.toString(ws.harga*3) +"\n");
            }
            else if(cmb_jt.getSelectedIndex() == 3){
                memoWahana.append("Jumlah Tiket: " + 4 +"\n");
                memoWahana.append("Jumlah Pemabayaran: " + Integer.toString(ws.harga*4) +"\n");
            }
            else if(cmb_jt.getSelectedIndex() == 4){
                memoWahana.append("Jumlah Tiket: " + 5 +"\n");
                memoWahana.append("Jumlah Pemabayaran: " + Integer.toString(ws.harga*5) +"\n");
            }
        }
        
    }//GEN-LAST:event_btnCETAKActionPerformed

    private void cmb_pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_pilihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_pilihActionPerformed

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
            public void run() {
                new GUI_Wahana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCETAK;
    private javax.swing.JButton btnINFO;
    private javax.swing.JComboBox<String> cmb_jt;
    private javax.swing.JComboBox<String> cmb_pilih;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea memoWahana;
    private javax.swing.JTextField txtHT;
    private javax.swing.JTextField txtJP;
    // End of variables declaration//GEN-END:variables
}
