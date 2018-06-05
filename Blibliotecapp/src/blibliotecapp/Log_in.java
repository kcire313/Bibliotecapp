/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import java.awt.Component;
import java.awt.KeyboardFocusManager;
import java.io.IOException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import sun.audio.AudioPlayer;

/**
 *
 * @author erick
 */
public class Log_in extends javax.swing.JFrame {

    /**
     * Creates new form Log_in
     */
    String error = "";
    String error1 = "";

    public Log_in() {
        this.setUndecorated(true);
        ImageIcon icon = new ImageIcon("src/surce/nuevasP/login E.png");
        ImageIcon anima = new javax.swing.ImageIcon(getClass().getResource("/surce/gif/libro-abre.gif"));
        anima.getImage().flush();
        switch (VarG.idioma) {
            case "espanol":

                error = "Uno o más datos son incorrectos";
                error1 = "Por favor, intentelo de nuevo";
                break;
            case "ingles":

                error = "Your ID or Password is incorrect";
                error1 = "Please, try again";
                break;
            case "frances":

                break;
            case "aleman":

                break;
        }
        //icon.getImage().flush();       
        initComponents();

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
        Letra1 = new javax.swing.JLabel();
        LSpace = new javax.swing.JLabel();
        Letra9 = new javax.swing.JLabel();
        Letra6 = new javax.swing.JLabel();
        Letra7 = new javax.swing.JLabel();
        Letra2 = new javax.swing.JLabel();
        Letra5 = new javax.swing.JLabel();
        Letra3 = new javax.swing.JLabel();
        LBack = new javax.swing.JLabel();
        Letra4 = new javax.swing.JLabel();
        Letra8 = new javax.swing.JLabel();
        Letra0 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBerror.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        LBerror.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(LBerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 380, 50));

        LBerror1.setFont(new java.awt.Font("Californian FB", 1, 24)); // NOI18N
        LBerror1.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(LBerror1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 380, 50));

        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonMouseClicked(evt);
            }
        });
        getContentPane().add(boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 260, 110));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 120));

        id.setText("195268");
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 220, 40));

        pass.setText("210696");
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 220, 40));

        Letra1.setForeground(new java.awt.Color(255, 255, 255));
        Letra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Letra1MouseClicked(evt);
            }
        });
        getContentPane().add(Letra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 120, 80));

        LSpace.setForeground(new java.awt.Color(255, 255, 255));
        LSpace.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LSpaceMouseClicked(evt);
            }
        });
        getContentPane().add(LSpace, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 690, 130, 70));

        Letra9.setForeground(new java.awt.Color(255, 255, 255));
        Letra9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Letra9MouseClicked(evt);
            }
        });
        getContentPane().add(Letra9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 600, 130, 70));

        Letra6.setForeground(new java.awt.Color(255, 255, 255));
        Letra6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Letra6MouseClicked(evt);
            }
        });
        getContentPane().add(Letra6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 130, 70));

        Letra7.setForeground(new java.awt.Color(255, 255, 255));
        Letra7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Letra7MouseClicked(evt);
            }
        });
        getContentPane().add(Letra7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 600, 120, 70));

        Letra2.setForeground(new java.awt.Color(255, 255, 255));
        Letra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Letra2MouseClicked(evt);
            }
        });
        getContentPane().add(Letra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 130, 80));

        Letra5.setForeground(new java.awt.Color(255, 255, 255));
        Letra5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Letra5MouseClicked(evt);
            }
        });
        getContentPane().add(Letra5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 120, 70));

        Letra3.setForeground(new java.awt.Color(255, 255, 255));
        Letra3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Letra3MouseClicked(evt);
            }
        });
        getContentPane().add(Letra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 420, 130, 80));

        LBack.setForeground(new java.awt.Color(255, 255, 255));
        LBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBackMouseClicked(evt);
            }
        });
        getContentPane().add(LBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 690, 130, 70));

        Letra4.setForeground(new java.awt.Color(255, 255, 255));
        Letra4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Letra4MouseClicked(evt);
            }
        });
        getContentPane().add(Letra4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 120, 70));

        Letra8.setForeground(new java.awt.Color(255, 255, 255));
        Letra8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Letra8MouseClicked(evt);
            }
        });
        getContentPane().add(Letra8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, 120, 70));

        Letra0.setForeground(new java.awt.Color(255, 255, 255));
        Letra0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Letra0MouseClicked(evt);
            }
        });
        getContentPane().add(Letra0, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 690, 120, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/nuevasP/login E.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        borradatos();
        this.setVisible(false);
        VarG.jfIdioma.pausarAudios();
        VarG.anActual = VarG.animaciones.get(6);
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
                        error1 = "Please, try again";
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
                        error1 = "Please, try again";
                        break;
                }
                String auxId = id.getText();
                VarG.jfIdioma.pausarAudios();
                String consulta = "select * from usuario where id_usuario=" + id.getText() + ";";
                VarG.objConn.Consultar(consulta);
                if (VarG.objConn.rs.getRow() != 0) {
                    String[] data;
                    String result;
                    if (VarG.objConn.rs.getString(2).equals(pass.getText().trim())) {
                        System.out.println("Entró aquí login");
                        Registry registry = LocateRegistry.getRegistry();
                        TestRemote testRemote = (TestRemote) registry.lookup("Test");
                        result = testRemote.pullData(this.id.getText());
                        data = result.split(",");
                        VarG.id_usuario = Integer.parseInt(data[0]);
                        VarG.password = data[1];
                        VarG.nombre = data[2];
                        VarG.appat = data[3];
                        VarG.apmat = data[4];
                        VarG.puntaje = Integer.parseInt(data[5]);
                        System.out.println("Nom: " + VarG.nombre);
                        VarG.jfLogin.setVisible(false);

                        //Apartir de aqui comienza a sacar todos los datos relacionados con los libros
                        VarG.libros = new ArrayList<>();
                        String[] tupla;
                        result = testRemote.bookData(this.id.getText());
                        tupla = result.split("&");
                        //System.out.println(tupla[0]);
                        data = tupla[0].split("%");
                        boolean band = false;
                        if (data[5].equals("true")) {
                            band = true;
                        }
                        //System.out.println(Integer.parseInt(data[0])+","+ Integer.parseInt(data[1])+","+ data[2]+","+ data[3]+","+ data[4]+","+ band+","+ Integer.parseInt(data[6])+","+ data[7]+","+ data[8]+","+ Integer.parseInt(data[9])+","+ Integer.parseInt(data[10])+","+ Integer.parseInt(data[11]));
                        VarG.libros.add(new LibroG(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2], data[3], data[4], band, Integer.parseInt(data[6]), data[7], data[8], Integer.parseInt(data[9]), Integer.parseInt(data[10]), Integer.parseInt(data[11])));
                        for (int i = 1; i < tupla.length; i++) {
                            data = tupla[i].split("%");
                            band = false;
                            if (data[5].equals("true")) {
                                band = true;
                            }
                            VarG.libros.add(new LibroG(Integer.parseInt(data[0]), Integer.parseInt(data[1]), data[2], data[3], data[4], band, Integer.parseInt(data[6]), data[7], data[8], Integer.parseInt(data[9]), Integer.parseInt(data[10]), Integer.parseInt(data[11])));
                        }
                        //                     System.out.println(VarG.libros.get(0).getTitulo() + "  " + VarG.libros.get(0).getAutor());
                        //                     System.out.println(VarG.libros.get(1).getTitulo() + "  " + VarG.libros.get(1).getAutor());
                        //Borra los datos previamente usados
                        //borradatos();
                        //Pantallas de continuidad
                        System.out.println("Entra a current frame");
                        switch (VarG.currentFrame) {
                            case "perfil":
                                AudioPlayer.player.start(VarG.aPerfilDatos);
                                VarG.jfPerfil.setVisible(true);
                                break;
                            case "prestamo":
                                sacaLibrosPrestados(auxId);
                                VarG.jfPrestamo.setVisible(true);
                                AudioPlayer.player.start(VarG.aPrestamo);
                                break;
                            case "renovar":
                                limpiaLibrosDevueltos();
                                VarG.jfRenovar.setVisible(true);
                                AudioPlayer.player.start(VarG.aRenovar);
                                break;
                            case "devolucion":
                                limpiaLibrosDevueltos();
                                VarG.jfDevolucion.setVisible(true);
                                AudioPlayer.player.start(VarG.aDevolucion);
                                break;
                            case "canjear":
                                System.out.println("entro cajas");
                                VarG.jfCanjear.setVisible(true);                                
                                AudioPlayer.player.start(VarG.aCanjear);                                
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

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if (VarG.idioma.equals("ingles")) {
            background.setIcon(new ImageIcon("src/surce/nuevasP/login I.png"));
        } else {
            background.setIcon(new ImageIcon("src/surce/nuevasP/login E.png"));
        }
        //Comentar si es necesario hacer pruebas
        //borradatos();
    }//GEN-LAST:event_formWindowActivated

    private void Letra1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Letra1MouseClicked
        Component testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (testField.equals(id)) {
            pushtecla("1", id);
        } else if (testField.equals(pass)) {
            pushtecla("1", pass);
        }
    }//GEN-LAST:event_Letra1MouseClicked

    private void LSpaceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LSpaceMouseClicked
        Component testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (testField.equals(id)) {
            id.setText("");
        } else if (testField.equals(pass)) {
            pass.setText("");

        }
    }//GEN-LAST:event_LSpaceMouseClicked

    private void Letra9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Letra9MouseClicked
        Component testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (testField.equals(id)) {
            pushtecla("9", id);
        } else if (testField.equals(pass)) {
            pushtecla("9", pass);

        }
    }//GEN-LAST:event_Letra9MouseClicked

    private void Letra6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Letra6MouseClicked
        Component testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (testField.equals(id)) {
            pushtecla("6", id);
        } else if (testField.equals(pass)) {
            pushtecla("6", pass);

        }
    }//GEN-LAST:event_Letra6MouseClicked

    private void Letra7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Letra7MouseClicked
        Component testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (testField.equals(id)) {
            pushtecla("7", id);
        } else if (testField.equals(pass)) {
            pushtecla("7", pass);

        }
    }//GEN-LAST:event_Letra7MouseClicked

    private void Letra2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Letra2MouseClicked
        Component testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (testField.equals(id)) {
            pushtecla("2", id);
        } else if (testField.equals(pass)) {
            pushtecla("2", pass);

        }
    }//GEN-LAST:event_Letra2MouseClicked

    private void Letra5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Letra5MouseClicked
        Component testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (testField.equals(id)) {
            pushtecla("5", id);
        } else if (testField.equals(pass)) {
            pushtecla("5", pass);

        }
    }//GEN-LAST:event_Letra5MouseClicked

    private void Letra3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Letra3MouseClicked
        Component testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (testField.equals(id)) {
            pushtecla("3", id);
        } else if (testField.equals(pass)) {
            pushtecla("3", pass);

        }
    }//GEN-LAST:event_Letra3MouseClicked

    private void LBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBackMouseClicked
        // TODO add your handling code here:
        Component testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (testField.equals(id)) {
            if (!id.getText().trim().isEmpty()) {
                int pos = id.getCaretPosition();
                String text = id.getText();
                String texto = text.substring(0, pos - 1) + text.substring(pos, text.length());
                id.setText(texto);
                id.setCaretPosition(pos - 1);
            }
        } else if (testField.equals(pass)) {
            if (!pass.getText().trim().isEmpty()) {
                int pos = pass.getCaretPosition();
                String text = pass.getText();
                String texto = text.substring(0, pos - 1) + text.substring(pos, text.length());
                pass.setText(texto);
                pass.setCaretPosition(pos - 1);
            }
        }
    }//GEN-LAST:event_LBackMouseClicked

    private void Letra4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Letra4MouseClicked
        Component testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (testField.equals(id)) {
            pushtecla("4", id);
        } else if (testField.equals(pass)) {
            pushtecla("4", pass);

        }
    }//GEN-LAST:event_Letra4MouseClicked

    private void Letra8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Letra8MouseClicked
        Component testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (testField.equals(id)) {
            pushtecla("8", id);
        } else if (testField.equals(pass)) {
            pushtecla("8", pass);

        }
    }//GEN-LAST:event_Letra8MouseClicked

    private void Letra0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Letra0MouseClicked
        Component testField = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusOwner();
        if (testField.equals(id)) {
            pushtecla("0", id);
        } else if (testField.equals(pass)) {
            pushtecla("0", pass);
        }
    }//GEN-LAST:event_Letra0MouseClicked
    //Teclado
    public void pushtecla(String letra, JTextField txt) {

        String aux = txt.getText();
        int pos = txt.getCaretPosition();
        String texto = aux.substring(0, pos) + letra + aux.substring(pos, aux.length());
        txt.setText(texto);
        txt.setCaretPosition(pos + 1);
    }

    public void borradatos() {
        id.setText("");
        pass.setText("");
        LBerror.setText("");
        LBerror1.setText("");
    }

    public void moserror() {
        VarG.jfIdioma.pausarAudios();
        AudioPlayer.player.start(VarG.aError);
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
    private javax.swing.JLabel LBack;
    private javax.swing.JLabel LBerror;
    private javax.swing.JLabel LBerror1;
    private javax.swing.JLabel LSpace;
    private javax.swing.JLabel Letra0;
    private javax.swing.JLabel Letra1;
    private javax.swing.JLabel Letra2;
    private javax.swing.JLabel Letra3;
    private javax.swing.JLabel Letra4;
    private javax.swing.JLabel Letra5;
    private javax.swing.JLabel Letra6;
    private javax.swing.JLabel Letra7;
    private javax.swing.JLabel Letra8;
    private javax.swing.JLabel Letra9;
    public static javax.swing.JLabel background;
    private javax.swing.JLabel boton;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables

    private void sacaLibrosPrestados(String id) {
        try {
            VarG.libros = new ArrayList<LibroG>();
            String result = "";
            String[] tupla, data;
            Registry registry = LocateRegistry.getRegistry();
            TestRemote testRemote = (TestRemote) registry.lookup("Test");
            result = testRemote.searchBook("", id, "prestamo", "", "");
            tupla = result.split("&");
            data = tupla[0].split("%");
            VarG.libros.add(new LibroG(data[0], Integer.parseInt(data[6]), data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5])));
            for (int i = 1; i < tupla.length; i++) {
                data = tupla[i].split("%");
                VarG.libros.add(new LibroG(data[0], Integer.parseInt(data[6]), data[1], data[2], Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[5])));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void limpiaLibrosDevueltos() {
        for (int i = 0; i < VarG.libros.size(); i++) {
            if (VarG.libros.get(i).isDevuelto()) {
                VarG.libros.remove(i);
            }
        }
    }
}
