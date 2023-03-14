package LAB3.zad3;

public class Remote {
    TV teleVision;
    public void switchTV(){ teleVision.isOn ^= true; }
    public void changeCh(boolean goUp){
        if(teleVision.isOn){
            if(goUp && teleVision.channel < 21){ ++teleVision.channel; }
            else if (!goUp && teleVision.channel > 1) { --teleVision.channel; }
        }
    }
    public void changeVol(boolean goUp){
        if(teleVision.isOn){
            if(goUp && teleVision.volume < 10){ ++teleVision.volume; }
            else if (!goUp && teleVision.channel > 1) { --teleVision.channel; }
        }
    }
    public Remote(TV television){ this.teleVision = television;}
}
