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
public class Customer implements Runnable{
    private boolean satisfied = false, stop = false;
    private Kebabbaro kebabbaro;
    int num;
    
    public Customer(Kebabbaro kebabbaro, int num) {
        this.kebabbaro = kebabbaro;
        this.num = num;
    }
    
    @Override
    public void run() {
        while(!stop){
            while(!satisfied){
                try {
                    satisfied = kebabbaro.kebabbing();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(satisfied){
                    System.out.println("Giovanni soddisfatto: " + num);
                    notifyAll();
                }
                else{
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
    
    public void end() {
        stop = true;
    }
}
