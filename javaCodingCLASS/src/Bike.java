public class Bike {
    private boolean isOn;
    private int speed;
    private int gear;

    public void bikeCanBeTurnedOnAndOff() {
        isOn = !isOn;
    }

    public boolean getBikeTurnedOnandOff() {
        return isOn;
    }


    public void setBikeAccelerated(int Gear) {
        if (Gear >= 0 && Gear < 21) {
            speed = Gear + 1; }
        if (Gear>=21 && Gear <31){
            speed = Gear + 2;}
        if (Gear>30 && Gear <41){
            speed = Gear +3; }
        if (Gear > 40 ){
            speed = Gear + 4;}
        }

    public int getBikeSpeed() {
        return speed;
    }
    public void setBikeDeccelerated(int Gear) {
        if (Gear >= 0 && Gear < 21) {
            speed = Gear - 1; }
        if (Gear>=21 && Gear <31){
            speed = Gear - 2;}
        if (Gear>30 && Gear <41){
            speed = Gear - 3; }
        if (Gear > 40 ){
            speed = Gear - 4;}
    }
    public void setBikeGear(int Gear) {
        if (Gear >= 0 && Gear < 21) {
            gear = 1; }
        if (Gear>=21 && Gear <31){
            gear = 2;}
        if (Gear>30 && Gear <41){
            gear  = 3; }
        if (Gear > 40 ){
            gear  = 4;}
    }


    public int getBikegear() {
        return gear;
    }
}


