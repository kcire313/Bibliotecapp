package blibliotecapp;

import java.awt.Color;
import java.text.SimpleDateFormat;
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
public class tDevolucion extends javax.swing.JFrame {

    /**
     * Creates new form tPrestamo
     */
    public tDevolucion() {
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

        jLID1 = new javax.swing.JLabel();
        jLID2 = new javax.swing.JLabel();
        jLID3 = new javax.swing.JLabel();
        jLID4 = new javax.swing.JLabel();
        jLibro1 = new javax.swing.JLabel();
        jLibro2 = new javax.swing.JLabel();
        jLibro3 = new javax.swing.JLabel();
        jLibro4 = new javax.swing.JLabel();
        jLPts1 = new javax.swing.JLabel();
        jLPts2 = new javax.swing.JLabel();
        jLPts3 = new javax.swing.JLabel();
        jLPts4 = new javax.swing.JLabel();
        jLCob1 = new javax.swing.JLabel();
        jLCob2 = new javax.swing.JLabel();
        jLCob3 = new javax.swing.JLabel();
        jLCob4 = new javax.swing.JLabel();
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

        jLID1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 210, 80));

        jLID2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLID2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 210, 80));

        jLID3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLID3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 210, 80));

        jLID4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLID4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLID4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 210, 80));

        jLibro1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLibro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 210, 80));

        jLibro2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLibro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLibro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 210, 80));

        jLibro3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLibro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLibro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 210, 80));

        jLibro4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLibro4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLibro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 210, 80));

        jLPts1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLPts1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLPts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 210, 80));

        jLPts2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLPts2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLPts2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 210, 80));

        jLPts3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLPts3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLPts3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 210, 80));

        jLPts4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLPts4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLPts4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 210, 80));

        jLCob1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLCob1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLCob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 210, 80));

        jLCob2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLCob2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLCob2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 210, 80));

        jLCob3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLCob3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLCob3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 210, 80));

        jLCob4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLCob4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLCob4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, 210, 80));

        jLBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLBotonMouseClicked(evt);
            }
        });
        getContentPane().add(jLBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 400, 200));

        jLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/nuevasP/tDevolucion.png"))); // NOI18N
        getContentPane().add(jLBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        for (int i = 0; i < VarG.libros.size(); i++) {
            if (!VarG.libros.get(i).isDevuelto()) {
                VarG.libros.remove(i);
            }
        }
        try {
            if (VarG.libros.get(0).isDevuelto()) {
                this.jLID1.setText(VarG.libros.get(0).getId_libro());
                this.jLibro1.setText(VarG.libros.get(0).getTitulo());
                this.jLPts1.setForeground(Color.BLUE);
                this.jLPts1.setText("10");
                this.jLCob1.setForeground(Color.RED);
                this.jLCob1.setText("0");
            }
            if (VarG.libros.get(1).isDevuelto()) {
                 this.jLID1.setText(VarG.libros.get(1).getId_libro());
                this.jLibro1.setText(VarG.libros.get(1).getTitulo());
                this.jLPts1.setForeground(Color.BLUE);
                this.jLPts1.setText("10");
                this.jLCob1.setForeground(Color.RED);
                this.jLCob1.setText("0");
            }
            if (VarG.libros.get(2).isDevuelto()) {
                 this.jLID1.setText(VarG.libros.get(2).getId_libro());
                this.jLibro1.setText(VarG.libros.get(2).getTitulo());
                this.jLPts1.setForeground(Color.BLUE);
                this.jLPts1.setText("10");
                this.jLCob1.setForeground(Color.RED);
                this.jLCob1.setText("0");
            }
            if (VarG.libros.get(3).isDevuelto()) {
                 this.jLID1.setText(VarG.libros.get(3).getId_libro());
                this.jLibro1.setText(VarG.libros.get(3).getTitulo());
                this.jLPts1.setForeground(Color.BLUE);
                this.jLPts1.setText("10");
                this.jLCob1.setForeground(Color.RED);
                this.jLCob1.setText("0");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jLBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLBotonMouseClicked
        VarG.jfLogin.setVisible(false);
        VarG.jfDevolucion.setVisible(false);
        this.setVisible(false);
        VarG.jfIdioma.pausarAudios();
        VarG.anActual = VarG.animaciones.get(8);
        VarG.anActual.getImage().flush();
    }//GEN-LAST:event_jLBotonMouseClicked

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        VarG.jfLogin.setVisible(false);
        VarG.jfDevolucion.setVisible(false);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(tDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tDevolucion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tDevolucion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLBackground;
    private javax.swing.JLabel jLBoton;
    private javax.swing.JLabel jLCob1;
    private javax.swing.JLabel jLCob2;
    private javax.swing.JLabel jLCob3;
    private javax.swing.JLabel jLCob4;
    private javax.swing.JLabel jLID1;
    private javax.swing.JLabel jLID2;
    private javax.swing.JLabel jLID3;
    private javax.swing.JLabel jLID4;
    private javax.swing.JLabel jLPts1;
    private javax.swing.JLabel jLPts2;
    private javax.swing.JLabel jLPts3;
    private javax.swing.JLabel jLPts4;
    private javax.swing.JLabel jLibro1;
    private javax.swing.JLabel jLibro2;
    private javax.swing.JLabel jLibro3;
    private javax.swing.JLabel jLibro4;
    // End of variables declaration//GEN-END:variables
}
