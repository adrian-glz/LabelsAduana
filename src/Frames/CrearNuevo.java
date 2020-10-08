/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author AGONZALEZ
 */
public class CrearNuevo extends javax.swing.JFrame {

    Statement st;
    PreparedStatement ps = null;
    ResultSet rs;
 
    public CrearNuevo() {
        initComponents();
      txt_codigo.requestFocusInWindow(); // btnguardar.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDescripcion3 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        lblcodigo = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblDescripcion1 = new javax.swing.JLabel();
        lblDescripcion2 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        txt_marca = new javax.swing.JTextField();
        txt_hecho = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        cbtension2 = new javax.swing.JComboBox();
        btnhelp = new javax.swing.JButton();
        cbfrecuencia = new javax.swing.JComboBox();
        lblDescripcion4 = new javax.swing.JLabel();
        btnbuscarcodigo = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        lblDescripcion5 = new javax.swing.JLabel();
        txt_codigofisico = new javax.swing.JTextField();
        cbpotencia = new javax.swing.JComboBox();
        txt_potencia = new javax.swing.JTextField();
        cbfrecuencia2 = new javax.swing.JComboBox();
        txt_frecuencia = new javax.swing.JTextField();
        txt_frecuencia2 = new javax.swing.JTextField();
        txt_tension = new javax.swing.JTextField();
        cbtension = new javax.swing.JComboBox();
        txt_tension2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btninformacion3 = new javax.swing.JButton();
        btninformacion1 = new javax.swing.JButton();
        btninformacion2 = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sounds - Generar Nuevo Label");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescripcion3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescripcion3.setText("Tension:");
        jPanel1.add(lblDescripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, 37));

        txt_codigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigoKeyPressed(evt);
            }
        });
        jPanel1.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 290, 37));

        lblcodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcodigo.setText("Codigo Sounds/Original:");
        jPanel1.add(lblcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 160, 37));

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescripcion.setText("Descripcion:");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 90, 37));

        lblMarca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMarca.setText("Marca:");
        jPanel1.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 50, 37));

        lblDescripcion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescripcion1.setText("Hecho en:");
        jPanel1.add(lblDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 70, 37));

        lblDescripcion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescripcion2.setText("Consumo de Potencia:");
        jPanel1.add(lblDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, 37));

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 290, 37));

        txt_marca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_marcaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 290, 37));

        txt_hecho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txt_hecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 290, 37));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Generar nuevo Label ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 220, 40));

        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/save.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setBorderPainted(false);
        btnguardar.setContentAreaFilled(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 320, 40));

        cbtension2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "mA" }));
        jPanel1.add(cbtension2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 60, 35));

        btnhelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/HELP2.png"))); // NOI18N
        btnhelp.setContentAreaFilled(false);
        btnhelp.setFocusPainted(false);
        btnhelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnhelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 50, 50));

        cbfrecuencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hz", "MHz", "KHz", "GHz" }));
        jPanel1.add(cbfrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 47, 37));

        lblDescripcion4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescripcion4.setText("Frecuencia:");
        jPanel1.add(lblDescripcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 70, 37));

        btnbuscarcodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/search.png"))); // NOI18N
        btnbuscarcodigo.setContentAreaFilled(false);
        btnbuscarcodigo.setFocusPainted(false);
        btnbuscarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarcodigoActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscarcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 40, 35));

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/limpiar.png"))); // NOI18N
        btnlimpiar.setContentAreaFilled(false);
        btnlimpiar.setFocusPainted(false);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 37, 35));

        lblDescripcion5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescripcion5.setText("Codigo Fisico(Modelo)");
        jPanel1.add(lblDescripcion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, 37));

        txt_codigofisico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txt_codigofisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 290, 37));

        cbpotencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "W", "kW" }));
        jPanel1.add(cbpotencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 50, 35));

        txt_potencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txt_potencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 238, 37));

        cbfrecuencia2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KHz", "MHz", "Hz" }));
        jPanel1.add(cbfrecuencia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 50, 35));

        txt_frecuencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txt_frecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 87, 37));

        txt_frecuencia2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txt_frecuencia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 98, 37));

        txt_tension.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txt_tension, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 87, 37));

        cbtension.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "V" }));
        jPanel1.add(cbtension, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 47, 37));

        txt_tension2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txt_tension2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 90, 37));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 18, 23));
        jLabel2.setText("*");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 40, 40));

        btninformacion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info.png"))); // NOI18N
        btninformacion3.setContentAreaFilled(false);
        btninformacion3.setFocusPainted(false);
        btninformacion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninformacion3ActionPerformed(evt);
            }
        });
        jPanel1.add(btninformacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 50, 34));

        btninformacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info.png"))); // NOI18N
        btninformacion1.setContentAreaFilled(false);
        btninformacion1.setFocusPainted(false);
        btninformacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninformacion1ActionPerformed(evt);
            }
        });
        jPanel1.add(btninformacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 50, 34));

        btninformacion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info.png"))); // NOI18N
        btninformacion2.setContentAreaFilled(false);
        btninformacion2.setFocusPainted(false);
        btninformacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninformacion2ActionPerformed(evt);
            }
        });
        jPanel1.add(btninformacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 50, 34));

        btnvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/volver.png"))); // NOI18N
        btnvolver.setContentAreaFilled(false);
        btnvolver.setFocusPainted(false);
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 5, 60, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 500));

        jLabel3.setText("  ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 30, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
         if (        txt_codigo.equals(" ")
                || txt_codigofisico.equals(" ")
                || txt_marca.equals(" ")
                || txt_hecho.equals(" ")
                || txt_descripcion.equals(" ")
                || txt_potencia.equals(" ")
                || txt_frecuencia.equals(" ")
                || txt_frecuencia2.equals(" ")
                || txt_tension.equals(" ")
                || txt_tension2.equals(" ")
               ) {

            JOptionPane.showMessageDialog(rootPane, "Falta un campo de llenar");

         
        } else {
             // JOptionPane.showMessageDialog(rootPane, "COmpleto!!!!");

             
             existecodigo();
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnhelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhelpActionPerformed
     // ayudaboton();
    }//GEN-LAST:event_btnhelpActionPerformed

    private void btnbuscarcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarcodigoActionPerformed
        buscarcodigo();
    }//GEN-LAST:event_btnbuscarcodigoActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiarcampos();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void txt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarcodigo();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            limpiarcampos();
        }

    }//GEN-LAST:event_txt_codigoKeyPressed

    private void btninformacion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninformacion3ActionPerformed
          ImageIcon icon = new ImageIcon(CrearNuevo.class.getResource("/Recursos/eje3.png"));
                JOptionPane.showMessageDialog(
                        null,
                        "<--------EJEMPLO",
                        "AYUDA VISUAL", JOptionPane.INFORMATION_MESSAGE,
                        icon); 
    }//GEN-LAST:event_btninformacion3ActionPerformed

    private void btninformacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninformacion1ActionPerformed
        // TODO add your handling code here:
          ImageIcon icon = new ImageIcon(CrearNuevo.class.getResource("/Recursos/eje1.png"));
                JOptionPane.showMessageDialog(
                        null,
                          "<--------EJEMPLO",
                        "AYUDA VISUAL", JOptionPane.INFORMATION_MESSAGE,
                        icon);
           

            
        
    }//GEN-LAST:event_btninformacion1ActionPerformed

    private void btninformacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninformacion2ActionPerformed
        // TODO add your handling code here:
           // TODO add your handling code here:
          ImageIcon icon = new ImageIcon(CrearNuevo.class.getResource("/Recursos/eje2.png"));
                JOptionPane.showMessageDialog(
                        null,
                       "<--------EJEMPLO",
                        "AYUDA VISUAL", JOptionPane.INFORMATION_MESSAGE,
                        icon);
           
    }//GEN-LAST:event_btninformacion2ActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:

        Menu m=new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    private void txt_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_marcaActionPerformed

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
            java.util.logging.Logger.getLogger(CrearNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarcodigo;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnhelp;
    private javax.swing.JButton btninformacion1;
    private javax.swing.JButton btninformacion2;
    private javax.swing.JButton btninformacion3;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JComboBox cbfrecuencia;
    private javax.swing.JComboBox cbfrecuencia2;
    private javax.swing.JComboBox cbpotencia;
    private javax.swing.JComboBox cbtension;
    private javax.swing.JComboBox cbtension2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblDescripcion3;
    private javax.swing.JLabel lblDescripcion4;
    private javax.swing.JLabel lblDescripcion5;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_codigofisico;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_frecuencia;
    private javax.swing.JTextField txt_frecuencia2;
    private javax.swing.JTextField txt_hecho;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_potencia;
    private javax.swing.JTextField txt_tension;
    private javax.swing.JTextField txt_tension2;
    // End of variables declaration//GEN-END:variables

    public void RevisarCamposVacios() {
        if (txt_codigo.equals(" ")|| txt_descripcion.equals(" ")
                || txt_marca.equals(" ")|| txt_hecho.equals(" ")) 
        {
            JOptionPane.showMessageDialog(rootPane, "Faltan datos, si aparecen datos en blanco, comunicate con el comprador responsable");    
        } else {
       //   Revisar si existe el codigo();
        }
     }

    public void ExisteCodigo() {
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:56704", "usounds", "madljda");
            st = conexion.createStatement();
            st.executeUpdate("USE  noms");
            rs = st.executeQuery("select codigo from noms1web where codigo='" + txt_codigo.getText() + "'");

            boolean variable = rs.next();

            String s1 = Boolean.toString(variable);

            try {
                if (s1.equals("false")) {
                    while (rs.next()) {///
                    }
                 
                } else {
                    JOptionPane.showMessageDialog(null, "El codigo ya tiene Label --> " + txt_codigo.getText(), "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }

        
     }

    public void buscarcodigo() {
        String codigo = "";
        String descripcion = "";
        String marca = "";
        String hecho = "";
        String importador = "";  
        String exportador = "";

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:56704", "usounds", "madljda");
            st = conexion.createStatement();
            st.executeUpdate("use cml;");

            rs = st.executeQuery("select codigo,descripcion,marca,hecho,importador,exportador "
                    + "from Noms1 where codigo='" + txt_codigo.getText().trim() + "'");

            while (rs.next()) {

                codigo = rs.getString(1).trim();
                descripcion = rs.getString(2).trim();
                marca = rs.getString(3).trim();
                hecho = rs.getString(4).trim();

            }
            String cod = txt_codigo.getText();
            txt_marca.setText(marca);
            txt_descripcion.setText(descripcion);
            txt_hecho.setText(hecho);
            txt_codigofisico.setText(cod);

            txt_codigo.setEditable(false);
            txt_codigo.setEnabled(false);
            btnguardar.setEnabled(true);

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error en la base de datos");
                btnguardar.setEnabled(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearNuevo.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void limpiarcampos() {
        txt_descripcion.setText("");
        txt_codigofisico.setText("");
        txt_codigo.setText("");
        txt_marca.setText("");
        txt_hecho.setText("");
        txt_tension.setText("");
        txt_tension2.setText("");
        txt_frecuencia.setText("");
        txt_frecuencia2.setText("");
        txt_potencia.setText("");
        txt_codigo.setEnabled(true);
        txt_codigo.setEditable(true);
        btnguardar.setEnabled(false);

    }
     public void existecodigo() {

         try {
             Class.forName("net.sourceforge.jtds.jdbc.Driver");
             java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:56704", "usounds", "madljda");
             st = conexion.createStatement();
             st.executeUpdate("USE CML");
             rs = st.executeQuery("select codigo from  NomEtiqueta where codigo='" + txt_codigo.getText() + "'");

             boolean variable = rs.next();
             String s1 = Boolean.toString(variable);

             try {
                 if (s1.equals("false")) {
                     while (rs.next()) {
                     }
                  confirmacodigo();

                 } else {
                     JOptionPane.showMessageDialog(null, "El codigo " + txt_codigo.getText().trim() + " ya esta registrado, puedes ir a la opcion de modificar o eliminarlo", "Alerta", JOptionPane.WARNING_MESSAGE);
                 }
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(rootPane, ex.getMessage());
             }
         } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
     public void confirmacodigo(){
     
     
     
      int result = JOptionPane.showConfirmDialog(null, "Seguro que quieres capturar el codigo?", "ATENCION",
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            grabarcodigo();
        } else if (result == JOptionPane.NO_OPTION) {

        }     
     }
     
     public void grabarcodigo(){
      
       String   p =cbpotencia.getSelectedItem().toString().trim();
       String   f =cbfrecuencia.getSelectedItem().toString().trim();
       String   p2 =cbfrecuencia2.getSelectedItem().toString().trim();
       String   t =cbtension.getSelectedItem().toString().trim();
       String   t2 =cbtension2.getSelectedItem().toString().trim();
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:56704", "usounds", "madljda");
            Statement st = conexion.createStatement();
            st.executeUpdate("USE cml;");

            ps = conexion.prepareStatement("insert into  NomEtiqueta (codigo, codigofisico, descripcion, marca, hecho, TensionAlimentacion, TensionAlimentacion2, ConsumoPotencia, Frecuencia, Frecuencia2) VALUES ('" + txt_codigo.getText().trim() + "','" + txt_codigofisico.getText().trim() + "',"
                    + "'" + txt_descripcion.getText().trim() + "','" + txt_marca.getText().trim() + "','" + txt_hecho.getText().trim() + "',"
                    + "'" + txt_tension.getText().trim() +"V"+ "','" + txt_tension2.getText().trim() +"mA"+ "',"
                    + "'" + txt_potencia.getText().trim() +"W"+ "','" + txt_frecuencia.getText().trim() +"Hz"+ "','" + txt_frecuencia2.getText().trim() +"kHz"+ "')");

            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "¡Los datos han sido guardados exitósamente!");
                st.close();
                   limpiarcampos();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error en la base de datos" + ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}


