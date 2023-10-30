/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.JOptionPane;
import modelo.DaoCliente;
import modelo.DaoSucursal;
import modelo.DtoCliente;
import modelo.DtoSucursal;

/**
 *
 * @author Lenovo
 */
public class VAccionSucursal extends javax.swing.JFrame {

    /**
     * Creates new form FrmInternalCrearCliente
     */
    int accion = 0; // Accion a relizar: 0 = Crear, 1 = Modificar, 2 = Eliminar
    public VAccionSucursal(int accion) {
        initComponents();
        if (accion == 1) {
            this.accion = accion;
            lblTitle.setText("Modificar sucursal");
            labelCrear.setText("Modificar");
        } else if (accion == 2) {
            this.accion = accion;
            lblTitle.setText("Eliminar sucursal");
            labelCrear.setText("Eliminar");
            txtCiudad.setEnabled(false);
            txtCiudad.setText("Omite este campo");
            txtNombre.setEnabled(false);
            txtNombre.setText("Omite este campo");
        } else {
            txtId.setEnabled(false);
            txtId.setText("Omite este campo");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        top = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buttons = new javax.swing.JPanel();
        btnAccion = new javax.swing.JPanel();
        labelCrear = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnConsular = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        top.setBackground(new java.awt.Color(21, 25, 29));

        lblTitle.setFont(new java.awt.Font("SlimSansSerif", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Agregar sucursal");

        javax.swing.GroupLayout topLayout = new javax.swing.GroupLayout(top);
        top.setLayout(topLayout);
        topLayout.setHorizontalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        topLayout.setVerticalGroup(
            topLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        background.add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 50));

        jLabel1.setFont(new java.awt.Font("SlimSansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Id");

        txtId.setFont(new java.awt.Font("SlimSansSerif", 0, 12)); // NOI18N
        txtId.setBorder(null);

        txtNombre.setFont(new java.awt.Font("SlimSansSerif", 0, 12)); // NOI18N
        txtNombre.setBorder(null);

        jLabel2.setFont(new java.awt.Font("SlimSansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Nombre :");

        txtCiudad.setFont(new java.awt.Font("SlimSansSerif", 0, 12)); // NOI18N
        txtCiudad.setBorder(null);

        jLabel3.setFont(new java.awt.Font("SlimSansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Ciudad");

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contentLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34))
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 290, 340));

        buttons.setBackground(new java.awt.Color(33, 37, 41));

        btnAccion.setBackground(new java.awt.Color(21, 25, 29));
        btnAccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAccionMouseClicked(evt);
            }
        });

        labelCrear.setFont(new java.awt.Font("SlimSansSerif", 1, 14)); // NOI18N
        labelCrear.setForeground(new java.awt.Color(255, 255, 255));
        labelCrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCrear.setText("Crear");

        javax.swing.GroupLayout btnAccionLayout = new javax.swing.GroupLayout(btnAccion);
        btnAccion.setLayout(btnAccionLayout);
        btnAccionLayout.setHorizontalGroup(
            btnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAccionLayout.setVerticalGroup(
            btnAccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelCrear, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        btnRegresar.setBackground(new java.awt.Color(21, 25, 29));
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SlimSansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Regresar");

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        btnConsular.setBackground(new java.awt.Color(21, 25, 29));
        btnConsular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsularMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("SlimSansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Consultar");

        javax.swing.GroupLayout btnConsularLayout = new javax.swing.GroupLayout(btnConsular);
        btnConsular.setLayout(btnConsularLayout);
        btnConsularLayout.setHorizontalGroup(
            btnConsularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConsularLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(14, 14, 14))
        );
        btnConsularLayout.setVerticalGroup(
            btnConsularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        background.add(buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 290, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccionMouseClicked
        DaoSucursal crud = new DaoSucursal();
        DtoSucursal sucursal = new DtoSucursal();
        
        
        
        
        switch (this.accion) {
            case 0:
                sucursal.setNombre(txtNombre.getText());
                sucursal.setIdCiudad(Integer.parseInt(txtCiudad.getText()));
                if (crud.agregar(sucursal)) {
                    JOptionPane.showMessageDialog(this, "Exito: sucursal "+ txtNombre.getText() + " " + txtCiudad.getText() +" agregado con exito.");
                } else {
                    JOptionPane.showMessageDialog(this, "Error: sucursal no ha sido agregado.");
                }
                break;
            case 1:
                if (crud.modificar(sucursal)) {
                    JOptionPane.showMessageDialog(this, "Exito: sucursal modificado con exito.");
                } else {
                    JOptionPane.showMessageDialog(this, "Error: sucursal no ha sido modificado.");
                }
                break;
            case 2:
                if (crud.eliminar(Integer.parseInt(txtId.getText()))){
                    JOptionPane.showMessageDialog(this, "Exito: sucursal eliminado con exito.");
                } else {
                    JOptionPane.showMessageDialog(this, "Error: sucursal no ha sido eliminado.");
                }
                break;
        }
    }//GEN-LAST:event_btnAccionMouseClicked

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnConsularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsularMouseClicked
        DaoSucursal crud = new DaoSucursal();
        DtoSucursal sucursal = new DtoSucursal();
        sucursal.setId(Integer.parseInt(txtId.getText()));
        if (crud.consultar(sucursal)) {
            txtId.setText(String.valueOf(sucursal.getId()));
            txtNombre.setText(sucursal.getNombre());
            txtCiudad.setText(String.valueOf(sucursal.getIdCiudad()));
        } else {
            JOptionPane.showMessageDialog(this, "Error: Sucursal no encontrado en la base de datos.");
        }
    }//GEN-LAST:event_btnConsularMouseClicked

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
            java.util.logging.Logger.getLogger(VAccionSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAccionSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAccionSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAccionSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new VAccionSucursal(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnAccion;
    private javax.swing.JPanel btnConsular;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JPanel buttons;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelCrear;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel top;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
