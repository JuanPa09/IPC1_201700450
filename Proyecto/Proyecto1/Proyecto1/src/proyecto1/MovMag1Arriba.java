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
public class MovMag1Arriba extends Thread{
    
     protected int cantidad;
    public Tablero tablero = null;
    public int i,j,n,m,r=0,q=0;
    Random rm = new Random();
    Config config = new Config();
   
    
   public MovMag1Arriba(){
        
    }
    
    public MovMag1Arriba(int cantidad, Tablero tablero){
        this.cantidad=cantidad;
        this.tablero=tablero;
    }
    
    public boolean comprobarfin(){
        if (tablero.d<=0) {
            return true;
        }
        return false;
    }
    
    public void moverArriba(int cantidad){
        
        
        if (cantidad<=0) {
            return;
        }
        if(comprobarfin()){
            cantidad=0;
            config.setVida1(config.getVida1()-1);
            
            tablero.matrizL[tablero.c][0]=0;
            tablero.matrizG[tablero.c][0].setIcon(null);
            int centro=tablero.matrizL[((tablero.tam-1)/2)][((tablero.tam-1)/2)];
            if (centro!=0||centro!=7||centro!=8){
            tablero.c=(tablero.tam-1)/2;
            tablero.d=(tablero.tam-1)/2;
            tablero.matrizL[(tablero.tam-1)/2][(tablero.tam-1)/2]=3;    
            }else{
                int centro1=tablero.matrizL[((tablero.tam-1)/2)+1][((tablero.tam-1)/2)];
                if (centro1!=0||centro1!=7||centro1!=8);{
            tablero.c=((tablero.tam-1)/2)+1;
            tablero.d=((tablero.tam-1)/2)+1;
            tablero.matrizL[((tablero.tam-1)/2)+1][((tablero.tam-1)/2)+1]=3;
            }
                
            }
            tablero.repintar();
            
        }
        else{
            
            int pos = tablero.matrizL[tablero.c][tablero.d-1];
            if(pos==1||pos==2||pos==3||pos==4||pos==5||pos==6){
                int i=rm.nextInt(2);
                   switch(i){
                       case 0: MovMag1Derecha moviderecha = new MovMag1Derecha(cantidad,tablero); moviderecha.start();
                           break;
                       case 1: MovMag1Izquierda moviizquierda = new MovMag1Izquierda(cantidad,tablero); moviizquierda.start();
                           break;
                   }
                }
                else{
       
            try {
                //mover una posicion
                if (r==1){
                    r=0; 
                    tablero.matrizL[tablero.c][tablero.d]=7;
                    tablero.matrizG[tablero.c][tablero.d].setIcon(null);
                tablero.repintar();
                }else{
                if(q==1){
                q=0; 
                    tablero.matrizL[tablero.c][tablero.d]=8;
                    tablero.matrizG[tablero.c][tablero.d].setIcon(null);
                tablero.repintar();    
                
                }else{
                tablero.matrizL[tablero.c][tablero.d]=0;
                tablero.matrizG[tablero.c][tablero.d].setIcon(null);
                tablero.repintar();
            }}
                tablero.d-=1;
                if (tablero.matrizL[tablero.c][tablero.d]==7){
                    if (cantidad==1){
                       config.setVida1(config.getVida1()-1);
                       tablero.matrizL[tablero.c][tablero.d]=0;
                       tablero.matrizG[tablero.c][tablero.d].setIcon(null);
                       tablero.repintar();
                       
                    }else{
                        r=1;
                    }}
                if (tablero.matrizL[tablero.c][tablero.d]==8) {   
                    if (cantidad==1){
                       config.setVida1(config.getVida1()+1);
                       tablero.matrizL[tablero.c][tablero.d]=0;
                       tablero.matrizG[tablero.c][tablero.d].setIcon(null);
                       tablero.repintar();
                       
                    }else{
                        q=1;
                    }}
                tablero.matrizL[tablero.c][tablero.d]=3;
                tablero.repintar();
                cantidad--;
                Thread.sleep(100);
                moverArriba(cantidad);
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MovCab1Arriba.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    }
    
    public void run(){
    moverArriba(cantidad);
    }
    
}
