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
public class Rotation extends Effet {

    public Rotation(String message) {
        super(message);
    }

    void afficheToiSur() {
	b.setMessage(message);
	b.sleep(100);
	for (int i = 0; i <= 100; i++) {
		b.setRotation(2*Math.PI*i / 100);
		b.sleep(100);
	}
    }
    
}
