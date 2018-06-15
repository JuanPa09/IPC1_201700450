/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;


import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juan Pablo
 */
public class Tablero {
   public JPanel fondo = null;
   public JLabel [][] matrizG;
   public int [][] matrizL;
   public JPanel panel;
   public JLabel texto;
   public int tam=0;
   public Cab1 personaje1;
   public Cab2 personaje2;
   public Pri1 personaje3;
   public Pri2 personaje4;
   public Mag1 personaje5;
   public Mag2 personaje6;
   public int tambloquey;
   public int tambloquex;  
   public int i,m;
   public int j,n;
   
   Random rm = new Random();
   
    
    public Tablero(int tam, JPanel panel){
        this.tam=tam;
        this.fondo=panel;
        llenar();        
    }
    
    public Tablero (){
        
    }
    
    public void llenar(){
        tambloquey = 625/tam;
        tambloquex = 785/tam;
        matrizL = new int [tam][tam];
        matrizG = new JLabel [tam][tam];
        Random rm = new Random();
        
        // 1 personaje, 0 vacio
        
        for (int i =0;i<tam;i++){
            for(int j=0;j<tam;j++){
                matrizL[i][j]=0;
            }
            
        }
        
       /*for(int n=0;n<6;n++){
           i=rm.nextInt(tam);
           j=rm.nextInt(tam);
           matrizL[i][j]=1+n;
       }*/
       
       
       n=rm.nextInt(tam);
       m=rm.nextInt(tam);
       matrizL[n][m]=1 ;
       
       
        personaje1 = new Cab1();
        personaje2 = new Cab2();
        personaje3 = new Pri1();
        personaje4 = new Pri2();
        personaje5 = new Mag1();
        personaje6 = new Mag2();
          
        personaje1.posper = 0;
        //personaje2.posper = 0;
        //personaje3.posper = 0;
        //personaje4.posper = 0;
        //personaje5.posper = 0;
        //personaje6.posper = 0;
        
        
        
        repintar();       
        
        
    }
    
    public void repintar (){
        JLabel casilla=null;
        for (int i=0;i<tam;i++){
            for (int j=0;j<tam;j++){
                if (matrizL[i][j]==0){
                    casilla = new JLabel();
                    
                }//1
                else{
                    if (matrizL[i][j]==1){
                    casilla=new JLabel(this.personaje1.obtenerImagen(tambloquex,tambloquey));
                    
                    }
                }
                casilla.setOpaque(false);
                casilla.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                casilla.setBounds(i*tambloquex,j*tambloquey,tambloquex,tambloquey);
               matrizG [i][j]=casilla;                
                fondo.add(matrizG[i][j],BorderLayout.CENTER);
                fondo.repaint();
                
                
            }
        }
    }
    
   
    
}
    
    

