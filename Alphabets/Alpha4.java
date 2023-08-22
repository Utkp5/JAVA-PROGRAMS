package Alphabets;


//Ques   --> below to print

//  Z Z Z Z Z 
//  Y Y Y Y Y
//  X X X X X
//  W W W W W
//  V V V V V 

public class Alpha4 {
    public static void main(String[] args) {
        
        for (char row = 'Z'; row >= 'V'; row--)   // loop for row
        {  
            
            for (char col = 'Z'; col >='V'; col--)   // loop for column
            {                 
                System.out.print(row + " ");
            }            
            System.out.println();
        }
    }  
}
