package Alphabets;


//Ques   --> below to print

//  Z Y X W V 
//  Z Y X W V 
//  Z Y X W V 
//  Z Y X W V 
//  Z Y X W V 

public class Alpha3 {
    public static void main(String[] args) {
        
        for (int row = 1; row <= 5; row++)   // loop for row
        {  
            
            for (char col = 'Z'; col >='V'; col--)   // loop for column
            {                 
                System.out.print(col + " ");
            }            
            System.out.println();
        }
    }  
}
