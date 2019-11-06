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
public class Pojazd {
    
    protected int numer;
    protected double predkoscmax;
    
    public Pojazd(int numer, double predkoscmax)
    {
        this.numer=numer;
        this.predkoscmax=predkoscmax;
    } 
    
    public int GetNumer()
    {
        return numer;
    }
    
}
