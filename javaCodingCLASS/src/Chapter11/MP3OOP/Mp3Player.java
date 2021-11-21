package Chapter11.MP3OOP;

import java.util.ArrayList;

public class Mp3Player {
    Playlist musicPlaylist;
    ArrayList<Music> musiclist = new ArrayList<Music>();
    Power power = Power.OFF;
    Volume volume =  new Volume();

    public void setMp3On() {
        power = Power.ON;

    }

    public Power getPower() {

        return power;
    }

    public void setMp3off() {
        power = Power.OFF;
    }

    // volume = 25;
}
