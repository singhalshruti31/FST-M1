package activities;

public class Activity7 {
    public static void main (String[] args){
        MountainBike mtbk = new MountainBike(10, 6, 30);
        //mtbk.seatHeight(5);
        System.out.println(mtbk.bicycleDesc());
        mtbk.speedUp(5);
        System.out.println(mtbk.bicycleDesc());
        mtbk.applyBrake(1);
        System.out.println(mtbk.bicycleDesc());

    }
}
