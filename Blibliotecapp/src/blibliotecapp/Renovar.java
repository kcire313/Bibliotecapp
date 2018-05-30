/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        Btinfo = new javax.swing.JLabel();
        Btaceptar = new javax.swing.JLabel();
        LBdev1 = new javax.swing.JLabel();
        LBn1 = new javax.swing.JLabel();
        LBtit2 = new javax.swing.JLabel();
        LBn4 = new javax.swing.JLabel();
        LBdev3 = new javax.swing.JLabel();
        LBr1 = new javax.swing.JLabel();
        LBdev2 = new javax.swing.JLabel();
        LBdat1 = new javax.swing.JLabel();
        LBn2 = new javax.swing.JLabel();
        LBdat2 = new javax.swing.JLabel();
        Btop2 = new javax.swing.JLabel();
        LBdat3 = new javax.swing.JLabel();
        LBr4 = new javax.swing.JLabel();
        LBr3 = new javax.swing.JLabel();
        Btop4 = new javax.swing.JLabel();
        Btop1 = new javax.swing.JLabel();
        LBtit1 = new javax.swing.JLabel();
        LBdev4 = new javax.swing.JLabel();
        LBtit4 = new javax.swing.JLabel();
        LBdat4 = new javax.swing.JLabel();
        LBn3 = new javax.swing.JLabel();
        Btop3 = new javax.swing.JLabel();
        LBr2 = new javax.swing.JLabel();
        LBtit3 = new javax.swing.JLabel();
        LB2 = new javax.swing.JLabel();
        LB1 = new javax.swing.JLabel();
        LB3 = new javax.swing.JLabel();
        LB4 = new javax.swing.JLabel();
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

        Btinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtinfoMouseClicked(evt);
            }
        });
        getContentPane().add(Btinfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 150, 270, 440));

        Btaceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtaceptarMouseClicked(evt);
            }
        });
        getContentPane().add(Btaceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 610, 270, 130));

        LBdev1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LBdev1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBdev1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 190, 110));

        LBn1.setFont(new java.awt.Font("Arial Black", 0, 50)); // NOI18N
        LBn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 234, 110, 100));

        LBtit2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(LBtit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 420, 50));

        LBn4.setFont(new java.awt.Font("Arial Black", 0, 50)); // NOI18N
        LBn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 620, 110, 110));

        LBdev3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LBdev3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBdev3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 190, 110));

        LBr1.setFont(new java.awt.Font("Arial Black", 0, 50)); // NOI18N
        LBr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 90, 110));

        LBdev2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LBdev2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBdev2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 190, 110));

        LBdat1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(LBdat1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 420, 50));

        LBn2.setFont(new java.awt.Font("Arial Black", 0, 50)); // NOI18N
        LBn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 110, 110));

        LBdat2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(LBdat2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 420, 50));

        Btop2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btop2MouseClicked(evt);
            }
        });
        getContentPane().add(Btop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 360, 120, 110));

        LBdat3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(LBdat3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 540, 420, 50));

        LBr4.setFont(new java.awt.Font("Arial Black", 0, 50)); // NOI18N
        LBr4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 90, 110));

        LBr3.setFont(new java.awt.Font("Arial Black", 0, 50)); // NOI18N
        LBr3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 90, 110));

        Btop4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btop4MouseClicked(evt);
            }
        });
        getContentPane().add(Btop4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, 120, 110));

        Btop1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btop1MouseClicked(evt);
            }
        });
        getContentPane().add(Btop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 230, 120, 110));

        LBtit1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(LBtit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 420, 50));

        LBdev4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LBdev4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBdev4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 620, 190, 120));

        LBtit4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(LBtit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 620, 420, 50));

        LBdat4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(LBdat4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 670, 420, 50));

        LBn3.setFont(new java.awt.Font("Arial Black", 0, 50)); // NOI18N
        LBn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 110, 110));

        Btop3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btop3MouseClicked(evt);
            }
        });
        getContentPane().add(Btop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 490, 120, 110));

        LBr2.setFont(new java.awt.Font("Arial Black", 0, 50)); // NOI18N
        LBr2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 90, 110));

        LBtit3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(LBtit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 420, 50));
        getContentPane().add(LB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 990, 130));

        LB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LB1MouseClicked(evt);
            }
        });
        getContentPane().add(LB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 990, 130));
        getContentPane().add(LB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 990, 130));
        getContentPane().add(LB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 990, 130));

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
        fondo = new ArrayList<ImageIcon>();
        if (VarG.idioma.equals("espanol")) {
            fondo.add(new ImageIcon("src/surce/nuevasP/renovacionI E.png"));
            fondo.add(new ImageIcon("src/surce/nuevasP/renovacion E.png"));
            LBFondo.setIcon(fondo.get(0));
        } else {
            fondo.add(new ImageIcon("src/surce/nuevasP/renovacionI I.png"));
            fondo.add(new ImageIcon("src/surce/nuevasP/renovacion I.png"));
            LBFondo.setIcon(fondo.get(0));
        }
        limpiar(5);
        k1=k2=k3=k4 = false;
        //Por alguna razon aqui saca todos los libros como si fuera Query de Perfil, en vez de corregir Server
        //Solo quitare el libro extra y si hay error entonces corregimos
        for (int i = 0; i < VarG.libros.size(); i++) {
            if (VarG.libros.get(i).isDevuelto()) {
                VarG.libros.remove(i);
            }
        }

        pintardev();

    }//GEN-LAST:event_formWindowActivated

    private void BtinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtinfoMouseClicked
        ImageIcon aux = fondo.remove(0);
        fondo.add(aux);
        LBFondo.setIcon(fondo.get(0));
    }//GEN-LAST:event_BtinfoMouseClicked

    private void Btop2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btop2MouseClicked
        VarG.libros.get(1).setDevuelto(!VarG.libros.get(1).isDevuelto());
        this.pintardev();
    }//GEN-LAST:event_Btop2MouseClicked

    private void Btop4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btop4MouseClicked
        VarG.libros.get(3).setDevuelto(!VarG.libros.get(3).isDevuelto());
        this.pintardev();
    }//GEN-LAST:event_Btop4MouseClicked

    private void Btop1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btop1MouseClicked
        VarG.libros.get(0).setDevuelto(!VarG.libros.get(0).isDevuelto());
        this.pintardev();
    }//GEN-LAST:event_Btop1MouseClicked

    private void Btop3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btop3MouseClicked
        VarG.libros.get(2).setDevuelto(!VarG.libros.get(2).isDevuelto());
        this.pintardev();
    }//GEN-LAST:event_Btop3MouseClicked

    private void LB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LB1MouseClicked

    }//GEN-LAST:event_LB1MouseClicked

    private void BtaceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtaceptarMouseClicked
        if(k1){}
        if(k2){}
        if(k3){}
        if(k4){}
    }//GEN-LAST:event_BtaceptarMouseClicked

    public void pintardev() {
        
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        
        Date now = new Date(System.currentTimeMillis());
        now.setHours(0);
        now.setMinutes(0);
        now.setSeconds(0);
        Date l1, l2, l3, l4, p1, p2, p3, p4;
        l1 = new Date();
        l2 = new Date();
        l3 = new Date();
        l4 = new Date();
        p1 = new Date();
        p2 = new Date();
        p3 = new Date();
        p4 = new Date();
        
        try {
            p1 = date.parse(VarG.libros.get(0).getFecha_dev());
            p2 = date.parse(VarG.libros.get(1).getFecha_dev());
            p3 = date.parse(VarG.libros.get(2).getFecha_dev());
            p4 = date.parse(VarG.libros.get(3).getFecha_dev());
            l1 = date.parse(VarG.libros.get(0).getFecha_pres());
            l2 = date.parse(VarG.libros.get(1).getFecha_pres());
            l3 = date.parse(VarG.libros.get(2).getFecha_pres());
            l4 = date.parse(VarG.libros.get(3).getFecha_pres());
        } catch (ParseException ex) {
            Logger.getLogger(Renovar.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (now.compareTo(l1) != 0) {
                if (now.compareTo(p1) < 0 || VarG.libros.get(0).getRenovacion() == 3) {
                    if (VarG.libros.get(0).isDevuelto()) {
                        this.LBn1.setText("1");
                        this.LBr1.setText(Integer.toString(VarG.libros.get(0).getRenovacion()));
                        this.LBdev1.setText(VarG.libros.get(0).getFecha_dev());
                        this.LBtit1.setText(VarG.libros.get(0).getTitulo());
                        this.LBtit1.setForeground(Color.BLACK);
                        this.LBdat1.setText(VarG.libros.get(0).getAutor() + "/ año: " + VarG.libros.get(0).getAnio());
                        this.LBdat1.setForeground(Color.BLACK);
                        this.LB1.setIcon(new ImageIcon("src/surce/nuevasP/F-Continuar.png"));
                        k1=true;
                    } else {
                        this.LBn1.setText("1");
                        this.LBr1.setText(Integer.toString(VarG.libros.get(0).getRenovacion()));
                        this.LBdev1.setText(VarG.libros.get(0).getFecha_dev());
                        this.LBtit1.setForeground(Color.BLACK);
                        this.LBdat1.setText(VarG.libros.get(0).getAutor() + "/ año: " + VarG.libros.get(0).getAnio());
                        this.LBdat1.setForeground(Color.BLACK);
                        this.LBtit1.setText(VarG.libros.get(0).getTitulo());
                        this.LB1.setIcon(new ImageIcon("src/surce/nuevasP/F-Cancelar.png"));
                        k1=false;
                    }
                } else {
                    this.LBn1.setText("1");
                    this.LBr1.setText(Integer.toString(VarG.libros.get(0).getRenovacion()));
                    this.LBdev1.setText(VarG.libros.get(0).getFecha_dev());
                    this.LBtit1.setForeground(Color.GRAY);
                    this.LBdat1.setText(VarG.libros.get(0).getAutor() + "/ año: " + VarG.libros.get(0).getAnio());
                    this.LBdat1.setForeground(Color.GRAY);
                    this.LBtit1.setText(VarG.libros.get(0).getTitulo());
                    this.LB1.setIcon(new ImageIcon("src/surce/nuevasP/F-Prohibido.png"));
                }

            } else {
                this.LBn1.setText("1");
                this.LBr1.setText(Integer.toString(VarG.libros.get(0).getRenovacion()));
                this.LBdev1.setText(VarG.libros.get(0).getFecha_dev());
                this.LBtit1.setForeground(Color.GRAY);
                this.LBdat1.setText(VarG.libros.get(0).getAutor() + "/ año: " + VarG.libros.get(0).getAnio());
                this.LBdat1.setForeground(Color.GRAY);
                this.LBtit1.setText(VarG.libros.get(0).getTitulo());
                this.LB1.setIcon(new ImageIcon("src/surce/nuevasP/F-Neutral.png"));
            }
            if (now.compareTo(l2) != 0) {
                if (now.compareTo(p2) < 0 || VarG.libros.get(0).getRenovacion() == 3) {
                    if (VarG.libros.get(1).isDevuelto()) {
                        this.LBn2.setText("2");
                        this.LBr2.setText(Integer.toString(VarG.libros.get(1).getRenovacion()));
                        this.LBdev2.setText(VarG.libros.get(1).getFecha_dev());
                        this.LBtit2.setText(VarG.libros.get(1).getTitulo());
                        this.LBtit2.setForeground(Color.BLACK);
                        this.LBdat2.setText(VarG.libros.get(1).getAutor() + "/ año: " + VarG.libros.get(1).getAnio());
                        this.LBdat2.setForeground(Color.BLACK);
                        this.LB2.setIcon(new ImageIcon("src/surce/nuevasP/F-Continuar.png"));
                        k2=true;
                    } else {
                        this.LBn2.setText("2");
                        this.LBtit2.setForeground(Color.BLACK);
                        this.LBdat2.setForeground(Color.BLACK);
                        this.LBr2.setText(Integer.toString(VarG.libros.get(1).getRenovacion()));
                        this.LBdev2.setText(VarG.libros.get(1).getFecha_dev());
                        this.LBtit2.setText(VarG.libros.get(1).getTitulo());
                        this.LBdat2.setText(VarG.libros.get(1).getAutor() + "/ año: " + VarG.libros.get(1).getAnio());
                        this.LB2.setIcon(new ImageIcon("src/surce/nuevasP/F-Cancelar.png"));
                        k2=false;
                    }
                } else {
                    this.LBn2.setText("2");
                    this.LBtit2.setForeground(Color.GRAY);
                    this.LBdat2.setForeground(Color.GRAY);
                    this.LBr2.setText(Integer.toString(VarG.libros.get(1).getRenovacion()));
                    this.LBdev2.setText(VarG.libros.get(1).getFecha_dev());
                    this.LBtit2.setText(VarG.libros.get(1).getTitulo());
                    this.LBdat2.setText(VarG.libros.get(1).getAutor() + "/ año: " + VarG.libros.get(1).getAnio());
                    this.LB2.setIcon(new ImageIcon("src/surce/nuevasP/F-Prohibido.png"));
                }

            } else {
                this.LBn2.setText("2");
                this.LBtit2.setForeground(Color.GRAY);
                this.LBdat2.setForeground(Color.GRAY);
                this.LBr2.setText(Integer.toString(VarG.libros.get(1).getRenovacion()));
                this.LBdev2.setText(VarG.libros.get(1).getFecha_dev());
                this.LBtit2.setText(VarG.libros.get(1).getTitulo());
                this.LBdat2.setText(VarG.libros.get(1).getAutor() + "/ año: " + VarG.libros.get(1).getAnio());
                this.LB2.setIcon(new ImageIcon("src/surce/nuevasP/F-Neutral.png"));
            }
            if (now.compareTo(l3) != 0) {
                if (now.compareTo(p3) < 0 || VarG.libros.get(0).getRenovacion() == 3) {
                    if (VarG.libros.get(2).isDevuelto()) {
                        this.LBn3.setText("3");
                        this.LBr3.setText(Integer.toString(VarG.libros.get(2).getRenovacion()));
                        this.LBdev3.setText(VarG.libros.get(2).getFecha_dev());
                        this.LBtit3.setText(VarG.libros.get(2).getTitulo());
                        this.LBtit3.setForeground(Color.BLACK);
                        this.LBdat3.setText(VarG.libros.get(2).getAutor() + "/ año: " + VarG.libros.get(2).getAnio());
                        this.LBdat3.setForeground(Color.BLACK);
                        this.LB3.setIcon(new ImageIcon("src/surce/nuevasP/F-Continuar.png"));
                        k3=true;
                    } else {
                        this.LBn3.setText("3");
                        this.LBtit3.setForeground(Color.BLACK);
                        this.LBdat3.setForeground(Color.BLACK);
                        this.LBr3.setText(Integer.toString(VarG.libros.get(2).getRenovacion()));
                        this.LBdev3.setText(VarG.libros.get(2).getFecha_dev());
                        this.LBtit3.setText(VarG.libros.get(2).getTitulo());
                        this.LBdat3.setText(VarG.libros.get(2).getAutor() + "/ año: " + VarG.libros.get(2).getAnio());
                        this.LB3.setIcon(new ImageIcon("src/surce/nuevasP/F-Cancelar.png"));
                        k3=false;
                    }
                } else {
                    this.LBn3.setText("3");
                    this.LBtit3.setForeground(Color.GRAY);
                    this.LBdat3.setForeground(Color.GRAY);
                    this.LBr3.setText(Integer.toString(VarG.libros.get(2).getRenovacion()));
                    this.LBdev3.setText(VarG.libros.get(2).getFecha_dev());
                    this.LBtit3.setText(VarG.libros.get(2).getTitulo());
                    this.LBdat3.setText(VarG.libros.get(2).getAutor() + "/ año: " + VarG.libros.get(2).getAnio());
                    this.LB3.setIcon(new ImageIcon("src/surce/nuevasP/F-Prohibido.png"));
                }

            } else {
                this.LBn3.setText("3");
                this.LBtit3.setForeground(Color.GRAY);
                this.LBdat3.setForeground(Color.GRAY);
                this.LBr3.setText(Integer.toString(VarG.libros.get(2).getRenovacion()));
                this.LBdev3.setText(VarG.libros.get(2).getFecha_dev());
                this.LBtit3.setText(VarG.libros.get(2).getTitulo());
                this.LBdat3.setText(VarG.libros.get(2).getAutor() + "/ año: " + VarG.libros.get(2).getAnio());
                this.LB3.setIcon(new ImageIcon("src/surce/nuevasP/F-Neutral.png"));
            }
            if (now.compareTo(l4) != 0) {
                if (now.compareTo(p4) < 0 || VarG.libros.get(0).getRenovacion() == 3) {
                    if (VarG.libros.get(3).isDevuelto()) {
                        this.LBn4.setText("4");
                        this.LBr4.setText(Integer.toString(VarG.libros.get(3).getRenovacion()));
                        this.LBdev4.setText(VarG.libros.get(3).getFecha_dev());
                        this.LBtit4.setText(VarG.libros.get(3).getTitulo());
                        this.LBtit4.setForeground(Color.BLACK);
                        this.LBdat4.setText(VarG.libros.get(3).getAutor() + "/ año: " + VarG.libros.get(3).getAnio());
                        this.LBdat4.setForeground(Color.BLACK);
                        this.LB4.setIcon(new ImageIcon("src/surce/nuevasP/F-Continuar.png"));
                        k4=true;

                    } else {
                        this.LBn4.setText("4");
                        this.LBtit4.setForeground(Color.BLACK);
                        this.LBdat4.setForeground(Color.BLACK);
                        this.LBr4.setText(Integer.toString(VarG.libros.get(3).getRenovacion()));
                        this.LBdev4.setText(VarG.libros.get(3).getFecha_dev());
                        this.LBtit4.setText(VarG.libros.get(3).getTitulo());
                        this.LBdat4.setText(VarG.libros.get(3).getAutor() + "/ año: " + VarG.libros.get(3).getAnio());
                        this.LB4.setIcon(new ImageIcon("src/surce/nuevasP/F-Cancelar.png"));
                        k4=false;
                    }
                } else {
                    this.LBn4.setText("4");
                    this.LBtit4.setForeground(Color.GRAY);
                    this.LBdat4.setForeground(Color.GRAY);
                    this.LBr4.setText(Integer.toString(VarG.libros.get(3).getRenovacion()));
                    this.LBdev4.setText(VarG.libros.get(3).getFecha_dev());
                    this.LBtit4.setText(VarG.libros.get(3).getTitulo());
                    this.LBdat4.setText(VarG.libros.get(3).getAutor() + "/ año: " + VarG.libros.get(3).getAnio());
                    this.LB4.setIcon(new ImageIcon("src/surce/nuevasP/F-Prohibido.png"));
                }

            } else {
                this.LBn4.setText("4");
                this.LBtit4.setForeground(Color.GRAY);
                this.LBdat4.setForeground(Color.GRAY);
                this.LBr4.setText(Integer.toString(VarG.libros.get(3).getRenovacion()));
                this.LBdev4.setText(VarG.libros.get(3).getFecha_dev());
                this.LBtit4.setText(VarG.libros.get(3).getTitulo());
                this.LBdat4.setText(VarG.libros.get(3).getAutor() + "/ año: " + VarG.libros.get(3).getAnio());
                this.LB4.setIcon(new ImageIcon("src/surce/nuevasP/F-Neutral.png"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void limpiar(int num) {
        switch (num) {
            case 1:
                this.LB1.setText("");
                this.LBtit1.setText("");
                this.LBdat1.setText("");
                this.LBn1.setText("");
                this.LBdev1.setText("");
                this.LBr1.setText("");
                this.LB1.setIcon(null);
                break;
            case 2:
                this.LB2.setText("");
                this.LBtit2.setText("");
                this.LBdat2.setText("");
                this.LBdev2.setText("");
                this.LBn2.setText("");
                this.LBr2.setText("");
                this.LB2.setIcon(null);
                break;
            case 3:
                this.LB3.setText("");
                this.LBtit3.setText("");
                this.LBdat3.setText("");
                this.LBdev3.setText("");
                this.LBn3.setText("");
                this.LBr3.setText("");
                this.LB3.setIcon(null);
                break;
            case 4:
                this.LB4.setText("");
                this.LBtit4.setText("");
                this.LBdat4.setText("");
                this.LBdev4.setText("");
                this.LBn4.setText("");
                this.LBr4.setText("");
                this.LB4.setIcon(null);
                break;
            case 5:
                limpiar(1);
                limpiar(2);
                limpiar(3);
                limpiar(4);
                break;
        }
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
    private javax.swing.JLabel Btop1;
    private javax.swing.JLabel Btop2;
    private javax.swing.JLabel Btop3;
    private javax.swing.JLabel Btop4;
    private javax.swing.JLabel LB1;
    private javax.swing.JLabel LB2;
    private javax.swing.JLabel LB3;
    private javax.swing.JLabel LB4;
    private javax.swing.JLabel LBFondo;
    private javax.swing.JLabel LBdat1;
    private javax.swing.JLabel LBdat2;
    private javax.swing.JLabel LBdat3;
    private javax.swing.JLabel LBdat4;
    private javax.swing.JLabel LBdev1;
    private javax.swing.JLabel LBdev2;
    private javax.swing.JLabel LBdev3;
    private javax.swing.JLabel LBdev4;
    private javax.swing.JLabel LBn1;
    private javax.swing.JLabel LBn2;
    private javax.swing.JLabel LBn3;
    private javax.swing.JLabel LBn4;
    private javax.swing.JLabel LBr1;
    private javax.swing.JLabel LBr2;
    private javax.swing.JLabel LBr3;
    private javax.swing.JLabel LBr4;
    private javax.swing.JLabel LBtit1;
    private javax.swing.JLabel LBtit2;
    private javax.swing.JLabel LBtit3;
    private javax.swing.JLabel LBtit4;
    private javax.swing.JLabel home;
    private javax.swing.JLabel regresar;
    // End of variables declaration//GEN-END:variables
    ArrayList<ImageIcon> fondo;
    boolean k1,k2,k3,k4;
}
