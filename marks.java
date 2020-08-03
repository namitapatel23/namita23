class marks
{
    double phy,chem,bio,avg;
    void initialize()
    {
        phy=95;
        chem=97;
        bio=100;
    }
    void calculate()
    {
        avg=(phy+chem+bio)/3;
    }
    void print()
    {
        System.out.println("The average marks is"+avg);
    }
}