/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author AGONZALEZ
 */
public class CrearNuevoop2 extends javax.swing.JFrame {

    Statement st;
    PreparedStatement ps = null;
    ResultSet rs;
 
    public CrearNuevoop2() {
        initComponents();
      txt_codigo.requestFocusInWindow(); // btnguardar.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblcodigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btnhelp = new javax.swing.JButton();
        btnbuscarcodigo = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        lblMarca = new javax.swing.JLabel();
        txt_marca = new javax.swing.JTextField();
        lblMarca1 = new javax.swing.JLabel();
        txt_hecho = new javax.swing.JTextField();
        lblDescripcion1 = new javax.swing.JLabel();
        txt_codigofisico = new javax.swing.JTextField();
        txt_descripcion1 = new javax.swing.JTextField();
        txt_descripcion2 = new javax.swing.JTextField();
        txt_descripcion3 = new javax.swing.JTextField();
        lblDescripcion2 = new javax.swing.JLabel();
        lblDescripcion4 = new javax.swing.JLabel();
        lblDescripcion3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        btnlimpiar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sounds - Generar Nuevo Label");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcodigo.setText("Codigo Sounds/Original:");
        jPanel1.add(lblcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 150, 30));

        jLabel1.setFont(new java.awt.Font("Britannic Bold", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Generar nuevo Label ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 220, 40));

        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/save.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setBorderPainted(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, 360, 50));

        btnhelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/HELP2.png"))); // NOI18N
        btnhelp.setContentAreaFilled(false);
        btnhelp.setFocusPainted(false);
        btnhelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhelpActionPerformed(evt);
            }
        });
        jPanel1.add(btnhelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, 70, 50));

        btnbuscarcodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/busqueda.png"))); // NOI18N
        btnbuscarcodigo.setContentAreaFilled(false);
        btnbuscarcodigo.setFocusPainted(false);
        btnbuscarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarcodigoActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscarcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 40, 30));

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CCleaner_23560.png"))); // NOI18N
        btnlimpiar.setContentAreaFilled(false);
        btnlimpiar.setFocusPainted(false);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 37, 30));

        btnvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/volver.png"))); // NOI18N
        btnvolver.setContentAreaFilled(false);
        btnvolver.setFocusPainted(false);
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 5, 60, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion.setText("Descripcion:");
        jPanel2.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 90, 30));

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 330, 30));

        lblMarca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMarca.setText(", Modelo: ");
        jPanel2.add(lblMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 70, 30));

        txt_marca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_marcaActionPerformed(evt);
            }
        });
        jPanel2.add(txt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 190, 30));

        lblMarca1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblMarca1.setText("Marca:");
        jPanel2.add(lblMarca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 60, 30));

        txt_hecho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_hecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hechoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_hecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 110, 30));

        lblDescripcion1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion1.setText("Hecho en:");
        jPanel2.add(lblDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 80, 30));

        txt_codigofisico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_codigofisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigofisicoActionPerformed(evt);
            }
        });
        txt_codigofisico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigofisicoKeyPressed(evt);
            }
        });
        jPanel2.add(txt_codigofisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 190, 30));

        txt_descripcion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txt_descripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 440, 30));

        txt_descripcion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txt_descripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 172, 440, 30));

        txt_descripcion3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txt_descripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 203, 440, 30));

        lblDescripcion2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion2.setText("descripcion 1:");
        jPanel2.add(lblDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, 30));

        lblDescripcion4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion4.setText("descripcion 2:");
        jPanel2.add(lblDescripcion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 172, 100, 30));

        lblDescripcion3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion3.setText("descripcion 3:");
        jPanel2.add(lblDescripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 203, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("\"C.P. 32330 - RFC. CML580203DQ6, Ciudad Juarez, Chihuahua, Mexico\"");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 570, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Importador: Casa de Musica de Luxe, S.A de C.V.");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 570, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("\"Av.Paseo Triunfo de la Republica 4450 local 21-23, Col. Partido Escobedo\"");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 570, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Para garantias e instructivos consulte la Pagina Web: www.sounds.mx");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 570, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 640, 370));

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
        jPanel1.add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 190, 30));

        btnlimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/VER.png"))); // NOI18N
        btnlimpiar1.setContentAreaFilled(false);
        btnlimpiar1.setFocusPainted(false);
        btnlimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnlimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 50, 40));

        jLabel2.setText("    ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 40, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigofisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigofisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigofisicoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
         if (        txt_codigofisico.equals(" ")
                || txt_codigofisico.equals(" ")
                || txt_marca.equals(" ")
                || txt_hecho.equals(" ")
                || txt_descripcion.equals(" ")
                || txt_descripcion1.equals(" ")
                || txt_descripcion2.equals(" ")
           
                || txt_descripcion3.equals(" ")  
              
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

    private void txt_codigofisicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigofisicoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            buscarcodigo();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            limpiarcampos();
        }

    }//GEN-LAST:event_txt_codigofisicoKeyPressed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:

        Menu m=new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    private void txt_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_marcaActionPerformed

    private void txt_hechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hechoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hechoActionPerformed

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void txt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyPressed
  
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
             buscarcodigo();
        }
    }//GEN-LAST:event_txt_codigoKeyPressed

    private void btnlimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiar1ActionPerformed
        // TODO add your handling code here:
         existecodigover();
    }//GEN-LAST:event_btnlimpiar1ActionPerformed
 public void existecodigover() {

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
                          JOptionPane.showMessageDialog(null, "El codigo " + txt_codigo.getText().trim() + " no esta registrado, puedes ir a la opcion de modificar o eliminarlo", "Alerta", JOptionPane.WARNING_MESSAGE);
             
                 } else {   Imprimircodigover();
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
 
   public void Imprimircodigover(){
    
         //  System.out.println(System.getProperty("user.name")); 
              String user = System.getProperty("user.name");
              // File archivo = new File("C:\\Users\\" + user + "\\Desktop\\LEEME.txt");
      try { 
           String codigo = txt_codigo.getText().trim();
          pruebaconexion con = new pruebaconexion();
          Connection conn = con.Conectar();
          JasperReport reporte = null;
          Map parametro = new HashMap(); // MAPEO DE MAPA TIPO HASH
          System.out.println(""+codigo);
          parametro.put("codigo", codigo);
        //  parametro.put("codigofisico", "'" +codigo+ "'");
               
          String path = "C:\\Program Files\\LabelAduana\\src\\Plantillas/labelchico.jasper";
       //   String path = "C:\\Users\\"+user+"\\Documents\\NetBeansProjects\\Inventario\\src\\reportes\\Dia.jasper";
          reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
          JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);
          JasperViewer view = new JasperViewer(jprint, false);
          view.setTitle("LABEL IMPORTACION CODIGO: "+codigo);
          view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
          view.setZoomRatio(new Float(4));
          view.setVisible(true); 
         
      
        //this.dispose();
        } catch (JRException ex) {
         Logger.getLogger(ImprimirLabel.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, ">>"+ex);
            
        }
      
      
    }
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
            java.util.logging.Logger.getLogger(CrearNuevoop2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearNuevoop2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearNuevoop2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearNuevoop2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearNuevoop2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarcodigo;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnhelp;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnlimpiar1;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblDescripcion3;
    private javax.swing.JLabel lblDescripcion4;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMarca1;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_codigofisico;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_descripcion1;
    private javax.swing.JTextField txt_descripcion2;
    private javax.swing.JTextField txt_descripcion3;
    private javax.swing.JTextField txt_hecho;
    private javax.swing.JTextField txt_marca;
    // End of variables declaration//GEN-END:variables

    public void RevisarCamposVacios() {
        if (txt_codigofisico.equals(" ")|| txt_descripcion.equals(" ")
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
            rs = st.executeQuery("select codigo from noms1web where codigo='" + txt_codigofisico.getText() + "'");

            boolean variable = rs.next();

            String s1 = Boolean.toString(variable);

            try {
                if (s1.equals("false")) {
                    while (rs.next()) {///
                    }
                 
                } else {
                    JOptionPane.showMessageDialog(null, "El codigo ya tiene Label --> " + txt_codigofisico.getText(), "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearNuevoop2.class.getName()).log(Level.SEVERE, null, ex);
        }

        
     }

    public void buscarcodigo() {
        String codigo = "";
        String descripcion = "";
        String marca = "";
        String hecho = "";
        String importador = "";  
        String exportador = "";
        System.out.println("llega");
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
                System.out.println(">>>>"+rs.getString(1).trim()+rs.getString(2).trim());
   
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
                JOptionPane.showMessageDialog(rootPane, ex);
                btnguardar.setEnabled(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearNuevoop2.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void limpiarcampos() {
        txt_descripcion.setText("");
        txt_codigo.setText("");
        txt_codigofisico.setText("");
        txt_marca.setText("");
        txt_hecho.setText("");
        txt_descripcion1.setText("");
        txt_descripcion2.setText("");
        txt_descripcion3.setText("");
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
             rs = st.executeQuery("select codigo from  NomEtiqueta where codigo='" + txt_codigofisico.getText() + "'");

             boolean variable = rs.next();
             String s1 = Boolean.toString(variable);

             try {
                 if (s1.equals("false")) {
                     while (rs.next()) {
                     }
                  confirmacodigo();

                 } else {
                     JOptionPane.showMessageDialog(null, "El codigo " + txt_codigofisico.getText().trim() + " ya esta registrado, puedes ir a la opcion de modificar o eliminarlo", "Alerta", JOptionPane.WARNING_MESSAGE);
                 }
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(rootPane, ex.getMessage());
             }
         } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearNuevoop2.class.getName()).log(Level.SEVERE, null, ex);
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
      
    
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:56704", "usounds", "madljda");
            Statement st = conexion.createStatement();
            st.executeUpdate("USE cml;");

            ps = conexion.prepareStatement("insert into  NomEtiqueta (codigo, codigofisico, descripcion, marca, hecho, descripcion1, descripcion2, descripcion3) VALUES ('" + txt_codigofisico.getText().trim() + "','" + txt_codigofisico.getText().trim() + "',"
                    + "'" + txt_descripcion.getText().trim() + "','" + txt_marca.getText().trim() + "','" + txt_hecho.getText().trim() + "',"
                    + "'" + txt_descripcion1.getText().trim()  + "','" + txt_descripcion2.getText().trim()  + "','" + txt_descripcion3.getText().trim()  + "')");

            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "¡Los datos han sido guardados exitósamente!");
                st.close();
                   limpiarcampos();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error en la base de datos" + ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CrearNuevoop2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}


