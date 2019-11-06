/*
 *  W pliku tekstowym zapisane są w kolejnych wierszach pary liczb — liczba zmiennoprzecinkowa i liczba całkowita. 
 *  Napisz program, który odczytuje pary liczb z pliku, oblicza iloczyn każdej pary i sumuje iloczyny. 
 *  Wynik obliczeń należy wypisaćw konsolii zapisaćw ostatnim wierszu pliku z danymi.
 *  Jeśli plik nie istnieje na dysku program wypisze właściwy komunikat.
 */
package lab5zad4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Lab5Zad4 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        float wynik;
        File file = new File("dane.txt");
        try {
           wynik = odczyt(file);
           zapisz(wynik, file);
        } catch (FileNotFoundException ex) {
           System.err.println("Nie mozna odnalezc okreslonego pliku");
        }
        
    }
    
   public static float odczyt(File file) throws FileNotFoundException
   {
       Scanner odczyt = new Scanner(file);
       float liczbarz;
       int liczbac;
       float iloczyn;
       float wynik =0;
       while(odczyt.hasNextLine())
       {
        liczbarz = odczyt.nextFloat();        
        liczbac = odczyt.nextInt();
        iloczyn = liczbarz*liczbac;
        System.out.println(iloczyn);
        wynik += iloczyn;
       }
       odczyt.close();
       return wynik;
   }
   public static void zapisz(float wynik, File file) throws IOException
   {
      FileWriter zapis = new FileWriter(file, true);
      zapis.append("\r\n"+wynik);
      zapis.close();
   }
    
}
