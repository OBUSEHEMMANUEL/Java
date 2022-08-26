package Deitel.chapter_7;

public class StudentPoll {
    public static void main(String[] args) {
        int [] responses = {1, 2, 5, 4, -3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 58};
        int [] frequency = new int [6];
        int answer;
        for (answer = 0; answer < responses.length; answer++ ){
            try {
                ++frequency[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("Answer [%d] : %d%n ", answer,responses[answer]);
            }

        }
        System.out.printf("%s  %6s%n", "RATING", "FREQUENCY");


        for(int rating =1; rating < frequency.length; rating++){
            System.out.printf("%5d %6d%n", rating,frequency[rating]);
        }

    }
}
