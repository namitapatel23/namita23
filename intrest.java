class intrest
{
    double P,t,r,I;
    void initialize()
    {
        P= 2000;
        t= 5;
        r= 2;
    }
    void calculate()
    {
        I=(P*r*t)/100;
    }
    void print()
    {
        System.out.println("The simple interest is"+I);
    }
}