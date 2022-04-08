class Solution {
    public void rotate(int[][] matrix) {
        int nmatrix[][] =new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++) {
            int c=matrix.length-1;
            for(int j=0;j<matrix[0].length;j++) {
                nmatrix[i][j]=matrix[c--][i];
            }
        }
         for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                matrix[i][j]=nmatrix[i][j];
    }
}
    }
}