class Average_Instance{
    //Declare instance variables
    int n1 = 40, n2=79;
    float avg;

    public static void main(String args[])  
    {  
        Average_Instance obj = new Average_Instance(); 
        
        obj.avg = (obj.n1+obj.n2)/2;
        System.out.println("Averge of two numbers 40 and 79 ="+obj.avg);  
    }  
}  