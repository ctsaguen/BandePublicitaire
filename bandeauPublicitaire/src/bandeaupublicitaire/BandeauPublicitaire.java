/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeaupublicitaire;
import java.awt.Color;
import java.awt.Font;
/**
 *
 * @author kevin
 */
public class BandeauPublicitaire {
    public static void main(String[] args) {
        
        ChangerCouleur s = new ChangerCouleur("Bonjour a tous");
        //s.afficheToiSur();
        Clignoter c = new Clignoter("je clignote un peu pour voir");
        //c.afficheToiSur();
        TeleType t = new TeleType("je suis un teletype vraiment");
        //t.afficheToiSur();
        Zoom z = new Zoom("je zoom");
        Scenario scene = new Scenario();
        scene.AjouterEffet(c, 1);
        scene.AjouterEffet(z, 1);
        scene.AjouterEffet(s, 1);
        scene.LireScenario();
        
    }
    
}
