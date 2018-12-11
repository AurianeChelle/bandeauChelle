/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

/**
 *
 * @author achelle
 */
public class ArcEnCiel extends Effets {

    public ArcEnCiel(Bandeau monBandeau) {
        super(monBandeau);
    }

    @Override
    public void afficher() {
            monBandeau.setMessage("Arc en Ciel !");
            monBandeau.setForeground(Color.BLUE);
            monBandeau.sleep(300);
            monBandeau.setForeground(Color.GREEN);
            monBandeau.sleep(300);
            monBandeau.setForeground(Color.MAGENTA);
            monBandeau.sleep(300);
            monBandeau.setForeground(Color.RED);
            monBandeau.sleep(300);
            monBandeau.setForeground(Color.YELLOW);
            monBandeau.sleep(300);
        
    }
}
