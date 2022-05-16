
package Vista;

import Modelo.dao.AsistenciaDao;
import Modelo.entidad.Asistencia;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmAsistencia extends javax.swing.JInternalFrame {
 DefaultTableModel defaultTableModel = new DefaultTableModel();

 Calendar calendar = new GregorianCalendar();
   AsistenciaDao asistenciaDao = new AsistenciaDao();
    Asistencia asistencia = new Asistencia();
 
    
    public frmAsistencia() {
        initComponents();
        fechaActual();
        listarTabla();
        lblid_empleado.setText(""+LoginTienda.empleado.getId_empleado());
        lblusuario.setText(""+LoginTienda.empleado.getUsuario());
        lblnombre.setText(""+LoginTienda.empleado.getNombre());
        lblapellidos.setText(""+LoginTienda.empleado.getNombre());
        
       
    }
void fechaActual() {
        lblFecha.setText("" + calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DAY_OF_MONTH));
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblusuario = new javax.swing.JLabel();
        lblid_empleado = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        lblapellidos = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnIngresar1 = new LIB.FSButtonMD();
        lblFecha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblusuario.setText("USUARIO");
        getContentPane().add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 99, 88, 43));

        lblid_empleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblid_empleado.setForeground(new java.awt.Color(255, 255, 255));
        lblid_empleado.setText("ID");
        getContentPane().add(lblid_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 99, 61, 43));

        lblnombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblnombre.setForeground(new java.awt.Color(255, 255, 255));
        lblnombre.setText("NOMBRES");
        getContentPane().add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 106, 76, 28));

        lblapellidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblapellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblapellidos.setText("APELLIDOS");
        getContentPane().add(lblapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 106, 98, 28));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIngresar1.setBackground(new java.awt.Color(255, 0, 0));
        btnIngresar1.setText("REGISTRAR ASISTENCIA");
        btnIngresar1.setColorNormal(new java.awt.Color(255, 0, 0));
        btnIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 100, 169, -1));

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 51, 204));
        lblFecha.setText("FECHA");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 99, 88, 43));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("LAN CENTER TUBINET");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ASISTENCIA", "ID USUARIO", "NOMBRES", "APELLIDOS", "USUARIO", "FECHA"
            }
        ));
        jScrollPane1.setViewportView(jtabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 700, 141));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresar1ActionPerformed
        agregar();
        
        listarTabla();
       
    }//GEN-LAST:event_btnIngresar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD btnIngresar1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabla;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblapellidos;
    private javax.swing.JLabel lblid_empleado;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblusuario;
    // End of variables declaration//GEN-END:variables
void agregar(){
    String nombre =lblnombre.getText();
    String apellido = lblapellidos.getText();
    int id_empleado = Integer.parseInt(lblid_empleado.getText());
    String usuario = lblusuario.getText();
    String fecha = lblFecha.getText();
    
    
        
            Object[] object = new Object[5];
            object[0] = id_empleado;
            object[1] = nombre;
            object[2] = apellido;
            object[3] = usuario;
            object[4] = fecha;
            
            
            
            asistenciaDao.Agregar(object);
        }
       
       
               

 void listarTabla() {
        List<Asistencia> lista = asistenciaDao.Listar();
        defaultTableModel = (DefaultTableModel) jtabla.getModel();
        Object[] object = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId_asistencia();
            object[1] = lista.get(i).getId_empleado();
            object[2] = lista.get(i).getNombres();
            object[3] = lista.get(i).getApellidos();
            object[4] = lista.get(i).getUsuario();
            object[5] = lista.get(i).getFecha();
            
            defaultTableModel.addRow(object);
        }
        jtabla.setModel(defaultTableModel);
    }

}
