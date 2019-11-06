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
public class Zad5Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Data[] data = new Data[5];
        
        for(int i=0; i<data.length; i++)
        {
            data[i]= new Data();
            data[i].wczytaj(i);
        }
        
        Sort sdata = new Sort(data);
        sdata.tabsort();
        sdata.wypisz();
 
    } 
    
    
}
