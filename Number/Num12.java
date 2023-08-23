package Number;

//Ques   --> below to print

// 1 2 3 4 5
// 2 3 4 5
// 3 4 5  
// 4 5   
// 5  


public class Num12 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {   // for row
                
            for (int j = i; j <=5; j++) {  // for column
                
                System.out.print(j +" ");
    
            }            
            System.out.println();
        }
    }    
}
