//Robert Bennethum
public class Odometer {
    private double totalMiles = 0, milesPerGallon = 0;
    //reset odometer
    public void resetOdometer() {
        totalMiles = 0;
        System.out.println("Current Miles:"+totalMiles+'\n');
        fuelUsed();
    }
    //Efficency and miles
    public void efficiency(double mpg) {
        milesPerGallon = mpg;
    }
    public void milesDriven(double miles) {
        totalMiles += miles;
        fuelUsed();
    }
    //How much fuel used
    public void fuelUsed() {
        System.out.format("%.2f", totalMiles/milesPerGallon);
        System.out.println(" Gallons Used"+'\n');
    }
}
