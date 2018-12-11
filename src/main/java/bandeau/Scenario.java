/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.ArrayList;

/**
 *
 * @author achelle
 */
public class Scenario {
    private ArrayList<Effets> monScenario;
    
    public Scenario(){
        monScenario = new ArrayList<>();
    }
    
    public void addEffets(Effets e, int repetition){
        for(int i=0; i<repetition; i++){
            monScenario.add(e);
        }
    }
    public void AfficherTousLesEffets(){
        for (Effets e : monScenario){
            e.afficher();
        }
    }

}
