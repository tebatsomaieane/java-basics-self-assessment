
package q26_haversinedistance;


public class Q26_HaversineDistance {

    public static void main(String[] args) {

        double latitude1 = 40.7128;
        double longitude1 = -74.0060;

        double latitude2 = 34.0522;
        double longitude2 = -118.2437;

        double earthRadius = 6371;

        double latitudeDifference = Math.toRadians(latitude2 - latitude1);
        double longitudeDifference = Math.toRadians(longitude2 - longitude1);

        double a = Math.sin(latitudeDifference / 2) * Math.sin(latitudeDifference / 2)
                + Math.cos(Math.toRadians(latitude1))
                * Math.cos(Math.toRadians(latitude2))
                * Math.sin(longitudeDifference / 2)
                * Math.sin(longitudeDifference / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distance = earthRadius * c;

        System.out.println("Distance: " + distance + " km");
    }
}
