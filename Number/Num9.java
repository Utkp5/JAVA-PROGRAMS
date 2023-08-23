package Number;

//Ques   --> below to print

// 5 4 3 2 1 
// 5 4 3 2  
// 5 4 3   
// 5 4    
// 5     


public class Num9 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {   // for row
                
            for (int j = 5; j >=i; j--) {  // for column
                
                System.out.print(j +" ");
    
            }            
            System.out.println();
        }
    }
}
