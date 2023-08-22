package Number;

//Ques   --> below to print

//  5
//  5 4
//  5 4 3
//  5 4 3 2
//  5 4 3 2 1


public class Num7 {
    public static void main(String[] args) {
        
        for (int i = 5; i >= 1; i--) {   // for row
                
            for (int j = 5; j >=i; j--) {  // for column
                
                System.out.print( j + " ");
    
            }            
            System.out.println();
        }

    } 
}
