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
public class ColaPasajeros {
   NodoColaPasajeros primero = new NodoColaPasajeros(); 
   //NodoEscritorios pri = new NodoEscritorios();
   ListaEscritorios listae = new ListaEscritorios();
   ListaEscritorios listam;
   ColaPasajeros cola;
   int num=0;
   NodoColaPasajeros aux1=primero;
//   ListaMantenimiento listam = new ListaMantenimiento();

    ColaPasajeros() {
        
    }
   
    
    
    public void imprimir(JTextArea consola,int i,int m){
        /*consola.append(" "+'\n');
        consola.append("Cola De Escritorio "+i+'\n');*/
        if(primero==null){
            System.out.println("LISTA VACIA");
        }else{
            NodoColaPasajeros aux=primero;//.sig;
                
                if(i==1){
                while (aux!=null&&aux.getEcola()!=8){
                consola.append(" "+'\n');
               consola.append("Pasajero no.: "+aux.getPasajero()+'\n');
                
                consola.append("Maletas: "+aux.getMaletas()+'\n');
                consola.append("Pasajeros: "+aux.getDocumentos()+'\n');
                consola.append("Numero: "+aux.getEcola()+'\n');
                aux=aux.sig;
                
                }
                }else{
                    
                    while(aux.getEcola()!=(7*(i-1)+1)){
                        aux=aux.sig;
                    }
                while (aux!=null){
                consola.append(" "+'\n');
               consola.append("Pasajero no.: "+aux.getPasajero()+'\n');
                
                consola.append("Maletas: "+aux.getMaletas()+'\n');
                consola.append("Documentos: "+aux.getDocumentos()+'\n');
                consola.append("Numero: "+aux.getEcola()+'\n');
                aux=aux.sig;
                
                }    
                    
                }
    }
    
    }
    
    
    
    
    
    
    
    
    
    
    public void encolar(int pasajero,int maletas, int documentos,int Tescritorio, int ecola){
     NodoColaPasajeros nuevo = new NodoColaPasajeros(pasajero,maletas,documentos,Tescritorio,ecola);
        NodoColaPasajeros aux=primero;
         if(primero==null){
             primero=nuevo;
         }else{
                   while(aux.sig!=null){
                            aux=aux.sig;
                   }
                   aux.sig=nuevo;
         }
         
        
    }
    
    public void descolar1(){
        if(primero!=null){
            if(primero.sig==null){
                primero = null;
            }else{
                primero=primero.sig;
            }
            
            
            
        }
    }
    
    
    public void descolar(int cmantenimiento, ListaMantenimiento listam) {
         NodoEscritorios aux1 = listae.primero;  
         int num=0;
        
    
        
        if (primero!=null){
        
            
            if (primero.sig==null){
                for(int i = 0; i<=cmantenimiento;i++){
                        if(aux1.getEstado()==0){
                            JOptionPane.showMessageDialog(null, "sale de la cola el avion: "+ primero.getPasajero());
                            //listam.insertarMantenimiento(aux.getNavion(), aux.getPasajeros(), aux.getMantenimiento(), aux.getDesabordaje(), aux.getTipo());
                            aux1.setPasajero(primero.getPasajero());
                            aux1.setMaletas(primero.getMaletas());
                            aux1.setDocumentos(primero.getDocumentos());
                            aux1.setTescritorio(primero.getTescritorios());
                            aux1.setEstado(1);
                        i=cmantenimiento;
                      num=num+5;
                        }
                        num=num+1;
                        aux1=aux1.sig;
                        
                        if(num>cmantenimiento){
                            JOptionPane.showMessageDialog(null,"Salio");
                            primero=null; 
                          //cola.encolar(aux.getNavion(), aux.getTipo(), aux.getPasajeros(), aux.getDesabordaje(), aux.getMantenimiento());  
                        
                        }
                    }
            
                
                
                
                //primero=null;
            }else{
                for(int i = 0; i<=cmantenimiento;i++){
                        if(aux1.getEstado()==0){
                            JOptionPane.showMessageDialog(null, "sale de la cola el avion: "+ primero.getPasajero());
                            //listam.insertarMantenimiento(aux.getNavion(), aux.getPasajeros(), aux.getMantenimiento(), aux.getDesabordaje(), aux.getTipo());
                            aux1.setPasajero(primero.getPasajero());
                            aux1.setMaletas(primero.getMaletas());
                            aux1.setDocumentos(primero.getDocumentos());
                            aux1.setTescritorio(primero.getTescritorios());
                            aux1.setEstado(1);
                        i=cmantenimiento;
                      num=num+5;
                        }
                        num=num+1;
                        aux1=aux1.sig;
                        
                        if(num>cmantenimiento){
                            JOptionPane.showMessageDialog(null,"Salio");
                            primero=null; 
                          //cola.encolar(aux.getNavion(), aux.getTipo(), aux.getPasajeros(), aux.getDesabordaje(), aux.getMantenimiento());  
                        
                        }
                    }
                
                
                
                
                
                
                
               //primero=primero.sig;
            }
        }
        
    }
    
    
    
    public void descolar1(ListaEscritorios listae){
        NodoEscritorios aux1 = listae.primero;
        
        if (primero!=null){
            while(aux1!=null){
                if(primero!=null){
                if(aux1.getEstado()==0){
                    
                    JOptionPane.showMessageDialog(null, "Pasa a matenimiento: "+aux1.getPasajero());
                            aux1.setPasajero(primero.getPasajero());
                            aux1.setMaletas(primero.getMaletas());
                            aux1.setDocumentos(primero.getDocumentos());
                            aux1.setTescritorio(primero.getTescritorios());
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
    
    
    
    public void imprimir2(JTextArea consola){
        
        NodoColaPasajeros aux=primero;
        
        
                for (int i=1;i<=7;i++){
                consola.append(" "+'\n');
               consola.append("Pasajero no.: "+aux.getPasajero()+'\n');
                
                consola.append("Maletas: "+aux.getMaletas()+'\n');
                consola.append("Pasajeros: "+aux.getDocumentos()+'\n');
                consola.append("Numero: "+aux.getEcola()+'\n');
                aux=aux.sig;
                
                }
                    
                    
                }
    
public void insertarEspacios(JTextArea consola){
    for(int i=1;i<=7;i++){
        this.encolar(0, 0, 0, 0, i);
        
    }
    //this.imprimir2(consola);
}
    
    
}
