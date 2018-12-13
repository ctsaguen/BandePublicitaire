/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeaupublicitaire;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class TeleType extends Effet {

    public TeleType(String message) {
        super(message);
    }
    
    void afficheToiSur() {
        String values[] = message.split("");
        String textFinal = values[0];
        b.sleep(500);
       for (int i = 1; i < values.length ; i++) {
           textFinal = textFinal + values[i];
           b.setMessage(textFinal);
		b.sleep(400);
       }
    }
}
