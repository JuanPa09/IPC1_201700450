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
public class MovPri2Abajo extends Thread{
    
    protected int cantidad;
    public Tablero tablero = null;
    public int r=0,i,j,q=0;
    Random rm = new Random();
    JLabel casilla=null;
    Config config = new Config();
   
   
   
   
    
   public MovPri2Abajo(){
        
    }
    
    public MovPri2Abajo(int cantidad, Tablero tablero){
        this.cantidad=cantidad;
        this.tablero=tablero;
    }
    
    
    public boolean comprobarfin(){
        if (tablero.y>=tablero.tam-1) {
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
            
            tablero.matrizL[tablero.x][tablero.tam-1]=0;
            tablero.matrizG[tablero.x][tablero.tam-1].setIcon(null);
            int centro=tablero.matrizL[((tablero.tam-1)/2)][((tablero.tam-1)/2)];
            if (centro!=0||centro!=7||centro!=8){
            tablero.x=(tablero.tam-1)/2;
            tablero.y=(tablero.tam-1)/2;
            tablero.matrizL[(tablero.tam-1)/2][(tablero.tam-1)/2]=6;    
            }else{
                int centro1=tablero.matrizL[((tablero.tam-1)/2)+1][((tablero.tam-1)/2)];
                if (centro1!=0||centro1!=7||centro1!=8);{
            tablero.x=((tablero.tam-1)/2)+1;
            tablero.y=((tablero.tam-1)/2)+1;
            tablero.matrizL[((tablero.tam-1)/2)+1][((tablero.tam-1)/2)+1]=6;
            }
                
            }
            tablero.repintar();
            
            
        }
        else{
           
            int pos = tablero.matrizL[tablero.x][tablero.y+1];
            if(pos==1){
                int j=rm.nextInt(2);
                   switch(j){
                       case 0: MovPri2Derecha moviderechaa = new MovPri2Derecha(cantidad,tablero); moviderechaa.start();
                           break;
                       case 1: MovPri2Izquierda moviizquierdaa = new MovPri2Izquierda(cantidad,tablero); moviizquierdaa.start();
                           break;
                   }
                }
                else{
            try {
                //mover una posicion
                if (r==1){
                    r=0; 
                    tablero.matrizL[tablero.x][tablero.y]=7;
                    tablero.matrizG[tablero.x][tablero.y].setIcon(null);
                tablero.repintar();
                }else{
                if(q==1){
                q=0; 
                    tablero.matrizL[tablero.x][tablero.y]=8;
                    tablero.matrizG[tablero.x][tablero.y].setIcon(null);
                tablero.repintar();    
                
                }else{
                tablero.matrizL[tablero.x][tablero.y]=0;
                tablero.matrizG[tablero.x][tablero.y].setIcon(null);
                tablero.matrizG[tablero.x][tablero.y].removeAll();
                tablero.repintar();
            }}
                tablero.y+=1;
                if (tablero.matrizL[tablero.x][tablero.y]==7){
                    if (cantidad==1){
                       config.setVida2(config.getVida2()-1);
                       tablero.matrizL[tablero.x][tablero.y]=0;
                       tablero.matrizG[tablero.x][tablero.y].setBackground(Color.yellow);
                       tablero.repintar();
                       
                    }else{
                        r=1;
                    }}
                if (tablero.matrizL[tablero.x][tablero.y]==8) {   
                    if (cantidad==1){
                       config.setVida2(config.getVida2()+1);
                       tablero.matrizL[tablero.x][tablero.y]=0;
                       tablero.matrizG[tablero.x][tablero.y].setIcon(null);
                       tablero.repintar();
                       
                    }else{
                        q=1;
                    }}
                    
                
                tablero.matrizL[tablero.x][tablero.y]=6;
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
