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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bandeau monBandeau = new Bandeau();
           Tourner t=new Tourner(monBandeau);
            Clignoter c=new Clignoter(monBandeau);
            Zoomer z=new Zoomer(monBandeau);
            ArcEnCiel a=new ArcEnCiel(monBandeau);
            Scenario s = new Scenario();
            s.addEffets(t,2);
            s.addEffets(c,5);
            s.addEffets(z,1);
            s.addEffets(a,1);
            s.AfficherTousLesEffets();
    }
    
}
