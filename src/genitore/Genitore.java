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
public class Genitore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Si sviluppi un applicativo ove dichiarato un array di 20 istanze di Thread che tentino di accedere simultaneamente ad una risorsa "kebab" condivisa. Il kebabbaro potrà soddsfare una sola richiesa alla volta. Visualizzare a schermo in che ordine vengono soddisfatti i 20 clienti. Il kebabbivendolo consegna un kebab ogni 5 secondi
        Thread tipi[] = new Thread[20];
        Kebabbaro kebabbaro = new Kebabbaro();
        
        for(int i = 0; i < tipi.length; i++) {
            tipi[i] = new Thread(new Customer(kebabbaro, i));
        }
        
        for(int i = 0; i < tipi.length; i++) {
            tipi[i].start();
        }
    }
    
}
