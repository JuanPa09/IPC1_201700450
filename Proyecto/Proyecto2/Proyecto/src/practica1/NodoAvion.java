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
public class NodoAvion {
    public int navion;
    public String tipo;
    public int pasajeros;
    public int desabordaje;
    public int mantenimiento;
    public NodoAvion sig;
    public NodoAvion ant;
    public JTextArea consola;
    
    public NodoAvion(JTextArea consola){
        this.consola=consola;
    }
    
    public NodoAvion(){}
    
    
   
    
    
    public NodoAvion(int navion, String tipo, int pasajeros, int desabordaje, int mantenimiento){
        this.navion=navion;
        this.tipo=tipo;
        this.pasajeros=pasajeros;
        this.desabordaje=desabordaje;
        this.mantenimiento=mantenimiento;
        this.ant=null;
        this.sig=null;
        this.consola=consola;
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

    public NodoAvion getSig() {
        return sig;
    }

    public void setSig(NodoAvion sig) {
        this.sig = sig;
    }

    public NodoAvion getAnt() {
        return ant;
    }

    public void setAnt(NodoAvion ant) {
        this.ant = ant;
    }

   
    }


    
    
    
    

