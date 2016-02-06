/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui.FramesAux;

import Gui.MainFrame;
import Obj.Empleado;
import Obj.Item;
import Obj.Kardex;
import Obj.Venta;
import java.awt.Image;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Dildo__Queen
 */
public class DetalleVenta extends javax.swing.JFrame {

    private MainFrame appRun;
    private Venta vnt;
    private Empleado empld;
    private Kardex krdx = null;

    /**
     *
     * @param mainFrame
     * @param venta
     * @param empleado
     * @param kardex
     */
    public DetalleVenta(MainFrame mainFrame, Venta venta, Empleado empleado, Kardex kardex) {
        this.appRun = mainFrame;
        this.vnt = venta;
        this.empld = empleado;
        this.krdx = kardex;
        initComponents();
        init();
    }

    public void init() {
        Image icon = new ImageIcon(getClass().getResource("/Media/003.png")).getImage();
        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
        tblDetalle.setModel(new AbstractTableModel() {
            String[] nmColumnas = {"Codigo", "Nombre", "Cantidad", "Valor unitario", "Subtotal"};

            @Override
            public String getColumnName(int column) {
                return nmColumnas[column];
            }

            @Override
            public int getRowCount() {
                if (vnt.getItems().isEmpty()) {
                    return 0;
                }
                return vnt.getItems().size();
            }

            @Override
            public int getColumnCount() {
                return nmColumnas.length;
            }

            @Override
            public Object getValueAt(int rowIndex, int columnIndex) {
                Item itmp = vnt.getItems().get(rowIndex);
                if (columnIndex == 0) {
                    return itmp.getProducto().getCodigo();
                } else if (columnIndex == 1) {
                    return itmp.getProducto().getNombre();
                } else if (columnIndex == 2) {
                    return itmp.getCantidad();
                } else if (columnIndex == 3) {
                    return itmp.getProducto().getCosto();
                } else if (columnIndex == 4) {
                    return itmp.getSubtotal();
                }
                return "";
            }
        });
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        this.setTitle("Detalle venta No." + vnt.getId() + '(' + s.format(vnt.getFecha()) + ')');
        txtfVentaId.setText(vnt.getId() + "");
        txtfFecha.setText(s.format(vnt.getFecha()));
        txtfCliente.setText(vnt.getCliente().toString());
        txtfEmpleado.setText(vnt.getVendedor().toString());
        txtfTotal.setValue(vnt.getSubtotal());
        txtfSaldo.setValue(vnt.getSaldoPorPagar());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVentaId = new javax.swing.JLabel();
        lblFechaVenta = new javax.swing.JLabel();
        lblCliente = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        txtfVentaId = new javax.swing.JTextField();
        txtfFecha = new javax.swing.JTextField();
        txtfCliente = new javax.swing.JTextField();
        txtfEmpleado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalle = new javax.swing.JTable();
        btnNuevoAbono = new javax.swing.JButton();
        txtfTotal = new javax.swing.JFormattedTextField();
        txtfSaldo = new javax.swing.JFormattedTextField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 470));

        lblVentaId.setText("IdVenta:");

        lblFechaVenta.setText("Fecha de venta:");

        lblCliente.setText("Cliente:");

        lblVendedor.setText("Vendedor:");

        lblTotal.setText("Total:");

        lblSaldo.setText("Saldo:");

        tblDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDetalle);

        btnNuevoAbono.setText("Nuevo abono");
        btnNuevoAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvtNuevoSaldo(evt);
            }
        });

        txtfTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤########################,##0.##"))));
        txtfTotal.setFocusable(false);

        txtfSaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤########################,##0.##"))));
        txtfSaldo.setFocusable(false);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvtSalir(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(lblVentaId))
                            .addComponent(lblCliente, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtfVentaId)
                                .addGap(18, 18, 18)
                                .addComponent(lblFechaVenta)
                                .addGap(18, 18, 18)
                                .addComponent(txtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblVendedor)
                        .addGap(18, 18, 18)
                        .addComponent(txtfEmpleado))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSaldo)
                                    .addComponent(lblTotal))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1))
                                    .addComponent(txtfSaldo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevoAbono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVentaId)
                    .addComponent(txtfVentaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaVenta)
                    .addComponent(txtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(txtfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor)
                    .addComponent(txtfEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(txtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo)
                    .addComponent(txtfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoAbono)
                    .addComponent(btnSalir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EvtNuevoSaldo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvtNuevoSaldo
        new RealizarAbonoVentaExistente(appRun, vnt, empld, krdx, this).setVisible(true);
    }//GEN-LAST:event_EvtNuevoSaldo

    private void EvtSalir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvtSalir
        this.dispose();
    }//GEN-LAST:event_EvtSalir

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevoAbono;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblFechaVenta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblVendedor;
    private javax.swing.JLabel lblVentaId;
    private javax.swing.JTable tblDetalle;
    private javax.swing.JTextField txtfCliente;
    private javax.swing.JTextField txtfEmpleado;
    private javax.swing.JTextField txtfFecha;
    public javax.swing.JFormattedTextField txtfSaldo;
    private javax.swing.JFormattedTextField txtfTotal;
    private javax.swing.JTextField txtfVentaId;
    // End of variables declaration//GEN-END:variables
}