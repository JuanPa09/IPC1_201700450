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
public class APrincesa {
    Tablero tab = new Tablero();
    Config config = new Config();


        public void ataqueAbajo1(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.g][tab.h+1];
            
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }
                   
        }
        
        
        public void ataqueArriba1(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.g][tab.h-1];
            
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }
                   
        }
        
        
        public void ataqueDerecha1(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.g+1][tab.h];
            
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }
                   
        }
    
        
        public void ataqueIzquierda1(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.g-1][tab.h];
            
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }
                   
        }
        
        
        
        
        
        
        public void ataqueAbajo2(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.i][tab.j+1];
            
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }
                   
        }
        
        
        public void ataqueArriba2(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.i][tab.j-1];
            
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }
                   
        }
        
        
        public void ataqueDerecha2(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.i+1][tab.j];
            
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }
                   
        }
    
        
        public void ataqueIzquierda2(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.i-1][tab.j];
            
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-1);
                    }
                   
        }
        
        
        
}
