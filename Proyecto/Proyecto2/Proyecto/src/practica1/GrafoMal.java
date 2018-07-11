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
public class GrafoMal {
    String guardar="";
                
     public void crearDotListaMaleta(NodoEquipaje primero, String nombre) {
	
        	
         FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
                    
			fw = new FileWriter(nombre + ".dot");
			pw = new PrintWriter(fw);
			pw.println("digraph listacircular {");
			pw.println(generarDotListaMaleta(primero));
			pw.println("}");
			pw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}
			catch(IOException ex) {
				
			}
		}
	}
  public String reemplazar(int posMemoria) {
		String cadena = String.valueOf(posMemoria);
		return cadena.replace("-", "_");
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
        
public void generarImagen(String direccionDot,String direccionImg){
    String doPath="C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe" ;
    String cmd = doPath+ " -Tjpg "+direccionDot+" -o "+direccionImg;
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ex) {
            
        }
}

public void Graficar(ListaEquipaje maleta,GrafoMal g) throws IOException{
     guardar="nodo"+reemplazar(maleta.primero.hashCode());
     //JOptionPane.showMessageDialog(null, guardar);
    g.crearDotListaMaleta(maleta.primero, "Grafica");
    g.generarImagen("Grafica.dot", "Grafica.png");
       
}






}
