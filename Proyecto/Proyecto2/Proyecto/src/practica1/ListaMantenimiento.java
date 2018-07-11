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
public class ListaMantenimiento {
    private int i;
    public NodoMantenimiento primero,fin;
    ColaMantenimiento cola;
    NodoAvion primeroa;
    ListaAvion primeroaa;
    ListaAvion lista = new ListaAvion();
    ListaMantenimiento listam;
    
    
    
    
    public ListaMantenimiento(){
        
    }
   
   
    
     public void insertarInicio(int navion, String tipo, int pasajeros, int desabordaje, int mantenimiento){
         NodoMantenimiento nuevo = new NodoMantenimiento(navion,tipo,pasajeros,desabordaje,mantenimiento);
         if(primero==null){
             primero=nuevo;
         }else{
             
            nuevo.sig=primero;
            primero=nuevo;
         }
       }
     
      public void insertarFinal(int est,int navion, int estado, String tipo, int pasajeros, int desabordaje, int mantenimiento){
         NodoMantenimiento nuevo = new NodoMantenimiento(est,navion,estado,tipo,pasajeros,desabordaje,mantenimiento);  
         NodoMantenimiento aux=primero;
         if(primero==null){
             primero=nuevo;
         }else{
                   while(aux.sig!=null){
                            aux=aux.sig;
                   }
                   aux.sig=nuevo;
         }
      
       }
      
      
      //Tengo que arreglar el error para que se vayan a la cola cuando el mantenimiento esta ocupado
      
      
      
      
      public void insertarMantenimiento(int navion,int pasajeros,int mantenimiento, int desabordaje, String tipo){
         // JOptionPane.showMessageDialog(null, "La estacion es"+primero.getNestacion());
          primero.setNavion(navion);
          primero.setPasajeros(pasajeros);
          primero.setMantenimiento(mantenimiento);
          primero.setDesabordaje(desabordaje);
          primero.setTipo(tipo);
          //JOptionPane.showMessageDialog(null, "El avion es "+primero.getNavion());
 
      }
      
      
      
     
       
       
       
       public void recorrer(JTextArea consola){
        NodoMantenimiento imprimir = new NodoMantenimiento(consola);
        if(primero==null){
            System.out.println("LISTA VACIA");
        }else{
            NodoMantenimiento aux=primero;
            while (aux!=null){
               
                consola.append(" "+'\n');
                consola.append("Numero de Estacion: "+aux.getNestacion()+'\n');
                consola.append("Numero de Avion: "+aux.getNavion()+'\n');
                if(aux.isEstado()==0){
                consola.append("Estado: Desocupado"+'\n');
                }else{
                    consola.append("Estado : Ocupado"+'\n');
                }
                consola.append("Tipo de Avion: "+aux.getTipo()+'\n');
                consola.append("Pasajeros: "+aux.getPasajeros()+'\n');
                consola.append("Turnos de Desabordaje: "+aux.getDesabordaje()+'\n');
                consola.append("Turnos de Mantenimiento: "+aux.getMantenimiento()+'\n');
                aux=aux.sig;
           }
            
        }
    
       }
       
       
       
       public boolean estaVacia() {
		if(primero==null) {
			return true;
		}
		else {
			return false;
		}
	}
       
       class ExceptionListaVacia extends Exception{
	public ExceptionListaVacia() {
		super("La lista esta vacia");
	}
       }
       
       
       public Object removerAlFrente() throws ExceptionListaVacia{
		if(estaVacia()) {
			throw new ExceptionListaVacia();					
		}
		int dato = primero.getMantenimiento();
		
		if(primero == fin) {
			primero = fin = null;
		}
		else {
			primero = primero.sig;
		}		
		return dato;
	}
       
       
       
       public void restarTurno(int turno){
      
            NodoMantenimiento aux=primero;
            
           
           
            if(primero!=null){
                if(aux.sig!=null){
            
            while(aux.sig!=null){
                if(aux.getMantenimiento()==0){
                    
                }else{
            aux.setMantenimiento(aux.getMantenimiento()-1);
                }
            aux=aux.sig;    
                  
            } 
           }/*else{
              
                   aux.setMantenimiento(aux.getMantenimiento()-1);
              }*/
               if(aux.sig==null&&aux.getMantenimiento()!=0){
                   aux.setMantenimiento(aux.getMantenimiento()-1);
               }
            }
    
    }
       
       
 public void eliminar(ListaAvion lista,ColaMantenimiento cola,int cmantenimiento,ListaMantenimiento listam){
        
        
     
     
     
     
     if(primero!=null){
            NodoMantenimiento aux=primero;
            while(aux!=null){
                if(aux.getMantenimiento()==0){
                    
                    aux.setEstado(0);
                    aux.setDesabordaje(0);
                    aux.setMantenimiento(0);
                    aux.setNavion(0);
                    aux.setTipo(null);
                    aux.setPasajeros(0);
                    
                }
                aux=aux.sig;
            }
        }
        
    }
 
}
       
       
       
    

