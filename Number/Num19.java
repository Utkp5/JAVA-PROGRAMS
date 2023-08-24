package Number;

//Ques   --> below to print

//         5
//       5 4
//     5 4 3
//   5 4 3 2
// 5 4 3 2 1


public class Num19 {
    public static void main(String[] args) {

        for (int i = 5; i >= 1; i--) {  
                
            for (int j = 1; j <= i; j++) {
                
                System.out.print(" ");              
            }            
            for (int k = 5; k >= i ; k--) {

                    System.out.print(k);

            }
            System.out.println();
        }
    }
}
