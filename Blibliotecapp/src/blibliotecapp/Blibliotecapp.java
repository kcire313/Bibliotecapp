/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author erick
 */
public class Blibliotecapp extends JComponent {

    private boolean band = true;
    private Image fondo = new ImageIcon("src/surce/franja.gif").getImage();
    private Image both = new ImageIcon("src/surce/back.png").getImage();
    private Image placa = new ImageIcon("src/surce/placa.gif").getImage();
    private Image boton = new ImageIcon("src/surce/espaniol.png").getImage();
    private Image uaalogo = new ImageIcon("src/surce/uaalogo.png").getImage();
    private AudioStream audios;

    public Blibliotecapp() {
        preLoadAudios();
        InputStream music;
        try {
            music = new FileInputStream(new File("src\\Audios\\BienvenidaEsp.wav"));
            audios = new AudioStream(music);
            music = new FileInputStream(new File("src\\Audios\\PerfilEsp.wav"));
            VarG.aLogin = new AudioStream(music);
            music = new FileInputStream(new File("src\\Audios\\IdiomaEsp.wav"));
            VarG.aIdioma = new AudioStream(music);
            music = new FileInputStream(new File("src\\Audios\\PrestamoEsp.wav"));
            VarG.aPrestamo = new AudioStream(music);
            music = new FileInputStream(new File("src\\Audios\\RenovarPrestamoEsp.wav"));
            VarG.aRenovar = new AudioStream(music);
            music = new FileInputStream(new File("src\\Audios\\CanjeaEsp.wav"));
            VarG.aCanjear = new AudioStream(music);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
        //Instancias de animaciones
        VarG.anOpen = new javax.swing.ImageIcon(getClass().getResource("/surce/gif/libro-abre.gif"));
        VarG.anClose = new javax.swing.ImageIcon(getClass().getResource("/surce/gif/libro-cierra.gif"));
        VarG.anActual = VarG.anOpen;

        //Instancia de la pantalla de Inicio
        VarG.jfInicio = new Inicio();
        VarG.jfInicio.pack();
        VarG.jfInicio.setLocationRelativeTo(null);

        //Instancia de la pantalla de Busqueda
        VarG.jfBusqueda = new Busqueda();
        VarG.jfBusqueda.pack();
        VarG.jfBusqueda.setLocationRelativeTo(null);

        //Instancia de la pantalla de log-in
        VarG.jfLogin = new Log_in();
        VarG.jfLogin.pack();
        VarG.jfLogin.setLocationRelativeTo(null);

        //Instancia de la pantalla de perfilDatos
        VarG.jfPerfil = new perfilDatos();
        VarG.jfPerfil.pack();
        VarG.jfPerfil.setLocationRelativeTo(null);

        //Instancia de la pantalla del cambio de idioma
        VarG.jfIdioma = new Idioma();
        VarG.jfIdioma.pack();
        VarG.jfIdioma.setLocationRelativeTo(null);

        //Instancia de la pantalla de Devolucion
        VarG.jfDevolucion = new Devolucion();
        VarG.jfDevolucion.pack();
        VarG.jfDevolucion.setLocationRelativeTo(null);

        //Instancia de la pantalla del cambio de Prestamo
        VarG.jfPrestamo = new Prestamo();
        VarG.jfPrestamo.pack();
        VarG.jfPrestamo.setLocationRelativeTo(null);

        //Instancia de la pantalla del cambio de Renovar
        VarG.jfRenovar = new Renovar();
        VarG.jfRenovar.pack();
        VarG.jfRenovar.setLocationRelativeTo(null);

        //Instancia de la pantalla de cupones
        VarG.jfCanjear = new Canjear();
        VarG.jfCanjear.pack();
        VarG.jfCanjear.setLocationRelativeTo(null);

        //Instancia de la pantalla de Resultados de busqueda
        VarG.jfLibros = new Libros();
        VarG.jfLibros.pack();
        VarG.jfLibros.setLocationRelativeTo(null);

        //Key listener para la pantalla
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                preLoadAudios();
                //Botón búsqueda
                if (e.getX() >= 180 && e.getX() <= 430 && e.getY() >= 310 && e.getY() <= 714) {
                    System.out.println("Búsqueda");
                    AudioPlayer.player.start(VarG.aBusqueda);
                    VarG.jfBusqueda.setVisible(true);
                }
                //Botón prestamo
                if (e.getX() >= 430 && e.getX() <= 680 && e.getY() >= 310 && e.getY() <= 510) {
                    System.out.println("Prestamo");
                    VarG.currentFrame = "prestamo";
                    AudioPlayer.player.start(VarG.aLogin);
                    VarG.jfLogin.setVisible(true);
                    VarG.jfLogin.id.requestFocus();                    
                }
                //Botón devolución
                if (e.getX() >= 688 && e.getX() <= 938 && e.getY() >= 310 && e.getY() <= 510) {
                    System.out.println("devolución");
                    VarG.currentFrame = "devolucion";
                    AudioPlayer.player.start(VarG.aLogin);
                    VarG.jfLogin.setVisible(true);
                    VarG.jfLogin.id.requestFocus();
                }
                //Botón renovar
                if (e.getX() >= 942 && e.getX() <= 1192 && e.getY() >= 310 && e.getY() <= 510) {
                    System.out.println("renovar");
                    VarG.currentFrame = "renovar";
                    AudioPlayer.player.start(VarG.aLogin);
                    VarG.jfLogin.setVisible(true);
                    VarG.jfLogin.id.requestFocus();  
                }
                //Botón perfil 
                if (e.getX() >= 434 && e.getX() <= 650 && e.getY() >= 514 && e.getY() <= 714) {
                    System.out.println("Profile");
                    VarG.currentFrame = "perfil";
                    AudioPlayer.player.start(VarG.aLogin);
                    VarG.jfLogin.setVisible(true);
                    VarG.jfLogin.id.requestFocus();  
                }
                //Botón canjear
                if (e.getX() >= 688 && e.getX() <= 938 && e.getY() >= 514 && e.getY() <= 714) {
                    System.out.println("canjear");
                    VarG.currentFrame = "canjear";
                    AudioPlayer.player.start(VarG.aLogin);
                    VarG.jfLogin.setVisible(true);
                    VarG.jfLogin.id.requestFocus();  
                }
                //Botón idioma
                if (e.getX() >= 942 && e.getX() <= 1192 && e.getY() >= 514 && e.getY() <= 714) {
                    System.out.println("idioma");
                    AudioPlayer.player.start(VarG.aIdioma);
                    VarG.jfIdioma.setVisible(true);
                }
            }
        });
        AudioPlayer.player.start(audios);
        VarG.jfInicio.setVisible(true);
        callInicio();
    }

    @Override
    public void paint(Graphics g) {
        if (band) {
            callInicio();
            band = false;
        }
        switch (VarG.idioma) {
            case "espanol":
                boton = new ImageIcon("src/surce/espaniol.png").getImage();
                break;
            case "ingles":
                boton = new ImageIcon("src/surce/ingles.png").getImage();
                break;
            case "frances":
                boton = new ImageIcon("src/surce/espaniol.png").getImage();
                break;
            case "aleman":
                boton = new ImageIcon("src/surce/aleman.png").getImage();
                break;
        }
        //1366 x 768  Mi tamaño de pantalla
        //g.fillRect(0, 0, 1366, 768);
        g.drawImage(fondo, 0, 0, 1366, 170, this);
        g.drawImage(both, 0, 40, 1366, 768, this);
        g.drawImage(placa, 1150, 50, this);
        g.drawImage(boton, 0, 0, this);
        g.drawImage(uaalogo, 491, 50, this); //Logo de fuego
        g.setColor(Color.BLUE);
        //animaciones
        g.drawImage(VarG.anActual.getImage(), 0, 0, 1366, 768, this);
        //g.drawString("Log in", 600, 100);
    }

    public void cicloPrincipalJuego() throws Exception {
        while (true) {
            dibuja();
        }
    }

    private void dibuja() throws Exception {
        SwingUtilities.invokeAndWait(() -> {
            paintImmediately(0, 0, 450, 450);
        });
    }

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here        
        JFrame jf = new JFrame("Blibliotecapp");
        jf.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        jf.setResizable(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Already there
        jf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jf.setUndecorated(true);
        Blibliotecapp app = new Blibliotecapp();
        jf.getContentPane().add(app);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        app.cicloPrincipalJuego();
        app.callInicio();
    }

    private void preLoadAudios() {
        setAudioIdiomas();
        setAudioPerfil();
        setAudioPrestamo();
        setAudioRenovar();
        setAudioBusqueda();
        setAudioDevolucion();
        setAudioPerfilDatos();
        setAudioCanjear();
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
                    music = new FileInputStream(new File("src\\Audios\\RenovarPrestamoEsp.wav"));
                    break;
                case "aleman":
                    music = new FileInputStream(new File("src\\Audios\\RenovarPrestamoEsp.wav"));
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

    private void callInicio() {
        VarG.jfInicio.setVisible(true);
    }
}
