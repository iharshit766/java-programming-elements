public class EarthVolumeCalculator {
    public static void main(String[] args) {
        // store the radius of Earth in kilometers
        double radiusKm = 6378;
        
        // conversion factor: 1 km = 0.621371 miles
        double conversionFactor = 0.621371;
        
        // calculate the volume using the sphere formula
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        
        // convert volume to cubic miles
        double radiusMiles = radiusKm * conversionFactor;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        
        // print the result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }
}
