package Number;

//Ques   --> below to print

// 5 4 3 2 1
//   4 3 2 1
//     3 2 1
//       2 1
//         1


public class Num14 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {   // for row
                
            for (int j = 5; j >= i; j--) {  // for column
                
                System.out.print(" ");              
            }            
            for (int k = i; k >= 1 ; k--) {

                    System.out.print(k);

            }
            System.out.println();
        }
    }
}
