
package Vista;

import Modelo.dao.ConexionSQL;
import Modelo.dao.EmpleadoDao;
import Modelo.entidad.Empleado;
import java.awt.Color;




import javax.swing.JOptionPane;

import java.sql.*;


public class LoginTienda extends javax.swing.JFrame {

ConexionSQL cc= new ConexionSQL();
Connection con=cc.Conexion();
public static EmpleadoDao empleadodao = new EmpleadoDao();
    public static Empleado empleado = new Empleado();
String privilegio;

    
    public LoginTienda() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnIngresar = new LIB.FSButtonMD();
        txtusuario = new LIB.FSTexFieldMD();
        jLabel5 = new javax.swing.JLabel();
        txtclave = new LIB.FSPasswordFieldMD();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Contraseña");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        btnIngresar.setBackground(new java.awt.Color(255, 0, 0));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setColorNormal(new java.awt.Color(255, 0, 0));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        txtusuario.setForeground(new java.awt.Color(0, 0, 0));
        txtusuario.setToolTipText("");
        txtusuario.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txtusuario.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtusuario.setCaretColor(new java.awt.Color(204, 204, 204));
        txtusuario.setMaterialDesing(true);
        txtusuario.setPlaceholder("Ingrese Usuario");
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("LOGIN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 110, 40));

        txtclave.setForeground(new java.awt.Color(0, 0, 0));
        txtclave.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txtclave.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtclave.setCaretColor(new java.awt.Color(204, 204, 204));
        txtclave.setMaterialDesing(true);
        txtclave.setPlaceholder("Ingrese Contraseña");
        jPanel1.add(txtclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Usuario");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("LanCenter TubiNet");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Bienvenido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 300, 410));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/66191919_1247596368751055_2338073435940323328_n.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       validar();
    }//GEN-LAST:event_btnIngresarActionPerformed

                                     
   
    
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
            java.util.logging.Logger.getLogger(LoginTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginTienda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginTienda().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private LIB.FSPasswordFieldMD txtclave;
    private LIB.FSTexFieldMD txtusuario;
    // End of variables declaration//GEN-END:variables
public void validar(){ 
        
        String user = txtusuario.getText();
        String dni = txtclave.getText();
        
        
        
        try {
            
            String sql="select * from r_empleado where usuario='"+user+"' and dni='"+dni+"'";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            if(rs.next()){
                user = rs.getString("usuario");
                dni=rs.getString("dni");
          
                empleado = empleadodao.iniciarSesion(user, dni);
            
                if (empleado.getUsuario() != null && empleado.getDni() != null) {
                privilegio=rs.getString("privilegio");
                
                 switch(privilegio){
                    case "Administrador": 
                    JOptionPane.showMessageDialog(null, "Bienvenido Administrador :"+user);
                    frmPrincipalAdministrador frm = new frmPrincipalAdministrador();
                    frm.setVisible(true);
                    this.dispose();
                    break;
                    
                    case "Empleado":
                    JOptionPane.showMessageDialog(null, "Bienvenido Colaborador :"+user);
                    frmPrincipalEmpleado abc = new frmPrincipalEmpleado();
                    abc.setVisible(true);
                    this.dispose();
                    break;
                 } 
            } else {
                JOptionPane.showMessageDialog(this, "Datos incorrectos");
                txtusuario.requestFocus();}
                }
            
    } catch (Exception e) {
    }
        
            }
                 }
 


