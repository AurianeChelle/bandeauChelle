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
public abstract class Effets {
    protected Bandeau monBandeau;

    
    public Effets(Bandeau bandeau){
        this.monBandeau=bandeau;

    }
    
    public abstract void afficher();
    
}
