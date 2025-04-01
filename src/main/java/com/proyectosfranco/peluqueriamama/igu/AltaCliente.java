package com.proyectosfranco.peluqueriamama.igu;

import com.mysql.cj.xdevapi.Result;
import com.proyectosfranco.peluqueriamama.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AltaCliente extends javax.swing.JFrame {

    public AltaCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreClienteAlta = new javax.swing.JTextField();
        apellidoClienteAlta = new javax.swing.JTextField();
        telefonoClienteAlta = new javax.swing.JTextField();
        emailClienteAlta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombreClienteAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteAltaActionPerformed(evt);
            }
        });

        apellidoClienteAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoClienteAltaActionPerformed(evt);
            }
        });

        telefonoClienteAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoClienteAltaActionPerformed(evt);
            }
        });

        emailClienteAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailClienteAltaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("ALTA USUARIO");

        jLabel2.setText("Nombre ");

        jLabel3.setText("Apellido:");

        jLabel4.setText("Telefono");

        jLabel5.setText("Email");

        jButton1.setText("Dar Alta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailClienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoClienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoClienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreClienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreClienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellidoClienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonoClienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailClienteAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreClienteAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteAltaActionPerformed

    private void apellidoClienteAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoClienteAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoClienteAltaActionPerformed

    private void telefonoClienteAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoClienteAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoClienteAltaActionPerformed

    private void emailClienteAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailClienteAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailClienteAltaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombreCliente = nombreClienteAlta.getText();
        String apellidoCliente = apellidoClienteAlta.getText();
        String telefonoCliente = telefonoClienteAlta.getText();
        String emailCliente = emailClienteAlta.getText();
        
        if(nombreCliente.isEmpty() || apellidoCliente.isEmpty() || telefonoCliente.isEmpty()){
          JOptionPane.showMessageDialog(null, "Ingrese todos los datos requeridos obligatorios!");
        }
        else{
            try(Connection conn = ConexionBD.getConnection()){
            String altaCliente = "INSERT INTO clientes(nombre, apellido, telefono, email) VALUES (?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(altaCliente);
            
            ps.setString(1, nombreCliente);
            ps.setString(2, apellidoCliente);
            ps.setString(3, telefonoCliente);
            ps.setString(4, emailCliente);
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente agregado exitosamente!");
            
            } catch (SQLException ex) {
                Logger.getLogger(AltaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoClienteAlta;
    private javax.swing.JTextField emailClienteAlta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nombreClienteAlta;
    private javax.swing.JTextField telefonoClienteAlta;
    // End of variables declaration//GEN-END:variables
}