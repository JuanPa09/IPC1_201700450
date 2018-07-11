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
public class ListaEscritorios {
    
    
   private int i;
    public NodoEscritorios primero,fin;
    ColaPasajeros cola;
    NodoAvion primeroa;
    ListaAvion primeroaa;
    ListaAvion lista = new ListaAvion();
    ListaMantenimiento listam;
    
    
    
    
    public ListaEscritorios(){
        
    }
   
   
    
     
     
      public void insertarFinal(int estado,int maletas,int documentos, int Nescritorios, int pasajero,int Tescritorios,int papeles){
         NodoEscritorios nuevo = new NodoEscritorios(estado,maletas, documentos, Nescritorios, pasajero,Tescritorios,papeles);  
         NodoEscritorios aux=primero;
         if(primero==null){
            primero=nuevo;
        }else{
            
            while(aux.sig!=null){
                aux=aux.sig;
            }
            aux.sig=nuevo;
            nuevo.ant=aux;
        }
      
       }
      
      
      //Tengo que arreglar el error para que se vayan a la cola cuando el mantenimiento esta ocupado
      
      
      
     
      
      
      
     
       
       
       
       public void recorrer(JTextArea consola){
        
        if(primero==null){
            System.out.println("LISTA VACIA");
        }else{
            NodoEscritorios aux=primero;
            while (aux!=null){
               
                consola.append(" "+'\n');
                consola.append("Escritorio no. "+aux.getNescritorios()+'\n');
                if(aux.getEstado()==0){
                consola.append("Estado: Vacio"+'\n');
                }else{
                    consola.append("Estado : Ocupado"+'\n');
                }
                consola.append("Atendiendo Pasajero : "+aux.getPasajero()+'\n');
                consola.append("Maletas: "+aux.getMaletas()+'\n');
                consola.append("Documentos: "+aux.getDocumentos()+'\n');
                consola.append("Turnos sobrantes: "+aux.getTescritorio()+'\n');
                consola.append("Pila Docs: "+aux.getPapeles()+'\n');
                
                aux=aux.sig;
           }
            
        }
    
       }
       
       
       

       
       

       
       
       
       public void restarTurno(){
      
            NodoEscritorios aux=primero;
            
           
           
            if(primero!=null){
                if(aux.sig!=null){
            
            while(aux.sig!=null){
                if(aux.getTescritorio()==0){
                    
                }else{
            aux.setTescritorio(aux.getTescritorio()-1);
                }
            aux=aux.sig;    
                  
            } 
           }/*else{
              
                   aux.setMantenimiento(aux.getMantenimiento()-1);
              }*/
               if(aux.sig==null&&aux.getTescritorio()!=0){
                   aux.setTescritorio(aux.getTescritorio()-1);
               }
            }
    
    }
       
 public void pEscritorios(){
     
 }      
     
       
       
 public void eliminar(ListaEquipaje listae){
       
     if(primero!=null){
            NodoEscritorios aux=primero;
            ListaEquipaje aux1 = new ListaEquipaje();
            while(aux!=null){
                if(aux.getTescritorio()==0){
                    
                    aux.setEstado(0);
                    aux.setPasajero(0);
                    aux.setDocumentos(0);
                    aux.setTescritorio(0);
                    //JOptionPane.showMessageDialog(null, aux.getMaletas());
                    for(int i=1;i<=3;i++){
                        aux1.Quitar();
                    }
                    aux.setMaletas(0);
                    
                    
                }
                aux=aux.sig;
            }
        }
        
    }
    
}
