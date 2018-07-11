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
public class ListaPersona {
    public NodoPersona primero;
    
    
     
      public void insertarFinal(int n, int maletas, int documentos,int Tregistro){
         NodoPersona nuevo = new NodoPersona(n,maletas,documentos,Tregistro);  
         NodoPersona aux=primero;
         if(primero==null){
             primero=nuevo;
         }else{
                   while(aux.sig!=null){
                            aux=aux.sig;
                   }
                   aux.sig=nuevo;
         }
      
       }
      //arreglar el eliminar
       public void eliminar(){
        if (primero!=null){
                if (primero.sig==null) {
                 primero=null;
             }else{
                    primero=primero.sig;
                }
         }
           
           
           /*if(primero!=null){
                   NodoPersona aux=primero;
                   NodoPersona ant=null;
                   //ubicamos a aux en el nodo que vamos a eliminar
                   while((aux!=null)&&(aux.getN()!=n)){//se va a ejecutar mientras no se haya salido de la lista y no se haya encontrado el numero.
                            ant=aux;//Nodo anterior
                            aux=aux.sig;//Nodo que se va a eliminar
                   } if(aux==null){//Si ya se recorrio toda la lista
                            //System.out.println("No existe el elemento");   
                   }
                   if(ant==null){//Aqui se dice que el primero es el que se va a elminiar
                            primero=primero.sig;//se elimina al primero y el segundo se vuelve el primero
                            //System.out.println("Solo hay un elemento");
                            primero.sig=null;
                            primero=null;
                   }else{
                            ant.sig=aux.sig;
                           // System.out.println("No se elimino el primer elemento");
                            aux.sig=null;
                            aux=null;
                   }
         }else{
             System.out.println("Lista Vacia");
         }*/
       }
       
       
       
       public void recorrer(JTextArea consola){
        if(primero==null){
            System.out.println("LISTA VACIA");
        }else{
            NodoPersona aux=primero;
            while (aux!=null){
                consola.append(" "+'\n');
                consola.append("Pasajero: "+aux.getN()+'\n');
                consola.append("Maletas: "+aux.getMaletas()+'\n');
                consola.append("Documentos: "+aux.getDocumentos()+'\n');
                consola.append("Turnos Registro: "+aux.getTregistro()+'\n');
                aux=aux.sig;
            }
            System.out.println(" NULL");
        }
    
       }
       
       
       public void Pcola(ListaEscritorios listam){
        NodoEscritorios aux1 = listam.primero;
        
        if (primero!=null){
            while(aux1!=null){
                if(primero!=null){
                if(aux1.getEstado()==0){
                    
                    //JOptionPane.showMessageDialog(null, "Pasa a matenimiento: "+aux1.getNavion());
                    aux1.setDocumentos(primero.getDocumentos());
                    aux1.setPasajero(primero.getN());
                    aux1.setTescritorio(primero.getTregistro());
                    aux1.setMaletas(primero.getMaletas());
                    /*.showMessageDialog(null, aux1.getPapeles());
                    JOptionPane.showMessageDialog(null, primero.getDocumentos());*/
                    aux1.setPapeles(aux1.getPapeles()+primero.getDocumentos());
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
    

