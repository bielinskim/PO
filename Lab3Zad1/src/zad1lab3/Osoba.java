/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1lab3;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Osoba {
    
    private String imie;
    private String nazwisko;
    private int wiek;
    
    public void wczytaj()
    {
        Scanner wczytaj = new Scanner(System.in);
        System.out.println("Podaj imie");
        imie = wczytaj.nextLine();
        if(imie.length()<3) throw new IllegalArgumentException("Imie musi posiadac minimum 3 znaki");
        System.out.println("Podaj nazwisko");
        nazwisko = wczytaj.nextLine();
        if(nazwisko.length()<3) throw new IllegalArgumentException("Nazwisko musi posiadac minimum 3 znaki");
        System.out.println("Podaj wiek");
        wiek = wczytaj.nextInt();
        if(wiek>100||wiek<0) throw new IllegalArgumentException("Wiek musi byc liczba w zakresie 0-100"); 
    }
    
}
