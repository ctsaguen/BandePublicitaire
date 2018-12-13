/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeaupublicitaire;

import java.awt.Color;

/**
 *
 * @author kevin
 */
public class ChangerCouleur extends Effet {

    public ChangerCouleur( String messages) {
        super( messages);
    }

    void afficheToiSur() {
        b.setMessage(message);
        b.getMessage();
	b.sleep(100);
	b.setBackground(Color.DARK_GRAY);
	b.sleep(100);
	b.setForeground(Color.YELLOW);
	b.sleep(100);
	b.setFont(font);
        b.sleep(100);
	b.setForeground(fore);
        b.sleep(100);
	b.setBackground(back);
    }
    
}
