package Chapter11.MP3OOP;

public class Volume {
   private int volume = 25;

   public int getVolume(){
       return volume;
   }
   public void decreaseVolume(){
       if(volume>0)
       this.volume -= 5;
   }

    public void increaseVolume() {
      if(volume<100)
       this.volume += 5;
    }
}
