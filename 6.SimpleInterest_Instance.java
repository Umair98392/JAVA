class SimpleInterest_Instance{
    //Declare instance varibles
    int p = 400,r=10,t=2;
    
    public static void main(String args[])  
    {  
        SimpleInterest_Instance obj = new SimpleInterest_Instance();
        
        float si = (obj.p *obj.r * obj.t)/100 ;     
        System.out.println("Simple Interest ="+si);  
    }  
} 