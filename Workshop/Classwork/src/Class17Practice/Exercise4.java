package Class17Practice;

abstract class Shape {

    int radius;

    abstract double area(int dimension);

    public void getDescription() {

        System.out.println("This is a shape...");

    }

}

interface Drawable {

    void draw();

}

class Circle extends Shape implements Drawable {

    @Override
    double area(int radius) {

        this.radius = radius;

        return 2 * Math.PI * radius;

    }

    @Override
    public void draw() {

        // got bored here... it half actually works, but it's more of an octagon than a circle

        for (int i = 0; i <= 2 * radius; i++) { // loops through the rows

            for (int j = 0; j <= 2 * radius; j++) { // loops through the columns

                int xSquared = (i - radius) * (i - radius); // gets the horizontal distance from the center of the circle
                int ySquared = (j - radius) * (j - radius); // gets the vertical distance from the center of the circle

                if (Math.abs(xSquared + ySquared - radius * radius) < radius) { // does some math to determine if the point is within the circle

                    System.out.print("*");

                } else {

                    System.out.print(" ");

                }

            }

            System.out.println();

        }

    }

}

public class Exercise4 {

    public static void main(String[] argv) {

        Circle circle = new Circle();

        System.out.println("Area of the circle: " + circle.area(5));

        circle.getDescription();
        circle.draw();

    }

}