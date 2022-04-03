public class Taxi extends Car
{
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected)
    {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public void printTaxi()
    {
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Toll Fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Is Electric?: " + isElectric());
        System.out.println("Discount Applied?: " + isDiscountApplied());
        System.out.println("Total Fare Collected: " + fareCollected);
    }
}
