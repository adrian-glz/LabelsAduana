package Frames;

import javax.swing.ImageIcon;

/**
 *
 * @author AGONZALEZ
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        
        initComponents();
         setIconImage(new ImageIcon(getClass().getResource("/recursos/logochico.png")).getImage());
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Generar = new javax.swing.JToggleButton();
        Imprimir = new javax.swing.JToggleButton();
        Generico = new javax.swing.JToggleButton();
        btnvercodigos = new javax.swing.JToggleButton();
        btnsalir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bienvenido - Sounds");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 84, 360, 300));

        jLabel2.setFont(new java.awt.Font("Britannic Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Sistema de Labels  para Importacion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 410, 40));

        jLabel3.setText("2019-2021 Version 1.1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 454, 140, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/label.png"))); // NOI18N
        Generar.setText("Generar Label");
        Generar.setPreferredSize(new java.awt.Dimension(137, 41));
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });
        jPanel1.add(Generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 62));

        Imprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Print_icon-icons.com_73705 (1).png"))); // NOI18N
        Imprimir.setText("Imprimir Label");
        Imprimir.setPreferredSize(new java.awt.Dimension(137, 41));
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(Imprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 190, 62));

        Generico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/label.png"))); // NOI18N
        Generico.setText(" Label Generico");
        Generico.setPreferredSize(new java.awt.Dimension(137, 41));
        Generico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenericoActionPerformed(evt);
            }
        });
        jPanel1.add(Generico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 62));

        btnvercodigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/ver2.png"))); // NOI18N
        btnvercodigos.setText("Ver Codigos");
        btnvercodigos.setPreferredSize(new java.awt.Dimension(137, 41));
        btnvercodigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvercodigosActionPerformed(evt);
            }
        });
        jPanel1.add(btnvercodigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 190, 62));

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setPreferredSize(new java.awt.Dimension(137, 41));
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, 62));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 210, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        Modificar m = new Modificar();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GenerarActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        ImprimirLabel m = new ImprimirLabel();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ImprimirActionPerformed

    private void GenericoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenericoActionPerformed
        Generico m = new Generico();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GenericoActionPerformed

    private void btnvercodigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvercodigosActionPerformed
      Editacodigos e= new Editacodigos();
      e.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_btnvercodigosActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Generar;
    private javax.swing.JToggleButton Generico;
    private javax.swing.JToggleButton Imprimir;
    private javax.swing.JToggleButton btnsalir;
    private javax.swing.JToggleButton btnvercodigos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
