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
public class ListaAvion{
    NodoAvion primero;
    ColaMantenimiento cola;
    ListaAvion lista ;
    ListaMantenimiento mantenimiento;
    ListaMantenimiento lmprimero,primeroo;
    
    
   
    
    
    
    
    public void insertarFinal(int navion, String tipo, int pasajeros, int desabordaje, int mantenimiento){
        NodoAvion nuevo=new NodoAvion(navion,tipo,pasajeros,desabordaje,mantenimiento);
        if(primero==null){
            primero=nuevo;
        }else{
            NodoAvion aux=primero;
            while(aux.sig!=null){
                aux=aux.sig;
            }
            aux.sig=nuevo;
            nuevo.ant=aux;
        }
        
    }
    
    public void recorrer(JTextArea consola){
        NodoAvion imprimir = new NodoAvion(consola);
        if(primero==null){
            System.out.println("LISTA VACIA");
        }else{
            NodoAvion aux=primero;
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
    
    
    public void restarTurno(int turno){
        
            NodoAvion aux=primero;
            
           
           
            if(primero!=null){
                if(aux.sig!=null){
            
            while(aux.sig!=null){
            aux.setDesabordaje(aux.getDesabordaje()-1);
            aux=aux.sig;    
                    
            } 
           }//else{
             if(aux.sig==null){  
                   aux.setDesabordaje(aux.getDesabordaje()-1);
             }// }
               
            }
    
    }
    
    
    
    
    


    
    
    public void eliminar(ListaAvion lista,ColaMantenimiento cola,int cmantenimiento,ListaMantenimiento listam){
        
       NodoMantenimiento aux1 = listam.primero; 
       int num=0;
        if(primero!=null){
            NodoAvion aux=primero;
            NodoAvion auxant=null;
            //lo recorremos hasta el último
            while(aux.sig!=null){
                if(aux.getDesabordaje()==0){
                   // JOptionPane.showMessageDialog(null, "se encolo el avion "+aux.getNavion());
                    cola.encolar(aux.getNavion(), aux.getTipo(), aux.getPasajeros(), aux.getDesabordaje(), aux.getMantenimiento());
                    //listam.insertarMantenimiento(aux.getNavion(), aux.getPasajeros(), aux.getMantenimiento(), aux.getDesabordaje(), aux.getTipo());
                    /*for(int i = 1; i<=cmantenimiento;i++){
                        if(aux1.isEstado()==0){
                            //listam.insertarMantenimiento(aux.getNavion(), aux.getPasajeros(), aux.getMantenimiento(), aux.getDesabordaje(), aux.getTipo());
                            aux1.setDesabordaje(aux.getDesabordaje());
                            aux1.setMantenimiento(aux.getMantenimiento()+1);
                            aux1.setNavion(aux.getNavion());
                            aux1.setPasajeros(aux.getPasajeros());
                            aux1.setTipo(aux.getTipo());
                            aux1.setEstado(1);
                        i=cmantenimiento;
                        num=num+5;
                        }
                        aux1=aux1.sig;
                        num=num+1;
                        if(num==(cmantenimiento)){
                            JOptionPane.showMessageDialog(null, "Se encolo");
                            cola.encolar(aux.getNavion(), aux.getTipo(), aux.getPasajeros(), aux.getDesabordaje(), aux.getMantenimiento());
                        }
                    }*/
                    
                  /* for(int i=1;i<=cmantenimiento;i++){
                        JOptionPane.showMessageDialog(null, i);
                        JOptionPane.showMessageDialog(null,aux.getNavion());
                        if(listam.primero.isEstado()==0){
                            listam.insertarMantenimiento(aux.getNavion(), aux.getPasajeros(), aux.getMantenimiento(), aux.getDesabordaje(), aux.getTipo());
                            
                            i=cmantenimiento;
                        }
                            
                        if(i==cmantenimiento&&listam.primero.isEstado()!=1){
                        cola.encolar(aux.getNavion(), aux.getTipo(), aux.getPasajeros(), aux.getDesabordaje(), aux.getMantenimiento());
                        }
                        
                        
                         listam.primero=listam.primero.sig;   
                        
                    } */   
                       
                    
                    
                    
                    if(auxant==null){
                        //primero
                       
                        
                        primero=primero.sig;
                        aux.sig=null;
                        aux=primero;
                        return;
                    }else{
                       
                        auxant.sig=aux.sig;
                        aux.sig=null;
                        aux=auxant.sig;
                        aux.ant=auxant;
                        return;
                    }
                }else{
                    
                    auxant=aux;
                    aux=aux.sig;
                }
            }
            //eliminamos el último quitando la referencia del anterior
            if(aux.getDesabordaje()==0){
                //JOptionPane.showMessageDialog(null,"Se encolo el avion "+aux.getNavion());
                cola.encolar(aux.getNavion(), aux.getTipo(), aux.getPasajeros(), aux.getDesabordaje(), aux.getMantenimiento());
               /* for(int i = 1; i<=cmantenimiento;i++){
                        if(aux1.isEstado()==0){
                            //listam.insertarMantenimiento(aux.getNavion(), aux.getPasajeros(), aux.getMantenimiento(), aux.getDesabordaje(), aux.getTipo());
                            aux1.setDesabordaje(aux.getDesabordaje());
                            aux1.setMantenimiento(aux.getMantenimiento());
                            aux1.setNavion(aux.getNavion());
                            aux1.setPasajeros(aux.getPasajeros());
                            aux1.setTipo(aux.getTipo());
                            aux1.setEstado(1);
                        i=cmantenimiento;
                      num=num+5;
                        }
                        num=num+1;
                        aux1=aux1.sig;
                        if(num==cmantenimiento){
                            JOptionPane.showMessageDialog(null, "Se encolo");
                          cola.encolar(aux.getNavion(), aux.getTipo(), aux.getPasajeros(), aux.getDesabordaje(), aux.getMantenimiento());  
                        }
                    }*/
                
                
                
                
                
                if(auxant==null){
                    primero=null;
                    return;
                }
                auxant.sig=null;
                aux=null;
            }
            
        }
        
    }
    
    public void EliminarInicio(){
            if (primero!=null){
                primero=primero.sig;
                primero.sig=null;
            }    
    }
    
    
    
 public void imprimirCola(JTextArea consola){
        //lista.recorrer(consola);
        
        NodoAvion imprimir = new NodoAvion(consola);
        if(primero==null){
            System.out.println("LISTA VACIA");
        }else{
            NodoAvion aux=primero;
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
    
}

