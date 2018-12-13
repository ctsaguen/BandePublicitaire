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
public class Scenario {
    ArrayList<Effet> listeEffet = new ArrayList<>();
    
    Scenario(){
       //a implementer au final 
    }
    
   public void AjouterEffet(Effet e, int nombreRepetition){
       e.nombreDeRepetition(nombreRepetition);
       listeEffet.add(e); 
   }
   
   public void LireScenario(){
       
       int i;
       
       for(i = 0;i<listeEffet.size();i++){
        listeEffet.get(i);
       }
   }
    
}
