/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2lab3;

/**
 *
 * @author mateu
 */
public class Stos {

    private int[] stos;
    private int wierzcholek;

    public Stos(int rozmiar)
            {
                stos = new int[rozmiar];
                wierzcholek = 0;
            }

    public int zdejmij() throws IndexOutOfBoundsException
    {
     if(wierzcholek>0)
     {
         int temp = stos[wierzcholek-1];
         wierzcholek--;
         return temp;
     }
        throw new IndexOutOfBoundsException("Stos jest pusty");
          
    }  

    public void poloz(int element) throws ArrayIndexOutOfBoundsException
    {
        if(wierzcholek<stos.length)
        {
            stos[wierzcholek]=element;
            wierzcholek++;
        }
        else
        {
            throw new ArrayIndexOutOfBoundsException("Stos jest przepelniony");
        }
    }
}
