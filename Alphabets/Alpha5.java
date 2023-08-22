package Alphabets;

//Ques   --> below to print

//  Z
//  Z Y
//  Z Y X
//  Z Y X W
//  Z Y X W V


public class Alpha5 {
    public static void main(String[] args) {
        
        for (char row = 'Z'; row >= 'V'; row--)   // loop for row
        {  
            
            for (char col = 'Z'; col >=row; col--)   // loop for column
            {                 
                System.out.print(col + " ");
            }            
            System.out.println();
        }
    }
}
