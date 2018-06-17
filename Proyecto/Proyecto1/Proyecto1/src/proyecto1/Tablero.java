/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;


import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juan Pablo
 */
public class Tablero {
   public JPanel fondo = null;
   public JLabel [][] matrizG;
   public int [][] matrizL;
   public JPanel panel;
   public JLabel texto;
   public int tam;
   public Cab1 personaje1;
   public Cab2 personaje2;
   public Pri1 personaje3;
   public Pri2 personaje4;
   public Mag1 personaje5;
   public Mag2 personaje6;
   public Mina mina;
   public int tambloquey;
   public int tambloquex;  
   public int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p;
   public int minA,vida;
   
   Random rm = new Random();
   
    
    public Tablero(int tam, JPanel panel){
        this.tam=tam;
        this.fondo=panel;
        
        llenar();        
    }
    
    public Tablero (){
        
    }
    
    public void llenar(){
        tambloquey = 625/tam;
        tambloquex = 785/tam;
        matrizL = new int [tam][tam];
        matrizG = new JLabel [tam][tam];
        Random rm = new Random();
        
        minA=(int) (0.10*tam*tam);
        vida=(int) (0.5*tam);
        // 1 personaje, 0 vacio
        
        for (int i =0;i<tam;i++){
            for(int j=0;j<tam;j++){
                matrizL[i][j]=0;
            }
            
        }
        //Caballero 1
       do{
        n=rm.nextInt(tam);
        m=rm.nextInt(tam);
        while(matrizL[n][m]!=0){
          n=rm.nextInt(tam);
        m=rm.nextInt(tam);  
        }
        matrizL[n][m]=1;}
       while(matrizL[n][m]==0);
        
        do{
        a=rm.nextInt(tam);
        b=rm.nextInt(tam);
        while(matrizL[a][b]!=0){
          a=rm.nextInt(tam);
        b=rm.nextInt(tam);  
        }
        matrizL[a][b]=2;}
       while(matrizL[a][b]==0);
        
        for(i=0;i<minA;i++){
        do{
        k=rm.nextInt(tam);
        l=rm.nextInt(tam);
        while(matrizL[k][l]!=0){
          k=rm.nextInt(tam);
        l=rm.nextInt(tam);  
        }
        matrizL[k][l]=7;}
       while(matrizL[n][m]==0);
    }
           
       
      
         
        personaje1 = new Cab1();
        personaje2 = new Cab2();
        personaje3 = new Pri1();
        personaje4 = new Pri2();
        personaje5 = new Mag1();
        personaje6 = new Mag2();
        mina =       new Mina(); 
        
        
        
        
        repintar();       
        
        
       }
    
    public void repintar (){
        JLabel casilla=null;
        for (int i=0;i<tam;i++){
            for (int j=0;j<tam;j++){
                if (matrizL[i][j]==0){
                    casilla = new JLabel();
                    
                }//1
                else{
                    switch(matrizL[i][j]) {
  
                        
    case 1 :
      casilla=new JLabel(this.personaje1.obtenerImagen(tambloquex,tambloquey));
      break; // optional
   
   case 2 :
      casilla=new JLabel(this.personaje2.obtenerImagen(tambloquex,tambloquey));
      break; // optional
      
   case 7 : casilla=new JLabel(this.mina.obtenerImagen(tambloquex/2,tambloquey/2));
   
   // You can have any number of case statements.
   default : // Optional
      
}
                    
                }
                casilla.setOpaque(false);
                casilla.setBorder(BorderFactory.createLineBorder(Color.BLUE));
                casilla.setBounds(i*tambloquex,j*tambloquey,tambloquex,tambloquey);
               matrizG [i][j]=casilla;                
                fondo.add(matrizG[i][j],BorderLayout.CENTER);
                fondo.repaint();
                
                
            }
        }
    }
    
   
    
}
    
    

