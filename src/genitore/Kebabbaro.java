/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genitore;

/**
 *
 * @author sesana.federico
 */
public class Kebabbaro {
    
    public boolean kebbabb;
    
    public synchronized boolean kebabbing() throws InterruptedException {
        kebbabb = false;
        Thread.sleep(5000);
        kebbabb = true;
        return kebbabb;
    }
}
