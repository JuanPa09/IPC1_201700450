/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Color;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Juan Pablo
 */
public class MovMag2Abajo extends Thread{
    
    protected int cantidad;
    public Tablero tablero = null;
    public int r=0,i,j,q=0;
    Random rm = new Random();
    JLabel casilla=null;
    Config config = new Config();
   
   
   
   
    
   public MovMag2Abajo(){
        
    }
    
    public MovMag2Abajo(int cantidad, Tablero tablero){
        this.cantidad=cantidad;
        this.tablero=tablero;
    }
    
    
    public boolean comprobarfin(){
        if (tablero.f>=tablero.tam-1) {
            return true;
        }
        return false;
    }
    
    public void moverAbajo(int cantidad){
        
        
        if (cantidad<=0) {
            return;
        }
        
        
         
        if(comprobarfin()){
            cantidad=0;
            config.setVida2(config.getVida2()-1);
            
            tablero.matrizL[tablero.e][tablero.tam-1]=0;
            tablero.matrizG[tablero.e][tablero.tam-1].setIcon(null);
            int centro=tablero.matrizL[((tablero.tam-1)/2)][((tablero.tam-1)/2)];
            if (centro!=0||centro!=7||centro!=8){
            tablero.e=(tablero.tam-1)/2;
            tablero.f=(tablero.tam-1)/2;
            tablero.matrizL[(tablero.tam-1)/2][(tablero.tam-1)/2]=4;    
            }else{
                int centro1=tablero.matrizL[((tablero.tam-1)/2)+1][((tablero.tam-1)/2)];
                if (centro1!=0||centro1!=7||centro1!=8);{
            tablero.e=((tablero.tam-1)/2)+1;
            tablero.f=((tablero.tam-1)/2)+1;
            tablero.matrizL[((tablero.tam-1)/2)+1][((tablero.tam-1)/2)+1]=4;
            }
                
            }
            tablero.repintar();
            
            
        }
        else{
           
            int pos = tablero.matrizL[tablero.e][tablero.f+1];
            if(pos==1){
                int j=rm.nextInt(2);
                   switch(j){
                       case 0: MovMag2Derecha moviderechaa = new MovMag2Derecha(cantidad,tablero); moviderechaa.start();
                           break;
                       case 1: MovMag2Izquierda moviizquierdaa = new MovMag2Izquierda(cantidad,tablero); moviizquierdaa.start();
                           break;
                   }
                }
                else{
            try {
                //mover una posicion
                if (r==1){
                    r=0; 
                    tablero.matrizL[tablero.e][tablero.f]=7;
                    tablero.matrizG[tablero.e][tablero.f].setIcon(null);
                tablero.repintar();
                }else{
                if(q==1){
                q=0; 
                    tablero.matrizL[tablero.e][tablero.f]=8;
                    tablero.matrizG[tablero.e][tablero.f].setIcon(null);
                tablero.repintar();    
                
                }else{
                tablero.matrizL[tablero.e][tablero.f]=0;
                tablero.matrizG[tablero.e][tablero.f].setIcon(null);
                tablero.matrizG[tablero.e][tablero.f].removeAll();
                tablero.repintar();
            }}
                tablero.f+=1;
                if (tablero.matrizL[tablero.e][tablero.f]==7){
                    if (cantidad==1){
                       config.setVida2(config.getVida2()-1);
                       tablero.matrizL[tablero.e][tablero.f]=0;
                       tablero.matrizG[tablero.e][tablero.f].setBackground(Color.yellow);
                       tablero.repintar();
                       
                    }else{
                        r=1;
                    }}
                if (tablero.matrizL[tablero.e][tablero.f]==8) {   
                    if (cantidad==1){
                       config.setVida2(config.getVida2()+1);
                       tablero.matrizL[tablero.e][tablero.f]=0;
                       tablero.matrizG[tablero.e][tablero.f].setIcon(null);
                       tablero.repintar();
                       
                    }else{
                        q=1;
                    }}
                    
                
                tablero.matrizL[tablero.e][tablero.f]=4;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
                moverAbajo(cantidad);
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MovCab2Abajo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }
    
    public void run(){
    moverAbajo(cantidad);
    }
    
    
}
