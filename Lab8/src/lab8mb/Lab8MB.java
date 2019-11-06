/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8mb;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Lab8MB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner wczytajwybor = new Scanner(System.in);
        String obszar;
        String sprzedawca;
        ObszarSprzedawca[] obszarSprzedawca = new ObszarSprzedawca[10];
        int ilosc =0;
        
        Scanner wczytaj = new Scanner(System.in);
        
        int wybor;

        do{

        System.out.println("Co chcesz zrobic?");

        System.out.println("1. Dodaj obszar i przypisz do niego sprzedawce");

        System.out.println("2. Dodaj sklep do obszaru miasta");

        System.out.println("3. Dodaj zamowienie dla wybranego sklepu");
        
        System.out.println("4. Wypisz zamowienia dla wybranego sklepu");
        
        System.out.println("5. Dodaj zamowienie dla wybranego sprzedawcy");

        System.out.println("0. Zakoncz");

        

        wybor = wczytajwybor.nextInt();

        

        switch(wybor)

        {

        case 1:

        System.out.println("Dodaj obszar: ");
        
        obszar = wczytaj.nextLine();
        
         System.out.println("Przypisz sprzedawce: ");

        sprzedawca = wczytaj.nextLine();
        
        obszarSprzedawca[ilosc] = new ObszarSprzedawca(obszar, sprzedawca);
        ilosc++;

        break;


        

        case 2:
        String nazwaSklepu;
            System.out.println("Wybierz obszar: ");
        for(int i=0; i<ilosc; i++)
        {
            System.out.println(i+". "+obszarSprzedawca[i]);
        }
        int wyborObszaru = wczytaj.nextInt();
        
        System.out.println("Wpisz nazwe sklepu: ");
        nazwaSklepu = wczytaj.nextLine();
        obszarSprzedawca[wyborObszaru].nowySklep(nazwaSklepu);
        
       
        break;
      
        

        case 3:
        System.out.println("Wybierz obszar: ");
        for(int i=0; i<ilosc; i++)
        {
            System.out.println(i+". "+obszarSprzedawca[i]);
        }
        int wyborObszaru2 = wczytaj.nextInt();
        
        System.out.println("Wybierz sklep: ");
        for(int i=0; i<obszarSprzedawca[i].sklep.length; i++)
        {
            System.out.println(i+". "+obszarSprzedawca[wyborObszaru2].sklep[i]);
        }
        int wyborSklepu = wczytaj.nextInt();
         System.out.println("Dodaj zamowienie ");
         System.out.println("Wpisz towar ");
         String nazwa = wczytaj.nextLine();
         System.out.println("Wpisz ilosc ");
         int ilosctowaru = wczytaj.nextInt();
         System.out.println("Wpisz date ");
         String data = wczytaj.nextLine();
        
         
         
         obszarSprzedawca[wyborObszaru2].sklep[wyborSklepu].noweZamowienie(nazwa, ilosctowaru, data);

        break;

        

        case 4:
            System.out.println("Wybierz obszar: ");
        for(int i=0; i<ilosc; i++)
        {
            System.out.println(i+". "+obszarSprzedawca[i]);
        }
        int wyborObszaru3 = wczytaj.nextInt();
        
        System.out.println("Wybierz sklep: ");
        for(int i=0; i<obszarSprzedawca[i].sklep.length; i++)
        {
            System.out.println(i+". "+obszarSprzedawca[wyborObszaru3].sklep[i]);
        }
        int wyborSklepu2 = wczytaj.nextInt();
            
        obszarSprzedawca[wyborObszaru3].sklep[wyborSklepu2].wypiszZamowienia();
                
        break;

        
        
        case 5:
            System.out.println("Wybierz Sprzedawce: ");
        for(int i=0; i<ilosc; i++)
        {
            System.out.println(i+". "+obszarSprzedawca[i]);
        }
        int wyborObszaru4 = wczytaj.nextInt();
        for(int i=0; i<obszarSprzedawca[wyborObszaru4].sklep.length; i++)
        {
            System.out.println(obszarSprzedawca[wyborObszaru4].sklep);
            obszarSprzedawca[wyborObszaru4].sklep[i].wypiszZamowienia();
        }
            
        break;
        
        case 0:
            break;
        }

        }while(wybor!=0);
    }
    
}
