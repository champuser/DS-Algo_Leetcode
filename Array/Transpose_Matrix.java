/**

Ques.-----> 867
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

 

Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]



**/


class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int column = matrix[0].length;
        int new_matrix[][] = new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                new_matrix[j][i] = matrix[i][j];
            }
        }
        return new_matrix;
        
    }
}
