class A{
    int a=15,c=30;
    int fun(int a,int b){
        return a+b;
    }
}
class B extends A{
    int b=40;
    int fun(int a,int b){
        return a*b;
    }
    int fun(int a,int b,int c){
        return a+b+c;
    }
}
public class inherit_and_poly{
    public static void main(String arg[]) {
        A obj = new A();
        A ob = new B();
        System.out.println("a is : "+ob.a+"\nb is : "+ob.b+"\nc is : "+ob.c);
        System.out.println("Sum of a & b is : "+obj.fun(ob.a,ob.b));
        System.out.println("Product of a & b is : "+ob.fun(ob.a,ob.b));
        System.out.println("Sum of a, b & c is : "+ob.fun(ob.a,ob.b,ob.c));
        
    }
}