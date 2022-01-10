package activities;

public class Activity6{
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        plane.onboard("Adam");
        plane.onboard("Eve");
        plane.onboard("Olivia");
        plane.onboard("Nectar");
        plane.onboard("Amanda");

        System.out.println("Plane take off at :: " + plane.takeOff());
        System.out.println("Passengers boarded in plane :: " + plane.getPassengers());
        Thread.sleep(5000);

        plane.land();
        System.out.println("Plane landed at :: " + plane.getLastTimeLanded());
    }
}