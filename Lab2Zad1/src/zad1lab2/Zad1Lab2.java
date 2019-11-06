/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad1lab2;

/**
 *
 * @author mateu
 */
public class Zad1Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RownanieKwadratowe zadanie = new RownanieKwadratowe(1.0, 5.0, 3.0);
        System.out.println(zadanie.obliczy(5));
        zadanie.obliczp();
        zadanie.wypiszpierwiastki();
    }

}
