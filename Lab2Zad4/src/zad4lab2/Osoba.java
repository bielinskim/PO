/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4lab2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Osoba {
    
    private String nazwisko;
    private int rok;
    private int miesiac;
    private int dzien;
    private int id;
    
    public void wczytaj()
    {
        Scanner wczytaj = new Scanner(System.in);
        System.out.print("Podaj nazwisko: ");
        nazwisko = wczytaj.nextLine();
        System.out.print("Podaj rok urodzenia: ");
        rok = wczytaj.nextInt();
        System.out.print("Podaj miesiac urodzenia: ");
        miesiac = wczytaj.nextInt();
        System.out.print("Podaj dzien urodzenia: ");
        dzien = wczytaj.nextInt();
        System.out.print("Podaj numer id: ");
        id = wczytaj.nextInt();
        
    }
    public void losowa()
    {
        Random losowa = new Random();
        nazwisko = "naz"+losowa.nextInt(100);
        rok = losowa.nextInt(1985-1960)+1960;
        miesiac = losowa.nextInt(12)+1;
        dzien = losowa.nextInt(32)+1;
        id = losowa.nextInt(101)+1;
        
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
