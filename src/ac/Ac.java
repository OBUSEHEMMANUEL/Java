package ac;

import javax.swing.*;

public class Ac {
    public String isOn (String on) throws Exception {
        if (on == "on") {
            System.out.println("Ac is on");
        }
        else {
            throw new Exception("please turn on Ac properly");
        }
        return on;
    }
    public String isOff (String off) throws Exception {
        if (off == "off"){
            System.out.println("AC is off");
        }
        else{
            throw new Exception("please turn off Ac properly");
        }
        return off;
    }
    public int increaseTemp(int temp) throws Exception {
        if (temp > 30){
            throw new Exception("input invalid");
        }
        else{
            System.out.println("Temperature increase to: "+ temp);
        }
        return temp;
    }

    public int decreaseTemp(int temp) throws Exception {
        if (temp < 16) {
            throw new Exception("Reached limit");
        } else{
            System.out.println("Temperature decrease to: "+ temp);
        }
         return temp;
    }
}


