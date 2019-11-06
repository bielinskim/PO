/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3lab3;

import java.util.Scanner;

/**
 *
 * @author mateu
 */
public class Zad3Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] wspolczynniki = {5, -4, 3, 5, -11};
        Wielomian wielomian1 = new Wielomian(wspolczynniki);
        int[] wspolczynniki2 = {0, 2, 1, -1, 0};
        Wielomian wielomian2 = new Wielomian(wspolczynniki2);
        Scanner entervalueofx = new Scanner(System.in);
        System.out.println("Pierwszy wielomian: "+wielomian1);
        System.out.println("Drugi wielomian: "+ wielomian2);
        System.out.println("Dodawanie: "+wielomian1.add(wielomian2));
        System.out.println("Odejmowanie: "+wielomian1.sub(wielomian2));
        System.out.println("Mnożenie: "+wielomian1.mul(wielomian2));
        System.out.println("Podaj wartosc x: ");
        int valueofx = entervalueofx.nextInt();
        System.out.println("Wartosc wielomianu: "+wielomian1.obliczY(3));
        
        
    }
    
}
