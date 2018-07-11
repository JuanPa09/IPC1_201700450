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
public class Enviar {
    ListaAvion lista = new ListaAvion();
    ColaMantenimiento cola = new ColaMantenimiento();
    NodoAvion temp = lista.primero;
    
    public void enviar(int turno,JTextArea consola,ColaMantenimiento cola,ListaAvion lista){
        
        
        for(int i=0;i<=turno;i++){    
                
                    if(temp!=null){
                       
                   if (temp.getDesabordaje()==0){
                           JOptionPane.showMessageDialog(null,lista.primero.getNavion()+" "+lista.primero.getTipo() );
                           cola.encolar(lista.primero.getNavion(), lista.primero.getTipo(), lista.primero.getPasajeros(), lista.primero.getDesabordaje(), lista.primero.getMantenimiento());
                           
                        }
                        //lista.primero=lista.primero.sig;
                        //lista.eliminar(lista,cola);
               
                    
                    }
                }
                    
        
    }
    
}
