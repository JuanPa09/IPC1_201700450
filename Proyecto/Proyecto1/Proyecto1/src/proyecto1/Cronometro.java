/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Juan Pablo
 */

    public class Cronometro {
int segundos=0;
int minutos=0;
    
 Timer timer = new Timer();
 TimerTask task = new TimerTask(){
    public void run(){
        segundos++;
        if (segundos==60){
            segundos=0;
            minutos+=1;
        }
        System.out.println("Segundos: "+segundos+" "+minutos);
    }
};
 
 public void start(){
     timer.scheduleAtFixedRate(task,1000,1000);
 }
    
}
