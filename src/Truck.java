public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public void printTruck()
  {
    System.out.println("License Plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\n# of axles: " + axles + "\nHas Trailer?: " + hasTrailer);
  }

  public boolean validateLicensePlate()
  {
    if (hasTrailer)
    {
      String licensePlate = getLicensePlate();

      String lastTwoChars = licensePlate.substring(licensePlate.length() - 2);

      boolean isValid = (lastTwoChars.equals("MX") && axles > 4) || (lastTwoChars.equals("LX") && axles <= 4);
      return isValid;
    }
    else
    {
      return true;
    }
  }
}