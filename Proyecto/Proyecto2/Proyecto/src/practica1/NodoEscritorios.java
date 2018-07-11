/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Juan Pablo
 */
public class NodoEscritorios {
    private int estado,maletas,documentos,Nescritorios,pasajero,Tescritorio,papeles;
    private ColaPasajeros cola;
    private PilaEscritorios pila;
    
    public NodoEscritorios ant;
    public NodoEscritorios sig;
    
    public NodoEscritorios(int estado,int maletas,int documentos, int Nescritorios, int pasajero,int Tescritorios,int papeles){
        this.documentos=documentos;
        this.estado=estado;
        this.Nescritorios=Nescritorios;
        this.pasajero=pasajero;
        this.maletas=maletas;
        this.Tescritorio=Tescritorios;
        this.papeles=papeles;
        
        this.ant=null;
        this.sig=null;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getDocumentos() {
        return documentos;
    }

    public void setDocumentos(int documentos) {
        this.documentos = documentos;
    }

    public int getNescritorios() {
        return Nescritorios;
    }

    public void setNescritorios(int escritorios) {
        this.Nescritorios = escritorios;
    }

    public int getPasajero() {
        return pasajero;
    }

    public void setPasajero(int pasajero) {
        this.pasajero = pasajero;
    }

    public NodoEscritorios getAnt() {
        return ant;
    }

    public void setAnt(NodoEscritorios ant) {
        this.ant = ant;
    }

    public NodoEscritorios getSig() {
        return sig;
    }

    public void setSig(NodoEscritorios sig) {
        this.sig = sig;
    }

    public int getTescritorio() {
        return Tescritorio;
    }

    public void setTescritorio(int Tescritorio) {
        this.Tescritorio = Tescritorio;
    }

    public int getMaletas() {
        return maletas;
    }

    public void setMaletas(int maletas) {
        this.maletas = maletas;
    }

    public int getPapeles() {
        return papeles;
    }

    public void setPapeles(int papeles) {
        this.papeles = papeles;
    }

    public ColaPasajeros getCola() {
        return cola;
    }

    public void setCola(ColaPasajeros cola) {
        this.cola = cola;
    }

    public PilaEscritorios getPila() {
        return pila;
    }

    public void setPila(PilaEscritorios pila) {
        this.pila = pila;
    }
    
    
    
    

   
    
}
