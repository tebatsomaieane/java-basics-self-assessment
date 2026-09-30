
package q25_polygonarea;


public class Q25_PolygonArea {

    public static void main(String[] args) {

        int numberOfSides = 6;
        double sideLength = 5;

        double area = (numberOfSides * sideLength * sideLength)
                / (4 * Math.tan(Math.PI / numberOfSides));

        System.out.println("Area of the polygon: " + area);
    }
}