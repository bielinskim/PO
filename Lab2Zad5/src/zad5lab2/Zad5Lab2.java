/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5lab2;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Zad5Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Osoby[] osoba = new Osoby[50]; 
        Scanner wczytajwybor = new Scanner(System.in);
        int wybor;
        int pozycja=0;
        do
        {
        System.out.println("Co chcesz zrobic?");
        System.out.println("1. Dodaj osobe o losowych danych");
        System.out.println("2. Wypisz na ekranie dane wszystkich dodanych osob");
        System.out.println("3  Elementy tablicy o nazwisku przekazanym jako parametr");
        System.out.println("4. Wyswietl osoby ktorych numery id mieszcza sie w podanym przedziale");
        System.out.println("0. Zakoncz program");
        wybor = wczytajwybor.nextInt();
        switch(wybor)
        {
            case 1:
               osoba[pozycja] = new Osoby();
               osoba[pozycja].dodajlosowa();
               pozycja++;
               break;
            case 2:
                for(int i=0; i<pozycja; i++)
                {
                    osoba[i].wypisz();
                }
                break;
            case 3:
                for(int i=0; i<pozycja; i++)
                {   
                    osoba[i].wyszukajnaz("naz25");
                }
                break;
            case 4:
                for(int i=0; i<pozycja; i++)
                {   
                    osoba[i].wyszukajid(20,40);
                }
                break;
            case 0:
            break;
        }
        }
        while(wybor!=0);
        
    }
    
}
