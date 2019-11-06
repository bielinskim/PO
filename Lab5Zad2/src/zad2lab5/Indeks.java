/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2lab5;

/**
 *
 * @author mateu
 */
public class Indeks {
    
    private int przedmiot1;
    private int przedmiot2;
    private int przedmiot3;
    private int przedmiot4;
    private int przedmiot5;
    private double srednia;
    
    public void setPrzedmiot1(int ocena1)
    {
        this.przedmiot1=ocena1;
    }
    public void setPrzedmiot2(int ocena2)
    {
        this.przedmiot2=ocena2;
    }
    public void setPrzedmiot3(int ocena3)
    {
        this.przedmiot3=ocena3;
    }
    public void setPrzedmiot4(int ocena4)
    {
        this.przedmiot4=ocena4;
    }
    public void setPrzedmiot5(int ocena5)
    {
        this.przedmiot5=ocena5;
    }
    public int getPrzedmiot1()
    {
        return przedmiot1;
    }
    public double getSrednia()
    {    
        srednia=(przedmiot1+przedmiot2+przedmiot3+przedmiot4+przedmiot5)/5.0;
        return srednia;
    }
    @Override
    public String toString()
    {
        return przedmiot1+" "+przedmiot2+" "+przedmiot3+" "+przedmiot4+" "+przedmiot5;
    }
}
