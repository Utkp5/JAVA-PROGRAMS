package Alphabets;

//Ques   --> below to print

//   A B C D E
//   A B C D E 
//   A B C D E
//   A B C D E
//   A B C D E

public class Alpha1 {

    public static void main(String[] args) {
        
        for (int row = 1; row <= 5; row++)   // loop for row
        {  
            
            for (char col = 'A'; col <='E'; col++)   // loop for column
            {                 
                System.out.print(col + " ");
            }            
            System.out.println();
        }
    }
}
