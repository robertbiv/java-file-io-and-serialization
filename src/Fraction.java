//Robert Bennethum
public class Fraction {
    public int numerator,denominator;
    //setters
    public void setNumerator(int n)
    {
        numerator=n;
    }
    public void setDenominator(int d)
    {
        denominator=d;
    }
    //print
    public void display()
    {
        int gcd=gcd(numerator, denominator);
        System.out.println(numerator/gcd+"/"+denominator/gcd);
    }
    //find the gcd
    public int gcd(int m,int n)
    {
        int result=1;
        for(int i = 1; i <= m && i <= n; ++i)
        {
            if(m % i==0 && n % i==0)
                result = i;
        }
        return result;
    }
}

