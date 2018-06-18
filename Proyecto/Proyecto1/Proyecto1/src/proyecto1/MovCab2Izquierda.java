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
public class MovCab2Izquierda extends Thread{
    
    protected int cantidad;
    public Tablero tablero = null;
    public int i,j,n,m,r=0,q=0;
    Random rm = new Random();
    Config config = new Config();
   
    
   public MovCab2Izquierda(){
        
    }
    
    public MovCab2Izquierda(int cantidad, Tablero tablero){
        this.cantidad=cantidad;
        this.tablero=tablero;
    }
    
    public boolean comprobarfin(){
        if (tablero.a<=0) {
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
            config.setVida2(config.getVida2()-1);
            
            tablero.matrizL[0][tablero.b]=0;
            tablero.matrizG[0][tablero.b].setIcon(null);
            int centro=tablero.matrizL[((tablero.tam-1)/2)][((tablero.tam-1)/2)];
            if (centro!=0||centro!=7||centro!=8){
            tablero.a=(tablero.tam-1)/2;
            tablero.b=(tablero.tam-1)/2;
            tablero.matrizL[(tablero.tam-1)/2][(tablero.tam-1)/2]=2;    
            }else{
                int centro1=tablero.matrizL[((tablero.tam-1)/2)+1][((tablero.tam-1)/2)];
                if (centro1!=0||centro1!=7||centro1!=8);{
            tablero.a=((tablero.tam-1)/2)+1;
            tablero.b=((tablero.tam-1)/2)+1;
            tablero.matrizL[((tablero.tam-1)/2)+1][((tablero.tam-1)/2)+1]=2;
            }
                
            }
            tablero.repintar();
            
        }
        else{
            
            int pos = tablero.matrizL[tablero.a-1][tablero.b];
            if(pos==1||pos==2||pos==3||pos==4||pos==5||pos==6){
                int i=rm.nextInt(2);
                   switch(i){
                       case 0: MovCab2Arriba moviarriba = new MovCab2Arriba(cantidad,tablero); moviarriba.start();
                           break;
                       case 1: MovCab2Abajo moviabajo = new MovCab2Abajo(cantidad,tablero); moviabajo.start();
                           break;
                   }
                }
                else{
            
            
            try {
                //mover una posicion
                if (r==1){
                    r=0; 
                    tablero.matrizL[tablero.a][tablero.b]=7;
                    tablero.matrizG[tablero.a][tablero.b].setIcon(null);
                tablero.repintar();
                }else{
                if(q==1){
                q=0; 
                    tablero.matrizL[tablero.a][tablero.b]=8;
                    tablero.matrizG[tablero.a][tablero.b].setIcon(null);
                tablero.repintar();    
                
                }else{
                tablero.matrizL[tablero.a][tablero.b]=0;
                tablero.matrizG[tablero.a][tablero.b].setIcon(null);
                tablero.repintar();
            }}
                tablero.a-=1;
                if (tablero.matrizL[tablero.a][tablero.b]==7){
                    if (cantidad==1){
                       config.setVida2(config.getVida2()-1);
                       tablero.matrizL[tablero.a][tablero.b]=0;
                       tablero.matrizG[tablero.a][tablero.b].setIcon(null);
                       tablero.repintar();
                       
                    }else{
                        r=1;
                    }}
                if (tablero.matrizL[tablero.a][tablero.b]==8) {   
                    if (cantidad==1){
                       config.setVida2(config.getVida2()+1);
                       tablero.matrizL[tablero.a][tablero.b]=0;
                       tablero.matrizG[tablero.a][tablero.b].setIcon(null);
                       tablero.repintar();
                       
                    }else{
                        q=1;
                    }}
                tablero.matrizL[tablero.a][tablero.b]=2;
                tablero.repintar();
                cantidad--;
                Thread.sleep(100);
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
