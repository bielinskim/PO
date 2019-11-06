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
public class RownanieKwadratowe {
    
    private double a, b, c;
    private double x1, x2, x0;
    private double delta;
    
    public RownanieKwadratowe(double a, double b, double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        delta=Math.pow(b, 2.0)-4*a*c;
    }
    public double obliczy(double x)
    {
        double y;
        y=a*Math.pow(x, 2.0)+b*x+c;
        return y;
    }
    public void obliczp()
    {
        if(delta>0)
        {
            delta=Math.sqrt(delta);
            x1=(-b-delta)/(2*a);
            x2=-b+delta/(2*a);
            System.out.println("delta="+delta);
        }
        else
        {
            if(delta==0)
            {
                x0 = -b/(2*a);
            }
            else
            {
                x0=0;
            }
        }
        }
  
    public void wypiszpierwiastki()
    {
        if(x1!=0)
        {
            System.out.println("Rownanie posiada dwa pierwiastki:"+x1+" "+x2);
        }
        else if(x0!=0)
        {
            System.out.println("Rownanie posiada jeden pierwiastek:"+x0);
        }
        else
        {
            System.out.println("Rownanie nie posiada pierwiastkow");
        }
    }
    
}
