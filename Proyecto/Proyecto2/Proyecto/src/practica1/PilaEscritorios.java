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
public class PilaEscritorios {
    public NodoEscritorios primero;
    
  public void insertarInicio(NodoEscritorios nuevo){
         
      
      if(primero==null){
             primero=nuevo;
         }else{
             
            nuevo.sig=primero;
            primero=nuevo;
         }
       }


public void recorrer(JTextArea consola){
        if(primero==null){
            System.out.println("LISTA VACIA");
        }else{
            NodoEscritorios aux=primero;
            while (aux!=null){
                //System.out.print("["+aux.getNombre()+" , "+aux.getDpi()+" ] ->");
                aux=aux.sig;
            }
            System.out.println(" NULL");
        }
    
       }  
    
    
    
}
