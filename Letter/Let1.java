package Letter;

//Ques   --> below to print...  its O letter   (pending)

//    * * * * *
//    *       *
//    *       *   
//    *       *
//    * * * * *  


public class Let1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {  
                
            for (int j = 1; j <= 5; j++) {
                
                if (i == 1 || j == 1 || j == 5 || i == 5) {

                    System.out.print("*");              
                    
                }
                System.out.print(" ");
            }            
            System.out.println(" ");
        }
    }
}