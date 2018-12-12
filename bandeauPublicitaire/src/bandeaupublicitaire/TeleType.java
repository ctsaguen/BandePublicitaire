/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeaupublicitaire;

/**
 *
 * @author kevin
 */
public class TeleType extends Effet {

    public TeleType(Bandeau b, String message) {
        super(b, message);
    }
    
    void afficheToiSur() {
        String values[] = message.split("");
       for (int i = 1; i < values.length ; i++) {
           b.setMessage(values[i]);
		b.sleep(1000);
       }
    }
}
