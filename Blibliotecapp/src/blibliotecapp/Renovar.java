/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author erick
 */
public class Renovar extends javax.swing.JFrame {

    /**
     * Creates new form perfilDatos
     */
    public Renovar() {
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
        home = new javax.swing.JLabel();
        LB1 = new javax.swing.JLabel();
        LB2 = new javax.swing.JLabel();
        LB3 = new javax.swing.JLabel();
        LB4 = new javax.swing.JLabel();
        Btinfo = new javax.swing.JLabel();
        Btaceptar = new javax.swing.JLabel();
        LBFondo = new javax.swing.JLabel();

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
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 140));

        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 170, 140));

        LB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/nuevasP/F-Continuar.png"))); // NOI18N
        getContentPane().add(LB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 990, 130));

        LB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/nuevasP/F-Continuar.png"))); // NOI18N
        getContentPane().add(LB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 990, 130));

        LB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/nuevasP/F-Continuar.png"))); // NOI18N
        getContentPane().add(LB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 990, 130));

        LB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/nuevasP/F-Continuar.png"))); // NOI18N
        getContentPane().add(LB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 990, 130));
        getContentPane().add(Btinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 150, 270, 440));
        getContentPane().add(Btaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 610, 270, 130));

        LBFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/nuevasP/renovacionI E.png"))); // NOI18N
        LBFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBFondoMouseClicked(evt);
            }
        });
        getContentPane().add(LBFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        VarG.jfIdioma.pausarAudios();
        VarG.jfLogin.setVisible(true);
        VarG.jfLogin.id.requestFocus();  
        System.out.println("return profile data");
        VarG.anActual = VarG.animaciones.get(10);
        VarG.anActual.getImage().flush();
    }//GEN-LAST:event_regresarMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        VarG.jfLogin.setVisible(false);
        this.setVisible(false);
        VarG.jfIdioma.pausarAudios();
        VarG.anActual = VarG.animaciones.get(10);
        VarG.anActual.getImage().flush();
    }//GEN-LAST:event_homeMouseClicked

    private void LBFondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBFondoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LBFondoMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(VarG.idioma.equals("espanol")){
            LBFondo.setIcon(new ImageIcon("src/surce/nuevasP/renovacionI E.png"));
        }else{
            LBFondo.setIcon(new ImageIcon("src/surce/nuevasP/renovacionI I.png"));
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Renovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Renovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Renovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Renovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Renovar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btaceptar;
    private javax.swing.JLabel Btinfo;
    private javax.swing.JLabel LB1;
    private javax.swing.JLabel LB2;
    private javax.swing.JLabel LB3;
    private javax.swing.JLabel LB4;
    private javax.swing.JLabel LBFondo;
    private javax.swing.JLabel home;
    private javax.swing.JLabel regresar;
    // End of variables declaration//GEN-END:variables
}
