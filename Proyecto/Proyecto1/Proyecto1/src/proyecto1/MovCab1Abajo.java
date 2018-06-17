/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pablo
 */



public class MovCab1Abajo extends Thread{
    
    
    
    
    protected int cantidad;
    public Tablero tablero = null;
    public int n,m;
    Random rm = new Random();
   
   
   
   
    
   public MovCab1Abajo(){
        
    }
    
    public MovCab1Abajo(int cantidad, Tablero tablero){
        this.cantidad=cantidad;
        this.tablero=tablero;
    }
    
    
    public boolean comprobarfin(){
        if (tablero.m>=tablero.tam-1) {
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
            tablero.matrizL[tablero.n][tablero.tam-1]=0;
            tablero.matrizG[tablero.n][tablero.tam-1].setIcon(null);
            tablero.n=(tablero.tam-1)/2;
            tablero.m=(tablero.tam-1)/2;
            tablero.matrizL[(tablero.tam-1)/2][(tablero.tam-1)/2]=1;
            tablero.repintar();
            
            
        }
        else{
           
            int pos = tablero.matrizL[tablero.n][tablero.m+1];
            if(pos==2){
                int i=rm.nextInt(2);
                   switch(i){
                       case 0: MovCab1Derecha moviderecha = new MovCab1Derecha(cantidad,tablero); moviderecha.start();
                           break;
                       case 1: MovCab1Izquierda moviizquierda = new MovCab1Izquierda(cantidad,tablero); moviizquierda.start();
                           break;
                   }
                }
                else{
            try {
                //mover una posicion
                tablero.matrizL[tablero.n][tablero.m]=0;
                tablero.matrizG[tablero.n][tablero.m].setIcon(null);
                tablero.repintar();
                tablero.m+=1;
                tablero.matrizL[tablero.n][tablero.m]+=1;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
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

        
    
    

