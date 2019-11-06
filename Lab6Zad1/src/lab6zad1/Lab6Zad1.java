/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6zad1;

/**
 *
 * @author mateu
 */
public class Lab6Zad1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Autobus[] autobus = new Autobus[5];
        autobus[0] = new Autobus(1, 90.0, 55.0);
        autobus[1] = new Autobus(2, 90.0, 120.0);
        autobus[2] = new Autobus(3, 90.0, 32.5);
        autobus[3] = new Autobus(4, 90.0, 76.0);
        autobus[4] = new Autobus(5, 90.0, 114.5);
        ZajezdniaAutobusowa zajezdnia_a = new ZajezdniaAutobusowa(autobus);
        System.out.println(zajezdnia_a);
        Tramwaj[] tramwaj = new Tramwaj[5];
        tramwaj[0] = new Tramwaj(1, 60.0, 1);
        tramwaj[1] = new Tramwaj(2, 75.0, 3);
        tramwaj[2] = new Tramwaj(3, 60.0, 1);
        tramwaj[3] = new Tramwaj(4, 70.0, 2);
        tramwaj[4] = new Tramwaj(5, 90.0, 2);
        ZajezdniaTramwajowa zajezdnia_t = new ZajezdniaTramwajowa(tramwaj);
        System.out.println(zajezdnia_t);
    }
    
}
