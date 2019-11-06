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
public class Rational {
    
    private int licznik;
    private int mianownik;
    
    public Rational(int l, int m)
            {
                licznik=l;
                mianownik=m;
                while(l!=m)
                {
                    if(l>m)
                    {
                        l=l-m;
                    }
                    else
                    {
                        m=m-l;
                    }
                }
                    licznik=licznik/l;
                    mianownik=mianownik/l;
            }
    public Rational add(Rational arg)
    {
        Rational wynik = new Rational(licznik, mianownik);
        wynik.licznik=(arg.licznik*this.mianownik)+(this.licznik*arg.mianownik);
        wynik.mianownik=arg.mianownik*this.mianownik;
        return wynik;
    }
    public Rational sub(Rational arg)
    {
        Rational wynik = new Rational(licznik, mianownik);
        wynik.licznik=(this.licznik*arg.mianownik)-(arg.licznik*this.mianownik);
        wynik.mianownik=arg.mianownik*this.mianownik;
        return wynik;
    }
    public Rational mul(Rational arg)
    {
        Rational wynik = new Rational(licznik, mianownik);
        wynik.licznik=this.licznik*arg.licznik;
        wynik.mianownik=this.mianownik*arg.mianownik;
        return wynik;
    }
    public Rational div(Rational arg)
    {
        Rational wynik = new Rational(licznik, mianownik);
        wynik.licznik=this.licznik*arg.mianownik;
        wynik.mianownik=this.mianownik*arg.licznik;
        return wynik;
    }
    public boolean equals(Rational arg)
    {
        boolean rownosc;
        rownosc =this.licznik*arg.mianownik==arg.licznik*this.mianownik;
        return rownosc;
    }
    public int compareTo(Rational arg)
    {
        int thislicznik, arglicznik;
        thislicznik = this.licznik*arg.mianownik;
        arglicznik = arg.licznik*this.mianownik;
        if(thislicznik==arglicznik)
        {
            return 0;
        }
        else if(thislicznik>arglicznik)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    @Override
     public String toString()
    {
        return licznik+"/"+mianownik;
    }
    
}
