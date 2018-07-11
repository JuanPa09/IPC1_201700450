/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pablo
 */
public class GraficarTodo {
    String cad,cad2;
    String cad4;
    String guardar="";
    public void crearDot(NodoMantenimiento primero,NodoColaMantenimiento segundo,NodoPersona tercero,NodoEquipaje cuarto,NodoAvion quinto,NodoEscritorios sexto, String nombre) throws IOException{
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
        fw = new FileWriter(nombre+".dot");
        pw=new PrintWriter(fw);
        pw.println("digraph g{");
        pw.println("compound=true; subgraph cluster0 { ");
        pw.println(generarDot(primero));
        pw.println("}\n" +" subgraph cluster1 {");
        pw.println(" ");
        pw.println(" ");
        pw.println(generarDot2(segundo));
        pw.println("rankdir=TB; \n" +" }\n");
        pw.println("compound=true; subgraph cluster2 { ");
        //Aca va lista pasajeros
        pw.println(generarDot3(tercero));
        pw.println("}\n");
        pw.println("compound=true; subgraph cluster3 { ");
        //Aca va lista maletas
        pw.println(generarDotListaMaleta(cuarto));
        pw.println("}\n");
        pw.println("compound=true; subgraph cluster4 { ");
        //Aca va lista aviones
        pw.println(generarDot5(quinto));
        pw.println("}\n");
        pw.println("compound=true; subgraph cluster5 { ");
        //Aca va lista aviones
        pw.println(generarDot6(sexto));
        pw.println("}\n");
        pw.println(this.get1()+"->"+this.get2()+"[ltail=cluster0, lhead=cluster1];");
        pw.println(" ");
        pw.println("} ");
        
        
        pw.close();
            fw.close();;
        }catch(IOException ex){
            
        }
    }
    
    /*public void crearDot2(NodoColaMantenimiento primero, String nombre){
       FileWriter fw = null;
        PrintWriter pw = null;
        try {
        fw = new FileWriter(nombre+".dot");
        pw=new PrintWriter(fw);
        pw.println("digraph list{");
        pw.println(generarDot2(primero));
        pw.println("rankdir=LR;}");
        pw.close();
            fw.close();;
        }catch(IOException ex){
            
        } 
    }*/
    
        public String reemplazar(int posmemoria){
            String cadena =String.valueOf(posmemoria);
            return cadena.replace("-", "-");
            
        }
    
    public String generarDot(NodoMantenimiento primero){
            String cadena = "";
            NodoMantenimiento aux= primero.sig;
            
            if (primero==null) {
                return cadena;
            }
            cadena+="nodo"+reemplazar(primero.hashCode())+"[constraint=false,label=\""+"Estacion: "+primero.getNestacion()+"\"];\n";
            this.set1("nodo"+reemplazar(primero.hashCode()));
            if (primero.sig!=null){
                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.sig.hashCode())+";\n";
                this.set1("nodo"+reemplazar(primero.hashCode()));
                //cadena+="nodo"+reemplazar(primero.sig.hashCode())+"->"+"nodo"+reemplazar(primero.sig.ant.hashCode())+";\n";
                cadena+=generarDot(primero.sig);
            }
            return cadena;
        }
    
   public String generarDot2(NodoColaMantenimiento primeroo){
      String cadena = "";
            if (primeroo==null) {
                return cadena;
            }
            cadena+="nodo"+reemplazar(primeroo.hashCode())+"[label=\""+"Avion: "+primeroo.getNavion()+"\"];\n";
            this.set2("nodo"+reemplazar(primeroo.hashCode()));
            if (primeroo.sig!=null){
                cadena+="nodo"+reemplazar(primeroo.hashCode())+"->"+"nodo"+reemplazar(primeroo.sig.hashCode())+";\n";
            this.set2("nodo"+reemplazar(primeroo.hashCode()));
                //cadena+="nodo"+reemplazar(primero.sig.hashCode())+"->"+"nodo"+reemplazar(primero.sig.ant.hashCode())+";\n";
                cadena+=generarDot2(primeroo.sig);
            }
            return cadena; 
   }
   
  public String generarDot3(NodoPersona primerooo){
      String cadena = "";
            if (primerooo==null) {
                return cadena;
            }
            //cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+"Pasajero: "+primero.getN()+'\n'+"Maletas: "+primero.getMaletas()+'\n'+"Documentos: "+primero.getDocumentos()+'\n'+"Turnos Registro: "+primero.getTregistro()+"\"];\n";
            cadena+="nodo"+reemplazar(primerooo.hashCode())+"[label=\""+"Pasajero: "+primerooo.getN()+"\"];\n";
            if (primerooo.sig!=null){
                
                cadena+="nodo"+reemplazar(primerooo.hashCode())+"->"+"nodo"+reemplazar(primerooo.sig.hashCode())+";\n";
                //cadena+="nodo"+reemplazar(primero.sig.hashCode())+"->"+"nodo"+reemplazar(primero.sig.ant.hashCode())+";\n";
                cadena+=generarDot3(primerooo.sig);
            }
            return cadena; 
   }
  
  
  public String generarDotListaMaleta(NodoEquipaje primero) {
		String cadena = "";
                
                NodoEquipaje aux= primero;
		
                if(aux==null) {
                JOptionPane.showMessageDialog(null, aux.getMaletas());
			return cadena;
		}
		cadena += "nodo" + reemplazar(aux.hashCode()) + "[label=\""+"Maleta: "+aux.getMaletas()+ "\"];\n";
		if(aux.sig!=null) {		
			cadena += "nodo"+ reemplazar(aux.hashCode())+"->" +"nodo"+reemplazar(aux.sig.hashCode()) + ";\n";	
			cadena += "nodo" + reemplazar(aux.sig.hashCode())+ "->" + "nodo" + reemplazar(aux.sig.ant.hashCode()) + ";\n";
			
                        if(aux.sig.sig==null){
                            cadena += guardar+"->" +"nodo"+reemplazar(aux.sig.hashCode()) + ";\n";
                            cadena += "nodo"+reemplazar(aux.sig.hashCode()) +"->" + guardar+";\n";
                        }
                        cadena += generarDotListaMaleta(aux.sig);
                        
		}
		
		return cadena;
	}
   
  public String generarDot5(NodoAvion primero){
            String cadena = "";
            if (primero==null) {
                return cadena;
            }
            cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+"Avion: "+primero.getNavion()+'\n'+"Tipo: "+primero.getTipo()+'\n'+ "Pasajeros: "+primero.getPasajeros()+'\n'+"Desabordaje: "+primero.getDesabordaje()+'\n'+"Mantenimiento: "+primero.getMantenimiento()+"\"];\n";
            this.setcad("nodo"+reemplazar(primero.hashCode()));
            
            if (primero.sig!=null){
                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.sig.hashCode())+";\n";
                this.setcad("nodo"+reemplazar(primero.hashCode()));
                
                cadena+="nodo"+reemplazar(primero.sig.hashCode())+"->"+"nodo"+reemplazar(primero.sig.ant.hashCode())+";\n";
                this.setcad("nodo"+reemplazar(primero.sig.hashCode()));
                
                cadena+=generarDot5(primero.sig);
            }
            return cadena;
        }
  
  public String generarDot6(NodoEscritorios primero){
            String cadena = "";
            if (primero==null) {
                return cadena;
            }
            cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+"Numero Escritorio: "+primero.getNescritorios()+"\"];\n";
            this.setcad("nodo"+reemplazar(primero.hashCode()));
            
            if (primero.sig!=null){
                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.sig.hashCode())+";\n";
                this.setcad("nodo"+reemplazar(primero.hashCode()));
                
                cadena+="nodo"+reemplazar(primero.sig.hashCode())+"->"+"nodo"+reemplazar(primero.sig.ant.hashCode())+";\n";
                this.setcad("nodo"+reemplazar(primero.sig.hashCode()));
                
                cadena+=generarDot6(primero.sig);
            }
            return cadena;
        }
   
   
   
   
   
   
   
    
    
public void generarImagen(String direccionDot,String direccionImg){
    String doPath="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe" ;
    String cmd = doPath+ " -Tjpg "+direccionDot+" -o "+direccionImg;
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ex) {
            
        }
}

public void Graficar(ListaMantenimiento mantenimiento,ColaMantenimiento cola,ListaPersona listap,ListaEquipaje maleta,ListaAvion lista,ListaEscritorios listae,GraficarTodo g) throws IOException{
    guardar="nodo"+reemplazar(maleta.primero.hashCode());
       
    g.crearDot(mantenimiento.primero,cola.primero,listap.primero, maleta.primero,lista.primero,listae.primero,"Grafica");
    g.generarImagen("Grafica.dot", "Grafica.png");
       
    
    
}

public void set1(String cadena){
    this.cad=cadena;
}

public String get1(){
    return cad;
}

public void set2(String cadena){
    this.cad2=cadena;
}

public String get2(){
    return cad2;
}


public void setcad(String cadena){
        this.cad4=cadena;
    }
    
    public String getcad(){
        return cad4;
    }
    
}
