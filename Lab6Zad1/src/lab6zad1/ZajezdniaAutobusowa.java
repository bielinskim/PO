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
public class ZajezdniaAutobusowa extends Zajezdnia {
    
    private final String nazwa = "Zajezdnia numer 1";
    private Autobus[] autobusy;
    private double zuzytepaliwo;
    
    public ZajezdniaAutobusowa(Autobus[] autobusy)
    {
        this.autobusy=autobusy;
    }
    
    public double zuzytepaliwo()
    {
        
        for(int i=0; i<autobusy.length; i++)
        {
            zuzytepaliwo += autobusy[i].getPaliwo();
        }
        
        return zuzytepaliwo;
    }
    @Override
    public String toString()
    {
        
        StringBuilder opis = new StringBuilder();
        opis.append(nazwa);
        opis.append(" - Autobusowa - ");
        opis.append("Pojazdy: ");
        opis.append("\r\n");
        for(int i=0; i<autobusy.length; i++)
        {
            opis.append(autobusy[i]);
            opis.append("\r\n");
        }
        
        opis.append("Sumaryczne zuzycie paliwa: ");
        opis.append(zuzytepaliwo());
        opis.append(" litrow");
        opis.append("\r\n");
        
        return opis.toString();
    }
}
