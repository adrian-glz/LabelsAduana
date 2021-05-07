package Frames;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;

/**
 * @author AGONZALEZ
 */
public class Editacodigos extends javax.swing.JFrame {

    ResultSet rs;
    int count = 0;
    DefaultTableModel md;
    Statement st;
    private PreparedStatement ps;

    public Editacodigos() {
        initComponents();
       llenartable();
        imagendebarra();
    }
     DefaultTableModel dmm;

    private void filtro(String consulta, JTable jtableBuscar) {
        dmm = (DefaultTableModel) jtabla.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(dmm);
        jtableBuscar.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(consulta));
    }

    public void update() {

       try {
                Class.forName("net.sourceforge.jtds.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:55024", "usounds", "madljda");
                Statement st = conexion.createStatement();
                st.executeUpdate("USE  cml");
                String codigo = jtabla.getValueAt(jtabla.getSelectedRow(), 0).toString();
                String codigofisico = jtabla.getValueAt(jtabla.getSelectedRow(), 1).toString();
                String descripcion = jtabla.getValueAt(jtabla.getSelectedRow(), 2).toString();
                String marca = jtabla.getValueAt(jtabla.getSelectedRow(), 3).toString();
                String hecho = jtabla.getValueAt(jtabla.getSelectedRow(), 4).toString();
                String d1 = jtabla.getValueAt(jtabla.getSelectedRow(), 5).toString();
                String d2 = jtabla.getValueAt(jtabla.getSelectedRow(), 6).toString();
                String d3= jtabla.getValueAt(jtabla.getSelectedRow(), 7).toString();

                String updateTableSQL = ("UPDATE nometiqueta SET codigofisico='" + codigofisico + "' ,descripcion='" + descripcion + "',marca='" + marca
                        + "',hecho='" + hecho + "',descripcion1='" + d1 + "',descripcion2='"+d2+"',descripcion3='"+d3+"'  WHERE codigo='" + codigo + "';");
                PreparedStatement preparedStatement = conexion.prepareStatement(updateTableSQL);
                preparedStatement.executeUpdate();
                int n = preparedStatement.executeUpdate();

                if (n > 0) {
                    JOptionPane.showMessageDialog(null, "¡Los datos han sido guardados exitósamente!" + updateTableSQL);
                } else {

                }
                st.close();
                llenartable();
            } catch (SQLException ex) {
            Logger.getLogger(Editacodigos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Editacodigos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void llenartable() {

        jtabla.getColumnModel().getColumn(0).setPreferredWidth(140); //Matrícula
        jtabla.getColumnModel().getColumn(0).setMaxWidth(240);
        jtabla.getColumnModel().getColumn(0).setMinWidth(80);

        jtabla.getColumnModel().getColumn(1).setPreferredWidth(140); //Nombre
        jtabla.getColumnModel().getColumn(1).setMaxWidth(70);
        jtabla.getColumnModel().getColumn(1).setMinWidth(90);

        jtabla.getColumnModel().getColumn(2).setPreferredWidth(140); //Nombre
        jtabla.getColumnModel().getColumn(2).setMaxWidth(70);
        jtabla.getColumnModel().getColumn(2).setMinWidth(70);

        jtabla.getColumnModel().getColumn(3).setPreferredWidth(120); //Matrícula
        jtabla.getColumnModel().getColumn(3).setMaxWidth(120);
        jtabla.getColumnModel().getColumn(3).setMinWidth(120);

        jtabla.getColumnModel().getColumn(4).setPreferredWidth(120); //Matrícula
        jtabla.getColumnModel().getColumn(4).setMaxWidth(120);
        jtabla.getColumnModel().getColumn(4).setMinWidth(120);

        jtabla.getColumnModel().getColumn(5).setPreferredWidth(240); //Matrícula
        jtabla.getColumnModel().getColumn(5).setMaxWidth(240);
        jtabla.getColumnModel().getColumn(5).setMinWidth(240);
        
        jtabla.getColumnModel().getColumn(6).setPreferredWidth(240); //Matrícula
        jtabla.getColumnModel().getColumn(6).setMaxWidth(240);
        jtabla.getColumnModel().getColumn(6).setMinWidth(240);
        
        jtabla.getColumnModel().getColumn(7).setPreferredWidth(240); //Matrícula
        jtabla.getColumnModel().getColumn(7).setMaxWidth(240);
        jtabla.getColumnModel().getColumn(7).setMinWidth(240);

        String data[][] = {};
        String cabeza[] = {"Codigo", "CodigoFisico", "Descripcion", "Marca", "Hecho", "Descripcion1", "Descripcion2", "Descripcion3"};///definimos nombre cada columna en encabezado

        md = new DefaultTableModel(data, cabeza) {
            @Override
            public boolean isCellEditable(int row, int column) {

                for (int i = 1; i < 8; i++) {
                    if (column == i) {//editar solo la columna 4
                        return true;  //La columna 4 es editable.
                    }
                }
                return false;  //El resto de celdas no son editables.
            }
        };
       jtabla.setAutoCreateRowSorter(true);
        jtabla.setModel(md); //igualamos en modelo en jplatos
        JTableHeader th;
        th = jtabla.getTableHeader();
        th.setFont(new java.awt.Font("tahoma", 0, 14));//seteamos fuente en el header
        //Centrar el encabezado de la tabla
        TableCellRenderer rendererFromHeader = jtabla.getTableHeader().getDefaultRenderer();//
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        //Conexión a la BD
        try {
               Class.forName("net.sourceforge.jtds.jdbc.Driver");
                java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:55024", "usounds", "madljda");
                Statement st = conexion.createStatement();
                st.executeUpdate("USE  cml");
           
            //Seleccionar datos
            rs = st.executeQuery("select * from nometiqueta");
            md = (DefaultTableModel) jtabla.getModel();
            md.setRowCount(0);
            try {
                jtabla.setRowHeight(40);
                while (rs.next()) {
                    Object[] fila = (new Object[]{rs.getString(1), rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8)
                    });
                    md.addRow(fila);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Editacodigos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 

    public void eliminarcodigo() {

        int filaseleccionada = jtabla.getSelectedRow();
        Object idd = (jtabla.getValueAt(filaseleccionada, 0));///OBTIENES EL PRIMER FILA  
        String id = idd.toString();
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            java.sql.Connection conexion = DriverManager.getConnection("jdbc:jtds:sqlserver://192.168.1.80:55024", "usounds", "madljda");
            Statement st = conexion.createStatement();
            st.executeUpdate("USE  cml");
            String query = "delete from nometiqueta where codigo= '" + id + " '  ";

            ps = conexion.prepareStatement(query);
            int n = ps.executeUpdate();

            if (n > 0) {
                JOptionPane.showMessageDialog(null, "¡Se elimino el codigo: " + id);
                st.close();
                llenartable();
                //  historialeliminado();

            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error en la base de datos");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Editacodigos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void imagendebarra() {
        try {
            setIconImage(new ImageIcon(getClass().getResource("/img/logo.png")).getImage());
        } catch (Exception e) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_codigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnregresar = new javax.swing.JButton();
        btnrefrescar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Edita Codigos Label");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_codigo.setPreferredSize(new java.awt.Dimension(6, 25));
        txt_codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_codigoKeyReleased(evt);
            }
        });
        getContentPane().add(txt_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 250, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Filtrar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 40));

        jLabel2.setText("   ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 440, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnregresar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnregresar.setText("Volver");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, 60));

        btnrefrescar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnrefrescar.setText("Refrescar");
        btnrefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefrescarActionPerformed(evt);
            }
        });
        jPanel1.add(btnrefrescar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 60));

        btneliminar.setBackground(new java.awt.Color(204, 0, 0));
        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 70, 150, 240));

        jLabel3.setText("  ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(994, 150, 30, -1));

        jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jtabla.getTableHeader().setReorderingAllowed(false);
        jtabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtablaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtabla);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 910, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnrefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefrescarActionPerformed
        llenartable();
    }//GEN-LAST:event_btnrefrescarActionPerformed
   
    private void txt_codigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigoKeyReleased
        filtro(txt_codigo.getText().toUpperCase(), jtabla);
    }//GEN-LAST:event_txt_codigoKeyReleased

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jtabla.getModel();

        int filaseleccionada = jtabla.getSelectedRow();//OBTIENES EL ELEMENTO DE LA TABLA
        if (filaseleccionada >= 0) {
            Object itemcodigo = (jtabla.getValueAt(filaseleccionada, 0));
            String cod = itemcodigo.toString();

            int result = JOptionPane.showConfirmDialog(null, "Quieres eliminar el codigo '" + cod + "' ?  \n Una vez eliminado no se puede recuperar el registro  de ninguna manera  NI POR SISTEMAS ", "ATENCION",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                eliminarcodigo();
            } else if (result == JOptionPane.NO_OPTION) {

            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecciona una fila de la tabla");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        this.dispose();
        Menu p = new Menu();
        p.setVisible(true);
    }//GEN-LAST:event_btnregresarActionPerformed

    private void jtablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtablaKeyReleased
       if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            update();
            }
    }//GEN-LAST:event_jtablaKeyReleased

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
            java.util.logging.Logger.getLogger(Editacodigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editacodigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editacodigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editacodigos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editacodigos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnrefrescar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtabla;
    private javax.swing.JTextField txt_codigo;
    // End of variables declaration//GEN-END:variables
 }