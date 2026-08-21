package org.example;

public class Tessellation {

    public static void drawPicture(double width, double height) {
        // Fill the background
        SimpleGraphics.fillBackground("white");

        // make some variables available
        // the color name "green" does not give the correct shade, so a hex code is used instead
        String[] colors = {"red", "#00ff00", "blue", "cyan", "magenta", "yellow"};

        // sizes of triangles are based on canvas size
        // we want to fit in 3 horizontally and 5 vertically.
        double TRIANGLE_HEIGHT = height / 5;
        double TRIANGLE_WIDTH = width / 3;

        // ==================================================================
        // Draw the tessellation (you should only edit code below this part!)
        // ==================================================================
        SimpleGraphics.setFillColor(colors[3]); // set fill color to cyan
        for (int i=0; i < 5; i++){
            SimpleGraphics.fillTriangle(
                0, i * TRIANGLE_HEIGHT,
                TRIANGLE_WIDTH, TRIANGLE_HEIGHT * (i + 1),
                0, (i + 1) * TRIANGLE_HEIGHT
            );
            System.out.println("1");
        }

        // code for RED triangles
        SimpleGraphics.setFillColor(colors[0]); // set fill color to red
        for (int i = 0; i < 5; i++) { // fillTriangle(x1, y1, x2, y2, x3, y3)
            SimpleGraphics.fillTriangle(
                2 * TRIANGLE_WIDTH, i * TRIANGLE_HEIGHT,
                3 * TRIANGLE_WIDTH, i * TRIANGLE_HEIGHT,
                3 * TRIANGLE_WIDTH, (i + 1) * TRIANGLE_HEIGHT
            );
            System.out.println("2");
        }

        // code for BLUE triangles

        // code for YELLOW triangles

        // code for GREEN triangles

        // code for MAGENTA triangles

        // code for CYAN triangles


    }

    public static void main(String[] args) {
        // Launch the wrapper; only edit starting dimensions of canvas if you would like to
        SimpleGraphics.start(Tessellation::drawPicture, 600, 400);
    }
}
