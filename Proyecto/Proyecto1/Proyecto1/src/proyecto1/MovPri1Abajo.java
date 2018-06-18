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
public class MovPri1Abajo extends Thread{
    
    
    protected int cantidad;
    public Tablero tablero = null;
    public int n,m,r=0,i,j,q=0;
    Random rm = new Random();
    JLabel casilla=null;
    Config config = new Config();
   
   
   
   
    
   public MovPri1Abajo(){
        
    }
    
    public MovPri1Abajo(int cantidad, Tablero tablero){
        this.cantidad=cantidad;
        this.tablero=tablero;
    }
    
    
    public boolean comprobarfin(){
        if (tablero.h>=tablero.tam-1) {
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
            config.setVida1(config.getVida1()-1);
            
            tablero.matrizL[tablero.g][tablero.tam-1]=0;
            tablero.matrizG[tablero.g][tablero.tam-1].setIcon(null);
            int centro=tablero.matrizL[((tablero.tam-1)/2)][((tablero.tam-1)/2)];
            if (centro!=0||centro!=7||centro!=8){
            tablero.g=(tablero.tam-1)/2;
            tablero.h=(tablero.tam-1)/2;
            tablero.matrizL[(tablero.tam-1)/2][(tablero.tam-1)/2]=5;    
            }else{
                int centro1=tablero.matrizL[((tablero.tam-1)/2)+1][((tablero.tam-1)/2)];
                if (centro1!=0||centro1!=7||centro1!=8);{
            tablero.g=((tablero.tam-1)/2)+1;
            tablero.h=((tablero.tam-1)/2)+1;
            tablero.matrizL[((tablero.tam-1)/2)+1][((tablero.tam-1)/2)+1]=6;
            }
                
            }
            tablero.repintar();
            
            
        }
        else{
           
            int pos = tablero.matrizL[tablero.g][tablero.h+1];
            if(pos==1||pos==2||pos==3||pos==4||pos==5||pos==6){
                int i=rm.nextInt(2);
                   switch(i){
                       case 0: MovPri1Derecha moviderecha = new MovPri1Derecha(cantidad,tablero); moviderecha.start();
                           break;
                       case 1: MovPri1Izquierda moviizquierda = new MovPri1Izquierda(cantidad,tablero); moviizquierda.start();
                           break;
                   }
                }
                else{
            try {
                //mover una posicion
                if (r==1){
                    r=0; 
                    tablero.matrizL[tablero.g][tablero.h]=7;
                    tablero.matrizG[tablero.g][tablero.h].setIcon(null);
                tablero.repintar();
                }else{
                if(q==1){
                q=0; 
                    tablero.matrizL[tablero.g][tablero.h]=8;
                    tablero.matrizG[tablero.g][tablero.h].setIcon(null);
                tablero.repintar();    
                
                }else{
                tablero.matrizL[tablero.g][tablero.h]=0;
                tablero.matrizG[tablero.g][tablero.h].setIcon(null);
                tablero.repintar();
            }}
                tablero.h+=1;
                if (tablero.matrizL[tablero.g][tablero.h]==7){
                    if (cantidad==1){
                       config.setVida1(config.getVida1()-1);
                       tablero.matrizL[tablero.g][tablero.h]=0;
                       tablero.matrizG[tablero.g][tablero.h].setBackground(Color.yellow);
                       tablero.repintar();
                       
                    }else{
                        r=1;
                    }}
                if (tablero.matrizL[tablero.g][tablero.h]==8) {   
                    if (cantidad==1){
                       config.setVida1(config.getVida1()+1);
                       tablero.matrizL[tablero.g][tablero.h]=0;
                       tablero.matrizG[tablero.g][tablero.h].setIcon(null);
                       tablero.repintar();
                       
                    }else{
                        q=1;
                    }}
                    
                
                tablero.matrizL[tablero.g][tablero.h]=5;
                tablero.repintar();
                cantidad--;
                Thread.sleep(10);
                moverAbajo(cantidad);
                
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MovCab1Abajo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }
    
    public void run(){
    moverAbajo(cantidad);
    }
    
}
