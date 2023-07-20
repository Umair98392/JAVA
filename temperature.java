import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double c,f, ftoc, ctof;
        System.out.println("Enter the temperature in Fahrenheit");
        f=sc.nextDouble();
        ftoc=(double)(5.0/9.0)*(f-32.0);
        System.out.println("Fahrenheit to celcius= "+ftoc);
        System.out.println("Enter the temperature in Celcius");
        c=sc.nextDouble();
        ctof=(double)(c*(9.0/5.0)+32.0);
        System.out.println("Celcius to Fahrenheit= "+ctof);
    }
}