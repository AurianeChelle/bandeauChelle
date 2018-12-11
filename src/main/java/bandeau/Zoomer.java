/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Font;

/**
 *
 * @author achelle
 */
public class Zoomer extends Effets {

    public Zoomer(Bandeau monBandeau, int repetition) {
        super(monBandeau);
    }

    @Override
    public void afficher() {
        monBandeau.setMessage("Zoomer !");

            for (int j = 5; j < 60; j += 5) {
                monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + j));
                monBandeau.sleep(100);
        }
    }
}
