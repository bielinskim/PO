/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8mb;

/**
 *
 * @author student
 */
public class Zamowienie {
    
    String nazwa;
    int ilosc;
    String data;
    
    public Zamowienie(String nazwa, int ilosc, String data)
    {
        this.nazwa=nazwa;
        this.ilosc=ilosc;
        this.data=data;
    }
    
    @Override
    public String toString()
    {
        return nazwa+" "+ilosc+" "+data;
    }
}
