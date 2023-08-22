package Number;

//Ques   --> below to print

//  5 4 3 2 1
//  5 4 3 2 1
//  5 4 3 2 1
//  5 4 3 2 1
//  5 4 3 2 1

public class Num3 {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++)   // loop for row
        {  
            
            for (int col = 5; col >=1; col--)   // loop for column
            {                 
                System.out.print(col + " ");
            }            
            System.out.println();
        }
    }  
}
