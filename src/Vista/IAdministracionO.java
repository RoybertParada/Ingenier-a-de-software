
package Vista;

import Controlador.CtrlControlador;
import Controlador.CtrlObras;


public class IAdministracionO extends javax.swing.JFrame {

    CtrlControlador controlador; 
    public IAdministracionO() { /* Incialización de la interfaz de administracion de obras. */
        initComponents(); 
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Administrar Obras de arte");

        if(CtrlObras.getInstancia().getObrasArray().size() <= 0){
           botonEliminarObra.setEnabled(false); /* Se deshabilita la eliminación de obras en caso de que no hayan obras en el arreglo de obras. */
           botonModificarObra.setEnabled(false); /* Se deshabilita la modificación de obras en caso de que no hayan obras en el arreglo de obras. */
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        botonModificarObra = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        botonEliminarObra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Administración de Obras de arte");

        jButton1.setBackground(new java.awt.Color(246, 246, 246));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_md.png"))); // NOI18N
        jButton1.setText("Agregar Obra de Arte");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonModificarObra.setBackground(new java.awt.Color(246, 246, 246));
        botonModificarObra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar_md.png"))); // NOI18N
        botonModificarObra.setText("Modificar Obra de arte ");
        botonModificarObra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarObra.setFocusPainted(false);
        botonModificarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarObraActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(246, 246, 246));
        jButton3.setText("Finalizar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        botonEliminarObra.setBackground(new java.awt.Color(246, 246, 246));
        botonEliminarObra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_md.png"))); // NOI18N
        botonEliminarObra.setText("Eliminar Obra de arte");
        botonEliminarObra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEliminarObra.setFocusPainted(false);
        botonEliminarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarObraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEliminarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(20, 20, 20)
                .addComponent(botonModificarObra)
                .addGap(26, 26, 26)
                .addComponent(botonEliminarObra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        controlador.getInstancia().opcionSeleccionada("agregarO",this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonModificarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarObraActionPerformed
        controlador.getInstancia().opcionSeleccionada("ModificarO",this);
    }//GEN-LAST:event_botonModificarObraActionPerformed
    
                 
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       IAdministracion administracion = new IAdministracion();
       administracion.setVisible(true); 
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void botonEliminarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarObraActionPerformed
       controlador.getInstancia().opcionSeleccionada("EliminarO",this);  
    }//GEN-LAST:event_botonEliminarObraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarObra;
    private javax.swing.JButton botonModificarObra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
