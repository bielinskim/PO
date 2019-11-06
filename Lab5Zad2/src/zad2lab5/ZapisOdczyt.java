/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2lab5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class ZapisOdczyt {
    
    File plik = new File("dane.txt");
    
    public void zapis(Student[] student) throws FileNotFoundException, IOException
    {
        FileWriter zapis = new FileWriter(plik, true);
        for (Student student1 : student) 
        {
            zapis.append(student1.toString()+"\r\n");
        }
        zapis.close();
    }
    public void nowyzapis(Student[] student) throws FileNotFoundException, IOException
    {
        FileWriter zapis = new FileWriter(plik);
        for (Student student1 : student) 
        {
            zapis.append(student1.toString()+"\r\n");
        }
        zapis.close();
    }
    public void wypisz() throws FileNotFoundException
    {   
        Scanner odczytaj = new Scanner(plik);
        while(odczytaj.hasNextLine())
        {
            String linia = odczytaj.nextLine();
            System.out.println(linia);
        }
        odczytaj.close();
        
    }
    public int rozmiar() throws FileNotFoundException
    {
        Scanner sprawdz = new Scanner(plik);
        int rozmiar =0;
        while(sprawdz.hasNextLine())
        {
            sprawdz.nextLine();
            rozmiar++;
        }
        sprawdz.close();
        return rozmiar;
    }
    public Student[] wczytaj() throws FileNotFoundException
    {   
        Student[] student = new Student[rozmiar()];
        Scanner odczytaj = new Scanner(plik);
  
        for(int i=0; i<rozmiar(); i++)
        {   
            student[i] = new Student();
            student[i].setImie(odczytaj.next());
            student[i].setNazwisko(odczytaj.next());
            odczytaj.next();
            student[i].getIndeks().setPrzedmiot1(odczytaj.nextInt());
            student[i].getIndeks().setPrzedmiot2(odczytaj.nextInt());
            student[i].getIndeks().setPrzedmiot3(odczytaj.nextInt());
            student[i].getIndeks().setPrzedmiot4(odczytaj.nextInt());
            student[i].getIndeks().setPrzedmiot5(odczytaj.nextInt());
        }
        
        odczytaj.close();
        return student;
    }
}
