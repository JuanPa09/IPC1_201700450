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
public class ListaEquipaje {
    
    public NodoEquipaje primero;
    
     /* public void insertarInicio(int n){
         NodoEquipaje nuevo = new NodoEquipaje(n);
          if(primero==null){
                   primero=nuevo;
                   primero.sig=nuevo;
                   primero.ant=primero;
         }else{
                   NodoEquipaje aux=primero;
                   while(aux.sig!=primero)
                            aux=aux.sig;
                            aux.sig=nuevo;
                            nuevo.ant=aux;
                            nuevo.sig=primero;
                            primero.ant=nuevo;
                            primero=nuevo;
                  
         }
       }*/
     
       public void insertarFinal(int n){
         NodoEquipaje nuevo = new NodoEquipaje(n);
           if(primero==null){
            primero=nuevo;
        }else{
            NodoEquipaje aux=primero;
            while(aux.sig!=null){
                aux=aux.sig;
            }
            aux.sig=nuevo;
            nuevo.ant=aux;
        }
       }
      
        public void eliminar(Integer n){
         if(primero!=null){
                   NodoEquipaje aux=primero;
                   NodoEquipaje ant=null;
                   while(aux.sig!=primero){
                            if(aux.getMaletas()==n){
                                      if(ant==null){
                                               if(aux.sig==primero)
                                                        primero=null;
                                               else{
                                                        ant=aux.ant;
                                                        ant.sig=aux.sig;
                                                        aux=aux.sig;
                                                        aux.ant=ant;
                                                        primero=aux;
                                                        ant=null;
                                               }
                                      }else{
                                               aux.ant=null;
                                               ant.sig=aux.sig;
                                               aux=aux.sig;
                                               aux.ant=ant;
                                      }
                   }else{
                            ant=aux;
                            aux=aux.sig;
                   }
         }   
               if(aux.getMaletas()==n){
                    ant.sig=primero;
                    primero.ant=ant;
                    aux=null;
            }
                   
         }else
                   System.out.println("LISTA VACIA");
       }
       
           
        
        
        public void recorrer(JTextArea consola){
         NodoAvion imprimir = new NodoAvion(consola);
        if(primero==null){
            System.out.println("LISTA VACIA");
        }else{
            NodoEquipaje aux=primero;
            while (aux!=null){
               
                consola.append(" "+'\n');
                consola.append("Maleta: "+aux.getMaletas()+'\n');
                
                aux=aux.sig;
            }
            
        }
    
        }
public void Quitar(){
   if(primero!=null){
   if(primero.sig==null){
       primero=null;
   }else{
       primero=primero.sig;
       primero.ant=null;
   }    
         
   }
}




}
