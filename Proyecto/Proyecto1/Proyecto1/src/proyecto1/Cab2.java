/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Juan Pablo
 */
public class Cab2 {
    
    public ImageIcon obtenerImagen(int tamx, int tamy){
        ImageIcon per = new ImageIcon(getClass().getResource("/imagen/caballero2.png"));
        Image imagen = per.getImage();
        Image tamImagen= imagen.getScaledInstance(tamx, tamy, Image.SCALE_AREA_AVERAGING);
        
        per = new ImageIcon(tamImagen);
        return per;
    }
    
}
