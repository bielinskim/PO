/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5zad1mb;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author student
 */
public class Tablice {
    
    public int[] tab1 = new int[5];
    public int[] tab2 = new int[3];
    public int[] tab3 = new int[tab1.length+tab2.length];
    File plik = new File("dane.txt");

    

    
    public Tablice()
    {  
        Random liczba = new Random();
        for(int i=0; i<tab1.length; i++)
        {
        tab1[i] = liczba.nextInt(1000000000)+1;
        }
        for(int i=0; i<tab2.length; i++)
        {
        tab2[i] = liczba.nextInt(1000000000)+1;
        }
    }
    
    public void licznosc() throws IOException
    {   
        
        FileWriter zapis = new FileWriter(plik, true);
        
        int indeks = tab1.length;
        int tmp =0;
        for(int i=0; i<tab1.length; i++)
        {
        tab3[i] = tab1[i];
        }
        
       for(int i=0; i<tab2.length; i++)
       {
        boolean jest = false;
         for(int j=0; j<tab1.length; j++)
         {
          jest = false;
           if(tab2[i]==tab1[j])
           {
            jest = true;
            break;
            }
           else
           {
           jest = false;
           tmp = tab2[i];
           }
          }
        
        if(!jest)
        {
        tab3[indeks] = tmp;
        indeks++;
        }
        } 
        for(int i=0; i<tab3.length; i++)
        {
            int licznosc = 0;
            for(int j=0; j<tab1.length; j++)
            {
             if(tab1[j]==tab3[i])
             {
                 licznosc++;
             }
            }
            for(int j=0; j<tab2.length; j++)
            {
                if(tab2[j]==tab3[i])
                {
                    licznosc++;
                }
            }
            zapis.append("Licznosc: "+tab3[i]+" wynosi: "+licznosc+"\r\n");
             
        }
       zapis.close();
       
       
       
       for(int i=0; i<tab3.length; i++)
        {
            System.out.println(tab3[i]);
        }
    }
}
