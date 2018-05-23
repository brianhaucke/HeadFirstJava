package ChapterFour;

class Vehicle {
    private int numOfWheels;
    private double fuelTankCapacity;
    private int maxSpeed;
    private double numGallonsGasTank;
    private int numOfSeats;
    private String modelName;
    private String color;
    private String modelSubClass;
    private boolean navigationGPS;

    public int getNumOfWheels(){
        return numOfWheels;
    }
    void setNumOfWheels(int s){
        if (s > 0) {
            numOfWheels = s;
        }
    }

    public double getFuelTankCapacity(){
        return fuelTankCapacity;
    }
    void setFuelTankCapacity(double s){
        if (s > 0){
        fuelTankCapacity = s;
        }
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
    void setMaxSpeed(int s){
        if (s > 0) {
            maxSpeed = s;
        }
    }

    public double getNumGallonsGasTank(){
        return numGallonsGasTank;
    }
    void setNumGallonsGasTank(double s){
        if (s >= 0) {
            numGallonsGasTank = s;
        }
    }

    public int getNumOfSeats(){
        return numOfSeats;
    }
    void setNumOfSeats(int s){
        if (s > 0) {
            numOfSeats = s;
        }
    }


    public String getModelName(){
        return modelName;
    }
    void setModelName(String s) {
        modelName = s;
    }


    public String getColor(){
        return color;
    }
    void setColor(String s){
        color = s;
    }

    public String getModelSubClass(){
        return modelSubClass;
    }
    void setModelSubClass(String s){
        modelSubClass = s;
    }

    public boolean getNavigationGPS(){
        return navigationGPS;
    }
    void setNavigationGPS(boolean s){
        navigationGPS = s;
    }





}
