package pollingExercise;

import java.util.Arrays;

public class Poll {

    private String[] topics = {"financial issues", "psychological issues", " Gender issues", "Hunger", "Breakfast"};

    private int[][] response = new int[5][10];
    private double averageRating;

    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    public int[][] getResponse() {
        return response;
    }

    public void setResponse(int[][] response) {
        this.response = response;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public void calculateAverage(int... pollNumber) {
        int totalOfRating = 0;

        for (int i = 0; i < pollNumber.length; i++) {
            totalOfRating += pollNumber[i];
        }
        averageRating = totalOfRating / pollNumber.length;

    }

    public int getHighestPoint(int[] pollNumber) {
        int highestNumber = pollNumber[0];
        for (int i = 0; i < pollNumber.length; i++) {
            if (pollNumber[i] > highestNumber) {
                highestNumber = pollNumber[i];
            }

        }

        return highestNumber;
    }

    public int getLowestPoint(int[] pollNumber) {
        int lowestNumber = pollNumber[0];
        for (int i = 0; i < pollNumber.length; i++) {
            if (pollNumber[i] < lowestNumber) {
                lowestNumber = pollNumber[i];
            }

        }
        return lowestNumber;
    }

    public void displayTabularReport() {
        String header = String.format("\t\t\t\t\t\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(header);
        for (int index = 0; index < getResponse().length; index++) {
            System.out.printf("%s\t",getTopics()[index]);
            System.out.print(Arrays.toString(getResponse()[index]));
            System.out.println();
        }
    }
}