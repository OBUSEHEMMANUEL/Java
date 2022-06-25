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
}


