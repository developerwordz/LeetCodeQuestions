class NumMatrix {
        int prefix[][];

    public NumMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        prefix = new int[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                int top,left,topLeft;
                top = (i>0)?prefix[i-1][j]:0;
                left=(j>0)?prefix[i][j-1]:0;
                topLeft=(i>0&&j>0)?prefix[i-1][j-1]:0;
                prefix[i][j] = matrix[i][j]+top+left-topLeft;
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int top = row1>0?prefix[row1-1][col2]:0;
        int left = col1>0?prefix[row2][col1-1]:0;
        int topLeft = (row1>0&&col1>0)?prefix[row1-1][col1-1]:0;
        return prefix[row2][col2]-top-left+topLeft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */