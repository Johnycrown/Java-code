package chapterThree;

public class Television {
    private boolean isOn;
    private int  channel;
    private  int volume;
    public void televisionCanBeTurnedOn(){
        isOn =!isOn; }
    public  boolean getTelevisionTurned(){
        return isOn;
    }

    public void increaseTelevisionChanenel() {
        this.channel = channel+ 1;
    }

    public int getTelevisionChannel() {
        return this.channel;
    }
    public void decreaseTelevisionChanenel() {
        if(channel>0){
        this.channel = channel - 1;}
    }

    public void increaseVolume() {
        this.volume = volume + 1;
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        if(volume > 0){
            this.volume = volume - 1;
        }
    }
}
