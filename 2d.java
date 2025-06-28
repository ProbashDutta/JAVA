import java.util.Stack;

public class 2d {

    // Main function to find the max rectangle
    public static int maxRectangle(int[][] matrix) {
        if (matrix.length == 0) return 0;

        int n = matrix.length;
        int m = matrix[0].length;
        int[] heights = new int[m];
        int maxArea = 0;

        // Traverse each row
        for (int i = 0; i < n; i++) {
            // Update the histogram heights
            for (int j = 0; j < m; j++) {
                // If matrix[i][j] is 1, increase height
                if (matrix[i][j] == 1)
                    heights[j] += 1;
                else
                    heights[j] = 0;
            }
            // Calculate max area for this histogram
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    // Function to calculate the largest rectangle in a histogram
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }

    // Sample Test
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 1, 0},
            {1, 1, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 0, 0}
        };

        System.out.println("Maximum rectangle area of 1s: " + maxRectangle(matrix));
    }
}
