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
public class Sklep {
    
    String nazwa;
    Zamowienie[] zamowienie = new Zamowienie[10];
    int ilosczamowien;
    
    
    public Sklep(String nazwa)
    {
        this.nazwa=nazwa;
    }
    
    public void noweZamowienie(String nazwa, int ilosctowaru, String data)
    {
        zamowienie[ilosczamowien] = new Zamowienie(nazwa, ilosctowaru, data);
        ilosczamowien++;
    }
    
    public void wypiszZamowienia()
    {
        for(int i=0; i<zamowienie.length; i++)
        {
            System.out.println(zamowienie[i]);
        }
    }
    @Override
    public String toString()
    {
        return nazwa;
    }
}
