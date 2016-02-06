/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui.InitApp;

import Gui.Login;
import Obj.Kardex;
import java.awt.Image;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dildo__Queen
 */
public class CrearInstancia extends javax.swing.JFrame {

    private String pathName = null;
    public boolean NonStatus = true;
    public String NombreIstancia = null;
    public String IdEmpleado = null;
    public String NombreEmpleado = null;

    /**
     *
     * @param ruta
     */
    public CrearInstancia(String ruta) {
        BufferedWriter bw = null;
        try {
            this.pathName = ruta;
            initComponents();
            bw = new BufferedWriter(new FileWriter(pathName));
            Image icon = new ImageIcon(getClass().getResource("/Media/001.png")).getImage();
            this.setIconImage(icon);
            this.setLocationRelativeTo(null);
        } catch (IOException ex) {
            Logger.getLogger(CrearInstancia.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bw.close();
            } catch (IOException ex) {
                Logger.getLogger(CrearInstancia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getNombreIstancia() {
        return NombreIstancia;
    }

    public String getIdEmpleado() {
        return IdEmpleado;
    }

    public String getNombreEmpleado() {
        return NombreEmpleado;
    }

    public boolean isNonStatus() {
        return NonStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreEmpresa = new javax.swing.JLabel();
        txtfNombreEmpresa = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblEmpleadoId = new javax.swing.JLabel();
        lblEmpleadoNombre = new javax.swing.JLabel();
        txtfEmpleadoId = new javax.swing.JTextField();
        txtfEmpleadoNombre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear instacia Kardex");

        lblNombreEmpresa.setText("Nombre del negocio:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Primer empleado"));

        lblEmpleadoId.setText("Identificacion del Empleado:");

        lblEmpleadoNombre.setText("Nombre del Empleado:");

        txtfEmpleadoId.setEnabled(false);

        txtfEmpleadoNombre.setEnabled(false);
        txtfEmpleadoNombre.addActionListener(new java.awt.event.ActionListener() {
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
                    .addComponent(lblEmpleadoNombre)
                    .addComponent(lblEmpleadoId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfEmpleadoId)
                    .addComponent(txtfEmpleadoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpleadoId)
                    .addComponent(txtfEmpleadoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpleadoNombre)
                    .addComponent(txtfEmpleadoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreEmpresa)
                        .addGap(18, 18, 18)
                        .addComponent(txtfNombreEmpresa))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEmpresa)
                    .addComponent(txtfNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EvtAceptar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvtAceptar
        NombreIstancia = txtfNombreEmpresa.getText();
        ObjectOutputStream oos = null;
        String emprs = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(pathName));
            emprs = new String(NombreIstancia);
            oos.writeObject(emprs);
        } catch (Exception e) {
            Logger.getLogger(CrearInstancia.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(CrearInstancia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.setVisible(false);
        try {
            new Login(new Kardex(emprs)).setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(CrearInstancia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EvtAceptar

    private void EvtCancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvtCancelar
        String ms = "Operacion cancelada";
        JOptionPane.showMessageDialog(rootPane, ms, "Crear instancia", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_EvtCancelar

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmpleadoId;
    private javax.swing.JLabel lblEmpleadoNombre;
    private javax.swing.JLabel lblNombreEmpresa;
    private javax.swing.JTextField txtfEmpleadoId;
    private javax.swing.JTextField txtfEmpleadoNombre;
    private javax.swing.JTextField txtfNombreEmpresa;
    // End of variables declaration//GEN-END:variables
}
