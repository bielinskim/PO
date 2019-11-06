/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4lab3;

import java.util.Random;

/**
 *
 * @author mateu
 */
public class Zad4Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] tab1 = new int[1];
        int[] tab2 = new int[1];
        wypelnij(tab1);
        wypelnij(tab2);
        System.out.println("Licznosc elementow obu tablic: "+ licznosc(tab1, tab2));
     
    }
  
    public static void wypelnij(int[] tab)
    {
        for(int x: tab)
        {
            Random losowa = new Random();
            tab[x] = losowa.nextInt(5)+1;
            System.out.println(tab[x]);
        }
    }
    
    public static int licznosc(int[] tab1, int[] tab2) throws CardinalityException
    {
        if(tab1.length+tab2.length==1||tab1.length+tab2.length==2)
        {
            throw new CardinalityException("Licznosc elementow w obu tablicach wynosi 1 lub 2");
        }
        else
        {
        return tab1.length+tab2.length;
        }
    }
}