/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui.FramesAux;

import Gui.MainFrame;
import Obj.Abono;
import Obj.Empleado;
import Obj.Kardex;
import Obj.Venta;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dildo__Queen
 */
public class RealizarAbonoVentaExistente extends javax.swing.JFrame {

    private MainFrame appRun;
    private Venta vnt;
    private Empleado empld;
    private Kardex krdx = null;
    private DetalleVenta dv = null;

    /**
     *
     * @param app
     * @param venta
     * @param empleado
     */
    public RealizarAbonoVentaExistente(MainFrame app, Venta venta, Empleado empleado, Kardex kardex) {
        this.appRun = app;
        this.empld = empleado;
        this.vnt = venta;
        this.krdx = kardex;
        initComponents();
        init();
    }

    /**
     *
     * @param app
     * @param venta
     * @param empleado
     * @param kardex
     * @param detalleVenta
     */
    public RealizarAbonoVentaExistente(MainFrame app, Venta venta, Empleado empleado, Kardex kardex, DetalleVenta detalleVenta) {
        this.appRun = app;
        this.empld = empleado;
        this.vnt = venta;
        this.krdx = kardex;
        this.dv = detalleVenta;
        initComponents();
        init();
    }

    public void init() {
        Image icon = new ImageIcon(getClass().getResource("/Media/003.png")).getImage();
        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        this.txtfFecha.setText(f.format(new Date()));
        this.txtfEmpleadoId.setText(this.empld.getIdentificacion());
        this.txtfEmpleadoNombre.setText(this.empld.getNombre());
        this.txtfIdVenta.setText(this.vnt.getId() + "");
        this.txtfTotal.setValue(this.vnt.getSubtotal());
        this.txtfSaldo.setValue(this.vnt.getSaldoPorPagar());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFecha = new javax.swing.JLabel();
        lblEmpleadoId = new javax.swing.JLabel();
        lblEmpleadoNombre = new javax.swing.JLabel();
        txtfFecha = new javax.swing.JTextField();
        txtfEmpleadoId = new javax.swing.JTextField();
        txtfEmpleadoNombre = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblIdVenta = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        lblAbono = new javax.swing.JLabel();
        txtfIdVenta = new javax.swing.JTextField();
        txtfTotal = new javax.swing.JFormattedTextField();
        txtfSaldo = new javax.swing.JFormattedTextField();
        txtfAbono = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Realizar abono");
        setMinimumSize(new java.awt.Dimension(505, 279));

        lblFecha.setText("Fecha:");

        lblEmpleadoId.setText("Id Empleado:");

        lblEmpleadoNombre.setText("Nombre Empleado:");

        txtfFecha.setFocusable(false);

        txtfEmpleadoId.setFocusable(false);

        txtfEmpleadoNombre.setFocusable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Abono"));

        lblIdVenta.setText("IdVenta:");

        lblTotal.setText("Total:");

        lblSaldo.setText("Saldo actual:");

        lblAbono.setText("Abono:");

        txtfIdVenta.setFocusable(false);

        txtfTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤########################,##0.##"))));
        txtfTotal.setFocusable(false);

        txtfSaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("¤########################,##0.##"))));
        txtfSaldo.setFocusable(false);

        txtfAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvtAceptar(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSaldo)
                    .addComponent(lblIdVenta)
                    .addComponent(lblAbono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtfIdVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtfTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(txtfAbono, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                        .addGap(197, 197, 197)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdVenta)
                    .addComponent(txtfIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal)
                    .addComponent(txtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldo)
                    .addComponent(txtfSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbono)
                    .addComponent(txtfAbono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvtAceptar(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvtCancelar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmpleadoId)
                            .addComponent(lblFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtfEmpleadoId, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblEmpleadoNombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtfEmpleadoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtfFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpleadoId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfEmpleadoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpleadoNombre)
                    .addComponent(txtfEmpleadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EvtAceptar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvtAceptar
        try {
            Double abono = new Double(this.txtfAbono.getText());
            this.vnt.add(new Abono(new Date(), this.empld, abono));
            appRun.rVenta.txtfSaldo.setValue(this.vnt.getSaldoPorPagar());
            if (dv != null) {
                dv.txtfSaldo.setValue(vnt.getSaldoPorPagar());
            }
            // pls help
            try {
                krdx.edit(this.vnt);
            } catch (Exception e) {
                e.printStackTrace();
            }
            // pls help
        } catch (Exception ex) {
            Logger.getLogger(RealizarAbonoVentaExistente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.appRun.vents.updateUI();
        this.dispose();
    }//GEN-LAST:event_EvtAceptar

    private void EvtCancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvtCancelar
        this.dispose();
    }//GEN-LAST:event_EvtCancelar

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAbono;
    private javax.swing.JLabel lblEmpleadoId;
    private javax.swing.JLabel lblEmpleadoNombre;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblIdVenta;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtfAbono;
    private javax.swing.JTextField txtfEmpleadoId;
    private javax.swing.JTextField txtfEmpleadoNombre;
    private javax.swing.JTextField txtfFecha;
    private javax.swing.JTextField txtfIdVenta;
    private javax.swing.JFormattedTextField txtfSaldo;
    private javax.swing.JFormattedTextField txtfTotal;
    // End of variables declaration//GEN-END:variables
}
