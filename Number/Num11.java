package Number;

//Ques   --> below to print

//  1 1 1 1 1
//  2 2 2 2 
//  3 3 3 
//  4 4
//  5   

public class Num11 {
    public static void main(String[] args) {
    
        for (int i = 1; i <= 5; i++) {   // for row
                
            for (int j = 5; j >=i; j--) {  // for column
                
                System.out.print(i +" ");
    
            }            
            System.out.println();
        }
    }
    
}
