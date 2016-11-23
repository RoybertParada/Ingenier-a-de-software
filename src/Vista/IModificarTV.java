/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtrlControlador;
import Controlador.CtrlObras;
import Controlador.CtrlPuntoDeInteres;
import Controlador.CtrlTourVirtual;
import Modelo.Obra;
import Modelo.PuntoDeInteres;
import Modelo.TourVirtual;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Jesus Antonio
 */
public class IModificarTV extends javax.swing.JFrame {

CtrlControlador controlador; 
CtrlTourVirtual controladorTv;
CtrlPuntoDeInteres controladorPI;
CtrlObras controladorObra;

private Iterator<TourVirtual> it = controladorTv.getInstancia().getToursVirtualesArray().iterator();
private Iterator<PuntoDeInteres> ite = controladorPI.getInstancia().getPuntoDeInteresArray().iterator();
private TourVirtual tour;
private PuntoDeInteres aux;
private ArrayList <PuntoDeInteres> puntoDeInteres = new ArrayList <PuntoDeInteres> (); 
private ArrayList <PuntoDeInteres> puntoDeInteresAux = new ArrayList <PuntoDeInteres> (); 
private PuntoDeInteres PI;
    /**
     * Creates new form CrearTV
     */
    public IModificarTV() {
        initComponents(); 
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Modificar Tour Virtual"); 
        
        DefaultTableModel modelo  = (DefaultTableModel) ToursVirtuales.getModel(); 
        
        while(it.hasNext()){
            tour = it.next();
            modelo.addRow(new Object[]{tour.getIdentificador(),tour.getNombre(),tour.getDisponibilidad()});           
        }
        
        while(ite.hasNext()){
            aux = ite.next();
            ComboBoxPIS.addItem(aux.getIdentificador() + " " + aux.getNombre());   
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

        disponibilidadtour = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        NombreTour = new javax.swing.JTextField();
        IDTour = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ToursVirtuales = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DButton = new javax.swing.JRadioButton();
        NDButton = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        ComboBoxPIS = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPIS = new javax.swing.JTable();
        EliminarPI = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("Identificador: ");

        jLabel3.setText("Ingrese propiedades del tour virtual a modificar: ");

        ToursVirtuales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Tour", "Nombre_Tour", "Disponibilidad"
            }
        ));
        ToursVirtuales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ToursVirtualesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ToursVirtuales);

        jLabel2.setText("Seleccione Tour Virtual a modificar: ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Modificar Tour Virtual");

        jLabel5.setText("Nombre:");

        jLabel6.setText("Disponibilidad:");

        DButton.setBackground(new java.awt.Color(255, 255, 255));
        disponibilidadtour.add(DButton);
        DButton.setText("Disponible");
        DButton.setFocusPainted(false);
        DButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DButtonActionPerformed(evt);
            }
        });

        NDButton.setBackground(new java.awt.Color(255, 255, 255));
        disponibilidadtour.add(NDButton);
        NDButton.setText("No Disponible");
        NDButton.setFocusPainted(false);

        jLabel7.setText("Agregar Puntos de interes: ");

        ComboBoxPIS.setFocusable(false);

        jButton1.setBackground(new java.awt.Color(246, 246, 246));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_md.png"))); // NOI18N
        jButton1.setText("Agregar Punto de interes");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TablaPIS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PuntoInteres", "Nombre_PInteres", "Disponibilidad"
            }
        ));
        jScrollPane2.setViewportView(TablaPIS);

        EliminarPI.setBackground(new java.awt.Color(246, 246, 246));
        EliminarPI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_md.png"))); // NOI18N
        EliminarPI.setText("Eliminar Punto de interes");
        EliminarPI.setFocusPainted(false);
        EliminarPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarPIActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(246, 246, 246));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar_md.png"))); // NOI18N
        jButton4.setText("Modificar");
        jButton4.setFocusPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(246, 246, 246));
        jButton3.setText("Finalizar");
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(20, 20, 20)
                                    .addComponent(DButton)
                                    .addGap(12, 12, 12)
                                    .addComponent(NDButton))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(30, 30, 30)
                                            .addComponent(IDTour, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(57, 57, 57)
                                            .addComponent(NombreTour, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(12, 12, 12)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(62, 62, 62)))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(EliminarPI)
                        .addGap(121, 121, 121))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(ComboBoxPIS, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IDTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NombreTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DButton)
                    .addComponent(NDButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboBoxPIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EliminarPI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(39, 39, 39))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       IAdministracionTV administraciontv = new IAdministracionTV();
       administraciontv.setVisible(true); 
       this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DButtonActionPerformed

    private void ToursVirtualesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToursVirtualesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo2 = (DefaultTableModel) TablaPIS.getModel();
        
        int filas= TablaPIS.getRowCount();
        
        for (int i = 0; filas>i; i++) {
            modelo2.removeRow(0);
        }
        
        String Id = ToursVirtuales.getValueAt(ToursVirtuales.getSelectedRow(), 0).toString();
        String Nombre = ToursVirtuales.getValueAt(ToursVirtuales.getSelectedRow(), 1).toString();
        String Disp = ToursVirtuales.getValueAt(ToursVirtuales.getSelectedRow(), 2).toString();
        IDTour.setText(Id);
        NombreTour.setText(Nombre);
        if(Disp == "Disponible"){
             disponibilidadtour.setSelected(DButton.getModel(), true);
        }else if(Disp == "No Disponible"){
             disponibilidadtour.setSelected(NDButton.getModel(), true);
        }

        for (int i=0;i<CtrlTourVirtual.getInstancia().getToursVirtualesArray().size();i++){

              tour =  CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i);
              String IdTour = tour.getIdentificador();

                if( Id == null ? IdTour == null : Id.equals(IdTour) ){
                    DefaultTableModel modeloO = (DefaultTableModel)TablaPIS.getModel();
                    for(int j = 0; j < aux.getObrasPuntoDeInteresArray().size(); j++){   
                       modeloO.addRow(new Object[]{aux.getObrasPuntoDeInteresArray().get(j).getIdObra(), aux.getObrasPuntoDeInteresArray().get(j).getTituloObra()});
                       puntoDeInteres = CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i).getTourspuntoDeInteresArray();
                   }   
                }     
        }
        
    }//GEN-LAST:event_ToursVirtualesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String O =(String) ComboBoxPIS.getSelectedItem(); 
        StringTokenizer id = new StringTokenizer(O," ");
        String token =  id.nextToken();
        String Id = ToursVirtuales.getValueAt(ToursVirtuales.getSelectedRow(), 0).toString();
        
        for(int j=0; j < CtrlTourVirtual.getInstancia().getToursVirtualesArray().size(); j++){
            
            String IDTour = CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(j).getIdentificador();
            
            if(Id == IDTour){
                
                for (int i=0;i<CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().size();i++){

                    String IdPuntoInteres = CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().get(i).getIdentificador();

                    if( token == null ? IdPuntoInteres == null : token.equals(IdPuntoInteres) ){

                        DefaultTableModel modelo2 = (DefaultTableModel) TablaPIS.getModel();

                            modelo2.insertRow(0, new Object[]{CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().get(i).getIdentificador(),
                            CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().get(i).getNombre()});
                        }
                    aux = CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().get(i);
                }
                    tour  = CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(j);
                    tour.getTourspuntoDeInteresArray().add(aux);
                      //  CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().get(j).getObrasPuntoDeInteresArray().add(auxO);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EliminarPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarPIActionPerformed
        
        String Id = TablaPIS.getValueAt(TablaPIS.getSelectedRow(), 0).toString();
        puntoDeInteresAux = puntoDeInteres;
        for(int i = 0; i < puntoDeInteresAux.size(); i++)
            if( Id == null ? puntoDeInteresAux.get(i).getIdentificador() == null : Id.equals(puntoDeInteresAux.get(i).getIdentificador())){    
                puntoDeInteresAux.remove(i);
                ((DefaultTableModel)TablaPIS.getModel()).removeRow(TablaPIS.getSelectedRow());
            } 
    }//GEN-LAST:event_EliminarPIActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tour.setIdentificador( IDTour.getText());
        tour.setNombre(NombreTour.getText());
        if(disponibilidadtour.getSelection().equals(DButton.getModel())) {
            aux.setDisponibilidad("Disponible");
        }
        if(disponibilidadtour.getSelection().equals(NDButton.getModel())) {
                aux.setDisponibilidad("No Disponible");
        }
    
        IDTour.setText(null);
        NombreTour.setText(null);
        disponibilidadtour.clearSelection();

        DefaultTableModel modelo2 = (DefaultTableModel) TablaPIS.getModel();
        int filas = TablaPIS.getRowCount();
        for (int i = 0; filas>i; i++) {
            modelo2.removeRow(0);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxPIS;
    private javax.swing.JRadioButton DButton;
    private javax.swing.JButton EliminarPI;
    private javax.swing.JTextField IDTour;
    private javax.swing.JRadioButton NDButton;
    private javax.swing.JTextField NombreTour;
    private javax.swing.JTable TablaPIS;
    private javax.swing.JTable ToursVirtuales;
    private javax.swing.ButtonGroup disponibilidadtour;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
