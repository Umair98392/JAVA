import java.util.Scanner;
  
  
interface A {
    
    public void inputs();
}
interface B {
    
    public void interest();
}
  
class si implements A,B {
    float p,r,si;
    int t;
    Scanner sc = new Scanner(System.in);

    public void inputs(){
        
        p = sc.nextFloat();
        r = sc.nextFloat();
        t = sc.nextInt();
    }
    public void interest()
    {
        si = (p*r*t)/100;
        System.out.println("Simple Interest is : "+si);
    }
  
}
  
// Drived class
class multiple_inherit{
    public static void main(String[] args)
    {
        
        si obj = new si();
        System.out.print("Enter Principle, Rate, Time :");
        obj.inputs();
        obj.interest();
    }
}