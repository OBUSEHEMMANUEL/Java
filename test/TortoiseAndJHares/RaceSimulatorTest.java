package TortoiseAndJHares;

import TortoiseAndJHares.animals.Hare;
import TortoiseAndJHares.animals.Tortoise;
import TortoiseAndJHares.enums.AnimalMovement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.WeakHashMap;

import static org.junit.jupiter.api.Assertions.*;

public class RaceSimulatorTest {
    private RaceCourse raceCourse;
    private Hare nnamdi;
    private Tortoise ijapa;

    @BeforeEach
    private void setUp(){
        raceCourse = new RaceCourse();
        nnamdi = new Hare();
        ijapa = new Tortoise();
    }
    @Test
    public void getRaceTrack() {
        assertNotNull(raceCourse.getRaceTrack());
    }
    @Test
    public void CreateRaceTrackWithSmallTack(){
        int[] smallTrack = new int[20];
        raceCourse = new RaceCourse(smallTrack);
        assertNotNull(raceCourse.getRaceTrack());
         assertTrue(raceCourse.getRaceTrack().length > 70);
    }
    @Test
    public void checkAAnimalStartPositionTest(){

        assertEquals(1,nnamdi.getPosition());
        assertEquals(1,ijapa.getPosition());
    }
    @Test
    public void generateNumber(){
        int moveNumber = RaceSimulator.generateMoveNumber();
        assertTrue(moveNumber > BigDecimal.ZERO.intValue());
    }
    @Test
    public void numberBetweenOneToTen(){
        int moveNumber = RaceSimulator.generateMoveNumber();
        assertTrue(moveNumber > BigDecimal.ZERO.intValue());
        assertTrue(moveNumber < 11);

    }
    @Test
    public void ijapaFastPlod(){
        int ijapaPosition = ijapa.move(AnimalMovement.FAST_PLOD);
        assertEquals(4,ijapaPosition);
    }
    @Test
    public void ijapaSlip(){
        ijapa.setPosition(16);
        int ijapaPosition = ijapa.move(AnimalMovement.SLIP);
        assertEquals(10,ijapaPosition);
    }

    @Test
    public void ijapaSlipFromLowPosition(){
        ijapa.setPosition(2);
        int ijapaPosition = ijapa.move(AnimalMovement.SLIP);
        assertEquals(1,ijapaPosition);
    }
    @Test
    public void ijapaSlowPlod(){
        int ijapaPosition = ijapa.move(AnimalMovement.SLOW_PLOD);
        assertEquals(2,ijapaPosition);
    }
    @Test
    public void nnamdiSleep(){
        nnamdi.setPosition(4);
        int nnamdiPosition = nnamdi.move(AnimalMovement.SLEEP);
        assertEquals(4,nnamdiPosition);
    }
    @Test
    public void nnamdiBig_Hop(){
        int nnamdiPosition = nnamdi.move(AnimalMovement.BIG_HOP);
        assertEquals(10,nnamdiPosition);
    }
    @Test
    public void nnamdiBig_Slip(){
        int nnamdiPosition = nnamdi.move(AnimalMovement.BIG_SLIP);
        assertEquals(13,nnamdiPosition);
    }
    @Test
    public void nnamdiSmall_Hop(){
        int nnamdiPosition = nnamdi.move(AnimalMovement.SMALL_HOP);
        assertEquals(2,nnamdiPosition);
    }

    @Test
    public void nnamdiSmall_Slip(){
        int nnamdiPosition = nnamdi.move(AnimalMovement.SMALL_SLIP);
        assertEquals(3,nnamdiPosition);
    }
    @Test
    public void ijapaFast_PlodMoveWhenTheNumberIsGiven(){
        AnimalMovement number = ijapa.movementSpeed(4);
        assertEquals(AnimalMovement.FAST_PLOD,number);
        int ijapaPosition = ijapa.move(number);
        assertEquals(4,ijapaPosition);
    }
    @Test
    public void ijapaSlipMoveWhenTheNumberIsGiven(){
        AnimalMovement number = ijapa.movementSpeed(6);
        assertEquals(AnimalMovement.SLIP,number);
        ijapa.setPosition(16);
        int ijapaPosition = ijapa.move(number);
        assertEquals(10,ijapaPosition);

    }
    @Test
    public void ijapaSlow_PlodMoveWhenTheNumberIsGiven(){
        AnimalMovement number = ijapa.movementSpeed(9);
        assertEquals(AnimalMovement.SLOW_PLOD,number);
        int ijapaPosition = ijapa.move(number);
        assertEquals(2,ijapaPosition);
    }
    @Test
    public void nnamdiSleepMoveWhenTheNumberIsGiven(){
        AnimalMovement number = nnamdi.movementSpeed(2);
        assertEquals(AnimalMovement.SLEEP,number);
        nnamdi.setPosition(1);
        int nnamdiPosition = nnamdi.move(number);
        assertEquals(1,nnamdiPosition);
    }
    @Test
    public void nnamdiBig_HopMoveWhenTheNumberIsGiven(){
        AnimalMovement number = nnamdi.movementSpeed(4);
        assertEquals(AnimalMovement.BIG_HOP,number);
        int nnamdiPosition = nnamdi.move(number);
        assertEquals(10,nnamdiPosition);
    }
    @Test
    public void nnamdiBig_SlipMoveWhenTheNumberIsGiven(){
        AnimalMovement number = nnamdi.movementSpeed(5);
        assertEquals(AnimalMovement.BIG_SLIP,number);
        int nnamdiPosition = nnamdi.move(number);
        assertEquals(13,nnamdiPosition);
    }
    @Test
    public void nnamdiSmall_HopMoveWhenTheNumberIsGiven(){
        AnimalMovement number = nnamdi.movementSpeed(8);
        assertEquals(AnimalMovement.SMALL_HOP,number);
        int nnamdiPosition = nnamdi.move(number);
        assertEquals(2,nnamdiPosition);
    }
@Test
    public void nnamdiSmall_SlipMoveWhenTheNumberIsGIVEN(){
        AnimalMovement number = nnamdi.movementSpeed(9);
        assertEquals(AnimalMovement.SMALL_SLIP,number);
        int nnamdiPosition = nnamdi.move(number);
        assertEquals(3,nnamdiPosition);
}
}
