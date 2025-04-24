import java.util.*;
public class diagonalsum{
    public static int diagonal(int matrix[][]){
        int sum=0;
        for(int i=0 ;i<matrix.length ; i++){
            for(int j=0 ;j<matrix[0].length ;j++){
                if(i==j){
                    sum = sum+matrix[i][j];
                }
                else if(i+j==matrix.length-1){
                        sum +=matrix[i][j];

                    }

            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            
            }
        }
        for(int i=0 ;i<n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();

        }
        int result = diagonal(matrix);
        System.out.println(result);
        
    
}
}

    
