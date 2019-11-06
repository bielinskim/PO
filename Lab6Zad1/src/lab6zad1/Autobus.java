/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6zad1;

/**
 *
 * @author mateu
 */
public class Autobus extends Pojazd {
    
    private double zuzytepaliwo;
    
    public Autobus(int numer, double predkoscmax, double zuzytepaliwo)
    {
        super(numer, predkoscmax);
        this.zuzytepaliwo=zuzytepaliwo;
    }
    
    public double getPaliwo()
    {
        return zuzytepaliwo;
    }
    
    @Override
    public String toString()
    {
        return "Autobus nr. "+numer+", predkosc maksymalna: "+predkoscmax+" km/h, zuzyte paliwo: "+zuzytepaliwo+" litrow";
    }
}
