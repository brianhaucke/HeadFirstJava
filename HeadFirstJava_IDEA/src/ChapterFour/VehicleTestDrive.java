package ChapterFour;

public class VehicleTestDrive {
    public static void main(String[] args) {
        Vehicle a = new Vehicle();
        a.setNumOfWheels(4);
        a.setFuelTankCapacity(12.5);
        a.setNumGallonsGasTank(0);
        a.setMaxSpeed(140);
        a.setNumOfSeats(6);
        a.setModelName("Honda");
        a.setColor("Green");
        a.setModelSubClass("Civic");
        a.setNavigationGPS(true);

        System.out.println("Make / Model: " + a.getModelName() + " " + a.getModelSubClass());
        System.out.println("Color: " + a.getColor());
        System.out.println("Number of wheels: " + a.getNumOfWheels());
        System.out.println("Fuel Tank Capacity: " + a.getFuelTankCapacity());
        System.out.println("Gallons currently in gas tank: " + a.getNumGallonsGasTank());
        System.out.println("Maximum Speed: " + a.getMaxSpeed());
        System.out.println("Number of Seats: " + a.getNumOfSeats());
        System.out.println("GPS Navigation: " + a.getNavigationGPS());

    }
}
