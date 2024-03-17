package HW.HW11;

public class hw11 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) { 
            return image;
        }
        fill(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void fill(int[][] image, int sr, int sc, int currentColor, int newColor){ 
        int rowLength = image.length;
        int colLength = image[0].length;
        if (sr < 0 || sc < 0 || sr >= rowLength || sc >= colLength|| image[sr][sc] != currentColor) {
            return;
        }

        image[sr][sc] = newColor;
        fill(image, sr + 1, sc, currentColor, newColor);
        fill(image, sr - 1, sc, currentColor, newColor);
        fill(image, sr, sc + 1, currentColor, newColor);
        fill(image, sr, sc - 1, currentColor, newColor);
    }

    public static void main(String[] args) {
        
    }
}
