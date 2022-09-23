package volume;

public class Cylinder {
    private int radius = 1;
    private int height = 1;
    private int volume = 1;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    private int cylinder(){
       int cylinder = getHeight() * getRadius() * getVolume();
        return cylinder;
    }
    public double total(){
      return   cylinder();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
