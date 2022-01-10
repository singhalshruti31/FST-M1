package activities;

public class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gears, int currentSpeed, int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + " and Speed of bicycle is " + currentSpeed+ " and Seat Height is " +seatHeight);
    }
}
