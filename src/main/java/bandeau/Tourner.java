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
public class Tourner extends Effets{
    
    public Tourner(Bandeau monBandeau, int repetition){
        super(monBandeau);
	}
    
    @Override
    public void afficher(){
        monBandeau.setMessage("Tourner !");

            for (int j = 0; j <= 100; j++) {
                monBandeau.setRotation(2*Math.PI*j / 100);
                monBandeau.sleep(100);
        }
    }
}