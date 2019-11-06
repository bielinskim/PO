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
public class ZajezdniaTramwajowa extends Zajezdnia {
    
    private final String nazwa = "Zajezdnia numer 2";
    private Tramwaj[] tramwaje;
    private int wagony;
    
    public ZajezdniaTramwajowa(Tramwaj[] tramwaje)
    {
        this.tramwaje=tramwaje;
    }
    
    public int wagony()
    {
        
        for(int i=0; i<tramwaje.length; i++)
        {
            wagony += tramwaje[i].getWagony();
        }
        
        return wagony;
    }
    @Override
    public String toString()
    {
        
        StringBuilder opis = new StringBuilder();
        opis.append(nazwa);
        opis.append(" - Tramwajowa - ");
        opis.append("Pojazdy: ");
        opis.append("\r\n");
        for(int i=0; i<tramwaje.length; i++)
        {
            opis.append(tramwaje[i]);
            opis.append("\r\n");
        }
        
        opis.append("Łączna ilosc wagonow: ");
        opis.append(wagony());
        opis.append("\r\n");
        
        return opis.toString();
    }
}
