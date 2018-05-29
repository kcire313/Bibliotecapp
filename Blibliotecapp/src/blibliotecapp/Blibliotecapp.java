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
import java.util.ArrayList;
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
    public boolean audioOnOff = true;
    private Image fondo = new ImageIcon("src/surce/franja.gif").getImage();
    private Image both = new ImageIcon("src/surce/back.png").getImage();
    private Image placa = new ImageIcon("src/surce/placa.gif").getImage();
    private Image boton = new ImageIcon("src/surce/espaniol.png").getImage();
    private Image uaalogo = new ImageIcon("src/surce/uaalogo.png").getImage();
    private Image audio = new ImageIcon("src/surce/nuevasP/high-volume.png").getImage();
    private Image aActual = audio;
    private Image noAudio = new ImageIcon("src/surce/nuevasP/no-audio.png").getImage();
    private AudioStream audios;

    public Blibliotecapp() {
        InputStream music;
        try {
            music = new FileInputStream(new File("src\\Audios\\BienvenidaEsp.wav"));
            VarG.aBienvenida = new AudioStream(music);            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
        //Instancias de animaciones
        VarG.animaciones = new ArrayList<ImageIcon>();
        VarG.animaciones.add(new ImageIcon("src/surce/gif/L-A-B.gif"));    //0
        VarG.animaciones.add(new ImageIcon("src/surce/gif/L-A-I.gif"));    //1
        VarG.animaciones.add(new ImageIcon("src/surce/gif/L-A-L.gif"));    //2
        VarG.animaciones.add(new ImageIcon("src/surce/gif/L-C-B.gif"));    //3
        VarG.animaciones.add(new ImageIcon("src/surce/gif/L-C-C.gif"));    //4
        VarG.animaciones.add(new ImageIcon("src/surce/gif/L-C-I.gif"));    //5
        VarG.animaciones.add(new ImageIcon("src/surce/gif/L-C-L.gif"));    //6
        VarG.animaciones.add(new ImageIcon("src/surce/gif/L-C-P.gif"));    //7
        VarG.animaciones.add(new ImageIcon("src/surce/gif/L-C-PD.gif"));   //8
        VarG.animaciones.add(new ImageIcon("src/surce/gif/L-C-Q.gif"));    //9
        VarG.animaciones.add(new ImageIcon("src/surce/gif/L-C-R.gif"));    //10
        VarG.anActual = new ImageIcon("src/surce/libro-abre.gif");
        
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
        
        //Carga los audios
        VarG.jfIdioma.loadAudios();
        
        //Mapa
        VarG.jmapa = new Mapa();
        VarG.jmapa.pack();
        VarG.jmapa.setLocationRelativeTo(null);
        
        //ticket cupon
        VarG.jtcupon = new tCupon();
        VarG.jtcupon.pack();
        VarG.jtcupon.setLocationRelativeTo(null);
        
        //Ticket prestamo
        VarG.jtPrestamo = new tPrestamo();
        VarG.jtPrestamo.pack();
        VarG.jtPrestamo.setLocationRelativeTo(null);
        
        //Ticket devolucion
        VarG.jtDevolucion = new tDevolucion();
        VarG.jtDevolucion.pack();
        VarG.jtDevolucion.setLocationRelativeTo(null);
        
        //Ticket libro
        VarG.jtLibro = new tLibro();
        VarG.jtLibro.pack();
        VarG.jtLibro.setLocationRelativeTo(null);
        
        //Key listener para la pantalla
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (audioOnOff) {                    
                    VarG.jfIdioma.loadAudios();
                }
                //Botón búsqueda
                if (e.getX() >= 180 && e.getX() <= 430 && e.getY() >= 310 && e.getY() <= 714) {
                    System.out.println("Búsqueda");
                    VarG.jfIdioma.pausarAudios();
                    AudioPlayer.player.start(VarG.aBusqueda);
                    VarG.jfBusqueda.setVisible(true);
                }
                //Botón prestamo
                if (e.getX() >= 430 && e.getX() <= 680 && e.getY() >= 310 && e.getY() <= 510) {
                    System.out.println("Prestamo");
                    VarG.currentFrame = "prestamo";
                    VarG.jfIdioma.pausarAudios();
                    AudioPlayer.player.start(VarG.aLogin);
                    VarG.jfLogin.setVisible(true);
                    VarG.jfLogin.id.requestFocus();
                }
                //Botón devolución
                if (e.getX() >= 688 && e.getX() <= 938 && e.getY() >= 310 && e.getY() <= 510) {
                    System.out.println("devolución");
                    VarG.currentFrame = "devolucion";
                    VarG.jfIdioma.pausarAudios();
                    AudioPlayer.player.start(VarG.aLogin);
                    VarG.jfLogin.setVisible(true);
                    VarG.jfLogin.id.requestFocus();
                }
                //Botón renovar
                if (e.getX() >= 942 && e.getX() <= 1192 && e.getY() >= 310 && e.getY() <= 510) {
                    System.out.println("renovar");
                    VarG.currentFrame = "renovar";
                    VarG.jfIdioma.pausarAudios();
                    AudioPlayer.player.start(VarG.aLogin);
                    VarG.jfLogin.setVisible(true);
                    VarG.jfLogin.id.requestFocus();
                }
                //Botón perfil 
                if (e.getX() >= 434 && e.getX() <= 650 && e.getY() >= 514 && e.getY() <= 714) {
                    System.out.println("Profile");
                    VarG.currentFrame = "perfil";
                    VarG.jfIdioma.pausarAudios();
                    AudioPlayer.player.start(VarG.aLogin);
                    VarG.jfLogin.setVisible(true);
                    VarG.jfLogin.id.requestFocus();
                }
                //Botón canjear
                if (e.getX() >= 688 && e.getX() <= 938 && e.getY() >= 514 && e.getY() <= 714) {
                    System.out.println("canjear");
                    VarG.currentFrame = "canjear";
                    VarG.jfIdioma.pausarAudios();
                    AudioPlayer.player.start(VarG.aLogin);
                    VarG.jfLogin.setVisible(true);
                    VarG.jfLogin.id.requestFocus();
                }
                //Botón idioma
                if (e.getX() >= 942 && e.getX() <= 1192 && e.getY() >= 514 && e.getY() <= 714) {
                    System.out.println("idioma");
                    VarG.jfIdioma.pausarAudios();
                    AudioPlayer.player.start(VarG.aIdioma);
                    VarG.jfIdioma.setVisible(true);
                }                
                //Botón idioma
                if (e.getX() >= 1230 && e.getX() <= 1330 && e.getY() >= 660 && e.getY() <= 760) {
                    System.out.println("audio");
                    VarG.jfIdioma.pausarAudios();
                    turnOnOffAudios();
                }

            }
        });
        AudioPlayer.player.start(VarG.aBienvenida);
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
                boton = new ImageIcon("src/surce/botonesE.png").getImage();
                break;
            case "ingles":
                boton = new ImageIcon("src/surce/botonesI.png").getImage();
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
        g.drawImage(aActual, 1230, 660, this);
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

    private void turnOnOffAudios() {
        if (audioOnOff) {
            aActual=noAudio;
            VarG.jfIdioma.cleanAudios();
            audioOnOff = false;
        } else {
            aActual=audio;
            VarG.jfIdioma.loadAudios();
            audioOnOff = true;
        }
    }

    
    
    private void callInicio() {
        VarG.jfInicio.setVisible(true);
    }

}
