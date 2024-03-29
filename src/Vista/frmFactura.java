/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;



import Modelo.dao.ClienteDao;
import Modelo.dao.DetalleDao;
import Modelo.dao.FacturaDao;
import Modelo.dao.ProductoDao;
import Modelo.entidad.Cliente;


import Modelo.entidad.Detalle;
import Modelo.entidad.Factura;
import Modelo.entidad.Producto;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static Vista.frmPrincipalAdministrador.jDesktopPanePrincipal;


/**
 *
 * @author PERSONAL
 */
public class frmFactura extends javax.swing.JInternalFrame {
    ClienteDao clienteDao = new ClienteDao();
    Cliente cliente = new Cliente();
   

    ProductoDao productoDAO = new ProductoDao();
    Producto producto = new Producto();

    FacturaDao facturaDAO = new FacturaDao();
    Factura factura = new Factura();

    DetalleDao detalledao = new DetalleDao();
    Detalle detalle = new Detalle();

    DefaultTableModel defaultTableModel = new DefaultTableModel();

    Calendar calendar = new GregorianCalendar();
    
    public static String FacturaRegistrada = "";

    public frmFactura() {
        initComponents();
        idVenta();
        llenarComboProducto();
        fechaActual();
        txtid_vendedor.setText(""+LoginTienda.empleado.getId_empleado());
        lblempleado.setText(""+LoginTienda.empleado.getUsuario());
        
    }
    
    void llenarComboProducto() {
        ArrayList<String> lista = new ArrayList<String>();
        lista = productoDAO.listarProducto();
        for (int i = 0; i < lista.size(); i++) {
            cbProductos.addItem(lista.get(i));
        }
         }
    
    void fechaActual() {
        txtfecha.setText("" + calendar.get(Calendar.YEAR) + "-" + calendar.get(Calendar.MONTH) + "-" + calendar.get(Calendar.DAY_OF_MONTH));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtruc = new LIB.FSTexFieldMD();
        jLabel5 = new javax.swing.JLabel();
        txttotal = new LIB.FSTexFieldMD();
        txtproducto = new LIB.FSTexFieldMD();
        cbProductos = new javax.swing.JComboBox<>();
        btnIngresar = new LIB.FSButtonMD();
        txtrazonsocial = new LIB.FSTexFieldMD();
        txtnombrep = new LIB.FSTexFieldMD();
        txtprecio = new LIB.FSTexFieldMD();
        txtcantidad = new LIB.FSTexFieldMD();
        jLabel8 = new javax.swing.JLabel();
        txtstock = new LIB.FSTexFieldMD();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblfactura = new javax.swing.JLabel();
        txtrazon2 = new LIB.FSTexFieldMD();
        jLabel1 = new javax.swing.JLabel();
        lblboleta = new javax.swing.JLabel();
        lblempleado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();
        txtfecha = new LIB.FSTexFieldMD();
        btnRegistrar = new LIB.FSButtonMD();
        btnNuevo = new LIB.FSButtonMD();
        jLabel10 = new javax.swing.JLabel();
        btnAgregar = new LIB.FSButtonMD();
        txtid_vendedor = new LIB.FSTexFieldMD();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtruc.setForeground(new java.awt.Color(0, 0, 0));
        txtruc.setToolTipText("");
        txtruc.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txtruc.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtruc.setCaretColor(new java.awt.Color(204, 204, 204));
        txtruc.setMaterialDesing(true);
        txtruc.setPlaceholder("Ingrese Ruc");
        jPanel1.add(txtruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Ruc");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txttotal.setForeground(new java.awt.Color(0, 0, 0));
        txttotal.setToolTipText("");
        txttotal.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txttotal.setBordeColorNoFocus(new java.awt.Color(255, 0, 0));
        txttotal.setCaretColor(new java.awt.Color(255, 0, 0));
        txttotal.setMaterialDesing(true);
        txttotal.setPlaceholder("Total");
        jPanel1.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, 120, -1));

        txtproducto.setForeground(new java.awt.Color(0, 0, 0));
        txtproducto.setToolTipText("");
        txtproducto.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txtproducto.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtproducto.setCaretColor(new java.awt.Color(204, 204, 204));
        txtproducto.setMaterialDesing(true);
        txtproducto.setPlaceholder("");
        jPanel1.add(txtproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 40, -1));

        cbProductos.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        cbProductos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbProductosItemStateChanged(evt);
            }
        });
        jPanel1.add(cbProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 200, 40));

        btnIngresar.setBackground(new java.awt.Color(255, 0, 0));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_26px.png"))); // NOI18N
        btnIngresar.setColorNormal(new java.awt.Color(255, 0, 0));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 50, -1));

        txtrazonsocial.setForeground(new java.awt.Color(0, 0, 0));
        txtrazonsocial.setToolTipText("");
        txtrazonsocial.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txtrazonsocial.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtrazonsocial.setCaretColor(new java.awt.Color(204, 204, 204));
        txtrazonsocial.setMaterialDesing(true);
        txtrazonsocial.setPlaceholder("Ingrese Razon Social");
        jPanel1.add(txtrazonsocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        txtnombrep.setForeground(new java.awt.Color(0, 0, 0));
        txtnombrep.setToolTipText("");
        txtnombrep.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txtnombrep.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtnombrep.setCaretColor(new java.awt.Color(204, 204, 204));
        txtnombrep.setMaterialDesing(true);
        txtnombrep.setPlaceholder("Producto");
        jPanel1.add(txtnombrep, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, -1));

        txtprecio.setForeground(new java.awt.Color(0, 0, 0));
        txtprecio.setToolTipText("");
        txtprecio.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txtprecio.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtprecio.setCaretColor(new java.awt.Color(204, 204, 204));
        txtprecio.setMaterialDesing(true);
        txtprecio.setPlaceholder("Precio");
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        txtcantidad.setForeground(new java.awt.Color(0, 0, 0));
        txtcantidad.setToolTipText("");
        txtcantidad.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txtcantidad.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtcantidad.setCaretColor(new java.awt.Color(204, 204, 204));
        txtcantidad.setMaterialDesing(true);
        txtcantidad.setPlaceholder("Ingrese Cantidad");
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Cantidad");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        txtstock.setForeground(new java.awt.Color(0, 0, 0));
        txtstock.setToolTipText("");
        txtstock.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txtstock.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtstock.setCaretColor(new java.awt.Color(204, 204, 204));
        txtstock.setMaterialDesing(true);
        txtstock.setPlaceholder("Stock");
        jPanel1.add(txtstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Razon Social");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfactura.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        lblfactura.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtrazon2.setForeground(new java.awt.Color(0, 0, 0));
        txtrazon2.setToolTipText("");
        txtrazon2.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txtrazon2.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtrazon2.setCaretColor(new java.awt.Color(204, 204, 204));
        txtrazon2.setMaterialDesing(true);
        txtrazon2.setPlaceholder("Ingrese Razon Social");
        jPanel2.add(txtrazon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("N Factura:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        lblboleta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblboleta.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblboleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 90, 20));

        lblempleado.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        lblempleado.setForeground(new java.awt.Color(204, 204, 204));
        lblempleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(lblempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 102, 32));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Colaborador");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_delete_26px_1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LAN CENTER TUBINET");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 790, 140));

        jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID PRODUCTO", "RUC", "RAZON SOCIAL", "PRODUCTO", "CANTIDAD", "PRECIO", "TOTAL"
            }
        ));
        jScrollPane1.setViewportView(jtabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 740, 130));

        txtfecha.setForeground(new java.awt.Color(0, 0, 0));
        txtfecha.setToolTipText("");
        txtfecha.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txtfecha.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtfecha.setCaretColor(new java.awt.Color(204, 204, 204));
        txtfecha.setMaterialDesing(true);
        txtfecha.setPlaceholder("Fecha");
        jPanel1.add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 130, -1));

        btnRegistrar.setBackground(new java.awt.Color(255, 0, 0));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setColorNormal(new java.awt.Color(255, 0, 0));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 110, -1));

        btnNuevo.setBackground(new java.awt.Color(255, 0, 0));
        btnNuevo.setText("Eliminar");
        btnNuevo.setColorNormal(new java.awt.Color(255, 0, 0));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 110, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Stock");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, -1, -1));

        btnAgregar.setBackground(new java.awt.Color(255, 0, 0));
        btnAgregar.setText("Agregar");
        btnAgregar.setColorNormal(new java.awt.Color(255, 0, 0));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 110, -1));

        txtid_vendedor.setForeground(new java.awt.Color(0, 0, 0));
        txtid_vendedor.setToolTipText("");
        txtid_vendedor.setBordeColorFocus(new java.awt.Color(251, 204, 52));
        txtid_vendedor.setBordeColorNoFocus(new java.awt.Color(204, 204, 204));
        txtid_vendedor.setCaretColor(new java.awt.Color(204, 204, 204));
        txtid_vendedor.setMaterialDesing(true);
        txtid_vendedor.setPlaceholder("ID Vendedor");
        jPanel1.add(txtid_vendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Producto");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("ID Vendedor");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Precio");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Producto");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
         buscarProducto();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
         int respuesta;
        if (txttotal.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Agregar producto");
        } else {
            respuesta = JOptionPane.showConfirmDialog(this, "¿Comprar?");
            if (respuesta == 0) {
            registrarVenta();
            registrarDetalleVenta();
            reporteVenta();
            actualizarStock();
            limpiarFormulario();
            limpiarTabla();
            idVenta();
            frmReporteFactura reporteVenta = new frmReporteFactura();
            CentrarVentana(reporteVenta);
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
             int respuesta;
        respuesta = JOptionPane.showConfirmDialog(this, "¿Cancelar?");
        if (respuesta == 0) {
            limpiarFormulario();
            limpiarTabla();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       agregarProducto();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cbProductosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbProductosItemStateChanged
         String nombreProducto = cbProductos.getSelectedItem().toString();
        int respuesta;
        if (nombreProducto.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresar código");
        } else {
            producto = productoDAO.buscarProducto(nombreProducto);
            if (producto.getId_producto() != 0) {
                txtnombrep.setText(producto.getNombre());
                txtprecio.setText("" + producto.getPrecio());
                txtstock.setText("" + producto.getStock());
                txtcantidad.requestFocus();
            } else {
                respuesta = JOptionPane.showConfirmDialog(this, "No registrado. ¿Desea registrar?");
                if (respuesta == 0) {
                    Productos productoForm = new Productos();
                    centrarVentana(productoForm);
                }
            }
        }
    }//GEN-LAST:event_cbProductosItemStateChanged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked
void idVenta() {
        int ultimaSerieVenta = facturaDAO.IdFactura();
        int idVenta = 0;
        if (ultimaSerieVenta >= 0) {
            idVenta = ultimaSerieVenta;
            lblboleta.setText("00000" + (idVenta + 1));
        } else {
            lblboleta.setText("000001");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD btnAgregar;
    private LIB.FSButtonMD btnIngresar;
    private LIB.FSButtonMD btnNuevo;
    private LIB.FSButtonMD btnRegistrar;
    private javax.swing.JComboBox<String> cbProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabla;
    private javax.swing.JLabel lblboleta;
    private javax.swing.JLabel lblempleado;
    private javax.swing.JLabel lblfactura;
    private LIB.FSTexFieldMD txtcantidad;
    private LIB.FSTexFieldMD txtfecha;
    private LIB.FSTexFieldMD txtid_vendedor;
    private LIB.FSTexFieldMD txtnombrep;
    private LIB.FSTexFieldMD txtprecio;
    private LIB.FSTexFieldMD txtproducto;
    private LIB.FSTexFieldMD txtrazon2;
    private LIB.FSTexFieldMD txtrazonsocial;
    private LIB.FSTexFieldMD txtruc;
    private LIB.FSTexFieldMD txtstock;
    private LIB.FSTexFieldMD txttotal;
    // End of variables declaration//GEN-END:variables
  void centrarVentana(JInternalFrame form) {
        frmPrincipalAdministrador.jDesktopPanePrincipal.add(form);
        Dimension dimensionPrincipal = frmPrincipalAdministrador.jDesktopPanePrincipal.getSize();
        Dimension dimensionVentasForm = form.getSize();
        form.setLocation((dimensionPrincipal.width - dimensionVentasForm.width) / 2, (dimensionPrincipal.height - dimensionVentasForm.height) / 2);
        form.show();
    }
    
    void CentrarVentana(JInternalFrame form) {
        jDesktopPanePrincipal.add(form);
        Dimension dimensionPrincipal = jDesktopPanePrincipal.getSize();
        Dimension dimensionVentasForm = form.getSize();
        form.setLocation((dimensionPrincipal.width - dimensionVentasForm.width) / 2, (dimensionPrincipal.height - dimensionVentasForm.height) / 2);
        form.show();
    }
   
    
    void buscarProducto() {
        String id = txtproducto.getText();
        int respuesta;
        if (txtproducto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresar código");
        } else {
            producto = productoDAO.buscarId(Integer.parseInt(id));
            if (producto.getId_producto() != 0) {
                txtnombrep.setText(producto.getNombre());
                txtprecio.setText("" + producto.getPrecio());
                txtstock.setText("" + producto.getStock());
                txtcantidad.requestFocus();
            } else {
                respuesta = JOptionPane.showConfirmDialog(this, "No registrado. ¿Desea registrar?");
                if (respuesta == 0) {
                    Productos p = new Productos();
                    centrarVentana(p);
                }
            }
        }
}
    
 void agregarProducto() {
        double subTotal = 0;
        ArrayList lista = new ArrayList();
        defaultTableModel = (DefaultTableModel) jtabla.getModel();
        String RUC = txtruc.getText();
        String razonsocial = txtrazonsocial.getText();

        int id_producto = producto.getId_producto();
        String nombre_producto = producto.getNombre();
        int cantidad = Integer.parseInt(txtcantidad.getText());
        double precio_producto = producto.getPrecio();
        subTotal = cantidad * precio_producto;

        int stock_producto = Integer.parseInt(txtstock.getText());
        //String estado_producto;

        if (RUC.equals("")) {
            JOptionPane.showMessageDialog(this, "ingresar ruc");
        } else {
            if (cantidad > 0) {
                if ((stock_producto-cantidad) >= 0) {
                    lista.add(id_producto);
                    lista.add(RUC);
                    lista.add(razonsocial);
                    lista.add(nombre_producto);
                    lista.add(cantidad);
                    lista.add(precio_producto);
                    lista.add(subTotal);
                    Object[] object = new Object[7];
                    object[0] = lista.get(0);
                    object[1] = lista.get(1);
                    object[2] = lista.get(2);
                    object[3] = lista.get(3);
                    object[4] = lista.get(4);
                    object[5] = lista.get(5);
                    object[6] = lista.get(6);
                    defaultTableModel.addRow(object);
                    jtabla.setModel(defaultTableModel);
                    totalVenta();
                } else {
                    JOptionPane.showMessageDialog(this, "No hay stock suficiente");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Escoger cantidad");
            }
        }
    } 
 
 void totalVenta() {
        double total = 0;
        int cantidad_venta = 0;
        double precio_producto = 0;
        for (int i = 0; i < jtabla.getRowCount(); i++) {
            cantidad_venta = Integer.parseInt(jtabla.getValueAt(i, 4).toString());
            precio_producto = Double.parseDouble(jtabla.getValueAt(i, 5).toString());
            total = total + (cantidad_venta * precio_producto);
        }
        txttotal.setText("" + total);
    }
    
 void registrarVenta() {
        String fecha_venta = txtfecha.getText();
        String ruc = txtruc.getText();
        String razon = txtrazonsocial.getText();
        double total_venta = Double.parseDouble(txttotal.getText());
        int id_cliente = cliente.getId_cliente();
        int id_vendedor = Integer.parseInt(txtid_vendedor.getText());

        factura.setFecha(fecha_venta);
        factura.setTotal(total_venta);
        factura.setRuc(ruc);
        factura.setRazon_social(razon);
        factura.setId_cliente(id_cliente);
        factura.setId_empleado(id_vendedor);
        facturaDAO.registrarVenta(factura);
    }
 
  void registrarDetalleVenta() {
        int venta_id_venta = facturaDAO.IdFactura();
        int cantidad_venta;
        int producto_id_producto;
        double subtotal_venta;
        for (int i = 0; i < jtabla.getRowCount(); i++) {
            
            cantidad_venta = Integer.parseInt(jtabla.getValueAt(i, 4).toString());
            producto_id_producto = Integer.parseInt(jtabla.getValueAt(i, 0).toString());
            subtotal_venta = Double.parseDouble(jtabla.getValueAt(i, 6).toString());
            
            detalle.setId_venta(venta_id_venta);
            detalle.setCantidad(cantidad_venta);
            detalle.setId_producto(producto_id_producto);
            detalle.setSub_total(subtotal_venta);
            detalledao.registrarDetalleVenta(detalle);
        }
    }
  
  void actualizarStock() {
        int id_producto;
        int cantidad_venta;
        int stock_producto;
        for (int i = 0; i < defaultTableModel.getRowCount(); i++) {
            id_producto = Integer.parseInt(jtabla.getValueAt(i, 0).toString());
            cantidad_venta = Integer.parseInt(jtabla.getValueAt(i, 4).toString());
            producto = productoDAO.buscarId(id_producto);
            stock_producto = producto.getStock() - cantidad_venta;
            productoDAO.actualizarStock(stock_producto, id_producto);
        }
    }
  
  void eliminar() {
        int fila = jtabla.getSelectedRow();
        int respuesta;
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione una fila");
        } else {
            respuesta = JOptionPane.showConfirmDialog(this, "¿Eliminar?");
            if (respuesta == 0) {
                defaultTableModel.removeRow(fila);
            }
        }
    }
  
  void limpiarTabla() {
        for (int i = (defaultTableModel.getRowCount() - 1); i >= 0; i--) {
            defaultTableModel.removeRow(i);
        }
        
        
    }
  
  void limpiarFormulario() {
        txtruc.setText("");
        txtproducto.setText("");
        cbProductos.setSelectedIndex(0);
        txtprecio.setText("");
        txtcantidad.setText("");
        txtrazonsocial.setText("");
        txtnombrep.setText("");
        txtstock.setText("");
        txtruc.requestFocus();
        txttotal.setText("");
    }
   void reporteVenta(){
        int venta_id_venta = facturaDAO.IdFactura();
        FacturaRegistrada = "";
        FacturaRegistrada += "N°: " + venta_id_venta + "\n";
        FacturaRegistrada += "RUC\t: " + txtruc.getText() + "\t\t";
        FacturaRegistrada += "Razon Social\t: " + txtrazonsocial.getText() + "\t\t";
        FacturaRegistrada += "Vendedor\t: " + LoginTienda.empleado.getNombre();
        FacturaRegistrada += "\n\nCódigo\tProducto\tCantidad\tPrecio\tSub Total\n";
        for (int i = 0; i < jtabla.getRowCount(); i++) {
            FacturaRegistrada += Integer.parseInt(jtabla.getValueAt(i, 0).toString()) + "\t";
            FacturaRegistrada += jtabla.getValueAt(i, 3).toString() + "\t";
            FacturaRegistrada += Integer.parseInt(jtabla.getValueAt(i, 4).toString()) + "\t";
            FacturaRegistrada += Double.parseDouble(jtabla.getValueAt(i, 5).toString()) + "\t";
            FacturaRegistrada += Double.parseDouble(jtabla.getValueAt(i, 6).toString()) + "\t";
            FacturaRegistrada += "\n";
        }
        FacturaRegistrada += "\t\t\tTotal\t" + txttotal.getText();
    }
}