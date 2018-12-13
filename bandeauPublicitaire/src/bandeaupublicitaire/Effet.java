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
abstract class Effet  {
    protected final Bandeau b = new Bandeau();
    protected String message;
     Font font = b.getFont();
     Color back = b.getBackground();
     Color fore = b.getForeground();
  
    
    Effet( String message){
        
        this.message = message;
        b.setMessage(message);

}
    
  abstract void afficheToiSur();
   
  void nombreDeRepetition(int nombre) {
        int i;
        
        for(i=1 ;i<= nombre; i++){
            this.afficheToiSur();
        }
    }
    
}
