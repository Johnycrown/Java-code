public class Aircondition2 {
    private int temperature;
    private int currenttemperature = 16;
   private Boolean Ison;


    public void acCanOn(boolean ison) {
        Ison = ison; }

    public boolean getAC(){
        return Ison;
    }


    public void acCanIncrease() {
        if(currenttemperature <30)
        temperature = currenttemperature +1;

    }

    public int getACIncrease() {
        return temperature;
    }

    public void acCanDecrease() {
        if(currenttemperature>16)
        temperature = currenttemperature -1;
    }
}
