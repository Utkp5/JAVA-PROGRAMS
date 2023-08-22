package Number;

//Ques   --> below to print

//  1 2 3 4 5 
//  6 7 8 9 10 


public class Num5 {
    public static void main(String[] args) {

        int k = 1;

        for (int row = 1; row <= 2; row++)   // loop for row
        {  
            
            for (int col = 1; col <=5; col++)   // loop for column
            {                 
                System.out.print(k + " ");
                k++;
            }            
            System.out.println();
        }
    }
}
