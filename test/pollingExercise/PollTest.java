package pollingExercise;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PollTest {
    Poll poll;

    @BeforeEach
    public void setUp() {
        poll = new Poll();
    }

    @Test
    void testCalculateAverage() {
        int[] pollNumber = {10, 20, 30, 40};
         poll.calculateAverage(pollNumber);

        assertEquals(25, poll.getAverageRating());
    }

    @Test
    void calculateHighestPoints() {
        int[] pollNumber = {10, 20, 30, 40};
        int highestPoint = poll.getHighestPoint(pollNumber);
        assertEquals(40, highestPoint);

    }

    @Test
    void calculateLowestPoints() {
        int[] pollNumber = {10, 20, 30, 40};
        int LowestPoint = poll.getLowestPoint(pollNumber);
        assertEquals(10, LowestPoint);
    }
}