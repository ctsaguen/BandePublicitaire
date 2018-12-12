/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeaupublicitaire;

import java.awt.Font;

/**
 *
 * @author kevin
 */
public class Clignoter extends Effet {  

    public Clignoter(Bandeau b, String message) {
        super(b, message);
    }
    
    void afficheToiSur() {
         for (int i = 1; i < 10 ; i++) {
		b.setMessage(message);
		b.sleep(100);
                b.setMessage(" ");
		b.sleep(100);
	}
    }
}
