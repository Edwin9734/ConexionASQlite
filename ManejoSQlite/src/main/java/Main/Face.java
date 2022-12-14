/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;
import Funciones.CLsFunciones;
import datos.Conexion;
import datos.MascotasDaoJDBC;
import dominio.MascotasDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario
 */
public class Face extends javax.swing.JFrame {
private static  CLsFunciones j;
    /**
     * Creates new form Face
     */
    public Face() {
       
        initComponents();        
        setLocationRelativeTo(null);
  
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        insMascota = new javax.swing.JButton();
        entradaid = new javax.swing.JTextField();
        entradaNombre = new javax.swing.JTextField();
        entradaRaza = new javax.swing.JTextField();
        BTupdatemascota = new javax.swing.JButton();
        BTdeletemascota = new javax.swing.JButton();
        TEXTupnombre = new javax.swing.JTextField();
        Textupraza = new javax.swing.JTextField();
        Textupid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("LISTA MASCOTAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Table1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(Table1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MASCCOTAS");

        insMascota.setText("insertar mascota");
        insMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insMascotaActionPerformed(evt);
            }
        });

        entradaRaza.setText("raza");
        entradaRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaRazaActionPerformed(evt);
            }
        });

        BTupdatemascota.setText("updatemascota");
        BTupdatemascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTupdatemascotaActionPerformed(evt);
            }
        });

        BTdeletemascota.setText("deletemascota");
        BTdeletemascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTdeletemascotaActionPerformed(evt);
            }
        });

        TEXTupnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTupnombreActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("NOMBRE");

        jLabel4.setText("RAZA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BTdeletemascota, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(BTupdatemascota, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(insMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(entradaid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(Textupid, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TEXTupnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Textupraza, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(entradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(entradaRaza, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2)
                        .addGap(123, 123, 123)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insMascota)
                    .addComponent(entradaRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entradaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTupdatemascota)
                    .addComponent(TEXTupnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Textupraza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Textupid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTdeletemascota)
                    .addComponent(entradaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  //  nombrepokemon.setText(resultadoConsulta.getString(2)+" especies "+resultadoConsulta.getString("species"));
    //Label1.setText(j.ListadoPeliculas);
    //List1.setToolTipText(j.ListadoPeliculas());
    mostrarMascota();
    //String t= "maje";
 //   entradaid.setText(t);
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void insMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insMascotaActionPerformed
        insertarMascota();
        mostrarMascota();
    }//GEN-LAST:event_insMascotaActionPerformed

    private void BTupdatemascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTupdatemascotaActionPerformed
        updateMascota();
        mostrarMascota();
    }//GEN-LAST:event_BTupdatemascotaActionPerformed

    private void BTdeletemascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTdeletemascotaActionPerformed
        deleteMascota();
        limpiar();

    }//GEN-LAST:event_BTdeletemascotaActionPerformed

    private void entradaRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaRazaActionPerformed

    private void TEXTupnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTupnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXTupnombreActionPerformed

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
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Face.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Face().setVisible(true);
            }
        });
    }

    public void mostrarMascota (){
        try{  
        Connection conexion = Conexion.getConnection();      
        MascotasDaoJDBC mascotajdbc = new MascotasDaoJDBC(conexion);
        List<MascotasDTO> Listmascotas =  mascotajdbc.select();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Nombre");
        model.addColumn("Raza");
        
        Table1.setModel(model);
        String[]datos = new String[3];
        
        for (MascotasDTO mascota : Listmascotas)
        { 
            datos[0]=String.valueOf(mascota.getIdmascota());
            datos[1]=mascota.getNombremascota();
            datos[2]=mascota.getRazamascota();               
            model.addRow(datos);                 
           }
        limpiar();
        conexion.close();
        }catch(SQLException e ){
            JOptionPane.showMessageDialog(null,"error"+e.toString() );
        }
    }
    
    public void insertarMascota (){
        try{  
        Connection conexion = Conexion.getConnection();      
        MascotasDaoJDBC mascotajdbc = new MascotasDaoJDBC(conexion);
        
        MascotasDTO mascota = new MascotasDTO();
      //mascota.setIdmascota(Integer.valueOf(entradaid.getText()));
        mascota.setNombremascota(entradaNombre.getText());
        mascota.setRazamascota(entradaRaza.getText());
        mascotajdbc.insert(mascota);
        
         limpiar();
         conexion.close();
        }catch(SQLException e ){
            JOptionPane.showMessageDialog(null,"error"+e.toString() );
        }
        
    }
    
    public void updateMascota (){
        try{  
        Connection conexion = Conexion.getConnection();      
        MascotasDaoJDBC mascotajdbc = new MascotasDaoJDBC(conexion);
        
        MascotasDTO mascota = new MascotasDTO();
        mascota.setIdmascota(Integer.valueOf(Textupid.getText()));
        mascota.setNombremascota(TEXTupnombre.getText());
        mascota.setRazamascota(Textupraza.getText());
        mascotajdbc.update(mascota);
        
         limpiar();
         conexion.close();
        }catch(SQLException e ){
            JOptionPane.showMessageDialog(null,"error"+e.toString() );
        }
        
    }
    
    public void deleteMascota (){
        try{  
        Connection conexion = Conexion.getConnection();      
        MascotasDaoJDBC mascotajdbc = new MascotasDaoJDBC(conexion);
        
        MascotasDTO mascota = new MascotasDTO();
        mascota.setIdmascota(Integer.valueOf(entradaid.getText()));
//        mascota.setNombremascota(entradaNombre.getText());
//        mascota.setRazamascota(entradaRaza.getText());
        mascotajdbc.update(mascota);
        
       limpiar();
         conexion.close();
        }catch(SQLException e ){
            JOptionPane.showMessageDialog(null,"error"+e.toString() );
        }
        
    }
    public void limpiar(){
        entradaNombre.setText("");
        entradaid.setText("");
        entradaRaza.setText("");
        Textupid.setText("");
        TEXTupnombre.setText("");
        Textupraza.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTdeletemascota;
    private javax.swing.JButton BTupdatemascota;
    private javax.swing.JTextField TEXTupnombre;
    private javax.swing.JTable Table1;
    private javax.swing.JTextField Textupid;
    private javax.swing.JTextField Textupraza;
    private javax.swing.JTextField entradaNombre;
    private javax.swing.JTextField entradaRaza;
    private javax.swing.JTextField entradaid;
    private javax.swing.JButton insMascota;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
