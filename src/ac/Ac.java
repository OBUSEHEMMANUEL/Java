package ac;

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

}


