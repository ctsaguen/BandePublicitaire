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
abstract class Effet  {
    Bandeau b;
    String message;
    
    Effet(Bandeau b, String message){
        this.b = b;
        this.message = message;

}
    
   abstract void afficheToiSur();
    
}
