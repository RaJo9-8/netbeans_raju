/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gudang1;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class databarangmsk extends javax.swing.JFrame {
private DefaultTableModel model=null;
private PreparedStatement stat;
private ResultSet rs;
koneksi k = new koneksi();
    /**
     * Creates new form databarangmsk
     */
    public databarangmsk() {
        initComponents();
        k.connect ();
        refreshTable();
    }
class brgmsk extends databarangmsk{
        int id_bm,id_barang,jumlah;
        String tanggal_masuk;
        
        public brgmsk(){
            this.id_barang=Integer.parseInt(idbrg.getText());
            this.jumlah=Integer.parseInt(jumlhbm.getText());
            try{
            Date date =tglmsk.getDate();
          DateFormat dateformat= new SimpleDateFormat("YYYY-MM-DD");
          this.tanggal_masuk=dateformat.format(date);
            }catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        }
        }
}
            public void refreshTable() { 
model=new DefaultTableModel(); 
model.addColumn("Id_bm"); 
model.addColumn("Id_barang"); 
model.addColumn("Tanggal_masuk"); 
model.addColumn("Jumlah");
tblbm.setModel(model); 
try {
this.stat=k.getCon().prepareStatement("select * from barang_masuk"); 
this.rs=this.stat.executeQuery();
while(rs.next()) { 
Object[] data={ rs.getInt("id_bm"), 
rs.getInt("id_barang"),
rs.getString("tanggal_masuk"),
rs.getInt("jumlah"), 
}; 
model.addRow (data);
}
}catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        } 

idbrg.setText(""); 
jumlhbm.setText("");

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
        idbm = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbm = new javax.swing.JTable();
        logoutbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idbrg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inptbtn = new javax.swing.JButton();
        ubhbtn = new javax.swing.JButton();
        hpsbtn = new javax.swing.JButton();
        jumlhbm = new javax.swing.JTextField();
        tglmsk = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Barang Masuk");

        jLabel2.setText("Id_bm ");

        idbm.setEnabled(false);

        tblbm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblbm);

        logoutbtn.setText("Log out");
        logoutbtn.setEnabled(false);
        logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbtnActionPerformed(evt);
            }
        });

        jLabel3.setText("id_barang");

        jLabel4.setText("tanggal masuk");

        jLabel5.setText("Jumlah");

        inptbtn.setText("input");
        inptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inptbtnActionPerformed(evt);
            }
        });

        ubhbtn.setText("ubah");
        ubhbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubhbtnActionPerformed(evt);
            }
        });

        hpsbtn.setText("hapus");
        hpsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpsbtnActionPerformed(evt);
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
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(logoutbtn)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idbm, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idbrg, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jumlhbm)
                            .addComponent(tglmsk, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inptbtn)
                        .addGap(65, 65, 65)
                        .addComponent(ubhbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hpsbtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(logoutbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idbm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idbrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tglmsk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jumlhbm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inptbtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ubhbtn)
                        .addComponent(hpsbtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbtnActionPerformed
Login l= new Login();
l.setVisible(true);
this.setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_logoutbtnActionPerformed

    private void inptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inptbtnActionPerformed
try{
         brgmsk m=new brgmsk();
         this.stat=k.getCon().prepareStatement("insert into barang_masuk values (?,?,?,?)");
         stat.setInt(1,0);
         stat.setInt(2,m.id_barang);
         stat.setString(3,m.tanggal_masuk);
         stat.setInt(4,m.jumlah);
         stat.executeUpdate();
        }catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_inptbtnActionPerformed

    private void ubhbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubhbtnActionPerformed
 try{
         brgmsk m=new brgmsk();
         this.stat=k.getCon().prepareStatement("update barang_masuk set id_barang=?,"+"tanggal_masuk=?"+"jumlah=?");
         stat.setInt(1,m.id_barang);
         stat.setString(2,m.tanggal_masuk);
         stat.setInt(3,m.jumlah);
         stat.executeUpdate();
        }catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_ubhbtnActionPerformed

    private void hpsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpsbtnActionPerformed
 try{
         brgmsk m=new brgmsk();
         this.stat=k.getCon().prepareStatement("DELETE FROM barang_masuk WHERE id_bm=?");
         stat.setInt(1,Integer.parseInt(idbm.getText()));
         stat.executeUpdate();
        }catch (Exception e) { 
        JOptionPane.showMessageDialog(null,e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_hpsbtnActionPerformed

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
            java.util.logging.Logger.getLogger(databarangmsk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(databarangmsk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(databarangmsk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(databarangmsk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new databarangmsk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hpsbtn;
    private javax.swing.JTextField idbm;
    private javax.swing.JTextField idbrg;
    private javax.swing.JButton inptbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlhbm;
    private javax.swing.JButton logoutbtn;
    private javax.swing.JTable tblbm;
    private com.toedter.calendar.JDateChooser tglmsk;
    private javax.swing.JButton ubhbtn;
    // End of variables declaration//GEN-END:variables
}