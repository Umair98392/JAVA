class AreaofRectangle_Instance{
    //Declare instance variables
    int width=5;  
    int height=10;

    public static void main(String args[])  
    {
        AreaofRectangle_Instance obj = new AreaofRectangle_Instance();
         
        int area = obj.width * obj.height;  
        
        System.out.println("Area of rectangle="+area);  
     }  
}