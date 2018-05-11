/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;

/**
 *
 * @author erick
 */
public class Log_in extends javax.swing.JFrame {

    /**
     * Creates new form Log_in
     */
    String error= "";
    String error1="";
    
    
    public Log_in() {
        this.setUndecorated(true);
        ImageIcon icon = new ImageIcon("src/surce/logesp.png");
        ImageIcon anima = new javax.swing.ImageIcon(getClass().getResource("/surce/gif/libro-abre.gif"));
        anima.getImage().flush();
        switch (VarG.idioma) {
            case "espanol":
                icon = new ImageIcon("src/surce/logesp.png");
                error = "Uno o más datos son incorrectos";
                error1 = "Por favor, intentelo de nuevo";
                break;
            case "ingles":
                icon = new ImageIcon("src/surce/logingles.png");
                error = "Your ID or Password is incorrect";
                error1 ="Please, try again";
                break;
            case "frances":
                icon = new ImageIcon("src/surce/logesp.png");
                break;
            case "aleman":
                icon = new ImageIcon("src/surce/logale.png");
                break;
        }
        //icon.getImage().flush();       
        initComponents();
        background.setIcon(icon);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBerror = new javax.swing.JLabel();
        LBerror1 = new javax.swing.JLabel();
        boton = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBerror.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        LBerror.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(LBerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 380, 50));

        LBerror1.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        LBerror1.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(LBerror1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 380, 50));

        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClicked(evt);
            }
        });
        getContentPane().add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 300, 150));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 120));

        id.setText("190798");
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
        });
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 220, 40));

        pass.setText("070996");
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
        });
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 220, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/logesp.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Runtime.getRuntime().exec("cmd /c osk");
        } catch (IOException ex) {
            Logger.getLogger(Log_in.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_idMouseClicked

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Runtime.getRuntime().exec("cmd /c osk");
        } catch (IOException ex) {
            Logger.getLogger(Log_in.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_passMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        borradatos();
        this.setVisible(false);
        VarG.anActual = VarG.anClose;
        VarG.anActual.getImage().flush();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMouseClicked
        // TODO add your handling code here:        
        try {
            if (id.getText().equals("") || pass.getText().equals("")) {
                System.out.println("Campos vacios");
                //Especificando error segun idioma
                switch (VarG.idioma) {
                    case "espanol":
                        error = "Uno o más datos están en blanco";
                        error1 = "Por favor, intentelo de nuevo";
                        break;
                    case "ingles":
                        error = "Your ID or Password are missing";
                        error1 ="Please, try again";
                        break;
                }
                moserror();
            } else {
                 //Especificando en caso de error segun idioma
                switch (VarG.idioma) {
                    case "espanol":
                        error = "Uno o más datos están incorrectos";
                        error1 = "Por favor, intentelo de nuevo";
                        break;
                    case "ingles":
                        error = "Your ID or Password are incorrect";
                        error1 ="Please, try again";
                        break;
                }
                String consulta = "select * from usuario where id_usuario=" + id.getText() + ";";
                VarG.objConn.Consultar(consulta);
                if (VarG.objConn.rs.getRow() != 0) {
                    if (VarG.objConn.rs.getString(2).equals(pass.getText().trim())) {
                        //System.out.println("Entró aquí");
                        //Conexión RMI
                        //Registry registro = LocateRegistry.getRegistry("localhost", 8080);
                        //InterfaceRMI getPerfil = (InterfaceRMI) registro.lookup("key");
                        //getPerfil.perfil(id.getText(), pass.getText());
                        //print para comprobar que los datos se agregaron exitosamente
                        //System.out.println("nomb: "+VarG.id+ "pass: "+VarG.pass);

                        //Borra los datos previamente usados
                        borradatos();
                        
                        //Pantallas de continuidad
                        switch (VarG.currentFrame) {
                            case "perfil":
                                AudioPlayer.player.start(VarG.aPerfilDatos);
                                VarG.jfPerfil.setVisible(true);
                                break;
                            case "prestamo":
                                VarG.jfPrestamo.setVisible(true);
                                AudioPlayer.player.start(VarG.aPrestamo);
                                break;
                            case "renovar":
                                VarG.jfRenovar.setVisible(true);
                                AudioPlayer.player.start(VarG.aRenovar);
                                break;  
                            case "devolucion":
                                VarG.jfDevolucion.setVisible(true);
                                AudioPlayer.player.start(VarG.aDevolucion);
                                break;
                            case "canjear":
                                VarG.jfCanjear.setVisible(true);
                                AudioPlayer.player.start(VarG.aLogin);
                                break;
                        }       
                      

                        VarG.jfLogin.setVisible(false);

                    } else {
                        //JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
                        moserror();
                    }
                } else {
                    //JOptionPane.showMessageDialog(this, "Usuario incorrecta");
                    moserror();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_botonMouseClicked
public void borradatos(){
    id.setText("");
    pass.setText("");
    LBerror.setText("");
    LBerror1.setText("");
}
public void moserror(){
    LBerror.setText(error);
    LBerror1.setText(error1);
}
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
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Log_in.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Log_in().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBerror;
    private javax.swing.JLabel LBerror1;
    public static javax.swing.JLabel background;
    private javax.swing.JLabel boton;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
