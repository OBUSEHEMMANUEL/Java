package bike;

public class Bike {
    public String isOn(String on) throws Exception {
        if (on == "on") {
            System.out.println("The bike is on");
        } else {
            throw new Exception("turn on  bike");
        }
        return on;

    }

    public String isOff(String off) throws Exception {
        if (off == "off") {
            System.out.println("BIKE IS ON");
        } else {
            throw new Exception("TURN OFF BIKE");
        }
        return off;

    }

    public int accelerateGearOne(int gear, int speedLimit) throws Exception {
        if (gear == 1) {
            System.out.println("ENTERED GEAR ONE");
        } else {
            throw new Exception("NOT ON GEAR 1");
        }

        if (speedLimit >= 0 && speedLimit <= 20) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit++;
        }

        if (speedLimit >= 21 && speedLimit <= 30) {
            speedLimit += 2;
            System.out.println("YOU ARE IN GEAR TWO");
        }

        if (speedLimit >= 31 && speedLimit < 40) {
            speedLimit +=3;
            System.out.println("YOU ARE IN GEAR THREE");
        }
        if (speedLimit >= 40) {
            speedLimit +=4 ;
            System.out.println("YOU ARE IN GEAR FOUR");
        }
        return speedLimit;

    }

    public int accelerateGearTwo(int gear, int speedLimit) throws Exception {
        if (gear == 2) {
            System.out.println("ENTERED GEAR TWO");
        } else {
            throw new Exception("NOT ON GEAR 2");
        }

        if (speedLimit >= 21 && speedLimit <= 30) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit += 2;
        }

        if (speedLimit >= 31 && speedLimit < 40) {
            speedLimit +=3;
            System.out.println("YOU ARE IN GEAR THREE");
        }

        if (speedLimit >= 0 && speedLimit <= 20) {
            speedLimit ++;
            System.out.println("YOU ARE IN GEAR ONE");
        }

        if (speedLimit >= 40) {
            speedLimit +=4 ;
            System.out.println("YOU ARE IN GEAR FOUR");
        }
        return speedLimit;

    }

    public int accelerateGearThree(int gear, int speedLimit) throws Exception {
        if (gear == 3) {
            System.out.println("ENTERED GEAR THREE");
        } else {
            throw new Exception("NOT ON GEAR 3");
        }

        if (speedLimit >= 31 && speedLimit < 40) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit += 3;
        }

        if (speedLimit >= 0 && speedLimit <= 20) {
            System.out.println("YOU ARE IN GEAR ONE");
            speedLimit++;
        }

        if (speedLimit >= 21 && speedLimit < 30) {
            speedLimit += 2;
            System.out.println("YOU ARE IN GEAR TWO");
        }

        if (speedLimit >= 40) {
            speedLimit +=4 ;
            System.out.println("YOU ARE IN GEAR FOUR");
        }

        return speedLimit;

    }

    public int accelerateGearFour(int gear, int speedLimit) throws Exception {
        if (gear == 4) {
            System.out.println("ENTERED GEAR FOUR");
        } else {
            throw new Exception("NOT ON GEAR 4");
        }
        if (speedLimit >= 40 && speedLimit <= 50) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit += 4;
        }
        if (speedLimit >= 31 && speedLimit <= 40) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit += 3;
        }

        if (speedLimit >= 0 && speedLimit <= 20) {
            speedLimit++;
            System.out.println("YOU ARE IN GEAR ONE");
        }

        if (speedLimit >= 21 && speedLimit < 30) {
            speedLimit += 2;
            System.out.println("YOU ARE IN GEAR TWO");
        }
        return speedLimit;

    }

    public int decelerateGearOne(int gear, int speedLimit) throws Exception {
        if (gear == 1) {
            System.out.println("ENTERED GEAR ONE");
        } else {
            throw new Exception("NOT ON GEAR 1");
        }
        if (speedLimit >= 0 && speedLimit <= 20) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit--;
        }

        if (speedLimit >= 0 && speedLimit <= 20) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
        }

        if (speedLimit >= 21 && speedLimit <= 30) {
            speedLimit -= 2;
            System.out.println("YOU ARE IN GEAR TWO");
        }

        if (speedLimit >= 31 && speedLimit < 40) {
            speedLimit -=3;
            System.out.println("YOU ARE IN GEAR THREE");
        }
        if (speedLimit >= 40) {
            speedLimit -=4 ;
            System.out.println("YOU ARE IN GEAR FOUR");
        }
        return speedLimit;

    }

    public int decelerateGearTwo(int gear, int speedLimit) throws Exception {
        if (gear == 2) {
            System.out.println("ENTERED GEAR TWO");
        } else {
            throw new Exception("NOT ON GEAR 2");
        }
        if (speedLimit >= 20 && speedLimit <= 30) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit -= 2;
        }
        if (speedLimit >= 31 && speedLimit < 40) {
            speedLimit -=3;
            System.out.println("YOU ARE IN GEAR THREE");
        }

        if (speedLimit >= 0 && speedLimit <= 20) {
            speedLimit --;
            System.out.println("YOU ARE IN GEAR ONE");
        }

        if (speedLimit >= 40) {
            speedLimit -=4 ;
            System.out.println("YOU ARE IN GEAR FOUR");
        }
        return speedLimit;

    }

    public int decelerateGearThree(int gear, int speedLimit) throws Exception {
        if (gear == 3) {
            System.out.println("ENTERED GEAR THREE");
        } else {
            throw new Exception("NOT ON GEAR 3");
        }
        if (speedLimit >= 31 && speedLimit <= 40) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit -= 3;
        }
        if (speedLimit >= 0 && speedLimit <= 20) {
            System.out.println("YOU ARE IN GEAR ONE");
            speedLimit--;
        }

        if (speedLimit >= 21 && speedLimit < 30) {
            speedLimit -= 2;
            System.out.println("YOU ARE IN GEAR TWO");
        }

        if (speedLimit >= 40) {
            speedLimit -=4 ;
            System.out.println("YOU ARE IN GEAR FOUR");
        }
        return speedLimit;

    }

    public int decelerateGearFour(int gear, int speedLimit) throws Exception {
        if (gear == 4) {
            System.out.println("ENTERED GEAR FOUR");
        } else {
            throw new Exception("NOT ON GEAR 4");
        }
        if (speedLimit >= 40) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit -= 4;
        }
        if (speedLimit >= 31 && speedLimit <= 40) {
            System.out.println("BETWEEN YOUR SPEED RANGE");
            speedLimit -= 3;
        }

        if (speedLimit >= 0 && speedLimit <= 20) {
            speedLimit--;
            System.out.println("YOU ARE IN GEAR ONE");
        }

        if (speedLimit >= 21 && speedLimit < 30) {
            speedLimit -= 2;
            System.out.println("YOU ARE IN GEAR TWO");
        }
        return speedLimit;
    }
}