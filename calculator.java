package pack;
public class calculator {
    public int add(int a,int b)
    {
        return a+b;
    }
    public int subtract(int a,int b)
    {
        return a-b;
    }
    public int multiplication(int a,int b)
    {
        return a*b;
    }
    public int divide(int a,int b)
    {
        if(b!=0)
        {
            return a/b;
        }
        else
        {
            throw new ArithmeticException("Cannot Divide By Zero");
        }
    }
}
