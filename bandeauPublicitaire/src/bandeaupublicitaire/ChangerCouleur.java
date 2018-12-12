/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeaupublicitaire;

import java.awt.Color;
import java.awt.Font;
import static javafx.scene.text.Font.font;

/**
 *
 * @author kevin
 */
public class ChangerCouleur extends Effet {

    public ChangerCouleur(Bandeau b, String message) {
        super(b, message);
    }

    void afficheToiSur() {
        b.setMessage(message);
	b.sleep(1000);
	b.setBackground(Color.DARK_GRAY);
	b.sleep(1000);
	b.setForeground(Color.YELLOW);
	b.sleep(1000);
	b.setFont(font);
        b.sleep(1000);
	b.setForeground(fore);
        b.sleep(1000);
	b.setBackground(back);
        b.sleep(1000);
    }
    
}
