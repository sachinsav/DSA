import java.util.Arrays;
class Solution {
    public void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
    public void setZeroes(int[][] matrix) {
        
        int m=matrix.length, n=matrix[0].length;
        boolean isFirstRowZero=false, isFirstColZero=false;
        for(int j=0; j<n;j++){
            if(matrix[0][j]==0){
                isFirstRowZero=true;
                break;
            }
        }
        for(int i=0; i<m;i++){
            if(matrix[i][0]==0){
                isFirstColZero=true;
                break;
            }
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //printMatrix(matrix);
        for(int i=1;i<m;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<n;j++) matrix[i][j] = 0;
            }
        }
        //printMatrix(matrix);
        for(int j=1;j<n;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<m;i++) matrix[i][j] = 0;
            }
        }
        
        if(isFirstRowZero){
            for(int i=0;i<n;i++) matrix[0][i] = 0;
        }
        if(isFirstColZero){
            for(int i=0;i<m;i++) matrix[i][0] = 0;
        }
    }
}