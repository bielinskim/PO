/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad5lab3;

/**
 *
 * @author mateu
 */
public class Sort {
    
    private Data[] data;
    
    public Sort(Data[] data)
    {
        this.data = data;
    }
    
     public void tabsort()
    {

       Data tmp;
       for(int i=0; i<5; i++)
       {
           for(int j=0; j<4; j++)
           {   
               if(data[j].getYear()>data[j+1].getYear())
               {
                   tmp = data[j];
                   data[j] = data[j+1];
                   data[j+1] = tmp;
               } 
               else if(data[j].getYear()==data[j+1].getYear())
               {
                   if(data[j].getMonth()>data[j+1].getMonth())
                   {
                   tmp = data[j];
                   data[j] = data[j+1];
                   data[j+1] = tmp;
                   }
                  else if(data[j].getMonth()==data[j+1].getMonth())
                  {
                   if(data[j].getDay()>data[j+1].getDay())
                   {
                   tmp = data[j];
                   data[j] = data[j+1];
                   data[j+1] = tmp;
                   }
                  }
               }
           }
       }
    } 
    public void wypisz()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println(data[i]);
        }
    }
}
