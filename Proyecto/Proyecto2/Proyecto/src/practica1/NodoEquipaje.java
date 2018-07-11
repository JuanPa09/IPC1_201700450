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
public class NodoEquipaje {
    
        private int maletas;
        private String nombre;
        
        public NodoEquipaje sig;
        public NodoEquipaje ant;
        
        public NodoEquipaje(int maletas){
            this.maletas=maletas;
            this.sig=null;
        }
        
        public NodoEquipaje(){}
        

    public int getMaletas() {
        return maletas;
    }

    public void setDpi(int dpi) {
        this.maletas = maletas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
