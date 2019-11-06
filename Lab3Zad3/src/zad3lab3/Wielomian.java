/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3lab3;

/**
 *
 * @author mateu
 */
public class Wielomian {
    
    private int[] wspolczynniki;
    private int stopien;
    
    public Wielomian(int[] wspolczynniki)
            {
                this.wspolczynniki=wspolczynniki;
                this.stopien=wspolczynniki.length;
            }
    public Wielomian add(Wielomian arg)
    {   
        int wynikstopien;
        if(this.stopien>arg.stopien)
        {
            wynikstopien=this.stopien;
        }
        else if(this.stopien<arg.stopien)
        {
            wynikstopien=arg.stopien;
        }
        else
        {
            wynikstopien=this.stopien;
        }
        int[] wspolczynniki2;
        wspolczynniki2 = new int[wynikstopien];
        Wielomian wynik = new Wielomian(wspolczynniki2);
        for(int i=0; i<wynikstopien; i++)
        {   
            if(i>=this.stopien)
            {
                wynik.wspolczynniki[i]=arg.wspolczynniki[i];
            }
            else if(i>=arg.stopien)
            {
                wynik.wspolczynniki[i]=this.wspolczynniki[i];
            }
            else
            {
                wynik.wspolczynniki[i]=this.wspolczynniki[i]+arg.wspolczynniki[i];
            }
        }
        return wynik;
    }
    public Wielomian sub(Wielomian arg)
    {   
        int wynikstopien;
        if(this.stopien>arg.stopien)
        {
            wynikstopien=this.stopien;
        }
        else if(this.stopien<arg.stopien)
        {
            wynikstopien=arg.stopien;
        }
        else
        {
            wynikstopien=this.stopien;
        }
        int[] wspolczynniki2;
        wspolczynniki2 = new int[wynikstopien];
        Wielomian wynik = new Wielomian(wspolczynniki2);
        for(int i=0; i<wynikstopien; i++)
        {   
            if(i>=this.stopien)
            {
                wynik.wspolczynniki[i]=arg.wspolczynniki[i];
            }
            else if(i>=arg.stopien)
            {
                wynik.wspolczynniki[i]=this.wspolczynniki[i];
            }
            else
            {
                wynik.wspolczynniki[i]=this.wspolczynniki[i]-arg.wspolczynniki[i];
            }
        }
        return wynik;
    }
    
    public Wielomian mul(Wielomian arg)
    {   
        int wynikstopien;
        if(this.stopien>arg.stopien)
        {
            wynikstopien=this.stopien;
        }
        else if(this.stopien<arg.stopien)
        {
            wynikstopien=arg.stopien;
        }
        else
        {
            wynikstopien=this.stopien;
        }
        int[] wspolczynniki2;
        wspolczynniki2 = new int[wynikstopien];
        Wielomian wynik = new Wielomian(wspolczynniki2);
        for(int i=0; i<wynikstopien; i++)
        {   
            if(i>=this.stopien)
            {
                wynik.wspolczynniki[i]=arg.wspolczynniki[i];
            }
            else if(i>=arg.stopien)
            {
                wynik.wspolczynniki[i]=this.wspolczynniki[i];
            }
            else
            {
                wynik.wspolczynniki[i]=this.wspolczynniki[i]*arg.wspolczynniki[i];
            }
        }
        return wynik;
    }
    
     public int obliczY(int x)
    {   
        int y =0;
        int potega = stopien -1;
        for(int i=0; i<stopien; i++)
        {
            y+=this.wspolczynniki[i]*(int)(Math.pow(x, potega));
            potega--;
        }
       if(y>100) throw new IllegalArgumentException("Wartosc y jest wieksza od 100");
       return y;
    }  
    
    @Override
    public String toString()
    { 
        StringBuilder wypisz = new StringBuilder();
        int potega=stopien-1;
        int plus = 0;
        for(int i=0; i<stopien; i++)
        {   
            
            if(wspolczynniki[i]!=0)
            {   
             if(wspolczynniki[i]>=0&&plus!=0)
             {
                 wypisz.append("+");
             }
             if(wspolczynniki[i]!=1&&wspolczynniki[i]!=-1)
             {
                 wypisz.append(wspolczynniki[i]);
             }
             else if(wspolczynniki[i]==-1)
             {
                 wypisz.append("-");
             }
             if(potega>1)
             {    
             wypisz.append("x^");
             wypisz.append(potega);
             }
             else if(potega==1)
             {
                 wypisz.append("x");
             }
             plus=1;
            }
            else
            {
              plus=0;
            }
             potega--;
             
             
        }
        return wypisz.toString();
    }
            
}
