package Number;

//Ques   --> below to print

// 1 
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5


public class Num6 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) {   // for row
                
            for (int j = 1; j <=i; j++) {  // for column
                
                System.out.print( j + " ");
    
            }            
            System.out.println();
        }

    }
}
