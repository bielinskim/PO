/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2lab5;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Zad2Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        Scanner wczytajwybor = new Scanner(System.in);
        int wybor;
        do{
        System.out.println("Co chcesz zrobic?");
        System.out.println("1. Dodaj studentow?");
        System.out.println("2. Wczytaj z pliku");
        System.out.println("3. Sortuj wedlug sredniej(rosnaco)");
        System.out.println("0. Zakoncz");
        
        wybor = wczytajwybor.nextInt();
        ZapisOdczyt plik = new ZapisOdczyt();
        switch(wybor)
        {
        case 1:
        Scanner wczytajilosc = new Scanner(System.in);
        System.out.println("Ilu studentow chcesz wprowadzic?");
        
        int ilosc = wczytajilosc.nextInt();
        Student[] student = new Student[ilosc];
        
        for(int i=0; i<ilosc; i++)
        {
        Scanner wczytaj = new Scanner(System.in);
        student[i] = new Student();
        System.out.println("Wprowadz imie:");
        student[i].setImie(wczytaj.nextLine());
        System.out.println("Wprowadz nazwisko:");
        student[i].setNazwisko(wczytaj.nextLine());
        System.out.println("Wprowadz oceny");
        student[i].wczytajoceny();
        } 
        
        plik.zapis(student);
        break;
       
        
        
        case 2:
        plik.wypisz();
        break;
        
        case 3:
        Sort sortowanie = new Sort();
        plik.nowyzapis(sortowanie.sortuj(plik.wczytaj()));
        plik.wypisz();
        break;
        
        case 0:
        break;
        
        }
        }while(wybor!=0);
    }
        
    
}
