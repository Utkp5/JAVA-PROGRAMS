package Star;

//Ques   --> below to print

// 1            *
// 3          * * *
// 5        * * * * *
// 7      * * * * * * *
// 9    * * * * * * * * * 


public class Star5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {  
                
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
