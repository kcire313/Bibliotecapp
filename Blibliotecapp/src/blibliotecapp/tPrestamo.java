package blibliotecapp;

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 620, 60));
        getContentPane().add(jLID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 300, 100));
        getContentPane().add(jLID2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 300, 100));
        getContentPane().add(jLID3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 300, 100));
        getContentPane().add(jLID4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 300, 100));
        getContentPane().add(jLibro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 300, 100));
        getContentPane().add(jLibro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 300, 100));
        getContentPane().add(jLibro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 300, 100));
        getContentPane().add(jLibro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 300, 100));
        getContentPane().add(jLFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 300, 100));
        getContentPane().add(jLFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 300, 300, 100));
        getContentPane().add(jLFecha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 300, 100));
        getContentPane().add(jLFecha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, 300, 100));
        getContentPane().add(jLBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 600, 140));

        jLBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/nuevasP/tPrestamo.png"))); // NOI18N
        getContentPane().add(jLBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
