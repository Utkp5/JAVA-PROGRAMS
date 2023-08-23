package Number;

//Ques   --> below to print

//  5 4 3 2 1
//    5 4 3 2
//      5 4 3
//        5 4 
//          5 


public class Num13 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {   // for row
                
            for (int j = 1; j <= i; j++) {  // for column
                
                System.out.print(" ");              
            }            
            for (int k = 5; k >= i ; k--) {

                    System.out.print(k);

            }
            System.out.println();
        }
    }
}
