/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Pablo
 */
public class MovPri1Izquierda extends Thread{
    
    protected int cantidad;
    public Tablero tablero = null;
    public int i,j,n,m,r=0,q=0;
    Random rm = new Random();
    Config config = new Config();
   
    
   public MovPri1Izquierda(){
        
    }
    
    public MovPri1Izquierda(int cantidad, Tablero tablero){
        this.cantidad=cantidad;
        this.tablero=tablero;
    }
    
    public boolean comprobarfin(){
        if (tablero.g<=0) {
            return true;
        }
        return false;
    }
    
    public void moverIzquierda(int cantidad){
        
        
        if (cantidad<=0) {
            return;
        }
        if(comprobarfin()){
            cantidad=0;
            config.setVida1(config.getVida1()-1);
            
            tablero.matrizL[0][tablero.h]=0;
            tablero.matrizG[0][tablero.h].setIcon(null);
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
            tablero.matrizL[((tablero.tam-1)/2)+1][((tablero.tam-1)/2)+1]=5;
            }
                
            }
            tablero.repintar();
            
        }
        else{
            
            int pos = tablero.matrizL[tablero.g-1][tablero.h];
            if(pos==1||pos==2||pos==3||pos==4||pos==5||pos==6){
                int i=rm.nextInt(2);
                   switch(i){
                       case 0: MovPri1Arriba moviarriba = new MovPri1Arriba(cantidad,tablero); moviarriba.start();
                           break;
                       case 1: MovPri1Abajo moviabajo = new MovPri1Abajo(cantidad,tablero); moviabajo.start();
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
                tablero.g-=1;
                if (tablero.matrizL[tablero.g][tablero.h]==7){
                    if (cantidad==1){
                       config.setVida1(config.getVida1()-1);
                       tablero.matrizL[tablero.g][tablero.h]=0;
                       tablero.matrizG[tablero.g][tablero.h].setIcon(null);
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
                moverIzquierda(cantidad);
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MovCab1Izquierda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }
    
    public void run(){
    moverIzquierda(cantidad);
    }
    
}
