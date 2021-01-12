/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genitore;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sesana.federico
 */
public class Kebabbaro {
    
    public boolean kebbabb;
    
    public synchronized boolean kebabbing() throws InterruptedException {
        kebbabb = false;
        prepare();
        return kebbabb;
    }
    
    public void prepare(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Kebabbaro.class.getName()).log(Level.SEVERE, null, ex);
        }
        kebbabb = true; 
    }
}
