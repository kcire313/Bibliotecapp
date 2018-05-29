/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blibliotecapp;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author erick
 */
public class Libros extends javax.swing.JFrame {

    /**
     * Creates new form perfilDatos
     */
    public Libros() {
        this.setUndecorated(true);
        initComponents();
        bandera=false;   //Control si no se encontraron datos
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regresar = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        LBcontador = new javax.swing.JLabel();
        LBop0 = new javax.swing.JLabel();
        LBtitulo0 = new javax.swing.JLabel();
        LBdatos0 = new javax.swing.JLabel();
        LBop1 = new javax.swing.JLabel();
        LBtitulo1 = new javax.swing.JLabel();
        LBdatos1 = new javax.swing.JLabel();
        LBop2 = new javax.swing.JLabel();
        LBtitulo2 = new javax.swing.JLabel();
        LBdatos2 = new javax.swing.JLabel();
        LBop3 = new javax.swing.JLabel();
        LBtitulo3 = new javax.swing.JLabel();
        LBdatos3 = new javax.swing.JLabel();
        LBop4 = new javax.swing.JLabel();
        LBtitulo4 = new javax.swing.JLabel();
        LBdatos4 = new javax.swing.JLabel();
        LBIDStatic = new javax.swing.JLabel();
        LBID = new javax.swing.JLabel();
        Btampliar = new javax.swing.JLabel();
        LBmapa = new javax.swing.JLabel();
        LbImagen = new javax.swing.JLabel();
        LbUp = new javax.swing.JLabel();
        LBDown = new javax.swing.JLabel();
        LbFondo = new javax.swing.JLabel();

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

        LBcontador.setFont(new java.awt.Font("Calibri", 1, 50)); // NOI18N
        LBcontador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBcontador.setText("0/0");
        getContentPane().add(LBcontador, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 150, 100));

        LBop0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBop0MouseClicked(evt);
            }
        });
        getContentPane().add(LBop0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 850, 100));

        LBtitulo0.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        getContentPane().add(LBtitulo0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 850, 50));

        LBdatos0.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        LBdatos0.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(LBdatos0, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 840, 50));

        LBop1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBop1MouseClicked(evt);
            }
        });
        getContentPane().add(LBop1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 850, 100));

        LBtitulo1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        getContentPane().add(LBtitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 850, 50));

        LBdatos1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        LBdatos1.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(LBdatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 840, 50));

        LBop2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBop2MouseClicked(evt);
            }
        });
        getContentPane().add(LBop2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 850, 100));

        LBtitulo2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        getContentPane().add(LBtitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 850, 50));

        LBdatos2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        LBdatos2.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(LBdatos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 840, 50));

        LBop3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBop3MouseClicked(evt);
            }
        });
        getContentPane().add(LBop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 850, 100));

        LBtitulo3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        getContentPane().add(LBtitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 850, 50));

        LBdatos3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        LBdatos3.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(LBdatos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 840, 50));

        LBop4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBop4MouseClicked(evt);
            }
        });
        getContentPane().add(LBop4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 850, 100));

        LBtitulo4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        getContentPane().add(LBtitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 850, 50));

        LBdatos4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        LBdatos4.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(LBdatos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 840, 50));

        LBIDStatic.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LBIDStatic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBIDStatic, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 280, 330, 50));

        LBID.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        LBID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBID, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, 330, 50));

        Btampliar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtampliarMouseClicked(evt);
            }
        });
        getContentPane().add(Btampliar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 414, 330, 190));

        LBmapa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LBmapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(1004, 424, 320, 140));

        LbImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LbImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 20, 230, 240));

        LbUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbUpMouseClicked(evt);
            }
        });
        getContentPane().add(LbUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 180, 60, 250));

        LBDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LBDownMouseClicked(evt);
            }
        });
        getContentPane().add(LBDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 440, 60, 250));

        LbFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/surce/nuevasP/libros E.png"))); // NOI18N
        getContentPane().add(LbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        VarG.jfBusqueda.setVisible(true);
        this.setVisible(false);
        VarG.jfIdioma.pausarAudios();
        System.out.println("return profile data");
        VarG.anActual = VarG.animaciones.get(9);
        VarG.anActual.getImage().flush();
    }//GEN-LAST:event_regresarMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        VarG.jfBusqueda.setVisible(false);
        this.setVisible(false);
        VarG.jfIdioma.pausarAudios();
        VarG.anActual = VarG.animaciones.get(9);
        VarG.anActual.getImage().flush();
    }//GEN-LAST:event_homeMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //limpiar todos los labels de info
        limpiar();
        if (VarG.idioma.equals("ingles")) {
            //LBIDStatic.setText("Book´s ID");
            LbFondo.setIcon(new ImageIcon("src/surce/nuevasP/libros I.png"));
        } else {
            //LBIDStatic.setText("ID del libro");
            LbFondo.setIcon(new ImageIcon("src/surce/nuevasP/libros E.png"));
        }
        //validar la página actual
        paginas = 0;
        pActual = 0;
        paginas = (int) Math.ceil((float) VarG.libros.size() / 5) - 1;
        System.out.println((int) Math.ceil((float) VarG.libros.size() / 5));
        imprimir(0);
    }//GEN-LAST:event_formWindowActivated

    private void LBop1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBop1MouseClicked
        try{
        String map = getmapa(VarG.libros.get(1 + pActual * 5).getUbicacion());
        ImageIcon imageIcon = new ImageIcon(map); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(imageIcon.getIconHeight() * 310 / 470, imageIcon.getIconHeight() * 230 / 800, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        LBmapa.setIcon(imageIcon);
        //Cover
        ImageIcon imageIcon1 = new ImageIcon("src/surce/cover/"+VarG.libros.get(1 + pActual * 5).getCover()+".jpg"); // load the image to a imageIcon
        Image image2 = imageIcon1.getImage(); // transform it 
        Image newimg3 = image2.getScaledInstance(imageIcon1.getIconHeight() * 120 / 470, imageIcon1.getIconHeight() * 300 / 800, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon1 = new ImageIcon(newimg3);
        LbImagen.setIcon(imageIcon1);
        
        this.LBIDStatic.setText("ID:" + VarG.libros.get(1 + pActual * 5).getId_libro());
        
        }catch(Exception e){
            System.out.println(e);
        }      
             
      
    }//GEN-LAST:event_LBop1MouseClicked

    private void LBop2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBop2MouseClicked
        try{
        String map = getmapa(VarG.libros.get(2 + pActual * 5).getUbicacion());
        ImageIcon imageIcon = new ImageIcon(map); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(imageIcon.getIconHeight() * 310 / 470, imageIcon.getIconHeight() * 230 / 800, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        LBmapa.setIcon(imageIcon);
        //Cover
        ImageIcon imageIcon1 = new ImageIcon("src/surce/cover/"+VarG.libros.get(2 + pActual * 5).getCover()+".jpg"); // load the image to a imageIcon
        Image image2 = imageIcon1.getImage(); // transform it 
        Image newimg3 = image2.getScaledInstance(imageIcon1.getIconHeight() * 120 / 470, imageIcon1.getIconHeight() * 300 / 800, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon1 = new ImageIcon(newimg3);
        LbImagen.setIcon(imageIcon1);
        
        this.LBIDStatic.setText("ID:" + VarG.libros.get(2 + pActual * 5).getId_libro());
         }catch(Exception e){
            System.out.println(e);
        }      
    }//GEN-LAST:event_LBop2MouseClicked

    private void LBDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBDownMouseClicked
        if (paginas > pActual) {
            pActual++;
            imprimir(pActual);
        }
    }//GEN-LAST:event_LBDownMouseClicked

    private void LbUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbUpMouseClicked
        if (pActual != 0) {
            pActual--;
            imprimir(pActual);
        }
    }//GEN-LAST:event_LbUpMouseClicked

    private void LBop0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBop0MouseClicked
        try{
        String map = getmapa(VarG.libros.get(0 + pActual * 5).getUbicacion());
        ImageIcon imageIcon = new ImageIcon(map); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(imageIcon.getIconHeight() * 310 / 470, imageIcon.getIconHeight() * 230 / 800, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        LBmapa.setIcon(imageIcon);
        //Cover
        ImageIcon imageIcon1 = new ImageIcon("src/surce/cover/"+VarG.libros.get(0 + pActual * 5).getCover()+".jpg"); // load the image to a imageIcon
        Image image2 = imageIcon1.getImage(); // transform it 
        Image newimg3 = image2.getScaledInstance(imageIcon1.getIconHeight() * 120 / 470, imageIcon1.getIconHeight() * 300 / 800, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon1 = new ImageIcon(newimg3);
        LbImagen.setIcon(imageIcon1);
        
        this.LBIDStatic.setText("ID:" + VarG.libros.get(0 + pActual * 5).getId_libro());
        
         }catch(Exception e){
            System.out.println(e);
        }      
    }//GEN-LAST:event_LBop0MouseClicked

    private void LBop3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBop3MouseClicked
        try{
        String map = getmapa(VarG.libros.get(3 + pActual * 5).getUbicacion());
        ImageIcon imageIcon = new ImageIcon(map); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(imageIcon.getIconHeight() * 310 / 470, imageIcon.getIconHeight() * 230 / 800, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        LBmapa.setIcon(imageIcon);
        //Cover
        ImageIcon imageIcon1 = new ImageIcon("src/surce/cover/"+VarG.libros.get(3 + pActual * 5).getCover()+".jpg"); // load the image to a imageIcon
        Image image2 = imageIcon1.getImage(); // transform it 
        Image newimg3 = image2.getScaledInstance(imageIcon1.getIconHeight() * 120 / 470, imageIcon1.getIconHeight() * 300 / 800, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon1 = new ImageIcon(newimg3);
        LbImagen.setIcon(imageIcon1);
        
        this.LBIDStatic.setText("ID:" + VarG.libros.get(3 + pActual * 5).getId_libro());
        
        }catch(Exception e){
            System.out.println(e);
        }      
    }//GEN-LAST:event_LBop3MouseClicked

    private void LBop4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LBop4MouseClicked
        try{
        String map = getmapa(VarG.libros.get(4 + pActual * 5).getUbicacion());
        ImageIcon imageIcon = new ImageIcon(map); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(imageIcon.getIconHeight() * 310 / 470, imageIcon.getIconHeight() * 230 / 800, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        LBmapa.setIcon(imageIcon);
        //Cover
        ImageIcon imageIcon1 = new ImageIcon("src/surce/cover/"+VarG.libros.get(4 + pActual * 5).getCover()+".jpg"); // load the image to a imageIcon
        Image image2 = imageIcon1.getImage(); // transform it 
        Image newimg3 = image2.getScaledInstance(imageIcon1.getIconHeight() * 120 / 470, imageIcon1.getIconHeight() * 300 / 800, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon1 = new ImageIcon(newimg3);
        LbImagen.setIcon(imageIcon1);
        
        this.LBIDStatic.setText("ID:" + VarG.libros.get(4 + pActual * 5).getId_libro());
        
        }catch(Exception e){
            System.out.println(e);
        }      
    }//GEN-LAST:event_LBop4MouseClicked

    private void BtampliarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtampliarMouseClicked
        if(!LBID.getText().isEmpty()){
            VarG.jmapa.setVisible(true);
        }
        
    }//GEN-LAST:event_BtampliarMouseClicked
    void imprimir(int i) {
        limpiar();
        if (VarG.libros.size() == 0){
            this.LBtitulo0.setText("NO SE ENCONTRARON LIBROS ");
        }
        if (VarG.libros.size() >= 1 + i * 5) {
            this.LBtitulo0.setText(VarG.libros.get(0 + i * 5).getTitulo());
            this.LBdatos0.setText(VarG.libros.get(0 + i * 5).getAutor() + "/ año: " + VarG.libros.get(0 + i * 5).getAnio());
        }
        if (VarG.libros.size() >= 2 + i * 5) {
            this.LBtitulo1.setText(VarG.libros.get(1 + i * 5).getTitulo());
            this.LBdatos1.setText(VarG.libros.get(1 + i * 5).getAutor() + "/ año: " + VarG.libros.get(1 + i * 5).getAnio());
        }
        if (VarG.libros.size() >= 3 + i * 5) {
            this.LBtitulo2.setText(VarG.libros.get(2 + i * 5).getTitulo());
            this.LBdatos2.setText(VarG.libros.get(2 + i * 5).getAutor() + "/ año: " + VarG.libros.get(2 + i * 5).getAnio());
        }
        if (VarG.libros.size() >= 4 + i * 5) {
            this.LBtitulo3.setText(VarG.libros.get(3 + i * 5).getTitulo());
            this.LBdatos3.setText(VarG.libros.get(3 + i * 5).getAutor() + "/ año: " + VarG.libros.get(3 + i * 5).getAnio());
        }
        if (VarG.libros.size() >= 5 + i * 5) {
            this.LBtitulo4.setText(VarG.libros.get(4 + i * 5).getTitulo());
            this.LBdatos4.setText(VarG.libros.get(4 + i * 5).getAutor() + "/ año: " + VarG.libros.get(4 + i * 5).getAnio());
        }
        this.LBcontador.setText((pActual + 1) + "/" + (paginas + 1));
    }
    
    public void limpiar(){
        this.LBID.setText("");
        this.LBcontador.setText("");
        this.LBdatos0.setText("");
        this.LBdatos1.setText("");
        this.LBdatos2.setText("");
        this.LBdatos3.setText("");
        this.LBdatos4.setText("");
        this.LBmapa.setIcon(null);
        this.LBtitulo0.setText("");
        this.LBtitulo1.setText("");
        this.LBtitulo2.setText("");
        this.LBtitulo3.setText("");
        this.LBtitulo4.setText("");
        this.LbImagen.setIcon(null);
        this.LBIDStatic.setText("");
        this.LBID.setText("");
    
    }
    public String getmapa(int ub){
            if (ub>=0 && ub <= 7){
                String map = "src/surce/nuevasP/mapaPlantaBaja"+ub+".png";
                VarG.mapa = map;
                System.out.println(map);
                if(VarG.idioma.equals("ingles")){
                     this.LBID.setText("Ground Floor");
                }else{
                    this.LBID.setText("Planta Baja");
                }
                return map;
            }else{
                String map = "src/surce/nuevasP/mapaPlantaAlta"+(ub-7)+".png";
                VarG.mapa = map;
                if(VarG.idioma.equals("ingles")){
                     this.LBID.setText("Top Floor");
                }else{
                    this.LBID.setText("Planta Alta");
                }
                return map;
                
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
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btampliar;
    private javax.swing.JLabel LBDown;
    private javax.swing.JLabel LBID;
    private javax.swing.JLabel LBIDStatic;
    private javax.swing.JLabel LBcontador;
    private javax.swing.JLabel LBdatos0;
    private javax.swing.JLabel LBdatos1;
    private javax.swing.JLabel LBdatos2;
    private javax.swing.JLabel LBdatos3;
    private javax.swing.JLabel LBdatos4;
    private javax.swing.JLabel LBmapa;
    private javax.swing.JLabel LBop0;
    private javax.swing.JLabel LBop1;
    private javax.swing.JLabel LBop2;
    private javax.swing.JLabel LBop3;
    private javax.swing.JLabel LBop4;
    private javax.swing.JLabel LBtitulo0;
    private javax.swing.JLabel LBtitulo1;
    private javax.swing.JLabel LBtitulo2;
    private javax.swing.JLabel LBtitulo3;
    private javax.swing.JLabel LBtitulo4;
    private javax.swing.JLabel LbFondo;
    private javax.swing.JLabel LbImagen;
    private javax.swing.JLabel LbUp;
    private javax.swing.JLabel home;
    private javax.swing.JLabel regresar;
    // End of variables declaration//GEN-END:variables
int pActual, paginas;
boolean bandera;
}
