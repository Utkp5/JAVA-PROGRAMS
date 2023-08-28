package Letter;

//Ques   --> below to print...  its L letter

//    * 
//    *       
//    *       
//    *       
//    * * * * *  


public class Let2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {  
                
            for (int j = 1; j <= 5; j++) {
                
                if (j == 1 || i == 5) {

                    System.out.print("*");              
                    
                }
                System.out.print(" ");
            }            
            System.out.println(" ");
        }
    }
}
