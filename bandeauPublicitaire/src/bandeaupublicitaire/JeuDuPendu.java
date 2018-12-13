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
public class JeuDuPendu extends Effet{

    public JeuDuPendu(String message) {
        super(message);
    }

    @Override
    void afficheToiSur() {
        b.setMessage(message);
	b.sleep(1000);
	b.setFont(new Font("Monospaced", Font.BOLD, 15));
	b.sleep(1000);
	b.setFont(new Font("SansSerif", Font.PLAIN, 15));
    }
    
}
