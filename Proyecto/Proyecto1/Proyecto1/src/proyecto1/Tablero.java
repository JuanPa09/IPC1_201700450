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
   public Mag1 personaje3;
   public Mag2 personaje4;
   public Pri1 personaje5;
   public Pri2 personaje6;
   public Mina mina;
   public Vida vida;
   public int tambloquey;
   public int tambloquex;  
   public int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,x,y;
   public int minA,vidas;
   
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
        vidas=(int) (0.5*tam);
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
        
       //Caballero 2
        do{
        a=rm.nextInt(tam);
        b=rm.nextInt(tam);
        while(matrizL[a][b]!=0){
          a=rm.nextInt(tam);
        b=rm.nextInt(tam);  
        }
        matrizL[a][b]=2;}
       while(matrizL[a][b]==0);
        
        //mago 1
        do{
        c=rm.nextInt(tam);
        d=rm.nextInt(tam);
        while(matrizL[c][d]!=0){
          c=rm.nextInt(tam);
        d=rm.nextInt(tam);  
        }
        matrizL[c][d]=3;}
       while(matrizL[c][d]==0);
        
        //mago2
        do{
        e=rm.nextInt(tam);
        f=rm.nextInt(tam);
        while(matrizL[e][f]!=0){
          e=rm.nextInt(tam);
        f=rm.nextInt(tam);  
        }
        matrizL[e][f]=4;}
       while(matrizL[e][f]==0);
        
        //princesa1
        do{
        g=rm.nextInt(tam);
        h=rm.nextInt(tam);
        while(matrizL[g][h]!=0){
          g=rm.nextInt(tam);
        h=rm.nextInt(tam);  
        }
        matrizL[g][h]=5;}
       while(matrizL[g][h]==0);
        
        //princesa2
        do{
        x=rm.nextInt(tam);
        y=rm.nextInt(tam);
        while(matrizL[x][y]!=0){
          x=rm.nextInt(tam);
        y=rm.nextInt(tam);  
        }
        matrizL[x][y]=6;}
       while(matrizL[x][y]==0);
        
        //minas
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
           
        //Vidas
        
        for(i=0;i<vidas;i++){
        do{
        o=rm.nextInt(tam);
        p=rm.nextInt(tam);
        while(matrizL[o][p]!=0){
        o=rm.nextInt(tam);
        p=rm.nextInt(tam);  
        }
        matrizL[o][p]=8;}
       while(matrizL[o][p]==0);
    }
        
       
      
         
        personaje1 = new Cab1();
        personaje2 = new Cab2();
        personaje3 = new Mag1();
        personaje4 = new Mag2();
        personaje5 = new Pri1();
        personaje6 = new Pri2();
        mina =       new Mina(); 
        vida =       new Vida();
        
        
        
        repintar();       
        
        
       }
    
    public void repintar (){
        JLabel casilla=null;
        
        for (int i=0;i<tam;i++){
            for (int j=0;j<tam;j++){
                if (matrizL[i][j]==0){
                    casilla = new JLabel();
                    casilla.setIcon(null);
                    fondo.repaint();
                    casilla.repaint();
                    
                }//1
                else{
                    switch(matrizL[i][j]) {
  
      
    case 1 :
      casilla=new JLabel(this.personaje1.obtenerImagen(tambloquex,tambloquey));
      break; 
   
   case 2 :
      casilla=new JLabel(this.personaje2.obtenerImagen(tambloquex,tambloquey));
      break; 
      
   case 3 :
      casilla=new JLabel(this.personaje3.obtenerImagen(tambloquex,tambloquey));
      break;
      
      case 4 :
      casilla=new JLabel(this.personaje4.obtenerImagen(tambloquex,tambloquey));
      break;
      
      case 5 :
      casilla=new JLabel(this.personaje5.obtenerImagen(tambloquex,tambloquey));
      break;
      
      case 6 :
      casilla=new JLabel(this.personaje6.obtenerImagen(tambloquex,tambloquey));
      break;
      
   case 7 : casilla=new JLabel(this.mina.obtenerImagen(tambloquex/2,tambloquey/2));
        break;
        
   case 8 : casilla=new JLabel(this.vida.obtenerImagen(tambloquex/2,tambloquey/2));
       break;
   
   
      
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
    
    

