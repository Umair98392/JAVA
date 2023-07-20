import java.io.*;
import java.util.Scanner;

class file_hand {
    public static void main(String[] args) throws IOException {
        file_hand obj = new file_hand();
        Scanner x = new Scanner(System.in);
        int n;
        System.out.println("File Handling Operations");
        do {
            System.out.println("1. Create file\n2. Write into File\n3. Info of file\n4. Read from file\n5. Delete File\n6. Exit");
            System.out.println("Choose option : ");
            n=x.nextInt();
            switch(n){
                case 1:
                    obj.Create();
                break;
                case 2:
                    obj.Write();
                break;
                case 3:
                    obj.Info();
                    break;
                case 4:
                    obj.Read();
                    break;
                case 5:
                    obj.Delete();  
                break;
                case 6:
                    obj.Copy();
                    break;
                default:
                    System.out.println("Good_Bye");
                break;
            }
        } while (n!=7);
        x.close();
    }
    void Create() throws IOException{
        File myFile = new File("file_1.txt");     
        if(myFile.createNewFile()){
                System.out.println("New file is created..");
            }else{
                System.out.println("the file is all ready exist");
            }
    }
    void Write() throws IOException{
        Scanner s= new Scanner(System.in);  
        System.out.print("Enter a String: ");  
        String str= s.nextLine(); 
		FileWriter fw=new FileWriter("file_1.txt");
        fw.write(str);
		System.out.println("Writing successful");
		fw.close();
    }
    void Info() throws IOException{
        File myFile = new File("file_1.txt");  
        if (myFile.exists()) {  
            // Getting file name  
            System.out.println("The name of the file is: " + myFile.getName());  
            
            // Getting path of the file   
            System.out.println("The absolute path of the file is: " + myFile.getAbsolutePath());     
   
            // Checking whether the file is writable or not  
            System.out.println("Is file writeable?: " + myFile.canWrite());    
   
            // Checking whether the file is readable or not  
            System.out.println("Is file readable " + myFile.canRead());    
   
            // Getting the length of the file in bytes  
            System.out.println("The size of the file in bytes is: " + myFile.length());    
        } else {  
            System.out.println("The file does not exist.");  
        }  
    }

    void Read() throws IOException{
        File myFile = new File("file_1.txt");
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String Line=sc.nextLine();
                System.out.println(Line);
            }
            sc.close();
    }
    void Delete() throws IOException{
        File myFile = new File("file_1.txt");
        if(myFile.delete()){
            System.out.println("i have deleted : "+myFile.getName());
        }
        else{
            System.out.println("Some problem is error...");
        }
    }
	void Copy() throws IOException {

        File myFile = new File("file_1.txt");
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String Line=sc.nextLine();
                System.out.println(Line);
                
                FileWriter fw=new FileWriter("kuldeep.txt");
                fw.write(Line);
		        System.out.println("Writing successful");
		        fw.close();
            }
            sc.close();
		
	}
}