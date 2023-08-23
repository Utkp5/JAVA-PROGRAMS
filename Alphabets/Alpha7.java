package Alphabets;

//Ques   --> below to print

//  p 
//  q r
//  s t u 
//  v w x y  


public class Alpha7 {
    public static void main(String[] args) {

        char k = 'p';
                
        for (char row = 'p'; row <= 's'; row++)   // loop for row
           {  
               
               for (char col = 'p'; col <= row; col++)   // loop for column
               {                 
                   System.out.print(k++ + " ");
               }            
               System.out.println();
           }
    }
}
