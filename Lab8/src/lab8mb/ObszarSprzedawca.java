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
public class ObszarSprzedawca {
    
    public String obszar;
    public String sprzedawca;
    public Sklep[] sklep = new Sklep[10];
    public int iloscSklepow;
    public String nazwaSklepu;
    
    public ObszarSprzedawca(String obszar, String sprzedawca)
    {
        this.obszar=obszar;
        this.sprzedawca=sprzedawca;
    }

    
    
    public void nowySklep(String nazwaSklepu)
    {
        this.nazwaSklepu=nazwaSklepu;
        sklep[iloscSklepow] = new Sklep(nazwaSklepu);
        iloscSklepow++;
    }
    public int getSklepLength()
    {
        return sklep.length;
    }
    @Override
    public String toString()
    {
        return obszar+" "+sprzedawca;
    }
}
