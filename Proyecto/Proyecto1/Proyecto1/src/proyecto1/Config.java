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
public class Config {
    public static String tamconfig=" ";

    public static String getTamconfig() {
        return tamconfig;
    }

    public static void setTamconfig(String tamconfiga) {
        tamconfig = tamconfiga;
    }
    
    public static String nombre1="";

    public static String getNombre1() {
        return nombre1;
    }

    public static void setNombre1(String nombre1) {
        Config.nombre1 = nombre1;
    }
    
    public static String nombre2="";

    public static String getNombre2() {
        return nombre2;
    }

    public static void setNombre2(String nombre2) {
        Config.nombre2 = nombre2;
    }
    
    public static int tiempo;

    public static int getTiempo() {
        return tiempo;
    }

    public static void setTiempo(int tiempo) {
        Config.tiempo = tiempo;
    }
    
    public static int tc1;
    public static int tc2;
    public static int tp1;
    public static int tp2;
    public static int tm1;
    public static int tm2;

    public static int getTc1() {
        return tc1;
    }

    public static void setTc1(int tc1) {
        if(tc1==1){
        Config.tc1 = tc1;    
        }else{
            if(tc1==2){
                Config.tc1 = 3;
            }else{
                if(tc1==3){
                    Config.tc1=5;
                }
            }
        }
        
        
        
    }

    public static int getTc2() {
        return tc2;
    }

    public static void setTc2(int tc2) {
        if(tc2==1){
        Config.tc2 = 2;    
        }else{
            if(tc2==2){
                Config.tc2 = 4;
            }else{
                if(tc2==3){
                    Config.tc2=6;
                }
            }
        }
    }

    public static int getTp1() {
        return tp1;
    }

    public static void setTp1(int tp1) {
        if(tp1==1){
        Config.tp1 = tp1;    
        }else{
            if(tp1==2){
                Config.tp1 = 3;
            }else{
                if(tp1==3){
                    Config.tp1=5;
                }
            }
        }
    }

    public static int getTp2() {
        return tp2;
    }

    public static void setTp2(int tp2) {
        if(tp2==1){
        Config.tp2 = 2;    
        }else{
            if(tp2==2){
                Config.tp2 = 4;
            }else{
                if(tp2==3){
                    Config.tp2=6;
                }
            }
        }
    }

    public static int getTm1() {
        return tm1;
    }

    public static void setTm1(int tm1) {
        if(tm1==1){
        Config.tm1 = tm1;    
        }else{
            if(tm1==2){
                Config.tm1 = 3;
            }else{
                if(tm1==3){
                    Config.tm1=5;
                }
            }
        }
    }

    public static int getTm2() {
        return tm2;
    }

    public static void setTm2(int tm2) {
        if(tm2==1){
        Config.tm2 = 2;    
        }else{
            if(tm2==2){
                Config.tm2 = 4;
            }else{
                if(tm2==3){
                    Config.tm2=6;
                }
            }
        }
    }
    
   public static int vida1=5;
   public static int vida2=5;

    public static int getVida1() {
        return vida1;
    }

    public static void setVida1(int vida1) {
        Config.vida1 = vida1;
    }

    public static int getVida2() {
        return vida2;
    }

    public static void setVida2(int vida2) {
        Config.vida2 = vida2;
    }
   
   
   
   
    
    
    

    
        
    
}
