/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Juan Pablo
 */
public class GraficadorM {
    String cad,cad2;
    public void crearDot(NodoMantenimiento primero,NodoColaMantenimiento segundo, String nombre) throws IOException{
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
        fw = new FileWriter(nombre+".dot");
        pw=new PrintWriter(fw);
        pw.println("digraph g{");
        pw.println("compound=true; subgraph cluster0 { ");
        pw.println(generarDot(primero));
        pw.println("}\n" +
" subgraph cluster1 {");
        pw.println(" ");
        pw.println(" ");
        pw.println(generarDot2(segundo));
        pw.println("rankdir=TB; \n" +
                    " }\n" +
            this.get1()+"->"+this.get2()+"[ltail=cluster0, lhead=cluster1];");
        pw.println("}");
        
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
    
    
public void generarImagen(String direccionDot,String direccionImg){
    String doPath="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe" ;
    String cmd = doPath+ " -Tjpg "+direccionDot+" -o "+direccionImg;
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ex) {
            
        }
}

public void Graficar(ListaMantenimiento mantenimiento,ColaMantenimiento cola,GraficadorM g) throws IOException{
    
       
    g.crearDot(mantenimiento.primero,cola.primero, "Grafica");
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

    void crearDot(NodoMantenimiento primero, NodoColaMantenimiento primero0, NodoPersona primero1, String grafica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void crearDot(NodoMantenimiento primero, NodoColaMantenimiento primero0, NodoPersona primero1, NodoEquipaje primero2, String grafica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void crearDot(NodoMantenimiento primero, NodoColaMantenimiento primero0, NodoPersona primero1, NodoEquipaje primero2, NodoAvion primero3, String grafica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
