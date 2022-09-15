public class Car {
    int cadence;
    int speedup;
    int gear;

    void changeCadence(int changeCadence){
        cadence = Integer.parseInt(String.valueOf(changeCadence));
    }

    void speedUp (int speedUp){
        speedup = Integer.parseInt(String.valueOf(speedUp));
    }

    void changeGear (String changeGear){
        gear = Integer.parseInt(changeGear);
    }

    void printInfo(){
        System.out.println(
                "Change Cadence : " + cadence + "\n" + "Speed Up : " + speedup + "\n" + "Change Gear : " + gear
        );
    }
}
