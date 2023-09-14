package TwoDArray;

public class two_D_arr {
    public static void main(String[] args) {
        
        int arr[][] = new int[3][5];     // [row][col]  by default value is 0

        // arr.length returns no. of rows in 2 D array
        // arrName[row_index].length - length of a row   eg: 1row. ----  2,3,4,5,3,  length = 5 ek row me kitne element hai
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
      
    }
}
