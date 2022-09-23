package pollingExercise;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    private static  Poll poll = new Poll();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] topics = poll.getTopics();
        int numberOfTopics = topics.length;
        System.out.println("Welcome To Unicorn Poll");
        var response = "yes";
        while (response.equals("yes")) {
            for (int index = 0; index < numberOfTopics; index++) {
                System.out.println("rate: " + topics[index]);
                int userRating = scanner.nextInt();
                if (userRating < 1 || userRating > 10) throw new UserFitNoGetSense("Abeg Try They Get Sense");
                saveRating(index,userRating);
            }
            System.out.println("continue?");
            response = scanner.next();
        }
            System.out.println();
            poll.displayTabularReport();

        }
        private static void saveRating(int issueNumber, int userRating) {
            var responsedb = poll.getResponse();

            responsedb[issueNumber][userRating-1] = responsedb[issueNumber][userRating-1] + 1;
        }
    }

