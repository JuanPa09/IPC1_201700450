/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Juan Pablo
 */
public class Juego extends javax.swing.JFrame {
    
    Cronometro cronometro = new Cronometro();
    
    
   public int dado,r;   
   public Tablero tab;
    public boolean tabcreado = false;
    Random rm = new Random();
    public int turno=1,tc1,tc2,tm1,tm2,tp1,tp2;
    public boolean c1,c2,m1,m2,p1,p2;
    
    ACaballero acaballero1 = new ACaballero();
    AMago amago1 = new AMago();
    APrincesa aprincesa = new APrincesa();
    Config config = new Config();
    int tamnio=Integer.valueOf(config.getTamconfig());
   
    
    //IMAGEN FONDO 
    public class Imagen extends javax.swing.JPanel {

        
public Imagen() {
this.setSize(845,675); //se selecciona el tamaño del panel
}

//Se crea un método cuyo parámetro debe ser un objeto Graphics

public void paint(Graphics grafico) {
Dimension height = getSize();

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa

ImageIcon Img = new ImageIcon(getClass().getResource("/imagen/ft.jpg")); 

//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel

grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

setOpaque(false);
super.paintComponent(grafico);
}
}
     

    /**
     * Creates new form Juego
     */
    public Juego() {
        initComponents();
        cronometro.start();
        
        

               jLabel15.setText("Jugador 1");
        
        
       Timer timer = new Timer();
       TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                
                jLabel6.setText(String.valueOf(cronometro.minutos));
                int min=cronometro.minutos;
                jLabel9.setText(String.valueOf(config.getVida1()));
                jLabel14.setText(String.valueOf(config.getVida2()));
                switch(min) {
   case 0 : jLabel7.setText("0"+String.valueOf(cronometro.segundos));
      break;
   case 1 : jLabel7.setText("0"+String.valueOf(cronometro.segundos));
      break; // optional
   case 2 : jLabel7.setText("0"+String.valueOf(cronometro.segundos));
       break;
   case 3 : jLabel7.setText("0"+String.valueOf(cronometro.segundos));
       break;
   case 5 : jLabel7.setText("0"+String.valueOf(cronometro.segundos));
       break;
   case 6 : jLabel7.setText("0"+String.valueOf(cronometro.segundos));  
   default : 
}
                if (cronometro.minutos==config.getTiempo()||config.getVida1()<=0||config.getVida2()<=0){
                    timer.cancel();
                    if(config.getVida1()<=0){
                        JOptionPane.showMessageDialog(null,"GANO EL JUGADOR 2");
                    }
                    if(config.getVida2()<=0){
                    JOptionPane.showMessageDialog(null,"GANO EL JUGADOR 1");
                        }
                    if(config.getVida1()>config.getVida2()){
                        JOptionPane.showMessageDialog(null,"GANO EL JUGADOR 1");
                    }
                    if(config.getVida2()>config.getVida1()){
                        JOptionPane.showMessageDialog(null,"GANO EL JUGADOR 2");
                    }
                    if(config.getVida1()==config.getVida2()){
                        JOptionPane.showMessageDialog(null,"!EMPATE");
                    }
                    
                }
                
                if(config.getTc1()==turno){ 
                    jLabel11.setText("Caballero"); 
                }else{
                    if(config.getTm1()==turno){
               jLabel11.setText("Mago");
               }else{
               if(config.getTp1()==turno){
               jLabel11.setText("Princesa");
               }else{
              // jLabel11.setText("Jugador 2");
               }}}
                
                if(config.getTc2()==turno){ 
                    jLabel15.setText("Caballero"); 
                }else{
                    if(config.getTm2()==turno){
               jLabel15.setText("Mago");
               }else{
               if(config.getTp2()==turno){
               jLabel15.setText("Princesa");
               }else{
               //jLabel11.setText("Jugador 2");
               }}}
                
                
                
            }
        };
        timer.schedule(tarea, 0, 1000);
        
        
        
        Config config = new Config();
        Imagen Imagen = new Imagen();
        jPanel2.add(Imagen);
        jPanel2.repaint();
        
         jPanel4.repaint();
        int tamnio=Integer.valueOf(config.getTamconfig());
        tab = new Tablero(tamnio,jPanel4);
        tabcreado= true;
        jLabel2.setText(config.getNombre1());
        jLabel4.setText(config.getNombre2());
        
        
       jLabel20.setText(String.valueOf(turno));
        
      
        
    
     

        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JUEGO\n");
        setBounds(new java.awt.Rectangle(400, 200, 1700, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(188, 183, 171));
        jPanel1.setPreferredSize(new java.awt.Dimension(204, 677));
        jPanel1.setRequestFocusEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jugador 1");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setText("Abajo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Arriba");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Izquierda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Derecha");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Dado");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setText("0");

        jButton6.setText("Abajo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Izquierda");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Arriba");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Jugador 2");

        jLabel8.setText("VIDAS");

        jLabel9.setText("jLabel9");

        jLabel10.setText("TURNO DE ");

        jLabel11.setText("jLabel11");

        jLabel12.setText("VIDAS");

        jLabel13.setText("TURNO DE");

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        jLabel16.setBackground(new java.awt.Color(255, 0, 0));
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("JUGADOR 1:");
        jLabel16.setOpaque(true);

        jLabel17.setBackground(new java.awt.Color(0, 0, 255));
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("JUGADOR 2");
        jLabel17.setOpaque(true);

        jButton9.setText("Derecha");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("PASAR TURNO");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel18.setText("MOVIMIENTO:");

        jLabel19.setText("ATAQUE:");

        jLabel20.setText("jLabel20");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel14)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel9))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel11)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)))
                        .addGap(0, 14, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8)
                            .addComponent(jButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jButton6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(19, 19, 19)
                .addComponent(jLabel19)
                .addGap(24, 24, 24)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addGap(36, 36, 36))
        );

        jLabel2.getAccessibleContext().setAccessibleName("jLabel2");

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setEnabled(false);
        jPanel2.setName("panel1"); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(788, 675));

        jPanel4.setBackground(new java.awt.Color(51, 255, 51));
        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(788, 675));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 625, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("MEDIEVIL");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("00");

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setText("00");

        jButton11.setText("NUEVO JUEGO");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(371, 371, 371)
                        .addComponent(jLabel1))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jButton11))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if (config.getTc1()==turno){
            acaballero1.ataqueArriba1(tab, config);
        }
        
        if (config.getTc2()==turno){
            acaballero1.ataqueArriba2(tab, config);
        }
        
        if(config.getTm1()==turno){
        amago1.ataqueArriba1(tab, config);
        }
        
        if(config.getTm2()==turno){
        amago1.ataqueArriba2(tab, config);
        }
        
        if(config.getTp1()==turno){
        aprincesa.ataqueArriba1(tab, config);
        }
        
        if(config.getTp2()==turno){
        aprincesa.ataqueArriba2(tab, config);
        }
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(config.getTc1()==turno){
            acaballero1.ataqueIzquierda1(tab,config);
        }
        
        if (config.getTc2()==turno){
            acaballero1.ataqueIzquierda1(tab, config);
        }
        if(config.getTm1()==turno){
        amago1.ataqueIzquierda(tab, config);
        }
        
        if(config.getTm2()==turno){
        amago1.ataqueIzquierda2(tab, config);
        }
        
        if(config.getTp1()==turno){
        aprincesa.ataqueIzquierda1(tab, config);
        }
        
        if(config.getTp2()==turno){
        aprincesa.ataqueIzquierda2(tab, config);
        }
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(config.getTc1()==turno){
            acaballero1.ataqueAbajo1(tab,config);
        }
        
        if (config.getTc2()==turno){
            acaballero1.ataqueAbajo2(tab, config);
        }
        
        if(config.getTm1()==turno){
        amago1.ataqueAbajo1(tab, config);
        }
        
        if(config.getTm2()==turno){
        amago1.ataqueAbajo2(tab, config);
        }
        
        if(config.getTp1()==turno){
        aprincesa.ataqueAbajo1(tab, config);
        }
        
        if(config.getTp2()==turno){
        aprincesa.ataqueAbajo2(tab, config);
        }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        do{
            dado=rm.nextInt(7);
        }
        while (dado==0);
        jLabel3.setText(String.valueOf(dado));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (config.getTc1()==turno){
            MovCab1Derecha moviderecha = new MovCab1Derecha(dado,tab);
            moviderecha.start();
        }
        
        if (config.getTc2()==turno){
            MovCab2Derecha moviderecha = new MovCab2Derecha(dado,tab);
            moviderecha.start();
        }
        
        if (config.getTm1()==turno){
            MovMag1Derecha moviderecha = new MovMag1Derecha (dado,tab);
            moviderecha.start();
        }
        
        if (config.getTm2()==turno){
            MovMag2Derecha moviderecha = new MovMag2Derecha (dado,tab);
            moviderecha.start();
        }
        
        if (config.getTp1()==turno){
            MovPri1Derecha moviderecha = new MovPri1Derecha (dado,tab);
            moviderecha.start();
        }
        
        if (config.getTp2()==turno){
            MovPri2Derecha moviderecha = new MovPri2Derecha (dado,tab);
            moviderecha.start();
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(config.getTc1()==turno){
            MovCab1Izquierda moviizquierda = new MovCab1Izquierda(dado,tab);
            moviizquierda.start();
        }
        
        if(config.getTc2()==turno){
             MovCab2Izquierda moviizquierda = new MovCab2Izquierda(dado,tab);
             moviizquierda.start();
        }
        
        if (config.getTm1()==turno){
            MovMag1Izquierda moviizquierda = new MovMag1Izquierda (dado,tab);
            moviizquierda.start();
        }
        
        if (config.getTm2()==turno){
            MovMag2Izquierda moviizquierda = new MovMag2Izquierda (dado,tab);
            moviizquierda.start();
        }
        
        if (config.getTp1()==turno){
            MovPri1Izquierda moviizquierda = new MovPri1Izquierda (dado,tab);
            moviizquierda.start();
        }
        
        if (config.getTp2()==turno){
            MovPri2Izquierda moviizquierda = new MovPri2Izquierda (dado,tab);
            moviizquierda.start();
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (config.getTc1()==turno){
            MovCab1Arriba moviarriba = new MovCab1Arriba (dado,tab);
            moviarriba.start();
        }
        
        if (config.getTc2()==turno){
            MovCab2Arriba moviarriba = new MovCab2Arriba (dado,tab);
            moviarriba.start();
        }
        
        if (config.getTm1()==turno){
            MovMag1Arriba moviarriba = new MovMag1Arriba (dado,tab);
            moviarriba.start();
        }
        
        if (config.getTm2()==turno){
            MovMag2Arriba moviarriba = new MovMag2Arriba (dado,tab);
            moviarriba.start();
        }
        
        if (config.getTp1()==turno){
            MovPri1Arriba moviarriba = new MovPri1Arriba (dado,tab);
            moviarriba.start();
        }
        
        if (config.getTp2()==turno){
            MovPri2Arriba moviarriba = new MovPri2Arriba (dado,tab);
            moviarriba.start();
        }
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (config.getTc1()==turno){
            MovCab1Abajo moviabajo = new MovCab1Abajo(dado,tab);
            moviabajo.start();
        }  
        
        if (config.getTc2()==turno){
            MovCab2Abajo moviabajo = new MovCab2Abajo(dado,tab);
            moviabajo.start();
        }
        
        if (config.getTm1()==turno){
            MovMag1Abajo moviabajo = new MovMag1Abajo (dado,tab);
            moviabajo.start();
        }
        
        if (config.getTm2()==turno){
            MovMag2Abajo moviabajo = new MovMag2Abajo (dado,tab);
            moviabajo.start();
        }
        
        if (config.getTm2()==turno){
            MovMag2Abajo moviabajo = new MovMag2Abajo (dado,tab);
            moviabajo.start();
        }
        
        if (config.getTp1()==turno){
            MovPri1Abajo moviabajo = new MovPri1Abajo (dado,tab);
            moviabajo.start();
        }
        
        if (config.getTp2()==turno){
            MovPri2Abajo moviabajo = new MovPri2Abajo (dado,tab);
            moviabajo.start();
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        cronometro.task.cancel();
        this.dispose();
        Configuracion configu = new Configuracion();
        configu.show();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        turno+=1;
        if(turno==7){
            turno=1;
        }
        jLabel20.setText(String.valueOf(turno));
        if(config.getTc1()==turno){ 
                    jLabel11.setText("Caballero"); 
                }else{
                    jLabel11.setText("Jugador 2"); }
                
                if(config.getTm1()==turno){ 
                    jLabel11.setText("Mago"); 
                }else{
                    jLabel11.setText("Jugador 2"); }
                
                if(config.getTp1()==turno){ 
                    jLabel11.setText("Princesa"); 
                }else{
                    jLabel11.setText("Jugador 2"); }
                
                if(config.getTc2()==turno){ 
                    jLabel15.setText("Caballero"); 
                }else{
                    jLabel15.setText("Jugador 1"); }
                
                if(config.getTm2()==turno){ 
                    jLabel15.setText("Mago"); 
                }else{
                    jLabel15.setText("Jugador 1"); }
                
                if(config.getTp2()==turno){ 
                    jLabel15.setText("Princesa"); 
                }else{
                    jLabel15.setText("Jugador 1"); }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(config.getTc1()==turno){
            acaballero1.ataqueDerecha1(tab,config);
        }
        
        if (config.getTc2()==turno){
            acaballero1.ataqueDerecha2(tab, config);
        }
        
        if(config.getTm1()==turno){
        amago1.ataqueDerecha(tab, config);
        }
        
        if(config.getTm2()==turno){
        amago1.ataqueDerecha2(tab, config);
        }
        
        if(config.getTp1()==turno){
        aprincesa.ataqueDerecha1(tab, config);
        }
        
        if(config.getTp2()==turno){
        aprincesa.ataqueDerecha2(tab, config);
        }
        
        
        
        

    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
                                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}