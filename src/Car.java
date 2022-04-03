public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public void printCar()
  {
    System.out.println("License Plate: " + getLicensePlate() + "\nToll Fee: " + getTollFee() + "\nPassengers: " + getPassengers() + "\nElectric?: " + electric + "\nDiscount applied?: " + discountApplied);
  }

  public boolean isElectric()
  {
    return electric;
  }

  public boolean isDiscountApplied()
  {
    return discountApplied;
  }

  public boolean dropOffPassengers(int numOut)
  {
    int currentNumOfPass = getPassengers();

    if (numOut < currentNumOfPass)
    {
      setPassengers(currentNumOfPass - numOut);
      return true;
    }
    return false;
  }

  public void applyDiscount()
  {
    if (!discountApplied)
    {
      if (isElectric())
      {
        double discountedFee = getTollFee() * 0.5;
        setTollFee(discountedFee);
        discountApplied = true;
      }
    }
  }
}