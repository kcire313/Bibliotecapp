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

    public Blibliotecapp() {
        setPreferredSize(new Dimension(450, 450));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed at X: " + e.getX() + " Y: " + e.getY());
                System.out.println("ID: " + VariablesGlobales.id + " Prestamos: " + VariablesGlobales.prestamos);
                System.out.println("-----------------------------------------------------------------");
                if (e.getX() >= 600 && e.getX() <= 650 && e.getY() >= 90 && e.getY() <= 110) {
                    System.out.println("log in pressed");
                    Log_in log = new Log_in();
                    log.pack();
                    log.setLocationRelativeTo(null);
                    log.setVisible(true);
                }
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        Image fondo = new ImageIcon("src/surce/franja.gif").getImage();
        Image both = new ImageIcon("src/surce/bajo.png").getImage();
        Image placa = new ImageIcon("src/surce/placa.gif").getImage();
        Image boton = new ImageIcon("src/surce/botones3.png").getImage();
        //g.setColor(Color.WHITE);
        //1366 x 768  Mi tamaño de pantalla
        //g.fillRect(0, 0, 1366, 768);
        g.drawImage(fondo, 0, 0, 1366, 170, this);
        g.drawImage(both, 0, 17, 1366, 768, this);
        g.drawImage(placa, 1150, 50, this);
        g.drawImage(boton, 0,0,this);
        g.drawImage(new ImageIcon("src/surce/uaalogo.png").getImage(), 491, 50, this);
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
