/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3lab2;

/**
 *
 * @author mateu
 */
public class Zad3Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prostokat prostokat1 = new Prostokat(5, 5, 10, 15);
        prostokat1.wypisz();
        System.out.println("Pole powierzchni prostokata = "+prostokat1.obliczpole());
        System.out.println(prostokat1.sprawdz(13, 17));
    }
    
}
