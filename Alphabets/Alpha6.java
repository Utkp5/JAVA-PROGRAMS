package Alphabets;

//Ques   --> below to print

// A
// A B
// A B C
// A B C D
// A B C D E

public class Alpha6 {
    public static void main(String[] args) {
        
        for (char row = 'A'; row <= 'E'; row++)   // loop for row
        {  
            
            for (char col = 'A'; col <= row; col++)   // loop for column
            {                 
                System.out.print(col + " ");
            }            
            System.out.println();
        }
    }
}
