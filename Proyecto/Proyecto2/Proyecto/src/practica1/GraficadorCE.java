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
public class GraficadorCE {
     String cad;
   
    public void crearDot(NodoEscritorios primero, String nombre) throws IOException{
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
        fw = new FileWriter(nombre+".dot");
        pw=new PrintWriter(fw);
        generarDot(primero);
        pw.println("digraph lista{");
        pw.println(generarDot(primero));
        pw.println("}");
        pw.close();
            fw.close();;
        }catch(IOException ex){
            
        }
    }
        public String reemplazar(int posmemoria){
            String cadena =String.valueOf(posmemoria);
            return cadena.replace("-", "-");
            
        }
    
    public String generarDot(NodoEscritorios primero){
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
                
                cadena+=generarDot(primero.sig);
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

public void Graficar(ListaEscritorios avion,GraficadorCE g) throws IOException{
    
       
    g.crearDot(avion.primero, "Grafica");
       g.generarImagen("Grafica.dot", "Grafica.png");
}

    
    public void setcad(String cadena){
        this.cad=cadena;
    }
    
    public String getcad(){
        return cad;
    }
    
}
