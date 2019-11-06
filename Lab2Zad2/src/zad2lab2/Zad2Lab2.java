/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2lab2;

/**
 *
 * @author mateu
 */
public class Zad2Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rational r0 = new Rational(3, 4);
        Rational r1 = new Rational(4, 8);
       
        System.out.println(r0+" + "+r1+" = "+r0.add(r1));
        System.out.println(r0+" - "+r1+" = "+r0.sub(r1));
        System.out.println(r0+" * "+r1+" = "+r0.mul(r1));
        System.out.println(r0+" / "+r1+" = "+r0.div(r1));
        System.out.println(r0.equals(r1));
        System.out.println(r0.compareTo(r1));
  

    }
    
}
