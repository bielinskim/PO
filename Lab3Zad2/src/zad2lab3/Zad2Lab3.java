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
public class Zad2Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stos stos1 = new  Stos(5);
        stos1.poloz(1);
        stos1.poloz(2);
        stos1.poloz(3);
        stos1.poloz(4);
        stos1.poloz(5);
        //stos1.poloz(6);
        System.out.println(stos1.zdejmij());
        System.out.println(stos1.zdejmij());
        System.out.println(stos1.zdejmij());
        System.out.println(stos1.zdejmij());
        System.out.println(stos1.zdejmij());
        System.out.println(stos1.zdejmij());
    }
    
}
