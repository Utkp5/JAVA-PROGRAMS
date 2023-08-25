package Star;

//Ques   --> below to print

// 9    * * * * * * * * * 
// 7      * * * * * * *
// 5        * * * * *
// 3          * * *
// 1            *



public class Star6 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {  
                
            for (int j = 5; j >= i; j--) {
                
                System.out.print(" ");              
            }  

            for (int k = 1; k <= i ; k++) {

                    System.out.print("*");
            }

            for (int m = 2; m <= i ; m++) {

                    System.out.print("*");
            }

            System.out.println();
        }
    }
}
