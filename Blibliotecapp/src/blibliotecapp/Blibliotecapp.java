/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JComponent;
import javax.swing.JFrame;
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

            }
        });
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 450, 450);
        g.setColor(Color.BLACK);
        g.drawString("Pagina de prueba", 10, 10);
    }

    public void cicloPrincipalJuego() throws Exception {
        while (true) {
            dibuja();
        }
    }

    private void dibuja() throws Exception {
        SwingUtilities.invokeAndWait(new Runnable() {
            @Override
            public void run() {
                paintImmediately(0, 0, 450, 450);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here        
        JFrame jf = new JFrame("Blibliotecapp");
        jf.addWindowListener(new WindowAdapter() {
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
        jf.setVisible(true);
        app.cicloPrincipalJuego();
    }
}
