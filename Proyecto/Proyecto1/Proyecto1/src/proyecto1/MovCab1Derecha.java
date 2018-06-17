/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pablo
 */
public class MovCab1Derecha extends Thread{
    protected int cantidad;
    public Tablero tablero = null;
    public int n,m;
    Random rm = new Random();
   
    
   public MovCab1Derecha(){
        
    }
    
    public MovCab1Derecha(int cantidad, Tablero tablero){
        this.cantidad=cantidad;
        this.tablero=tablero;
        Tablero tab = new Tablero();
        tab.i=n;
        tab.j=m;
    }
    
    public boolean comprobarfin(){
        if (tablero.n>=tablero.tam-1) {
            return true;
        }
        return false;
    }
    
    public void moverDerecha(int cantidad){
        
        
        if (cantidad<=0) {
            return;
        }
        if(comprobarfin()){
            cantidad=0;
            tablero.matrizL[tablero.tam-1][tablero.m]=0;
            tablero.matrizG[tablero.tam-1][tablero.m].setIcon(null);
            tablero.n=(tablero.tam-1)/2;
            tablero.m=(tablero.tam-1)/2;
            tablero.matrizL[(tablero.tam-1)/2][(tablero.tam-1)/2]=1;
            tablero.repintar();
            
            
        }
        else{
            
            
            int pos = tablero.matrizL[tablero.n+1][tablero.m];
            if(pos==2){
                int i=rm.nextInt(2);
                   switch(i){
                       case 0: MovCab1Arriba moviarriba = new MovCab1Arriba(cantidad,tablero); moviarriba.start();
                           break;
                       case 1: MovCab1Abajo moviabajo = new MovCab1Abajo(cantidad,tablero); moviabajo.start();
                           break;
                   }
                }
                else{
            if(tablero.matrizL[tablero.n+1][tablero.m]==7){
                tablero.matrizL[tablero.n+1][tablero.m]=0;
                tablero.matrizG[tablero.n+1][tablero.m].setIcon(null);
               
                JOptionPane.showMessageDialog(null, "Hola");
            }
            
            try {
                tablero.matrizL[tablero.n][tablero.m]=0;
                tablero.matrizG[tablero.n][tablero.m].setIcon(null);
                tablero.repintar();
                tablero.n+=1;
                tablero.matrizG[tablero.n][tablero.m].setIcon(null);
                tablero.matrizL[tablero.n][tablero.m]=1;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
                moverDerecha(cantidad);
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(MovCab1Derecha.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        
    }
    
    public void run(){
    moverDerecha(cantidad);
    }
        
    }
    

