import pack.calculator;
public class sum1{
    public static void main(String[] args) {
        calculator cal=new calculator();
        int result;
        result=cal.add(10,10);
        System.out.println(result);
        result=cal.subtract(10,100);
        System.out.println(result);
        result=cal.multiplication(10,10);
        System.out.println(result);
        result=cal.divide(10,100);
        System.out.println(result);
    }
}
