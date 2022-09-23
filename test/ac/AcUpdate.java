package ac;

public class AcUpdate {
    public boolean isOn;
    public int temp =16;


    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn =true;

    }

    public void turnOff() {
    isOn = false;
    }
    public int getTemp() {
        return temp;
    }
    public int increaseAc() {
        if(isOn) conditionIncrease();

    return temp;
    }
    private void conditionIncrease() {
        temp++;
        if(temp > 30) temp = 30;
    }
    public int decreaseAc() {
        if(isOn) conditionDecrease();
        return temp;
    }
    private void conditionDecrease() {
        temp--;
        if(temp < 16) temp = 16;
    }

}
