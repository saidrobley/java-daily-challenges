public class MatrixRotation {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {12, 14, 4, 5}, {9, 19, 45, 65}, {89, 90, 88, 77}};
        printArray(matrix);
        int[][] newMatrix = rotate90Degree(matrix, matrix.length);
        System.out.println("=======================================================");
        printArray(newMatrix);

    }

    public static int[][] rotate90Degree(int[][] matrix, int n) {
        for(int layer = 0; layer < n/2; layer++ ) {
            int first = layer;
            int last = n - layer - 1;
            for(int i = first; i < last; i++) {
                int offset = i - first;
                // save the top
                int top = matrix[first][i];
                // left -> top
                matrix[first][i] = matrix[last - offset][first];
                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];
                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];
                // top -> right
                matrix[i][last] = top;
            }
        }
        return matrix;
    }
    public static void printArray(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}