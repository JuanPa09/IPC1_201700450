/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import javax.swing.JTextArea;

/**
 *
 * @author Juan Pablo
 */
public class NodoColaMantenimiento {
    
      
       private int navion;
       private String tipo;
       private int pasajeros;
       private int desabordaje;
       private int mantenimiento;
       private int encolar;
       public NodoColaMantenimiento sig;
       public JTextArea consola;
       
       public NodoColaMantenimiento(JTextArea consola){
        this.consola=consola;
        
    }
       public NodoColaMantenimiento(){}
       
       public NodoColaMantenimiento(int navion, String tipo, int pasajeros, int desabordaje, int mantenimiento){
          this.desabordaje=desabordaje;
            this.mantenimiento=mantenimiento;
            this.navion=navion;
            this.pasajeros=pasajeros;
            this.tipo=tipo;
            this.sig=null; 
       }
       
      
        
        

    public int getNavion() {
        return navion;
    }

    public void setNavion(int navion) {
        this.navion = navion;
    }

   

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getDesabordaje() {
        return desabordaje;
    }

    public void setDesabordaje(int desabordaje) {
        this.desabordaje = desabordaje;
    }

    public int getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(int mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public NodoColaMantenimiento getSig() {
        return sig;
    }

    public void setSig(NodoColaMantenimiento sig) {
        this.sig = sig;
    }

    public int getEncolar() {
        return encolar;
    }

    public void setEncolar(int encolar) {
        this.encolar = encolar;
    }
    
    

    
    
}
