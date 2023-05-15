import java.util.Scanner;
class Exception_Hand{
    public static void main(String arg[]){
        int x,y,z,i;
        String str=null;
        int arr[] = {1,2,3};
        System.out.println("**********Exception Handling**********");
        System.out.println("1.Exception handling in string");
        System.out.println("2.Exception handling in array");
        System.out.println("3.Division Exception handling");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice :");
        z = sc.nextInt();
        switch(z){
            case 1:
                System.out.println("we initialize a string with null value i.e. str=null");
                try{
                        System.out.println("string length = "+str.length());
                }catch(Exception e){
                    System.out.println(e);
                }
                break;
            case 2:
                System.out.print("Enter location of element :");
                i = sc.nextInt();
                try{
                    System.out.println("Element at location "+i+" is "+arr[i]);
                }catch(Exception e){
                    System.out.println(e);
                }
            
            break;
            case 3 :
                System.out.print("Enter number x and y :");
                x = sc.nextInt();
                y = sc.nextInt();
                try{
                    System.out.println("Division is "+x/y);
                }catch(Exception e){
                    System.out.println(e);
                }

                break;
            default:
                System.out.println("Invalid choice");
            
            
        }
        System.out.print("Process complete");

    }
}