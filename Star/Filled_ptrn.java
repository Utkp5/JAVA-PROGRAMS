package Star;

//Ques   --> below to print

//  * * * * *
//  * * * * *
//  * * * * *
//  * * * * *
//  * * * * *


public class Filled_ptrn {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {   // for row
            
            for (int j = 1; j <=5; j++) {  // for column
                
                System.out.print(" * ");

            }            
            System.out.println();
        }
    }
}
