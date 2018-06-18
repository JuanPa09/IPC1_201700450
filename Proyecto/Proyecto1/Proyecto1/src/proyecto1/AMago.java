/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Juan Pablo
 */
public class AMago {
public Tablero tab;
public Config config;

public AMago(){
    Tablero tab = new Tablero();
    Config config = new Config();
}

        public void ataqueAbajo1(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.c][tab.d+2];
            int b = tab.matrizL[tab.c][tab.d+1];
            int c = tab.matrizL[tab.c][tab.d+3];
            int d = tab.matrizL[tab.c][tab.d+4];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                    if(c==2||c==4||c==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                        if(d==2||d==4||d==6){
                    config.setVida2(config.getVida2()-1);
                }
                    }
                }
                }
        }
        
        
        public void ataqueArriba1(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.c][tab.d-2];
            int b = tab.matrizL[tab.c][tab.d-1];
            int c = tab.matrizL[tab.c][tab.d-3];
            int d = tab.matrizL[tab.c][tab.d-4];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                    if(c==2||c==4||c==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                        if(d==2||d==4||d==6){
                    config.setVida2(config.getVida2()-1);
                }
                    }
                }
                }
        }
        
        
        public void ataqueDerecha(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.c+1][tab.d];
            int b = tab.matrizL[tab.c+2][tab.d];
            int c = tab.matrizL[tab.c+3][tab.d];
            int d = tab.matrizL[tab.c+4][tab.d];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                    if(c==2||c==4||c==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                        if(d==2||d==4||d==6){
                    config.setVida2(config.getVida2()-1);
                }
                    }
                }
                }
        }
        
        
        public void ataqueIzquierda(Tablero tab,Config config){
            
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.c-1][tab.d];
            int b = tab.matrizL[tab.c-2][tab.d];
            int c = tab.matrizL[tab.c-3][tab.d];
            int d = tab.matrizL[tab.c-4][tab.d];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                    if(c==2||c==4||c==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                        if(d==2||d==4||d==6){
                    config.setVida2(config.getVida2()-1);
                }
                    }
                }
                }     
        }
        
        
        
        
        public void ataqueAbajo2(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.e][tab.f+2];
            int b = tab.matrizL[tab.e][tab.f+1];
            int c = tab.matrizL[tab.e][tab.f+3];
            int d = tab.matrizL[tab.e][tab.f+4];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                    if(c==2||c==4||c==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                        if(d==2||d==4||d==6){
                    config.setVida2(config.getVida2()-1);
                }
                    }
                }
                }
        }
        
        
        public void ataqueArriba2(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.e][tab.f-2];
            int b = tab.matrizL[tab.e][tab.f-1];
            int c = tab.matrizL[tab.e][tab.f-3];
            int d = tab.matrizL[tab.e][tab.f-4];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                    if(c==2||c==4||c==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                        if(d==2||d==4||d==6){
                    config.setVida2(config.getVida2()-1);
                }
                    }
                }
                }
        }
        
        
        public void ataqueDerecha2(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.e+1][tab.f];
            int b = tab.matrizL[tab.e+2][tab.f];
            int c = tab.matrizL[tab.e+3][tab.f];
            int d = tab.matrizL[tab.e+4][tab.f];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                    if(c==2||c==4||c==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                        if(d==2||d==4||d==6){
                    config.setVida2(config.getVida2()-1);
                }
                    }
                }
                }
        }
        
        
        public void ataqueIzquierda2(Tablero tab,Config config){
            
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.e-1][tab.f];
            int b = tab.matrizL[tab.e-2][tab.f];
            int c = tab.matrizL[tab.e-3][tab.f];
            int d = tab.matrizL[tab.e-4][tab.f];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                    if(c==2||c==4||c==6){
                    config.setVida2(config.getVida2()-1);
                }else{
                        if(d==2||d==4||d==6){
                    config.setVida2(config.getVida2()-1);
                }
                    }
                }
                }     
        }
        
        
        
        
        
        
        


    
}
