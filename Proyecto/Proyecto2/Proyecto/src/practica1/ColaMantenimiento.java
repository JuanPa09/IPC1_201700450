/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import practica1.ListaMantenimiento.ExceptionListaVacia;

/**
 *
 * @author Juan Pablo
 */
//Agregacion rombo vacio
//Composicion rombo lleno
//Asociacion solo la flecha
public class ColaMantenimiento{
    
   NodoColaMantenimiento primero = new NodoColaMantenimiento(); 
   NodoAvion primeroc = new NodoAvion();
   ListaAvion lista = new ListaAvion();
   ListaMantenimiento listam;
   ColaMantenimiento cola;
   int num=0;
//   ListaMantenimiento listam = new ListaMantenimiento();
   
    
    
    public void imprimir(JTextArea consola){
        
        if(primero==null){
            System.out.println("LISTA VACIA");
        }else{
            NodoColaMantenimiento aux=primero;//.sig;
            while (aux!=null){
               
                consola.append(" "+'\n');
               consola.append("Numero de Avion: "+aux.getNavion()+'\n');
                
                consola.append("Tipo de Avion: "+aux.getTipo()+'\n');
                consola.append("Pasajeros: "+aux.getPasajeros()+'\n');
                consola.append("Turnos de Desabordaje: "+aux.getDesabordaje()+'\n');
                consola.append("Turnos de Mantenimiento: "+aux.getMantenimiento()+'\n');
                aux=aux.sig;
               
               
               
            }
            
        } 
    }
    
    
    
    public void encolar(int navion, String tipo, int pasajeros, int desabordaje, int mantenimiento){
     NodoColaMantenimiento nuevo = new NodoColaMantenimiento(navion,tipo,pasajeros,desabordaje,mantenimiento);
        NodoColaMantenimiento aux=primero;
         if(primero==null){
             primero=nuevo;
         }else{
                   while(aux.sig!=null){
                            aux=aux.sig;
                   }
                   aux.sig=nuevo;
         }   
    }
    
    public void descolar(int cmantenimiento, ListaMantenimiento listam) {
         NodoMantenimiento aux1 = listam.primero; 
         int num=0;
        
    
        
        if (primero!=null){
        
            
            if (primero.sig==null){
                for(int i = 0; i<=cmantenimiento;i++){
                        if(aux1.isEstado()==0){
                            //JOptionPane.showMessageDialog(null, "sale de la cola el avion: "+ primero.getNavion());
                            //listam.insertarMantenimiento(aux.getNavion(), aux.getPasajeros(), aux.getMantenimiento(), aux.getDesabordaje(), aux.getTipo());
                            aux1.setDesabordaje(primero.getDesabordaje());
                            aux1.setMantenimiento(primero.getMantenimiento());
                            aux1.setNavion(primero.getNavion());
                            aux1.setPasajeros(primero.getPasajeros());
                            aux1.setTipo(primero.getTipo());
                            aux1.setEstado(1);
                        i=cmantenimiento;
                      num=num+5;
                        }
                        num=num+1;
                        aux1=aux1.sig;
                        
                        if(num>cmantenimiento){
                            //JOptionPane.showMessageDialog(null,"Salio");
                            primero=null; 
                          //cola.encolar(aux.getNavion(), aux.getTipo(), aux.getPasajeros(), aux.getDesabordaje(), aux.getMantenimiento());  
                        
                        }
                    }
            
                
                
                
                //primero=null;
            }else{
                for(int i = 0; i<=cmantenimiento;i++){
                        if(aux1.isEstado()==0){
                            //listam.insertarMantenimiento(aux.getNavion(), aux.getPasajeros(), aux.getMantenimiento(), aux.getDesabordaje(), aux.getTipo());
                            aux1.setDesabordaje(primero.getDesabordaje());
                            aux1.setMantenimiento(primero.getMantenimiento());
                            aux1.setNavion(primero.getNavion());
                            aux1.setPasajeros(primero.getPasajeros());
                            aux1.setTipo(primero.getTipo());
                            aux1.setEstado(1);
                        i=cmantenimiento;
                      num=num+5;
                        }
                        num=num+1;
                        aux1=aux1.sig;
                        
                        if(num>cmantenimiento){
                           //JOptionPane.showMessageDialog(null,"Se descolo");
                            primero=primero.sig; 
                          //cola.encolar(aux.getNavion(), aux.getTipo(), aux.getPasajeros(), aux.getDesabordaje(), aux.getMantenimiento());  
                        
                        }
                    }
                
                
                
                
                
                
                
               //primero=primero.sig;
            }
        }
        
    }
    
    
    
    public void descolar1(ListaMantenimiento listam){
        NodoMantenimiento aux1 = listam.primero;
        
        if (primero!=null){
            while(aux1!=null){
                if(primero!=null){
                if(aux1.isEstado()==0){
                    
                    //JOptionPane.showMessageDialog(null, "Pasa a matenimiento: "+aux1.getNavion());
                    aux1.setDesabordaje(primero.getDesabordaje());
                    aux1.setMantenimiento(primero.getMantenimiento());
                    aux1.setNavion(primero.getNavion());
                    aux1.setPasajeros(primero.getPasajeros());
                    aux1.setTipo(primero.getTipo());
                    aux1.setEstado(1);
                        if(primero.sig==null){
                            primero=null;
                        }else{
                            primero=primero.sig;
                        }
                }
            
            
            //if(aux1.sig!=null){
            aux1=aux1.sig;
            //}
            }else{
                    aux1=null;
                }
            
            }  
        }
    }
    
    
    
}
