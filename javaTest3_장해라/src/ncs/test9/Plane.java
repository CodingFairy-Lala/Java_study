package ncs.test9;

public abstract class Plane {

    private String planeName;
    private int fuelSize;

    public Plane() {
    }

    public Plane(String planeName, int fuelSize) {
        this.planeName = planeName;
        this.fuelSize = fuelSize;
    }

    public String getPlaneName() {
        return this.planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public int getFuelSize() {
        return this.fuelSize;
    }

    public void setFuelSize(int fuelSize) {
        this.fuelSize = fuelSize;
    }

    // 주유
    public void refuel(int fuel) {
        this.fuelSize += fuel;
    }

    // 운항(Abstract method)
    public abstract void flight(int distance);

}
