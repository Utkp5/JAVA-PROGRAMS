package Number;

//Ques   --> below to print

//  1
//  1 0
//  1 0 1
//  1 0 1 0
//  1 0 1 0 1


public class Num21 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
                      
            for (int k = 1; k <= i ; k++) {

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
