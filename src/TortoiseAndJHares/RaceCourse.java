package TortoiseAndJHares;

import TortoiseAndJHares.animals.Hare;

public class RaceCourse {
    private  int[] raceTrack ;
    private Hare nnamdi;


    public RaceCourse() {
        this.raceTrack = new int[100];
    }

    public RaceCourse(int[] raceTrack) {
        if (raceTrack.length < 70){
          this.raceTrack = new int[100];
      }else {
          this.raceTrack = raceTrack;
      }
    }
    public int[] getRaceTrack() {
        return raceTrack;
    }

    public void setRaceTrack(int[] raceTrack) {
        this.raceTrack = raceTrack;
    }
    public void display(){
        System.out.println("BANG!!!!!");
        System.out.println("AND THEY'RE OFF!!!!!");
        for (int i = 0; i < raceTrack.length; i++) {
//            if (raceTrack[i] ==)

        }
    }
}
