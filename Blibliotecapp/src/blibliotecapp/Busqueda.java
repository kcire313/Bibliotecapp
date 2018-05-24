/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import java.awt.Component;
import java.awt.KeyboardFocusManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import sun.audio.AudioPlayer;

/**
 *
 * @author erick
 */

public class Busqueda extends javax.swing.JFrame {
    /**
     * Creates new form perfilDatos
     */
    
    public boolean bandera = false;
    //Bandera es para checar si es busqueda Básica o Avanazada
    //false= Básica     true= Avanzada
    
    
    public Busqueda() {
        this.setUndecorated(true);
        initComponents();
        LBTitulo.setVisible(false);
        LBAutor.setVisible(false);
        LBAño.setVisible(false);
        TxtTitulo.setVisible(false);
        TxtAutor.setVisible(false);
        TxtAnio.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBTitulo = new javax.swing.JLabel();
        TxtAnio = new javax.swing.JTextField();
        TxtTitulo = new javax.swing.JTextField();
        TxtAutor = new javax.swing.JTextField();
        LBAutor = new javax.swing.JLabel();
        LBAño = new javax.swing.JLabel();
        regresar = new javax.swing.JLabel();
        LBBusAvanzada = new javax.swing.JLabel();
        LBBusBasica = new javax.swing.JLabel();
        LBBusqueda = new javax.swing.JLabel();
        TxtPalabra = new javax.swing.JTextField();
        CMBCampo = new javax.swing.JComboBox();
        LBCampo = new javax.swing.JLabel();
        jLBBuscar = new javax.swing.JLabel();
        LetraA = new javax.swing.JLabel();
        LBFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBTitulo.setFont(new java.awt.Font("Calibri Light", 1, 30)); // NOI18N
        LBTitulo.setText("Titulo:");
        getContentPane().add(LBTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 340, 50));

        TxtAnio.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        TxtAnio.setToolTipText("");
        TxtAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(TxtAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 270, 40));

        TxtTitulo.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        TxtTitulo.setToolTipText("");
        TxtTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(TxtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 480, 40));

        TxtAutor.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        TxtAutor.setToolTipText("");
        TxtAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(TxtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 480, 40));

        LBAutor.setFont(new java.awt.Font("Calibri Light", 1, 30)); // NOI18N
        LBAutor.setText("Autor:");
        getContentPane().add(LBAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 340, 50));

        LBAño.setFont(new java.awt.Font("Calibri Light", 1, 30)); // NOI18N
        LBAño.setText("   Año:");
        getContentPane().add(LBAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 340, 50));

        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMouseClicked(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 140));

        LBBusAvanzada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBBusAvanzadaMouseClicked(evt);
            }
        });
        getContentPane().add(LBBusAvanzada, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 400, 130));

        LBBusBasica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBBusBasicaMouseClicked(evt);
            }
        });
        getContentPane().add(LBBusBasica, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 400, 130));

        LBBusqueda.setFont(new java.awt.Font("Calibri Light", 1, 30)); // NOI18N
        LBBusqueda.setText("Buscar en:");
        getContentPane().add(LBBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 230, 50));

        TxtPalabra.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        TxtPalabra.setToolTipText("");
        TxtPalabra.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TxtPalabra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPalabraFocusGained(evt);
            }
        });
        getContentPane().add(TxtPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 480, 40));

        CMBCampo.setFont(new java.awt.Font("Calibri Light", 1, 28)); // NOI18N
        CMBCampo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Titulo", "Autor", "ID de libro", "Año" }));
        getContentPane().add(CMBCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 480, 80));

        LBCampo.setFont(new java.awt.Font("Calibri Light", 1, 30)); // NOI18N
        LBCampo.setText("Palabra(s) a buscar:");
        getContentPane().add(LBCampo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 340, 50));

        jLBBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBBuscarMouseClicked(evt);
            }
        });
        getContentPane().add(jLBBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 154, 280, 280));

        LetraA.setForeground(new java.awt.Color(255, 255, 255));
        LetraA.setText("A");
        LetraA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LetraAMouseClicked(evt);
            }
        });
        getContentPane().add(LetraA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 230, 140));

        LBFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/nuevasP/busquedaB E.png"))); // NOI18N
        LBFondo.setText("ss");
        getContentPane().add(LBFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);        
        System.out.println("return to menu");
    }//GEN-LAST:event_regresarMouseClicked

    private void LBBusAvanzadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBBusAvanzadaMouseClicked
      if(!bandera){
        LBFondo.setIcon(new ImageIcon("src/surce/busqueda avanzada.png"));
        LBBusqueda.setVisible(false);
        LBCampo.setVisible(false);
        TxtPalabra.setVisible(false);
        CMBCampo.setVisible(false);
        bandera = true;
        LBTitulo.setVisible(bandera);
        LBAutor.setVisible(bandera);
        LBAño.setVisible(bandera);
        TxtTitulo.setVisible(bandera);
        TxtAutor.setVisible(bandera);
        TxtAnio.setVisible(bandera);
        TxtTitulo.setText("");
        TxtAutor.setText("");
        TxtAnio.setText("");
        TxtTitulo.grabFocus();
        //LBFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/busquedaavanzada.png")));
      }  
        
    }//GEN-LAST:event_LBBusAvanzadaMouseClicked

    private void LBBusBasicaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBBusBasicaMouseClicked
      if (bandera){
        LBFondo.setIcon(new ImageIcon("src/surce/busqueda basica.png"));
        LBTitulo.setVisible(false);
        LBAutor.setVisible(false);
        LBAño.setVisible(false);
        TxtTitulo.setVisible(false);
        TxtAutor.setVisible(false);
        TxtAnio.setVisible(false);
        LBBusqueda.setVisible(true);
        LBCampo.setVisible(true);
        TxtPalabra.setVisible(true);
        CMBCampo.setVisible(true);
        TxtPalabra.setText("");
        TxtPalabra.grabFocus();
        CMBCampo.setSelectedIndex(0);
        bandera = false;
        //LBFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/busquedabasica.png")));
      }
        
    }//GEN-LAST:event_LBBusBasicaMouseClicked

    private void jLBBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBBuscarMouseClicked
        /*
        TxtTitulo
        TxtAutor
        TxtAnio
        */
        String busqueda = "";
        String titulo ="";
        String autor="";
        String anio="";
        if (!bandera){
            if (TxtPalabra.getText().trim().isEmpty()){
                System.out.println("No hay nada escrito en basica");
                //Poner Aviso de falta de datos
            }else{
                titulo=TxtPalabra.getText();
                System.out.println(titulo);
                busqueda=CMBCampo.getSelectedItem().toString();
                System.out.println(busqueda);
                VarG.jfLibros.setVisible(true);
                this.setVisible(false);
            }
        }else{
            if(TxtTitulo.getText().trim().isEmpty() && TxtAutor.getText().trim().isEmpty() && 
               TxtAnio.getText().trim().isEmpty()  ){
                 System.out.println("no hay nada escrito en avanzada");
                //Poner Aviso de falta de datos
            }else{
                if(!TxtTitulo.getText().trim().isEmpty()){
                    titulo=TxtTitulo.getText();
                    System.out.println(titulo);
                }
                if(!TxtAutor.getText().trim().isEmpty() ){
                    autor=TxtAutor.getText();
                    System.out.println(autor);
                }
                if(!TxtAnio.getText().trim().isEmpty()){
                    anio=TxtAnio.getText();
                    System.out.println(anio);
                }    
                
            }    
        }
        
        //AudioPlayer.player.start(VarG.aLogin); //audio
    }//GEN-LAST:event_jLBBuscarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        String[] ing = {"Title","Author","Book ID","Year"};
        String[] esp = {"Titulo","Autor","ID del libro","Año"};
        TxtPalabra.setText("");
        TxtTitulo.setText("");
        TxtAutor.setText("");
        TxtAnio.setText("");
        if(VarG.idioma.equals("ingles")){
            LBCampo.setText("Words to searh for:");
            LBBusqueda.setText("Search in:");
            LBTitulo.setText("Title:");
            LBAutor.setText("Author:");
            LBAño.setText("Year:");
            DefaultComboBoxModel model = new DefaultComboBoxModel( ing );
            CMBCampo.setModel( model );
        }else{
            LBCampo.setText("Palabra(s) a buscar:");
            LBBusqueda.setText("Buscar en:");
            LBTitulo.setText("Titulo:");
            LBAutor.setText("Autor:");
            LBAño.setText("Año:");
            DefaultComboBoxModel model = new DefaultComboBoxModel( esp );
            CMBCampo.setModel( model );
        }
    }//GEN-LAST:event_formWindowActivated

    private void LetraAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LetraAMouseClicked
        Component  testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if(testField.equals(TxtPalabra)){
            pushtecla("a", TxtPalabra);
        }else if(testField.equals(TxtTitulo)){
            pushtecla("a", TxtTitulo);
        }else if(testField.equals(TxtAutor)){
            pushtecla("a", TxtAutor);
        }else if(testField.equals(TxtAnio)){
            pushtecla("a", TxtAnio);
        }
    }//GEN-LAST:event_LetraAMouseClicked
//Teclado
    public void pushtecla(String letra, JTextField txt ){
   
        String aux = txt.getText();              
        int pos=txt.getCaretPosition();
        String texto= aux.substring(0, pos)+letra+aux.substring(pos, aux.length());
        txt.setText(texto);
        txt.setCaretPosition(pos+1);
    }
    /*
         if(txt.getText().isEmpty()){
                txt.setText(letra);
            }else{
                String aux = txt.getText();              
                int pos=txt.getCaretPosition();
                String texto= aux.substring(0, pos)++letra++aux.substring(pos, aux.length());
                txt.setText(texto);
                txt.setCaretPosition(pos+1);
            }*/
    
    
    
    private void TxtPalabraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPalabraFocusGained

    }//GEN-LAST:event_TxtPalabraFocusGained

    
    
    
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
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CMBCampo;
    private javax.swing.JLabel LBAutor;
    private javax.swing.JLabel LBAño;
    private javax.swing.JLabel LBBusAvanzada;
    private javax.swing.JLabel LBBusBasica;
    private javax.swing.JLabel LBBusqueda;
    private javax.swing.JLabel LBCampo;
    private javax.swing.JLabel LBFondo;
    private javax.swing.JLabel LBTitulo;
    private javax.swing.JLabel LetraA;
    private javax.swing.JTextField TxtAnio;
    private javax.swing.JTextField TxtAutor;
    private javax.swing.JTextField TxtPalabra;
    private javax.swing.JTextField TxtTitulo;
    private javax.swing.JLabel jLBBuscar;
    private javax.swing.JLabel regresar;
    // End of variables declaration//GEN-END:variables
}
