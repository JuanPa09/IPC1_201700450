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
public class ACaballero {
public Tablero tab;
public Config config;

public ACaballero(){
    Tablero tab = new Tablero();
    Config config = new Config();
}

        public void ataqueAbajo1(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.n][tab.m+2];
            int b = tab.matrizL[tab.n][tab.m+1];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-2);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-2);
                }}
        }

        public void ataqueArriba1(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.n][tab.m-2];
            int b = tab.matrizL[tab.n][tab.m-1];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-2);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-2);
                }}    
        }
        
        public void ataqueDerecha1(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.n+2][tab.m];
            int b = tab.matrizL[tab.n+1][tab.m];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-2);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-2);
                }}
        }
        
        public void ataqueIzquierda1(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.n-2][tab.m];
            int b = tab.matrizL[tab.n-1][tab.m];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-2);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-2);
                }}
        }


        
        
        
        
        
        
        public void ataqueAbajo2(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.a][tab.b+2];
            int b = tab.matrizL[tab.a][tab.b+1];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-2);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-2);
                }}
        }

        public void ataqueArriba2(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.a][tab.b-2];
            int b = tab.matrizL[tab.a][tab.b-1];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-2);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-2);
                }}    
        }
        
        public void ataqueDerecha2(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.a+2][tab.b];
            int b = tab.matrizL[tab.a+1][tab.b];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-2);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-2);
                }}
        }
        
        public void ataqueIzquierda2(Tablero tab,Config config){
            this.config=config;
            this.tab=tab;
            int a =tab.matrizL[tab.a-2][tab.b];
            int b = tab.matrizL[tab.a-1][tab.b];
                if (a==2||a==4||a==6){
                config.setVida2(config.getVida2()-2);
                    }else{
                    
                if(b==2||b==4||b==6){
                    config.setVida2(config.getVida2()-2);
                }}
        }
        
        
        



}
