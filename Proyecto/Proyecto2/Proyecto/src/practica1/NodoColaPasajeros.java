/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Juan Pablo
 */
public class NodoColaPasajeros {
    
       private int pasajero;
       private int maletas;
       private int documentos;
       private int tescritorios;
       private int ecola;
       public NodoColaPasajeros sig,aux;
       public JTextArea consola;
       
       
       public NodoColaPasajeros(JTextArea consola){
        this.consola=consola;
        
    }
       public NodoColaPasajeros(){}
       
       public NodoColaPasajeros(int pasajero, int maletas , int documentos, int tescritorios, int ecola){
            this.pasajero=pasajero;
            this.maletas=maletas;
            this.documentos=documentos;
            this.tescritorios=tescritorios;
            this.ecola=ecola;
            
            this.sig=null; 
       }

    public int getPasajero() {
        return pasajero;
    }

    public void setPasajero(int pasajero) {
        this.pasajero = pasajero;
    }

    public int getMaletas() {
        return maletas;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }

    public int getDocumentos() {
        return documentos;
    }

    public void setDocumentos(int documentos) {
        this.documentos = documentos;
    }

    public NodoColaPasajeros getSig() {
        return sig;
    }

    public void setSig(NodoColaPasajeros sig) {
        this.sig = sig;
    }

    public JTextArea getConsola() {
        return consola;
    }

    public void setConsola(JTextArea consola) {
        this.consola = consola;
    }

    public int getTescritorios() {
        return tescritorios;
    }

    public void setTescritorios(int tescritorios) {
        this.tescritorios = tescritorios;
    }
    
    public NodoColaPasajeros getAux(){
        return aux;
    }
    
    public void setAux(NodoColaPasajeros aux){
        this.aux=aux;
    }

    public int getEcola() {
        return ecola;
    }

    public void setEcola(int ecola) {
        this.ecola = ecola;
    }
    
    
       
      
        

    
}
