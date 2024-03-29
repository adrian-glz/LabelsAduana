package Frames;

import buscador.CodigoPOJO;
import buscador.PersonaJDBC;
import com.mxrck.autocompleter.AutoCompleterCallback;
import com.mxrck.autocompleter.TextAutoCompleter;
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
public class Generico extends javax.swing.JFrame {

    Statement st;
    PreparedStatement ps = null;
    ResultSet rs;
    String guardadito = "";
    TextAutoCompleter textAutoCompleter;

    /**
     * Creates new form Modificar
     */
    public Generico() {
        initComponents();
              setIconImage(new ImageIcon(getClass().getResource("/recursos/logochico.png")).getImage());
   
        txt_codigo.requestFocusInWindow();
        btnguardar.setEnabled(false);

        textAutoCompleter = new TextAutoCompleter(txt_codigo, new AutoCompleterCallback() {
            @Override
            public void callback(Object o) {
                Object a = textAutoCompleter.findItem(o);
                CodigoPOJO personaPOJO = (CodigoPOJO) a;
            }
        });
        PersonaJDBC.cargarCompleter(textAutoCompleter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDescripcion2 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        txt_marca = new javax.swing.JTextField();
        txt_hecho = new javax.swing.JTextField();
        lblDescripcion7 = new javax.swing.JLabel();
        txt_codigofisico = new javax.swing.JTextField();
        txt_descripcion1 = new javax.swing.JTextField();
        txt_descripcion2 = new javax.swing.JTextField();
        txt_descripcion3 = new javax.swing.JTextField();
        lblDescripcion8 = new javax.swing.JLabel();
        lblDescripcion9 = new javax.swing.JLabel();
        lblDescripcion10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnactualizar = new javax.swing.JButton();
        lblcodigo = new javax.swing.JLabel();
        btnbuscarcodigo = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnlimpiar1 = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        txt_codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sounds - Generar  Label Generico");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("  ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 30, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDescripcion2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion2.setText("Descripcion:");
        jPanel2.add(lblDescripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 90, 30));

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcionKeyTyped(evt);
            }
        });
        jPanel2.add(txt_descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 330, 30));

        txt_marca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_marcaActionPerformed(evt);
            }
        });
        txt_marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_marcaKeyTyped(evt);
            }
        });
        jPanel2.add(txt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 190, 30));

        txt_hecho.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_hecho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hechoActionPerformed(evt);
            }
        });
        txt_hecho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_hechoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_hecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 110, 30));

        lblDescripcion7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion7.setText("Hecho en:");
        jPanel2.add(lblDescripcion7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 80, 30));

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
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigofisicoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_codigofisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 190, 30));

        txt_descripcion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_descripcion1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_descripcion1InputMethodTextChanged(evt);
            }
        });
        txt_descripcion1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcion1KeyTyped(evt);
            }
        });
        jPanel2.add(txt_descripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 440, 30));

        txt_descripcion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_descripcion2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcion2KeyTyped(evt);
            }
        });
        jPanel2.add(txt_descripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 173, 440, 30));

        txt_descripcion3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_descripcion3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descripcion3KeyTyped(evt);
            }
        });
        jPanel2.add(txt_descripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 206, 440, 30));

        lblDescripcion8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion8.setText("descripcion 1:");
        jPanel2.add(lblDescripcion8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, 30));

        lblDescripcion9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion9.setText("descripcion 2:");
        jPanel2.add(lblDescripcion9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 173, 100, 30));

        lblDescripcion10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescripcion10.setText("descripcion 3:");
        jPanel2.add(lblDescripcion10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 206, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("\"C.P. 32330 - RFC. CML580203DQ6, Ciudad Juarez, Chihuahua, Mexico\"");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 570, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Para garantias e instructivos consulte la Pagina Web: www.sounds.mx");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 570, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("\"Av.Paseo Triunfo de la Republica 4450 local 21-23, Col. Partido Escobedo\"");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 570, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Importador: Casa de Musica de Luxe, S.A de C.V.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 570, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 610, 370));

        btnactualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/update.png"))); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.setBorderPainted(false);
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 180, 50));

        lblcodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcodigo.setText("Codigo Sounds/Original:");
        getContentPane().add(lblcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 170, 40));

        btnbuscarcodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/buscar.png"))); // NOI18N
        btnbuscarcodigo.setContentAreaFilled(false);
        btnbuscarcodigo.setFocusPainted(false);
        btnbuscarcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarcodigoActionPerformed(evt);
            }
        });
        getContentPane().add(btnbuscarcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 40, 35));

        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/limpiar_1.png"))); // NOI18N
        btnlimpiar.setContentAreaFilled(false);
        btnlimpiar.setFocusPainted(false);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 40, 35));

        btnvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/volver.png"))); // NOI18N
        btnvolver.setContentAreaFilled(false);
        btnvolver.setFocusPainted(false);
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 50, 40));

        jLabel2.setText("      ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 50, 30));

        btnlimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Print_icon-icons.com_73705 (1).png"))); // NOI18N
        btnlimpiar1.setContentAreaFilled(false);
        btnlimpiar1.setFocusPainted(false);
        btnlimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 60, 50));

        btnguardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/save.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.setBorderPainted(false);
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 180, 50));

        txt_codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigoKeyPressed(evt);
            }
        });
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 220, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_marcaActionPerformed

    private void txt_hechoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hechoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hechoActionPerformed

    private void txt_codigofisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigofisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigofisicoActionPerformed

    private void txt_codigofisicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigofisicoKeyPressed

    }//GEN-LAST:event_txt_codigofisicoKeyPressed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        // TODO add your handling code here:

        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        limpiarcampos();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnbuscarcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarcodigoActionPerformed

        buscarcodigo();
        existecodigo2();


    }//GEN-LAST:event_btnbuscarcodigoActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        if (txt_codigo.equals(" ")
                || txt_codigofisico.equals(" ")
                || txt_marca.equals(" ")
                || txt_hecho.equals(" ")
                || txt_descripcion.equals(" ")) {

            JOptionPane.showMessageDialog(rootPane, "Falta un campo de llenar");

        } else {
            existecodigomodificar();
        }

    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btnlimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiar1ActionPerformed
        existecodigover();
    }//GEN-LAST:event_btnlimpiar1ActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (txt_codigofisico.equals(" ")
                || txt_codigofisico.equals(" ")
                || txt_marca.equals(" ")
                || txt_hecho.equals(" ")
                || txt_descripcion.equals(" ")
                || txt_descripcion1.equals(" ")
                || txt_descripcion2.equals(" ")
                || txt_descripcion3.equals(" ")) {

            JOptionPane.showMessageDialog(rootPane, "Falta un campo de llenar");

        } else {
            existecodigoguardar();
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txt_descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descripcionKeyTyped

    private void txt_marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_marcaKeyTyped
        // TODO add your handling code here:
        if (txt_marca.getText().length() == 30) {
            JOptionPane.showMessageDialog(null, "Solo 30 caracteres", "Alerta", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txt_marcaKeyTyped

    private void txt_codigofisicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigofisicoKeyTyped
        // TODO add your handling code here:
        if (txt_codigofisico.getText().length() == 30) {
            JOptionPane.showMessageDialog(null, "Solo 30 caracteres", "Alerta", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txt_codigofisicoKeyTyped

    private void txt_hechoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hechoKeyTyped
        if (txt_hecho.getText().length() == 15) {
            JOptionPane.showMessageDialog(null, "Solo 15 caracteres", "Alerta", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txt_hechoKeyTyped

    private void txt_descripcion1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcion1KeyTyped
        String limite = txt_descripcion1.getText().substring(0, 40);
        double C = limite.length();

        if (C >= 40) {
            JOptionPane.showMessageDialog(null, "Solo 40 caracteres", "Alerta", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }

    }//GEN-LAST:event_txt_descripcion1KeyTyped

    private void txt_descripcion2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcion2KeyTyped
        if (txt_descripcion2.getText().length() == 40) {
            JOptionPane.showMessageDialog(null, "Solo 40 caracteres", "Alerta", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txt_descripcion2KeyTyped

    private void txt_descripcion3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descripcion3KeyTyped
        if (txt_descripcion3.getText().length() == 40) {
            JOptionPane.showMessageDialog(null, "Solo 40 caracteres", "Alerta", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txt_descripcion3KeyTyped

    private void txt_descripcion1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_descripcion1InputMethodTextChanged
        // TODO add your handling code here:
        String limite = txt_descripcion1.getText().substring(0, 40);
        double C = limite.length();

        if (C >= 40) {
            JOptionPane.showMessageDialog(null, "Solo 40 caracteres", "Alerta", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }

    }//GEN-LAST:event_txt_descripcion1InputMethodTextChanged

    private void txt_codigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("-->" + txt_codigo.getText());
            buscarcodigo();
           
        }

    }//GEN-LAST:event_txt_codigoKeyPressed
    public void existecodigover() {

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:55024", "usounds", "madljda");
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

                } else {
                    Imprimircodigover();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Generico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Imprimircodigover() {

        //  System.out.println(System.getProperty("user.name")); 
        String user = System.getProperty("user.name");
        // File archivo = new File("C:\\Users\\" + user + "\\Desktop\\LEEME.txt");
        try {
            String codigo = txt_codigo.getText().trim();
            pruebaconexion con = new pruebaconexion();
            Connection conn = con.Conectar();
            JasperReport reporte = null;
            Map parametro = new HashMap(); // MAPEO DE MAPA TIPO HASH
            System.out.println("" + codigo);
            parametro.put("codigo", codigo);
            //  parametro.put("codigofisico", "'" +codigo+ "'");

            String path = "C:\\Program Files\\LabelAduana\\src\\Plantillas/labelgenerico.jasper";
            //   String path = "C:\\Users\\"+user+"\\Documents\\NetBeansProjects\\Inventario\\src\\reportes\\Dia.jasper";
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, conn);
            JasperViewer view = new JasperViewer(jprint, false);
            view.setTitle("LABEL IMPORTACION CODIGO: " + codigo);
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setZoomRatio(new Float(4));
            view.setVisible(true);

            //this.dispose();
        } catch (JRException ex) {
            Logger.getLogger(ImprimirLabel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ">>" + ex);

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
            java.util.logging.Logger.getLogger(Generico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscarcodigo;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnlimpiar1;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDescripcion10;
    private javax.swing.JLabel lblDescripcion2;
    private javax.swing.JLabel lblDescripcion7;
    private javax.swing.JLabel lblDescripcion8;
    private javax.swing.JLabel lblDescripcion9;
    private javax.swing.JLabel lblcodigo;
    public static javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_codigofisico;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_descripcion1;
    private javax.swing.JTextField txt_descripcion2;
    private javax.swing.JTextField txt_descripcion3;
    private javax.swing.JTextField txt_hecho;
    private javax.swing.JTextField txt_marca;
    // End of variables declaration//GEN-END:variables

    public void RevisarCamposVacios() {
        if (txt_codigo.equals(" ") || txt_descripcion.equals(" ")
                || txt_marca.equals(" ") || txt_hecho.equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Faltan datos, si aparecen datos en blanco, comunicate con el comprador responsable");
        } else {
            //   Revisar si existe el codigo();
        }
    }

    public void buscarcodigo() {

        String codigo = "";
        String codigof = "";
        String descripcion = "";
        String marca = "";
        String hecho = "";
        String importador = "";
        String exportador = "";
        String descripcion1 = "";
        String descripcion2 = "";
        String descripcion3 = "";

        guardadito = txt_codigo.getText().trim();

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:55024", "usounds", "madljda");
            st = conexion.createStatement();
            st.executeUpdate("use cml;");

            rs = st.executeQuery("select codigo,codigofisico,descripcion,marca"
                    + ",hecho,descripcion1,descripcion2,descripcion3 from nometiqueta where codigo='" + txt_codigo.getText().trim() + "' or codigofisico= '" + txt_codigo.getText().trim() + "'");
            // System.out.println("si llega");
            while (rs.next()) {
                codigo = rs.getString(1).trim();
                codigof = rs.getString(2).trim();
                descripcion = rs.getString(3).trim();
                marca = rs.getString(4).trim();
                hecho = rs.getString(5).trim();
                descripcion1 = rs.getString(6).trim();
                descripcion2 = rs.getString(7).trim();
                descripcion3 = rs.getString(8).trim();
                txt_marca.setText(marca);
                txt_descripcion.setText(descripcion);
                txt_hecho.setText(hecho);
                txt_codigofisico.setText(codigof);
                txt_descripcion1.setText(descripcion1);
                txt_descripcion2.setText(descripcion2);
                txt_descripcion3.setText(descripcion3);
                txt_codigo.setText(codigo);
                txt_codigo.setEditable(false);
                txt_codigo.setEnabled(false);
                btnactualizar.setEnabled(true);
                existecodigo2();
            }

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error en la base de datos");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Generico.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }

    public void limpiarcampos() {
        txt_descripcion.setText("");
        txt_descripcion1.setText("");
        txt_descripcion2.setText("");
        txt_descripcion3.setText("");
        txt_codigofisico.setText("");
        txt_codigo.setText("");
        txt_marca.setText("");
        txt_hecho.setText("");
        txt_codigo.setEnabled(true);
        txt_codigo.setEditable(true);
        btnactualizar.setEnabled(false);
    }

    public void confirmacodigo() {
        int result = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres modificar el codigo?", "ATENCION",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            modificarcodigo();
        } else if (result == JOptionPane.NO_OPTION) {
        }
    }

    public void existecodigomodificar() {

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:55024", "usounds", "madljda");
            st = conexion.createStatement();
            st.executeUpdate("USE CML");
            rs = st.executeQuery("select codigo from  NomEtiqueta where codigo='" + txt_codigo.getText() + "'");

            boolean variable = rs.next();
            String s1 = Boolean.toString(variable);

            try {
                if (s1.equals("true")) {
                    while (rs.next()) {
                    }
                    confirmacodigo();
                } else {
                    JOptionPane.showMessageDialog(null, "El codigo " + txt_codigo.getText().trim() + " no esta registrado", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Generico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarcodigo() {

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:55024", "usounds", "madljda");
            Statement st = conexion.createStatement();
            st.executeUpdate("USE cml;");

            ps = conexion.prepareStatement("update nometiqueta set codigofisico='" + txt_codigofisico.getText().trim() + "',\n"
                    + "descripcion='" + txt_descripcion.getText().trim() + "',marca='" + txt_marca.getText().trim() + "',\n"
                    + "hecho='" + txt_hecho.getText().trim() + "',descripcion1='" + txt_descripcion1.getText().trim() + "',\n"
                    + "descripcion2='" + txt_descripcion2.getText().trim() + "',descripcion3='" + txt_descripcion3.getText().trim() + "'  where codigo='" + txt_codigo.getText().trim() + "'   ");

            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "¡Los datos han sido guardados exitósamente!");
                st.close();
                //  limpiarcampos();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error en la base de datos" + ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Generico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void existecodigo2() {

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:55024", "usounds", "madljda");
            st = conexion.createStatement();
            st.executeUpdate("USE CML");
            rs = st.executeQuery("select codigo from  NomEtiqueta where codigo='" + txt_codigo.getText() + "'");

            boolean variable = rs.next();
            String s1 = Boolean.toString(variable);

            try {
                if (s1.equals("false")) {
                    while (rs.next()) {
                    }
                    // confirmacodigo();
                    JOptionPane.showMessageDialog(null, "El codigo " + txt_codigo.getText().trim() + " No tiene etiqueta aun, Favor de registrarlo", "Alerta", JOptionPane.WARNING_MESSAGE);

                    txt_codigo.setEnabled(true);
                    txt_codigo.setEditable(true);
                    txt_descripcion.requestFocusInWindow(); // btnguardar.setEnabled(false);
                    txt_codigo.setText(guardadito);
                    btnguardar.setEnabled(true);
                    btnactualizar.setEnabled(false);

                    //     buscarcodigo();
                } else {
                    JOptionPane.showMessageDialog(null, "El codigo " + txt_codigo.getText().trim() + " Ya tiene etiqueta  ", "Confirmacion ", JOptionPane.INFORMATION_MESSAGE);
                    txt_descripcion.requestFocusInWindow();
                    btnguardar.setEnabled(false);
                    // confirmacodigo();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Generico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void existecodigoguardar() {

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:55024", "usounds", "madljda");
            st = conexion.createStatement();
            st.executeUpdate("USE CML");
            rs = st.executeQuery("select codigo from  NomEtiqueta where codigo='" + txt_codigofisico.getText() + "'");

            boolean variable = rs.next();
            String s1 = Boolean.toString(variable);

            try {
                if (s1.equals("false")) {
                    while (rs.next()) {
                    }
                    confirmacodigoguardar();

                } else {
                    JOptionPane.showMessageDialog(null, "El codigo " + txt_codigofisico.getText().trim() + " ya esta registrado, puedes ir a la opcion de modificar o eliminarlo", "Alerta", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage());
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Generico.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void confirmacodigoguardar() {

        int result = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres capturar el codigo?", "ATENCION",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            grabarcodigo();
        } else if (result == JOptionPane.NO_OPTION) {

        }
    }

    public void grabarcodigo() {

        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:55024", "usounds", "madljda");
            Statement st = conexion.createStatement();
            st.executeUpdate("USE cml;");

            ps = conexion.prepareStatement("insert into  NomEtiqueta (codigo, codigofisico, descripcion, marca, hecho, descripcion1, descripcion2, descripcion3) VALUES ('" + txt_codigo.getText().trim() + "','" + txt_codigofisico.getText().trim() + "',"
                    + "'" + txt_descripcion.getText().trim() + "','" + txt_marca.getText().trim() + "','" + txt_hecho.getText().trim() + "',"
                    + "'" + txt_descripcion1.getText().trim() + "','" + txt_descripcion2.getText().trim() + "','" + txt_descripcion3.getText().trim() + "')");

            int n = ps.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "¡Los datos han sido guardados exitósamente!");
                st.close();
                //limpiarcampos();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error en la base de datos" + ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Generico.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
