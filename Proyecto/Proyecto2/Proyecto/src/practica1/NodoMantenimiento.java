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
public class NodoMantenimiento {
    
       private int nestacion; 
       private int navion;
       private int estado=0;
       private String tipo;
       private int pasajeros;
       private int desabordaje;
       private int mantenimiento;
       public NodoMantenimiento sig;
       public JTextArea consola;
       
       public NodoMantenimiento(JTextArea consola){
        this.consola=consola;
        
    }
       
       public NodoMantenimiento(){}
       
       public NodoMantenimiento(int navion, String tipo, int pasajeros, int desabordaje, int mantenimiento){
          this.desabordaje=desabordaje;
            this.mantenimiento=mantenimiento;
            this.navion=navion;
            this.pasajeros=pasajeros;
            this.tipo=tipo;
            this.sig=null; 
       }
       
       public NodoMantenimiento(int navion, int estado,String tipo,int pasajeros,int desabordaje,int mantenimiento){
            this.desabordaje=desabordaje;
            this.estado=estado;
            this.mantenimiento=mantenimiento;
            this.navion=navion;
            this.pasajeros=pasajeros;
            this.tipo=tipo;
            this.sig=null;
            
        }
        
        public NodoMantenimiento(int nestacion,int navion, int estado,String tipo,int pasajeros,int desabordaje,int mantenimiento){
            this.desabordaje=desabordaje;
            this.estado=estado;
            this.mantenimiento=mantenimiento;
            this.navion=navion;
            this.pasajeros=pasajeros;
            this.tipo=tipo;
            this.sig=null;
            this.nestacion=nestacion;
        }

    public int getNavion() {
        return navion;
    }

    public void setNavion(int navion) {
        this.navion = navion;
    }

    public int isEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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

    public NodoMantenimiento getSig() {
        return sig;
    }

    public void setSig(NodoMantenimiento sig) {
        this.sig = sig;
    }

    public int getNestacion() {
        return nestacion;
    }

    public void setNestacion(int nestacion) {
        this.nestacion = nestacion;
    }
        
        
        

  
    
}
