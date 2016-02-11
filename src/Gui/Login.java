/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import Conect.ConexionCliente;
import Obj.Empleado;
import Obj.Kardex;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Dildo__Queen
 */
public class Login extends javax.swing.JFrame {

    private Kardex krdx = null;
    private int op = -1;
    private ConexionCliente conex = null;

    /**
     *
     * @param kardex
     */
    public Login(Kardex kardex) {
        this.krdx = kardex;
        String clienteID = System.getProperty("user.name");
        conex = new ConexionCliente(5000, "127.0.0.1", clienteID, this);
        conex.start();
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/Media/002.png")).getImage();
        this.setIconImage(icon);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUserId = new javax.swing.JLabel();
        lblUserPassword = new javax.swing.JLabel();
        txtfUserId = new javax.swing.JTextField();
        txtfUserPassword = new javax.swing.JPasswordField();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(351, 121));

        lblUserId.setText("User Id:");

        lblUserPassword.setText("User Password:");

        txtfUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvtAceptar(evt);
            }
        });

        txtfUserPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvtAceptar(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evtCancelar(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EvtAceptar(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUserPassword)
                            .addComponent(lblUserId))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfUserPassword)
                            .addComponent(txtfUserId, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserId)
                    .addComponent(txtfUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserPassword)
                    .addComponent(txtfUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void evtCancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evtCancelar
        System.exit(0);
    }//GEN-LAST:event_evtCancelar

    private void EvtAceptar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EvtAceptar
        try {

            String nm = txtfUserId.getText().trim();
            String ps = new String(txtfUserPassword.getPassword());
            if (op == 0) {
                this.krdx.add(new Empleado(nm, nm, ps));
                JOptionPane.showMessageDialog(null, "Se ha creado el usuario satisfactoriamente");
                op = -1;

            }
                    System.out.println("LLego a piso 1");
            conex.enviarTrama(2, new Empleado("001", nm, ps));
            System.out.println("Error trama paso");
            //Aqui se espera la respuesta del servidor para el logueo
            if (conex.logueo()) {
                JOptionPane.showMessageDialog(this, "Se LOGUEO EXITOSAMENTE");
            } else {
                JOptionPane.showMessageDialog(this, "ACCES DENIED");
            }

//            new MainFrame(this.krdx, this.krdx.accesoEmpleado(nm, ps)).setVisible(true);
            this.txtfUserId.setText("");
            this.txtfUserPassword.setText("");
            this.setVisible(false);
            //*******************************
            //COmentado porque es reusable con la conexion al servidor ########
//            ##############################
//        } catch (NonexistentEntityException ex) {
//            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
//             op= JOptionPane.showConfirmDialog(rootPane, ex.getMessage() + " Desea crear el usuario?", this.krdx.getNombre() + "Error", JOptionPane.ERROR_MESSAGE);
//            if(op==0) {
//                JOptionPane.showMessageDialog(null, "vamos a crear el usuario, por favor introduce en los mismos campos el usuario y la contraseña");
//                
//            }else{
//                //nada por ahora 
//            }
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), this.krdx.getNombre() + "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EvtAceptar


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserPassword;
    private javax.swing.JTextField txtfUserId;
    private javax.swing.JPasswordField txtfUserPassword;
    // End of variables declaration//GEN-END:variables
}
