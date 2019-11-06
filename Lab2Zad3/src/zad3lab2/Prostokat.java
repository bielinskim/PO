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
public class Prostokat {
    
    private int x, y, sz, w;
    private boolean sprawdz;
    
    
    public Prostokat(int x, int y, int sz, int w)
    {
        this.x=x;
        this.y=y;
        this.sz=sz;
        this.w=w;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getSZ()
    {
        return sz;
    }
    public int getW()
    {
        return w;
    }
    public void wypisz()
    {
        System.out.println("Wspolrzedna x = "+getX());
        System.out.println("Wspolrzedna y = "+getY());
        System.out.println("Szerokosc = "+getSZ());
        System.out.println("Wysokosc = "+getW());
    }
    public int obliczpole()
    {
        int pole;
        pole=getSZ()*getW();
        return pole;
    }
    public boolean sprawdz(int x2, int y2)
    {
        sprawdz=x2>getX()&&x2<(getX()+getSZ())&&y2>getY()&&y2<(getY()+getW());
        return sprawdz;
    }
    
    
}
