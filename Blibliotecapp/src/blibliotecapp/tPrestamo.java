package blibliotecapp;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alan
 */
public class tPrestamo extends javax.swing.JFrame {

    /**
     * Creates new form tPrestamo
     */
    public tPrestamo() {
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

        jLNombre = new javax.swing.JLabel();
        jLID1 = new javax.swing.JLabel();
        jLID2 = new javax.swing.JLabel();
        jLID3 = new javax.swing.JLabel();
        jLID4 = new javax.swing.JLabel();
        jLibro1 = new javax.swing.JLabel();
        jLibro2 = new javax.swing.JLabel();
        jLibro3 = new javax.swing.JLabel();
        jLibro4 = new javax.swing.JLabel();
        jLFecha1 = new javax.swing.JLabel();
        jLFecha2 = new javax.swing.JLabel();
        jLFecha3 = new javax.swing.JLabel();
        jLFecha4 = new javax.swing.JLabel();
        jLBoton = new javax.swing.JLabel();
        jLBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLNombre.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 620, 60));

        jLID1.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLID1.setToolTipText("");
        getContentPane().add(jLID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, 100));

        jLID2.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLID2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 300, 100));

        jLID3.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLID3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 300, 100));

        jLID4.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        jLID4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLID4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 300, 100));

        jLibro1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLibro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 300, 100));

        jLibro2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLibro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLibro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 300, 100));

        jLibro3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLibro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLibro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 300, 100));

        jLibro4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLibro4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLibro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 300, 100));

        jLFecha1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLFecha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 300, 100));

        jLFecha2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLFecha2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 300, 100));

        jLFecha3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLFecha3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLFecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 300, 100));

        jLFecha4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLFecha4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLFecha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 300, 100));

        jLBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBotonMouseClicked(evt);
            }
        });
        getContentPane().add(jLBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 600, 140));

        jLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/nuevasP/tPrestamo.png"))); // NOI18N
        getContentPane().add(jLBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.jLNombre.setText(VarG.nombre + " " + VarG.appat);
        for (int i = 0; i < VarG.libros.size(); i++) {
            if (!VarG.libros.get(i).isDevuelto()) {
                VarG.libros.remove(i);
            }
        }
        try {
            Date now = new Date(System.currentTimeMillis());
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            c.setTime(now);
            c.add(Calendar.DATE, 3);
            if (VarG.libros.get(0).isDevuelto() && VarG.libros.get(0).getRenovacion()==0) {
                this.jLID1.setText(VarG.libros.get(0).getId_libro());
                this.jLibro1.setText(VarG.libros.get(0).getTitulo());
                this.jLFecha1.setText(date.format(c.getTime()));
            }
            if (VarG.libros.get(1).isDevuelto() && VarG.libros.get(1).getRenovacion()==0) {
                this.jLID2.setText(VarG.libros.get(1).getId_libro());
                this.jLibro2.setText(VarG.libros.get(1).getTitulo());
                this.jLFecha2.setText(date.format(c.getTime()));
            }
            if (VarG.libros.get(2).isDevuelto() && VarG.libros.get(2).getRenovacion()==0) {
                this.jLID3.setText(VarG.libros.get(2).getId_libro());
                this.jLibro3.setText(VarG.libros.get(2).getTitulo());
                this.jLFecha3.setText(date.format(c.getTime()));
            }
            if (VarG.libros.get(3).isDevuelto() && VarG.libros.get(3).getRenovacion()==0) {
                this.jLID4.setText(VarG.libros.get(3).getId_libro());
                this.jLibro4.setText(VarG.libros.get(3).getTitulo());
                this.jLFecha4.setText(date.format(c.getTime()));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jLBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBotonMouseClicked
        VarG.jfLogin.setVisible(false);
        VarG.jfPrestamo.setVisible(false);
        this.setVisible(false);
        VarG.jfIdioma.pausarAudios();
        VarG.anActual = VarG.animaciones.get(8);
        VarG.anActual.getImage().flush();
    }//GEN-LAST:event_jLBotonMouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        VarG.jfLogin.setVisible(false);
        this.setVisible(false);
        VarG.jfPrestamo.setVisible(false);
        VarG.jfIdioma.pausarAudios();
        VarG.anActual = VarG.animaciones.get(8);
        VarG.anActual.getImage().flush();
    }//GEN-LAST:event_formWindowLostFocus

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
            java.util.logging.Logger.getLogger(tPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tPrestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tPrestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLBackground;
    private javax.swing.JLabel jLBoton;
    private javax.swing.JLabel jLFecha1;
    private javax.swing.JLabel jLFecha2;
    private javax.swing.JLabel jLFecha3;
    private javax.swing.JLabel jLFecha4;
    private javax.swing.JLabel jLID1;
    private javax.swing.JLabel jLID2;
    private javax.swing.JLabel jLID3;
    private javax.swing.JLabel jLID4;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLibro1;
    private javax.swing.JLabel jLibro2;
    private javax.swing.JLabel jLibro3;
    private javax.swing.JLabel jLibro4;
    // End of variables declaration//GEN-END:variables
}
