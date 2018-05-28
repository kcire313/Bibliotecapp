/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.audio.AudioStream;

/**
 *
 * @author erick
 */
public class Mapa extends javax.swing.JFrame {

    /**
     * Creates new form Idioma
     */
    public Mapa() {
        this.setUndecorated(true);
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

        regresar = new javax.swing.JLabel();
        Mapa = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMouseClicked(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 80));

        Mapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 900, 520));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_regresarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        background.setIcon(new ImageIcon("src/surce/nuevasP/mapa.png"));
        ImageIcon imageIcon = new ImageIcon("src/surce/nuevasP/mapaPlantaBaja1.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(imageIcon.getIconHeight() * 750 / 470, imageIcon.getIconHeight() * 700 / 800, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        Mapa.setIcon(imageIcon);
    }//GEN-LAST:event_formWindowActivated
    public void cambiaIdioma(String idioma) {
        VarG.idioma = idioma;
        imagesProfile(); //Cambia las imagenes del Log_in
        setAudioPerfil(); //Cambia el audio del boton de perfil
        setAudioBusqueda(); //Cambia el audio del boton de busqueda
        setAudioIdiomas(); //Cambia el audio del boton de idiomas
        setAudioPrestamo(); //Cambia el audio del boton de prestamo
        setAudioRenovar(); //Cambia el audio del boton de renovar
        setAudioDevolucion(); //Cambia el audio del boton de devolucion
        setAudioPerfilDatos(); //Cambia el audio del boton de perfil datos
        setAudioCanjear(); //Cambia el audio del boton de canjea
        

        //Faltan mas funciones para las demas pantallas!!!!
        this.setVisible(false); //Cierra la ventana
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
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Mapa;
    private javax.swing.JLabel background;
    private javax.swing.JLabel regresar;
    // End of variables declaration//GEN-END:variables

    private void imagesProfile() {
        ImageIcon icon = new ImageIcon("src/surce/logesp.png");
        switch (VarG.idioma) {
            case "espanol":
                icon = new ImageIcon("src/surce/logesp.png");
                break;
            case "ingles":
                icon = new ImageIcon("src/surce/logingles.png");
                break;
            case "frances":
                icon = new ImageIcon("src/surce/logesp.png");
                break;
            case "aleman":
                icon = new ImageIcon("src/surce/logale.png");
                break;
        }
        Log_in.background.setIcon(icon);
    }

    public void setAudioPerfil() {
        try {
            InputStream music = new FileInputStream(new File("src\\Audios\\IngresoDatosEsp.wav"));
            switch (VarG.idioma) {
                case "espanol":
                    music = new FileInputStream(new File("src\\Audios\\IngresoDatosEsp.wav"));
                    break;
                case "ingles":
                    music = new FileInputStream(new File("src\\Audios\\IngresoDatosEng.wav"));
                    break;
                case "frances":
                    music = new FileInputStream(new File("src\\Audios\\IngresoDatosEsp.wav"));
                    break;
                case "aleman":
                    music = new FileInputStream(new File("src\\Audios\\IngresoDatosEsp.wav"));
                    break;
            }
            VarG.aLogin = new AudioStream(music);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void setAudioIdiomas() {
        try {
            InputStream music = new FileInputStream(new File("src\\Audios\\IdiomaEsp.wav"));
            switch (VarG.idioma) {
                case "espanol":
                    music = new FileInputStream(new File("src\\Audios\\IdiomaEsp.wav"));
                    break;
                case "ingles":
                    music = new FileInputStream(new File("src\\Audios\\IdiomaEng.wav"));
                    break;
                case "frances":
                    music = new FileInputStream(new File("src\\Audios\\IdiomaEsp.wav"));
                    break;
                case "aleman":
                    music = new FileInputStream(new File("src\\Audios\\IdiomaEsp.wav"));
                    break;
            }
            VarG.aIdioma = new AudioStream(music);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void setAudioPrestamo() {
        try {
            InputStream music = new FileInputStream(new File("src\\Audios\\PrestamoEsp.wav"));
            switch (VarG.idioma) {
                case "espanol":
                    music = new FileInputStream(new File("src\\Audios\\PrestamoEsp.wav"));
                    break;
                case "ingles":
                    music = new FileInputStream(new File("src\\Audios\\PrestamoEng.wav"));
                    break;
                case "frances":
                    music = new FileInputStream(new File("src\\Audios\\PrestamoEsp.wav"));
                    break;
                case "aleman":
                    music = new FileInputStream(new File("src\\Audios\\PrestamoEsp.wav"));
                    break;
            }
            VarG.aPrestamo = new AudioStream(music);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void setAudioRenovar() {
        try {
            InputStream music = new FileInputStream(new File("src\\Audios\\RenovarPrestamoEsp.wav"));
            switch (VarG.idioma) {
                case "espanol":
                    music = new FileInputStream(new File("src\\Audios\\RenovarPrestamoEsp.wav"));
                    break;
                case "ingles":
                    music = new FileInputStream(new File("src\\Audios\\RenovarPrestamoEng.wav"));
                    break;
                case "frances":
                    music = new FileInputStream(new File("src\\Audios\\RenovarPrestamoEsp.wav"));
                    break;
                case "aleman":
                    music = new FileInputStream(new File("src\\Audios\\RenovarPrestamoEsp.wav"));
                    break;
            }
            VarG.aRenovar = new AudioStream(music);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private void setAudioBusqueda() {
        try {
            InputStream music = new FileInputStream(new File("src\\Audios\\LLenarCasillasEsp2.wav"));
            switch (VarG.idioma) {
                case "espanol":
                    music = new FileInputStream(new File("src\\Audios\\LLenarCasillasEsp2.wav"));
                    break;
                case "ingles":
                    music = new FileInputStream(new File("src\\Audios\\LLenarCasillasEng.wav"));
                    break;
                case "frances":
                    music = new FileInputStream(new File("src\\Audios\\LLenarCasillasEsp2.wav"));
                    break;
                case "aleman":
                    music = new FileInputStream(new File("src\\Audios\\LLenarCasillasEsp2.wav"));
                    break;
            }
            VarG.aBusqueda = new AudioStream(music);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    private void setAudioDevolucion() {
        try {
            InputStream music = new FileInputStream(new File("src\\Audios\\DevuelveEsp.wav"));
            switch (VarG.idioma) {
                case "espanol":
                    music = new FileInputStream(new File("src\\Audios\\DevuelveEsp.wav"));
                    break;
                case "ingles":
                    music = new FileInputStream(new File("src\\Audios\\DevuelveEng.wav"));
                    break;
                case "frances":
                    music = new FileInputStream(new File("src\\Audios\\DevuelveEsp.wav"));
                    break;
                case "aleman":
                    music = new FileInputStream(new File("src\\Audios\\DevuelveEsp.wav"));
                    break;
            }
            VarG.aDevolucion = new AudioStream(music);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void setAudioPerfilDatos() {
        try {
            InputStream music = new FileInputStream(new File("src\\Audios\\DatosPerfilEsp.wav"));
            switch (VarG.idioma) {
                case "espanol":
                    music = new FileInputStream(new File("src\\Audios\\DatosPerfilEsp.wav"));
                    break;
                case "ingles":
                    music = new FileInputStream(new File("src\\Audios\\DatosPerfilEng.wav"));
                    break;
                case "frances":
                    music = new FileInputStream(new File("src\\Audios\\DatosPerfilEsp.wav"));
                    break;
                case "aleman":
                    music = new FileInputStream(new File("src\\Audios\\DatosPerfilEsp.wav"));
                    break;
            }
            VarG.aPerfilDatos = new AudioStream(music);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void setAudioCanjear() {
        try {
            InputStream music = new FileInputStream(new File("src\\Audios\\CanjeaEsp.wav"));
            switch (VarG.idioma) {
                case "espanol":
                    music = new FileInputStream(new File("src\\Audios\\CanjeaEsp.wav"));
                    break;
                case "ingles":
                    music = new FileInputStream(new File("src\\Audios\\CanjeaEsp.wav"));
                    break;
                case "frances":
                    music = new FileInputStream(new File("src\\Audios\\CanjeaEsp.wav"));
                    break;
                case "aleman":
                    music = new FileInputStream(new File("src\\Audios\\CanjeaEsp.wav"));
                    break;
            }
            VarG.aPerfilDatos = new AudioStream(music);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}