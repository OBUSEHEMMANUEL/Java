package ticktactoe;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ticktactoe.Value.*;

class PlayerTest {
    private Player player1;
    private Player player2;
    private Board board;
    @BeforeEach
    void setUp(){
       player1 = new Player(X, "Emmanuel");
       player2 = new Player(O, "Lakes");
       board = new Board();
    }
    @Test
    public void boardTest(){
        assertNotNull(board);
    }
    @Test
    public void boardDisplay(){
        board.displayBoard();

    }

    @Test
    void testToGetPlayerMark(){
        assertEquals(X, player1.getValue());
        assertEquals(O, player2.getValue());
    }

    @Test
    void playerTest(){
        var boardSurface = board.getBoard();
        player1.playGame(1,board);
        assertEquals(X, boardSurface[0][0]);
        player2.playGame(2, board);
        assertEquals(O, boardSurface[0][1]);
    }

    @Test
    public void testThatPlayerCanWinOnRow1(){
        player1.playGame(1,board);
        player2.playGame(5, board);
        player1.playGame(2,board);
        player2.playGame(7, board);
        player1.playGame(3,board);
        player2.playGame(9,board);
        assertTrue(board.isAWinner());
        board.displayBoard();
    }
    @Test
    public void testThatPlayerCanWinOnRow2(){
        player1.playGame(4,board);
        player2.playGame(1, board);
        player1.playGame(5,board);
        player2.playGame(7, board);
        player1.playGame(6,board);
        player2.playGame(9,board);
        assertTrue(board.isAWinner());
        board.displayBoard();
    }
    @Test
    public void testThatPlayerCanWinOnRow3(){
        player1.playGame(7,board);
        player2.playGame(1, board);
        player1.playGame(8,board);
        player2.playGame(3, board);
        player1.playGame(9,board);
        player2.playGame(4,board);
        assertTrue(board.isAWinner());
        board.displayBoard();
    }
    @Test
    public void testThatPlayerCanWinOnColumn1(){
        player1.playGame(6,board);
        player2.playGame(1, board);
        player1.playGame(8,board);
        player2.playGame(7, board);
        player1.playGame(9,board);
        player2.playGame(4,board);
        assertTrue(board.isAWinner());
        board.displayBoard();
    }
    @Test
    public void testThatPlayerCanWinOnColumn2(){
        player1.playGame(2,board);
        player2.playGame(1, board);
        player1.playGame(5,board);
        player2.playGame(7, board);
        player1.playGame(8,board);
        player2.playGame(9,board);
        board.displayBoard();
        assertTrue(board.isAWinner());

    }
    @Test
    public void testThatPlayerCanWinOnColumn3(){
        player1.playGame(3,board);
        player2.playGame(1, board);
        player1.playGame(6,board);
        player2.playGame(7, board);
        player1.playGame(9,board);
        player2.playGame(5,board);
        board.displayBoard();
        assertTrue(board.isAWinner());
    }
    @Test
    public void testThatPlayerCanWinOnAxis1(){
        player1.playGame(3,board);
        player2.playGame(1, board);
        player1.playGame(5,board);
        player2.playGame(8, board);
        player1.playGame(7,board);
        player2.playGame(6,board);
        board.displayBoard();
        assertTrue(board.isAWinner());
    }
    @Test
    public void testThatPlayerCanWinOnAxis2(){
        player1.playGame(3,board);
        player2.playGame(1, board);
        player1.playGame(5,board);
        player2.playGame(8, board);
        player1.playGame(7,board);
        player2.playGame(6,board);
        board.displayBoard();
        assertTrue(board.isAWinner());
    }
    @Test
    public void testThatPlayersTied(){
        player1.playGame(3,board);
        player2.playGame(1, board);
        player1.playGame(4,board);
        player2.playGame(8, board);
        player1.playGame(7,board);
        player2.playGame(6,board);
        board.displayBoard();
        assertTrue(board.isTie());

    }
}