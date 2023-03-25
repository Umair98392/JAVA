class AreaofCircle_Instance{
    //Declare instance varibles
    double area;
    int r = 7;//radius
    public static void main(String args[])  
    {  
        double pi = 3.14;
        AreaofCircle_Instance obj = new AreaofCircle_Instance();

        obj.area = 2 * pi * obj.r * obj.r;
        System.out.println("Area of Circle="+obj.area);  
    }  
} 