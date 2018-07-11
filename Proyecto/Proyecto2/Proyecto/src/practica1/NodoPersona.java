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
public class NodoPersona {
        private int n,maletas,documentos,p,m,h,Tregistro;
        private String nombre;
        
        public NodoPersona sig;
        public NodoPersona(){}
        public NodoPersona(int n,int maletas, int documentos,int Tregistro){
            this.n=n;
            this.maletas=maletas;
            this.documentos=documentos;
            this.sig=null;
            this.Tregistro=Tregistro;
        }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoPersona getSig() {
        return sig;
    }

    public void setSig(NodoPersona sig) {
        this.sig = sig;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m+1;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getTregistro() {
        return Tregistro;
    }

    public void setTregistro(int Tregistro) {
        this.Tregistro = Tregistro;
    }
    
    
    
    

 
}
