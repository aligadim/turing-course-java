package turingLesson3;

public class Matrix {
    public static void main(String[] args) {
        int [] rowSum = {10,15};
        int[] colSum = {5,2};

        Matrix matrix = new Matrix();
        int [][] resultMatrix = matrix.restoreMatrix(rowSum,colSum);
        for (int i = 0; i <resultMatrix.length ; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.println(resultMatrix[i][j]+" ");
            }
            System.out.println();
            
        }


    }


    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;
        
        int [][] matrix = new int[n][m];
        int i = 0;int j = 0;

        while (i<n && j<m){
            int val = Math.min(rowSum[i],colSum[j]);
            matrix[i][j]=val;
            rowSum[i]-=val;
            colSum[j]-=val;
            
            if(rowSum[i] ==0)i++;
            if(colSum[j]==0)j++;
        }
        return matrix;

    }
}


