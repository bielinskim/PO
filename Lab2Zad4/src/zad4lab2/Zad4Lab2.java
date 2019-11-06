/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4lab2;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Zad4Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Osoba osoba1 = new Osoba();
        Scanner wczytajwybor = new Scanner(System.in);
        int wybor;
        do
        {
        System.out.println("Co chcesz zrobic?");
        System.out.println("1. Wpisz dane osoby");
        System.out.println("2. Wylosuj dane osoby");
        System.out.println("3. Wypisz dane osoby");
        System.out.println("0. Zakoncz program");
        wybor = wczytajwybor.nextInt();
        switch(wybor)
        {
            case 1:
               osoba1.wczytaj();
               break;
            case 2:
               osoba1.losowa();
               break;
            case 3:
               osoba1.wypisz();
               break;
            case 0:
            break;
        }
        }
        while(wybor!=0);
    }
    
}
