public class MP3 {

        private boolean isOn;
        private int  channel;
        private  int volume;
        public void MP3CanBeTurnedOn(){
            isOn =!isOn; }
        public  boolean getMP3Turned(){
            return isOn;
        }

        public void increaseMP3Chanenel() {
            this.channel = channel+ 1;
        }

        public int getMP3Channel() {
            return this.channel;
        }
        public void decreaseMP3Chanenel() {
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


