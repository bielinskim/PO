/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5lab2;

import java.util.Random;

/**
 *
 * @author mateu
 */
public class Osoby {
    
    private String nazwisko;
    private int rok;
    private int miesiac;
    private int dzien;
    private int id;
    
    public void dodajlosowa()
    {
        Random losowa = new Random();
        nazwisko = "naz"+losowa.nextInt(100);
        rok = losowa.nextInt(1985-1960)+1960;
        miesiac = losowa.nextInt(12)+1;
        dzien = losowa.nextInt(32)+1;
        id = losowa.nextInt(101)+1;
        
    }
   public void wyszukajnaz(String naz)
   {  
       if(naz==nazwisko)
       {
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Rok urodzenia: "+rok);
        System.out.println("Miesiac urodzenia: "+miesiac);
        System.out.println("Dzien urodzenia: "+dzien);
        System.out.println("Numer id: "+id);
       }
   }
   public void wyszukajid(int a, int b)
   {
       if(a<id&&id<b)
       {
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Rok urodzenia: "+rok);
        System.out.println("Miesiac urodzenia: "+miesiac);
        System.out.println("Dzien urodzenia: "+dzien);
        System.out.println("Numer id: "+id);
       }
   }
           
   public void wypisz()
    {
        System.out.println("Nazwisko: "+nazwisko);
        System.out.println("Rok urodzenia: "+rok);
        System.out.println("Miesiac urodzenia: "+miesiac);
        System.out.println("Dzien urodzenia: "+dzien);
        System.out.println("Numer id: "+id);
        
    }
}
