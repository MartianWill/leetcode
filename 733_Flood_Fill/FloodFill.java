
public class FloodFill {
    public static int[][] fillFlood(int[][] image, int sr, int sc, int color) {
        int curColor = image[sr][sc];
        if (color == curColor)
            return image;
        depthFirst(image, sr, sc, color);
        return image;
    }

    private static void depthFirst(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor)
            return;
        int oldColor = image[sr][sc];
        image[sr][sc] = newColor;
        int[][] direction = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        for (int[] dir : direction) {
            int newR = sr + dir[0];
            int newC = sc + dir[1];
            if (newR >= 0 && newR < image.length && newC >= 0 && newC < image[0].length
                    && image[newR][newC] == oldColor) {
                depthFirst(image, newR, newC, newColor);
            }
        }

    }

    public static void main(String[] args) {
        int[][] image = { { 2, 2, 2 }, { 1, 2, 0 }, { 1, 0, 1 } };
        int sr = 1;
        int sc = 1;
        int color = 1;

        image = fillFlood(image, sr, sc, color);

        for (int i = 0; i < image[i].length; i++) {
            for (int c : image[i]) {
                System.out.print(c);
            }
            System.out.println("");
        }

    }
}
