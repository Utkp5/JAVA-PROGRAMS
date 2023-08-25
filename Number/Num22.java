package Number;

//Ques   --> below to print

//  1 0 1 0 1
//    0 1 0 1
//      1 0 1
//        0 1
//          1


public class Num22 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j < i; j++) {
                
                System.out.print(" ");              
            }    
                      
            for (int k = 5; k >= i ; k--) {

                if (k%2==0) {
                    System.out.print("0");
                    
                } else {
                    System.out.print("1");
                    
                }
            }
            System.out.println();
        }
    }
}
