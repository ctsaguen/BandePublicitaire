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
public class Zoom extends Effet {

    public Zoom(Bandeau b, String message) {
        super(b, message);
    }
    
    void afficheToiSur() {
        b.setMessage(message);
	b.sleep(1000);
	b.setMessage("Zoom........");
	for (int i = 5; i < 60 ; i+=5) {
		b.setFont(new Font("Dialog", Font.BOLD, 5+i));
		b.sleep(100);
	}
	b.sleep(1000);
    }

    
}
