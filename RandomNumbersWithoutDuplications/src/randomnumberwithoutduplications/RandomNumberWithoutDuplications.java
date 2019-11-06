/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumberwithoutduplications;

import java.util.Random;

/**
 *
 * @author mateu
 */
public class RandomNumberWithoutDuplications {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] random_numbers = new int[16];
        int number;
        int quantity =0;

        do
        {
        number = random();
        if(!check(random_numbers, number))
        {
        random_numbers[quantity]=number;
        quantity++;
        }
        }while(quantity<16);
        
        for(int i=0; i<random_numbers.length; i++)
        {
            System.out.println(random_numbers[i]);
        }
    }
    
    public static int random()
    {
        Random generator = new Random();
        int number = generator.nextInt(16)+1;
        
        return number;
    }
    public static boolean check(int[] rn, int n)
    {   
        boolean check = false;
        for(int i=0; i<rn.length; i++)
        {
            if(rn[i]==n)
            {
                check = true;
         
            }
        }
        return check;
    }
    
    
}
