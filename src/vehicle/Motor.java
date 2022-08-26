package vehicle;

public class Motor {

    private String brands = "bens";
    private String plateNumber;
    private String color;
    private String brake;


    public Motor() {

    }

    public void setBrands() {


    }

    public String getBrands() {
        return brands;
    }

    public void setplateNumber(String plateNumber) {
        this.plateNumber = plateNumber;

    }

    public String getplateNumber() {
        return plateNumber;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    public void setBrake(String brake) {
        this.brake = brake;
    }

    public String getBrake() {
        return brake;
    }

    public int gearOne(int gear, int speedLimit) throws Exception {
        if
        (gear == 1) {
            System.out.println("ENTERED GEAR ONE");
        } else {
            throw new Exception("NOT ON GEAR 1");
        }
        if (speedLimit >= 0 && speedLimit <= 20) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit++;

        }
        return speedLimit;
    }

    public int gearTwo(int gear, int speedLimit) throws Exception {
        if
        (gear == 2) {
            System.out.println("ENTERED GEAR TWO");
        } else {
            throw new Exception("NOT ON GEAR 2");
        }

        if (speedLimit >= 21 && speedLimit <= 30) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit += 2;
        }
        return speedLimit;
    }

    public int gearThree(int gear, int speedLimit) throws Exception {
        if
        (gear == 3) {
            System.out.println("ENTERED GEAR THREE");
        } else {
            throw new Exception("NOT ON GEAR 3");
        }

        if (speedLimit >= 31 && speedLimit < 40) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit += 3;
        }
        return speedLimit;
    }

    public int gearFour(int gear, int speedLimit) throws Exception {
        if
        (gear == 4) {
            System.out.println("ENTERED GEAR FOUR");
        } else {
            throw new Exception("NOT ON GEAR 4");
        }
        if (speedLimit >= 40 && speedLimit <= 50) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit += 4;
        }
        return speedLimit;


    }
}