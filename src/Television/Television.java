

package Television;

public class Television {
    private int changeChannel;
    private boolean isOn;
    private int volume;
    private boolean mute;
    private int volumeSaver;



    public boolean isOn() {
        return isOn;
    }
    public void turnOn(){
        isOn = true;
    }
    public void turnOff() {
        isOn = false;
    }
    public int getChangeChannel() {
        return changeChannel;
    }
    public void setChangeChannel(int changeChannel) {
        if(changeChannel > 100)  changeChannel = 0;
        if(changeChannel < 0)  changeChannel = 100;
        this.changeChannel = changeChannel;
    }
    public void positiveChangeChannel(){
        changeChannel++;
        if(changeChannel > 100)  changeChannel = 0;
    }
    public  void negativeChangeChannel(){
        changeChannel--;
        if(changeChannel < 0)  changeChannel = 100;
    }
    public void channelForward(){
        if(isOn) positiveChangeChannel();

    }
    public void channelBackward() {
        if (isOn) negativeChangeChannel();
    }
    public void increaseVolume() {
        volume++;
        if(volume > 50) volume = 50;
    }
    public void volumePlus(){
        if(isOn) increaseVolume();
    }
    public int getVolume() {
        volumeSaver = volume;
        if(mute){
            volume = 0;
        }
        return volume;
    }

    public void volumeMinus(){
       if(isOn) decreaseVolume();
    }
    public  void decreaseVolume(){
        volume--;
        if(volume < 0) volume = 0;
    }
    public boolean IsMute() {
       return mute;
    }
    public void mute(){
        mute = true;
    }
    public void unMute(){
        if (mute){
            mute = false;
            volume = volumeSaver;
        }
    }



}
