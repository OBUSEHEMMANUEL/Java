package bike;

public class BikeUpdate {

    public boolean isOn;
    public int speed;
    private int gear;

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        gear = 1;

    }

    public void turnOff() {
        isOn = false;
        gear = 0;
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void increaseSpeed() {
        if (isOn) accelerate();
    }

    private void accelerate() {
        if (gear == 4) speedGear4();

        if (gear == 3) speedGear3();

        if (gear == 2) speedGear2();

        if (gear == 1) speedGear1();
    }

    private void speedGear4() {
        speed += 4;
    }

    private void speedGear3() {
        speed += 3;
        if (speed >= 41) gear++;
    }

    private void speedGear2() {
        speed += 2;
        if (speed >= 31) gear++;
    }

    private void speedGear1() {
        speed++;
        if (speed > 20) gear++;
    }

    public void decreaseSpeed() {
        if (isOn) decelerate();
    }

    private void decelerate() {
        if(gear == 1) speed--;

        if(gear == 2)gear2Decrease();

        if (gear == 3) gear3Decrease();

        if(gear == 4) gear4Decrease();

    }

    private void gear2Decrease() {
        speed -=2;
        if(speed < 21) gear--;

    }

    private void gear3Decrease() {
        speed -=3;
        if (speed < 31)
            gear--;
    }

    private void gear4Decrease() {
        speed-=4;
        if (speed < 41)
            gear--;
    }

}
