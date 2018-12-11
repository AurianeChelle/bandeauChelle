/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author achelle
 */
public class Clignoter extends Effets {
    
    public Clignoter(Bandeau monBandeau, int repetition){
       super(monBandeau);
    }
    
    @Override
    public void afficher(){
            monBandeau.setMessage("Clignoter !");
            monBandeau.sleep(500);
            monBandeau.setMessage("");
            monBandeau.sleep(500);
             
    }
}
