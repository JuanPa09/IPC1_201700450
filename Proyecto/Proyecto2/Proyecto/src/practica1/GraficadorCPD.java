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
//LISTA PASAJEROS DESABORDAJE
public class GraficadorCPD {
    public void crearDot(NodoPersona primero, String nombre) throws IOException{
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
        fw = new FileWriter(nombre+".dot");
        pw=new PrintWriter(fw);
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
    
    public String generarDot(NodoPersona primero){
            
        String cadena = "";
            if (primero==null) {
                return cadena;
            }
            //cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+"Pasajero: "+primero.getN()+'\n'+"Maletas: "+primero.getMaletas()+'\n'+"Documentos: "+primero.getDocumentos()+'\n'+"Turnos Registro: "+primero.getTregistro()+"\"];\n";
            cadena+="nodo"+reemplazar(primero.hashCode())+"[label=\""+"Pasajero: "+primero.getN()+"\"];\n";
            if (primero.sig!=null){
                
                cadena+="nodo"+reemplazar(primero.hashCode())+"->"+"nodo"+reemplazar(primero.sig.hashCode())+";\n";
                //cadena+="nodo"+reemplazar(primero.sig.hashCode())+"->"+"nodo"+reemplazar(primero.sig.ant.hashCode())+";\n";
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

public void Graficar(ListaPersona persona,GraficadorCPD g) throws IOException{
    
       
    g.crearDot(persona.primero, "Grafica");
       g.generarImagen("Grafica.dot", "Grafica.png");
}

    

    
    
}
