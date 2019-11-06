/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5lab3;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Data {
    
    private int day;
    private int month;
    private int year;
    
    public int getDay()
    {
        return day;
    }
    
    public int getMonth()
    {
        return month;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public void setDay(int day)
    {
        this.day=day;
    }
    public void setMonth(int year)
    {
        this.month=month;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
            
   public void wczytaj(int idd) throws IllegalArgumentException
   {
       Scanner wczytaj = new Scanner(System.in);
       System.out.println("Data nr. "+(idd+1));
       System.out.println("Podaj dzien");
       day = wczytaj.nextInt();
       System.out.println("Podaj miesiac");
       month = wczytaj.nextInt();
       System.out.println("Podaj rok");
       year = wczytaj.nextInt();
       if(year==2003)
       {
           throw new IllegalArgumentException("Data dotyczy roku 2003");
       }
   }
   
   @Override
     public String toString()
     {
         return day+"."+month+"."+year;
     }
}
