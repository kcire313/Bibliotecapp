/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author erick
 */
public class Blibliotecapp extends JComponent {

    private Image fondo = new ImageIcon("src/surce/franja.gif").getImage();
    private Image both = new ImageIcon("src/surce/back.png").getImage();
    private Image placa = new ImageIcon("src/surce/placa.gif").getImage();
    private Image boton = new ImageIcon("src/surce/espaniol.png").getImage();
    private Image uaalogo = new ImageIcon("src/surce/uaalogo.png").getImage();

    public Blibliotecapp() {
        setPreferredSize(new Dimension(450, 450));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                //System.out.println("Mouse pressed at X: " + e.getX() + " Y: " + e.getY());
                //System.out.println("ID: " + VariablesGlobales.id + " Prestamos: " + VariablesGlobales.prestamos);
                //System.out.println("-----------------------------------------------------------------");
                //Botón búsqueda
                if (e.getX() >= 180 && e.getX() <= 430 && e.getY() >= 310 && e.getY() <= 714) {
                    System.out.println("Búsqueda");
                }
                //Botón prestamo
                if (e.getX() >= 430 && e.getX() <= 680 && e.getY() >= 310 && e.getY() <= 510) {
                    System.out.println("Prestamo");
                }
                //Botón devolución
                if (e.getX() >= 688 && e.getX() <= 938 && e.getY() >= 310 && e.getY() <= 510) {
                    System.out.println("devolución");
                }
                //Botón renovar
                if (e.getX() >= 942 && e.getX() <= 1192 && e.getY() >= 310 && e.getY() <= 510) {
                    System.out.println("renovar");
                }
                //Botón perfil 
                if (e.getX() >= 434 && e.getX() <= 650 && e.getY() >= 514 && e.getY() <= 714) {
                    System.out.println("Profile");
                    Log_in log = new Log_in();
                    log.pack();
                    log.setLocationRelativeTo(null);
                    log.setVisible(true);
                }
                //Botón canjear
                if (e.getX() >= 688 && e.getX() <= 938 && e.getY() >= 514 && e.getY() <= 714) {
                    System.out.println("canjear");
                }
                //Botón idioma
                if (e.getX() >= 942 && e.getX() <= 1192 && e.getY() >= 514 && e.getY() <= 714) {
                    System.out.println("idioma");
                    Idioma log = new Idioma();
                    log.pack();
                    log.setLocationRelativeTo(null);
                    log.setVisible(true);
                }
                
            }
        });
    }

    @Override
    public void paint(Graphics g) {      
        switch(VariablesGlobales.idioma){
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
        g.drawString("Log in", 600, 100);
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
    }
}
