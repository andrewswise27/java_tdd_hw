public class WaterBottle {

    private int volume;

    public WaterBottle(int volume){
        this.volume = 100;
    }

    public int getVolume(){
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int Drink(){
        setVolume(this.volume - 10);
        return this.volume;
    }

    public int Empty(){
        setVolume(0);
        return this.volume;
    }

    public int Fill(){
        setVolume(100);
        return this.volume;
    }
}
