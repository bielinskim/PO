/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2lab5;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Student {
    
    private String imie;
    private String nazwisko;
    private Indeks indeks = new Indeks();
    
    public void setImie(String imie)
    {
        this.imie=imie;
    }
    public void setNazwisko(String nazwisko)
    {
        this.nazwisko=nazwisko;
    }
    public String getImie()
            {
                return imie;
            }
    public String getNazwisko()
            {
                return nazwisko;
            }
    public Indeks getIndeks()
            {
                return indeks;
            }
    public void wczytajoceny()
    {
        Scanner wczytaj = new Scanner(System.in);
        System.out.println("Wprowadz ocene z pierwszego przedmiotu:");
        indeks.setPrzedmiot1(wczytaj.nextInt());
        System.out.println("Wprowadz ocene z drugiego przedmiotu:");
        indeks.setPrzedmiot2(wczytaj.nextInt());
        System.out.println("Wprowadz ocene z trzeciego przedmiotu:");
        indeks.setPrzedmiot3(wczytaj.nextInt());
        System.out.println("Wprowadz ocene z czwartego przedmiotu:");
        indeks.setPrzedmiot4(wczytaj.nextInt());
        System.out.println("Wprowadz ocene z piatego przedmiotu:");
        indeks.setPrzedmiot5(wczytaj.nextInt());
    }
   
    @Override
    public String toString()
    {
        return imie+" "+nazwisko+" "+"Oceny: "+indeks;
    }
}
