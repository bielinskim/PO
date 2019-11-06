/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3lab5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mateu
 */
public class Zad3Lab5 {

    
    
    
    public static void main(String[] args) throws IOException {
       
       File file = new File("liczbypierwsze.txt");
       FileWriter zapiszliczbe = new FileWriter(file);
       
       int liczba;
        
       
       for(int i=1000; i<=10000; i++)
        {
            liczba=i;
            int flaga=0;
            for(int j=1; j<=liczba; j++)
            {
                int dzielnik = j;
                if(liczba%dzielnik==0)
                {
                    flaga++;
                }
            }
            if(flaga==2)
            {
                System.out.println("Liczba pierwsza: "+Integer.toString(liczba));
                zapisz(liczba, file, zapiszliczbe);
            }
          
            
        } 
       zapiszliczbe.close();
    }
    public static void zapisz(int liczba, File file, FileWriter zapiszliczbe) throws IOException
    {
        
        zapiszliczbe.append(Integer.toString(liczba)+"\r\n");
        
    }
    
}
