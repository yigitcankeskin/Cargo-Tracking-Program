
package ileripcprogproje;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class application extends javax.swing.JFrame {
      
      private long kno;
      private long TC;
      private String ktt;
      private String kadres;
      private AssesmentApp Aapp = new AssesmentApp();
      private DefaultTableModel model ;
     
      public application() {
        initComponents();
        //başlangıç değerlerinin atanması
           kno=0;
           TC=0;
           ktt= new String();
           kadres= new String();
           model = (DefaultTableModel) table.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        kno_txt = new javax.swing.JTextField();
        tc_txt = new javax.swing.JTextField();
        ktt_txt = new javax.swing.JTextField();
        kadres_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        kayıt_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        kgor_txt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        gor_btn = new javax.swing.JButton();
        list_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("KARGO GİRİŞİ");

        kno_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kno_txtActionPerformed(evt);
            }
        });

        tc_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tc_txtActionPerformed(evt);
            }
        });

        ktt_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ktt_txtActionPerformed(evt);
            }
        });

        kadres_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kadres_txtActionPerformed(evt);
            }
        });

        jLabel2.setText("kargo takip no:");

        jLabel3.setText("Kargo sahibi TC:");

        jLabel4.setText("kargo teslim tarihi");

        jLabel5.setText("Adres:");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kargo no", "Tc no", "Teslim Tarihi", "Adres"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(20);
            table.getColumnModel().getColumn(1).setPreferredWidth(25);
            table.getColumnModel().getColumn(2).setPreferredWidth(40);
            table.getColumnModel().getColumn(3).setPreferredWidth(250);
        }

        jLabel6.setText("Tüm Kargoları Listele");

        kayıt_btn.setText("Kaydet");
        kayıt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayıt_btnActionPerformed(evt);
            }
        });

        jLabel7.setText("Kargo görüntüle");

        kgor_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kgor_txtActionPerformed(evt);
            }
        });

        jLabel8.setText("Kargo takip no:");

        gor_btn.setText("Görüntüle");
        gor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gor_btnActionPerformed(evt);
            }
        });

        list_btn.setText("Listele");
        list_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(148, 148, 148)
                .addComponent(list_btn)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(kgor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(gor_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kadres_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(30, 30, 30)
                                    .addComponent(kno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(ktt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(kayıt_btn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kgor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gor_btn))
                .addGap(166, 166, 166)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ktt_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(kadres_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(kayıt_btn)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(list_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tc_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tc_txtActionPerformed

    }//GEN-LAST:event_tc_txtActionPerformed

    private void kadres_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kadres_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kadres_txtActionPerformed

    private void ktt_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ktt_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ktt_txtActionPerformed

    private void kno_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kno_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kno_txtActionPerformed

    private void kayıt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayıt_btnActionPerformed
       kno = Long.parseLong(kno_txt.getText());
        TC = Long.parseLong(tc_txt.getText());
        ktt= ktt_txt.getText();
        kadres=kadres_txt.getText();
        ktt=ktt.replace(" ","*");
        kadres=kadres.replace(" ","*");
        Aapp.dosyayaYaz(kno,TC,ktt,kadres);
        kno_txt.setText("");
        tc_txt.setText("");
        ktt_txt.setText("");
        kadres_txt.setText("");
        JOptionPane.showMessageDialog(null,"Kargo Sisteme kaydedildi");
        
    }//GEN-LAST:event_kayıt_btnActionPerformed

    private void kgor_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kgor_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kgor_txtActionPerformed

    private void gor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gor_btnActionPerformed
     
     int flag;
     kno = Long.parseLong(kgor_txt.getText());
     flag=Aapp.goruntule(kno);
      if(flag==1)
      {
         Aapp.setKtt(Aapp.getKtt().replace("*", " "));
         Aapp.setKadres(Aapp.getKadres().replace("*", " "));
        JOptionPane.showMessageDialog(null,"Kargo no : "+Aapp.getKno()+"\n"+"Tc no : "+Aapp.getTC()+"\n"+"Kargo Teslim Tarihi : "+Aapp.getKtt()+"\n"+"Adres : "+Aapp.getKadres()+"\n");   
      }
      else
      {
       JOptionPane.showMessageDialog(null,"\nMalesef Girdiğiniz kargo numarasına ait bir kargo bulunmamaktadır.\n");         
      }
      kgor_txt.setText("");
    }//GEN-LAST:event_gor_btnActionPerformed

    private void list_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_btnActionPerformed
     model.setRowCount(0);
     boolean empty = false;
     int flag=0;
        while(empty==false){
         empty=Aapp.Lıstele(flag);
         Aapp.setKtt(Aapp.getKtt().replace("*", " "));
         Aapp.setKadres(Aapp.getKadres().replace("*", " "));
         model.insertRow(model.getRowCount(), new Object[]{Aapp.getKno(),Aapp.getTC(),Aapp.getKtt(),Aapp.getKadres()});
         
         flag++;
        }
        model.removeRow(flag-1);
    }//GEN-LAST:event_list_btnActionPerformed

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
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {    
            public void run() {
                
                new application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton gor_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kadres_txt;
    private javax.swing.JButton kayıt_btn;
    private javax.swing.JTextField kgor_txt;
    private javax.swing.JTextField kno_txt;
    private javax.swing.JTextField ktt_txt;
    private javax.swing.JButton list_btn;
    private javax.swing.JTable table;
    private javax.swing.JTextField tc_txt;
    // End of variables declaration//GEN-END:variables
}
