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
public class Tramwaj extends Pojazd {
    
    private int iloscwagonow;
    
    public Tramwaj(int numer, double predkoscmax, int iloscwagonow)
    {
        super(numer, predkoscmax);
        this.iloscwagonow=iloscwagonow;
    }
    public int getWagony()
    {
        return iloscwagonow;
    }
    
    @Override
    public String toString()
    {
        return "Tramwaj nr. "+numer+", predkosc maksymalna: "+predkoscmax+" km/h, ilosc wagonow: "+iloscwagonow;
    }
    
    
}
