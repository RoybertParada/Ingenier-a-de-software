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
import Modelo.PuntoDeInteres;
import Modelo.TourVirtual;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
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
private TourVirtual tourAux, copiaTour;
private PuntoDeInteres auxPI;
private ArrayList <PuntoDeInteres> puntoDeInteres = new ArrayList <PuntoDeInteres> (); 

    /**
     * Creates new form CrearTV
     */
    public IModificarTV(){
        initComponents(); 
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Modificar Tour Virtual"); 
        
        DefaultTableModel modelo  = (DefaultTableModel) ToursVirtuales.getModel(); 
        
        while(it.hasNext()){
            tourAux = it.next();
            modelo.addRow(new Object[]{tourAux.getIdentificador(),tourAux.getNombre(),tourAux.getDisponibilidad()});           
        }
        
        while(ite.hasNext()){
            auxPI = ite.next();
            ComboBoxPIS.addItem(auxPI.getIdentificador() + " " + auxPI.getNombre());   
        }
        
        if(CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().size() <=0){
            agregarPuntoInteres.setEnabled(false);
            eliminarPuntoInteres.setEnabled(false);
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
        nombreTour = new javax.swing.JTextField();
        idTour = new javax.swing.JTextField();
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
        agregarPuntoInteres = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPIS = new javax.swing.JTable();
        eliminarPuntoInteres = new javax.swing.JButton();
        modificarTourVirtual = new javax.swing.JButton();
        finalizarModificarTV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        idTour.setEditable(false);

        jLabel4.setText("Identificador: ");

        jLabel3.setText("Ingrese propiedades del tour virtual a modificar: ");

        ToursVirtuales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Tour", "Nombre_Tour", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ToursVirtuales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ToursVirtuales.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
        ComboBoxPIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxPISActionPerformed(evt);
            }
        });

        agregarPuntoInteres.setBackground(new java.awt.Color(246, 246, 246));
        agregarPuntoInteres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_md.png"))); // NOI18N
        agregarPuntoInteres.setText("Agregar Punto de interes");
        agregarPuntoInteres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarPuntoInteres.setFocusPainted(false);
        agregarPuntoInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPuntoInteresActionPerformed(evt);
            }
        });

        TablaPIS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PuntoInteres", "Nombre_PInteres", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPIS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablaPIS.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(TablaPIS);

        eliminarPuntoInteres.setBackground(new java.awt.Color(246, 246, 246));
        eliminarPuntoInteres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_md.png"))); // NOI18N
        eliminarPuntoInteres.setText("Eliminar Punto de interes");
        eliminarPuntoInteres.setFocusPainted(false);
        eliminarPuntoInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPuntoInteresActionPerformed(evt);
            }
        });

        modificarTourVirtual.setBackground(new java.awt.Color(246, 246, 246));
        modificarTourVirtual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificar_md.png"))); // NOI18N
        modificarTourVirtual.setText("Modificar");
        modificarTourVirtual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modificarTourVirtual.setFocusPainted(false);
        modificarTourVirtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarTourVirtualActionPerformed(evt);
            }
        });

        finalizarModificarTV.setBackground(new java.awt.Color(246, 246, 246));
        finalizarModificarTV.setText("Finalizar");
        finalizarModificarTV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        finalizarModificarTV.setFocusPainted(false);
        finalizarModificarTV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarModificarTVActionPerformed(evt);
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
                                            .addComponent(idTour, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(57, 57, 57)
                                            .addComponent(nombreTour, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(12, 12, 12)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(agregarPuntoInteres)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(modificarTourVirtual)
                                .addGap(62, 62, 62)))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalizarModificarTV, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(eliminarPuntoInteres)
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
                    .addComponent(idTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombreTour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(agregarPuntoInteres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarPuntoInteres)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarTourVirtual, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(finalizarModificarTV)
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

    private void finalizarModificarTVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarModificarTVActionPerformed
       IAdministracionTV administraciontv = new IAdministracionTV();
       administraciontv.setVisible(true); 
       this.setVisible(false);
    }//GEN-LAST:event_finalizarModificarTVActionPerformed

    private void DButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DButtonActionPerformed

    private void ToursVirtualesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ToursVirtualesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelo2 = (DefaultTableModel) TablaPIS.getModel();
        
        int filas = TablaPIS.getRowCount();
        
        for (int i = 0; filas>i; i++){
            modelo2.removeRow(0);
        }
        
        String Id = ToursVirtuales.getValueAt(ToursVirtuales.getSelectedRow(), 0).toString();
        String Nombre = ToursVirtuales.getValueAt(ToursVirtuales.getSelectedRow(), 1).toString();
        String Disp = ToursVirtuales.getValueAt(ToursVirtuales.getSelectedRow(), 2).toString();
        idTour.setText(Id);
        nombreTour.setText(Nombre);
        if(Disp == "Disponible"){
             disponibilidadtour.setSelected(DButton.getModel(), true);
        }else if(Disp == "No Disponible"){
             disponibilidadtour.setSelected(NDButton.getModel(), true);
        }

        for(int i=0; i < CtrlTourVirtual.getInstancia().getToursVirtualesArray().size();i++){
        
            
            String IdTour = CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i).getIdentificador();

            if( Id == null ? IdTour == null : Id.equals(IdTour) ){
                copiaTour = CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i);
                String idAux = "";
                String nombreAux = "";
                String DispAux = "";
                ArrayList <PuntoDeInteres> PIAux = new ArrayList <> ();
                
                tourAux = new TourVirtual(idAux, nombreAux, DispAux, PIAux);
                
                for(int j = 0; j < CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i).getTourspuntoDeInteresArray().size(); j++){
                    auxPI = copiaTour.getTourspuntoDeInteresArray().get(j);
                    tourAux.getTourspuntoDeInteresArray().add(auxPI);
                }
              
                tourAux.setIdentificador(copiaTour.getIdentificador()); 
                tourAux.setDisponibilidad(copiaTour.getDisponibilidad());
                tourAux.setNombre(copiaTour.getNombre());
                
                DefaultTableModel modeloO = (DefaultTableModel)TablaPIS.getModel();
                for(int j = 0; j < copiaTour.getTourspuntoDeInteresArray().size(); j++){   
                    modeloO.addRow(new Object[]{copiaTour.getTourspuntoDeInteresArray().get(j).getIdentificador(), copiaTour.getTourspuntoDeInteresArray().get(j).getNombre(), copiaTour.getTourspuntoDeInteresArray().get(j).getDisponibilidad()});
                    
                } 
                break;
            }     
        }
        
    }//GEN-LAST:event_ToursVirtualesMouseClicked

    private void agregarPuntoInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPuntoInteresActionPerformed
        // TODO add your handling code here:
            String PI =(String) ComboBoxPIS.getSelectedItem(); 
            StringTokenizer id = new StringTokenizer(PI," ");
            String token =  id.nextToken();
                                  
                for (int i=0; i < CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().size(); i++){

                    String IdPuntoInteres = CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().get(i).getIdentificador();

                    if( token == null ? IdPuntoInteres == null : token.equals(IdPuntoInteres) ){
                        
                        DefaultTableModel modelo2 = (DefaultTableModel) TablaPIS.getModel();
                        modelo2.insertRow(0, new Object[]{CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().get(i).getIdentificador(),
                        CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().get(i).getNombre(), CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().get(i).getDisponibilidad()});
                        tourAux.getTourspuntoDeInteresArray().add(CtrlPuntoDeInteres.getInstancia().getPuntoDeInteresArray().get(i));
                        break;
                    }
                }            
    }//GEN-LAST:event_agregarPuntoInteresActionPerformed

    private void eliminarPuntoInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPuntoInteresActionPerformed
        
        try{
            puntoDeInteres = tourAux.getTourspuntoDeInteresArray();
            String Id = TablaPIS.getValueAt(TablaPIS.getSelectedRow(), 0).toString();
            for(int i = 0; i < puntoDeInteres.size(); i++){
                if( Id == null ? puntoDeInteres.get(i).getIdentificador() == null : Id.equals(puntoDeInteres.get(i).getIdentificador())){    
                    tourAux.getTourspuntoDeInteresArray().remove(puntoDeInteres.get(i));
                    ((DefaultTableModel)TablaPIS.getModel()).removeRow(TablaPIS.getSelectedRow());
                    break;
                }
            }
        }catch(ArrayIndexOutOfBoundsException  e){
            JOptionPane.showMessageDialog(null, "No hay puntos de interés a eliminar.", "Atención.", JOptionPane.WARNING_MESSAGE);
        }  
    }//GEN-LAST:event_eliminarPuntoInteresActionPerformed

    private void modificarTourVirtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTourVirtualActionPerformed
        
        if((nombreTour.getText().length()!=0) && (DButton.isSelected() || NDButton.isSelected())){
            tourAux.setIdentificador(idTour.getText());
            tourAux.setNombre(nombreTour.getText());
            if(disponibilidadtour.getSelection().equals(DButton.getModel())) {
                tourAux.setDisponibilidad("Disponible");
            }
            if(disponibilidadtour.getSelection().equals(NDButton.getModel())) {
                tourAux.setDisponibilidad("No Disponible");
            }

            for(int i=0; i < CtrlTourVirtual.getInstancia().getToursVirtualesArray().size();i++){
                String id = CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i).getIdentificador();
                if(copiaTour.getIdentificador() == null ? id == null : copiaTour.getIdentificador().equals(id)){
                    CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i).setIdentificador(tourAux.getIdentificador());
                    CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i).setNombre(tourAux.getNombre());
                    CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i).setDisponibilidad(tourAux.getDisponibilidad());
                    CtrlTourVirtual.getInstancia().getToursVirtualesArray().get(i).setTourspuntoDeInteresArray(tourAux.getTourspuntoDeInteresArray());
                    break;
                }    
            }
            int row = ToursVirtuales.getSelectedRow();
            ((DefaultTableModel)ToursVirtuales.getModel()).removeRow(row);
            ((DefaultTableModel)ToursVirtuales.getModel()).insertRow(row, new Object[]{tourAux.getIdentificador(),tourAux.getNombre(),tourAux.getDisponibilidad()});
            
            idTour.setText(null);
            nombreTour.setText(null);
            disponibilidadtour.clearSelection();
            auxPI = null;
            copiaTour = null;
            puntoDeInteres = null;
            tourAux = null;

            DefaultTableModel modelo2 = (DefaultTableModel) TablaPIS.getModel();
            int filas = TablaPIS.getRowCount();
            for (int i = 0; filas>i; i++) {
                modelo2.removeRow(0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No deben haber campos vacíos.", "Atención.", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_modificarTourVirtualActionPerformed

    private void ComboBoxPISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxPISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxPISActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxPIS;
    private javax.swing.JRadioButton DButton;
    private javax.swing.JRadioButton NDButton;
    private javax.swing.JTable TablaPIS;
    private javax.swing.JTable ToursVirtuales;
    private javax.swing.JButton agregarPuntoInteres;
    private javax.swing.ButtonGroup disponibilidadtour;
    private javax.swing.JButton eliminarPuntoInteres;
    private javax.swing.JButton finalizarModificarTV;
    private javax.swing.JTextField idTour;
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
    private javax.swing.JButton modificarTourVirtual;
    private javax.swing.JTextField nombreTour;
    // End of variables declaration//GEN-END:variables
}
